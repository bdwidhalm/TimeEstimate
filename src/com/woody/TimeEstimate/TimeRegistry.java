package com.woody.TimeEstimate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

public class TimeRegistry
{

  private static final String URL = "jdbc:derby:TimeEstimate;create=true";
  private static final String USERNAME = "woody";
  private static final String PASSWORD = "woody";
  private Connection connection = null; // manages connection
  private PreparedStatement selectTimeInfo = null;
  private PreparedStatement insertTimeInfo = null;
  private PreparedStatement newTimeInfo = null;
  private PreparedStatement createTable = null;
  private PreparedStatement selectAll = null;

  public TimeRegistry()
  {
    try
    {
      Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
      connection =
          DriverManager.getConnection(URL, USERNAME, PASSWORD);
//      connection =
//          DriverManager.getConnection(URL);

      try
      {
        createTable = connection.prepareStatement("CREATE TABLE TIMETABLE " +
            "(TIME_DATE DATE PRIMARY KEY, " +
            " TIME_AM1 TIME," +
            " TIME_AM2 TIME," +
            " AM_LOCK VARCHAR(10), " +
            " TIME_PM1 TIME, " +
            " TIME_PM2 TIME, " +
            " PM_LOCK VARCHAR(10))");

        createTable.execute();
      }
      catch (Exception e)
      {

      }


      selectTimeInfo = connection.prepareStatement(
          "SELECT * FROM TIMETABLE WHERE TIME_DATE = ?");

      insertTimeInfo = connection.prepareStatement(
          "UPDATE TIMETABLE " +
              "SET TIME_AM1 = ?, TIME_AM2 = ?, AM_LOCK = ?, TIME_PM1 = ?, TIME_PM2 = ?, PM_LOCK = ?" +
              "WHERE TIME_DATE = ?");

      newTimeInfo = connection.prepareStatement("INSERT INTO TIMETABLE" +
              "( TIME_DATE, TIME_AM1, TIME_AM2, AM_LOCK, TIME_PM1, TIME_PM2, PM_LOCK ) " +
              "VALUES ( ?, ?, ?, ?, ?, ?, ? )");

      selectAll = connection.prepareStatement("SELECT * FROM TIMETABLE");


    }
    catch (Exception e)
    {
      e.printStackTrace();
      System.exit(1);
    }
  }

  public TimeDay getDayTime(Date date)
  {
    TimeDay timeInfo = new TimeDay();
    ResultSet resultSet = null;
    java.sql.Date sqlDate = new java.sql.Date(date.getTime());


    try
    {
      selectTimeInfo.setDate(1, sqlDate);

      resultSet = selectTimeInfo.executeQuery();

      while (resultSet.next())
      {
        timeInfo.setTimeDate(resultSet.getDate("TIME_DATE"));
        timeInfo.setAm1Date(resultSet.getTimestamp("TIME_AM1"));
        timeInfo.setAm2Date(resultSet.getTimestamp("TIME_AM2"));
        timeInfo.setAmLock(resultSet.getBoolean("AM_LOCK"));
        timeInfo.setPm1Date(resultSet.getTimestamp("TIME_PM1"));
        timeInfo.setPm2Date(resultSet.getTimestamp("TIME_PM2"));
        timeInfo.setPmLock(resultSet.getBoolean("PM_LOCK"));
      }

    }
    catch (SQLException sqlException)
    {
      sqlException.printStackTrace();
    }
    finally
    {
      try
      {
        resultSet.close();
      }
      catch (SQLException sqlException)
      {
        sqlException.printStackTrace();
        close();
      }
    }
    return timeInfo;
  }


  public void setDayTime(TimeDay timeInfo)
  {
    try
    {
      insertTimeInfo.setDate(7, new java.sql.Date(timeInfo.getTimeDate().getTime()));
      insertTimeInfo.setTimestamp(1, new Timestamp(timeInfo.getAm1Date().getTime()));
      insertTimeInfo.setTimestamp(2, new Timestamp(timeInfo.getAm2Date().getTime()));
      insertTimeInfo.setBoolean(3, timeInfo.isAmLock());
      insertTimeInfo.setTimestamp(4, new Timestamp(timeInfo.getPm1Date().getTime()));
      insertTimeInfo.setTimestamp(5, new Timestamp(timeInfo.getPm2Date().getTime()));
      insertTimeInfo.setBoolean(6, timeInfo.isPmLock());

      insertTimeInfo.executeUpdate();
    }
    catch (SQLException sqlException)
    {
      sqlException.printStackTrace();
      close();
    }
  }

  public void newDayTime(TimeDay timeInfo)
  {

    try
    {
      newTimeInfo.setDate(1, new java.sql.Date(timeInfo.getTimeDate().getTime()));
      newTimeInfo.setTimestamp(2, new Timestamp(timeInfo.getAm1Date().getTime()));
      newTimeInfo.setTimestamp(3, new Timestamp(timeInfo.getAm2Date().getTime()));
      newTimeInfo.setBoolean(4, timeInfo.isAmLock());
      newTimeInfo.setTimestamp(5, new Timestamp(timeInfo.getPm1Date().getTime()));
      newTimeInfo.setTimestamp(6, new Timestamp(timeInfo.getPm2Date().getTime()));
      newTimeInfo.setBoolean(7, timeInfo.isPmLock());

      newTimeInfo.executeUpdate();
    }
    catch (SQLException sqlException)
    {
      sqlException.printStackTrace();
      close();
    }


  }

  public void close()
  {
    try
    {
      connection.close();
    }
    catch (SQLException sqlException)
    {
      sqlException.printStackTrace();
    }
  }

  public ArrayList<TimeDay> selectAll()
  {
    ArrayList<TimeDay> timeInfo = new ArrayList<TimeDay>();
    ResultSet resultSet = null;


    try
    {
      resultSet = selectAll.executeQuery();

      while (resultSet.next())
      {
        TimeDay addTimeDay = new TimeDay();

        addTimeDay.setTimeDate(resultSet.getDate("TIME_DATE"));
        addTimeDay.setAm1Date(resultSet.getTimestamp("TIME_AM1"));
        addTimeDay.setAm2Date(resultSet.getTimestamp("TIME_AM2"));
        addTimeDay.setAmLock(resultSet.getBoolean("AM_LOCK"));
        addTimeDay.setPm1Date(resultSet.getTimestamp("TIME_PM1"));
        addTimeDay.setPm2Date(resultSet.getTimestamp("TIME_PM2"));
        addTimeDay.setPmLock(resultSet.getBoolean("PM_LOCK"));

        timeInfo.add(addTimeDay);
      }

    }
    catch (SQLException sqlException)
    {
      sqlException.printStackTrace();
    }
    finally
    {
      try
      {
        resultSet.close();
      }
      catch (SQLException sqlException)
      {
        sqlException.printStackTrace();
        close();
      }
    }
    return timeInfo;

  }

}
