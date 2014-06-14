package com.woody.TimeEstimate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeCloudRegistry
{
  private static final String URL = "jdbc:mysql://50.63.244.187:3306/TimeEstimate";
  private final static String TABLE_NAME = "TimeTable";
  private final static String USER = "TimeEstimate";
  private final static String PASSWORD = "Nebr@sk@68701";

  private static boolean initialized = false;

  // ---------------------------------------------------------------------------
  // I N I T I A L I Z A T I O N
  // ---------------------------------------------------------------------------

  private static void initialize()
  {
    if (!initialized)
    {
      Connection connection = null;

      try
      {
        connection = DriverManager.getConnection(URL, USER, PASSWORD);

        createTimeTable(connection);
        initialized = true;
      }
      catch (Exception e)
      {
        e.printStackTrace();
      }
      finally
      {
        try
        {
          connection.close();
        }
        catch (Exception e)
        {
          e.printStackTrace();
        }
      }
    }
  }

  // ---------------------------------------------------------------------------
  //  P U B L I C
  // ---------------------------------------------------------------------------

  public static TimeDay getDayTime(Date date)
  {
    initialize();

    TimeDay timeInfo = new TimeDay();
    java.sql.Date sqlDate = new java.sql.Date(date.getTime());

    Connection connection = null;
    PreparedStatement selectTimeInfo = null;
    ResultSet resultSet = null;


    try
    {
      connection = DriverManager.getConnection(URL, USER, PASSWORD);

      selectTimeInfo = connection.prepareStatement(
        "SELECT * FROM TimeTable WHERE timeDate = ?");

      selectTimeInfo.setDate(1, sqlDate);

      resultSet = selectTimeInfo.executeQuery();

      while (resultSet.next())
      {
        timeInfo.setTimeDate(resultSet.getDate("timeDate"));
        timeInfo.setAm1Date(resultSet.getTimestamp("timeAM1"));
        timeInfo.setAm2Date(resultSet.getTimestamp("timeAM2"));
        timeInfo.setAmLock(resultSet.getBoolean("amLock"));
        timeInfo.setPm1Date(resultSet.getTimestamp("timePM1"));
        timeInfo.setPm2Date(resultSet.getTimestamp("timePM2"));
        timeInfo.setPmLock(resultSet.getBoolean("pmLock"));
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
        selectTimeInfo.close();
        connection.close();
      }
      catch (Exception e)
      {
        e.printStackTrace();
      }
    }

    return timeInfo;
  }

  public static void setDayTime(TimeDay timeInfo)
  {
    initialize();

    Connection connection = null;
    PreparedStatement insertTimeInfo = null;

    try
    {
      connection = DriverManager.getConnection(URL, USER, PASSWORD);

      insertTimeInfo = connection.prepareStatement(
          "UPDATE TimeTable " +
              "SET timeAM1 = ?, timeAM2 = ?, amLock = ?, timePM1 = ?, timePM2 = ?, pmLock = ? " +
              "WHERE timeDate = ?");

      insertTimeInfo.setString(7, format(timeInfo.getTimeDate()));
      insertTimeInfo.setTimestamp(1, new Timestamp(timeInfo.getAm1Date().getTime()));
      insertTimeInfo.setTimestamp(2, new Timestamp(timeInfo.getAm2Date().getTime()));
      insertTimeInfo.setString(3, Boolean.toString(timeInfo.isAmLock()));
      insertTimeInfo.setTimestamp(4, new Timestamp(timeInfo.getPm1Date().getTime()));
      insertTimeInfo.setTimestamp(5, new Timestamp(timeInfo.getPm2Date().getTime()));
      insertTimeInfo.setString(6, Boolean.toString(timeInfo.isPmLock()));

      insertTimeInfo.executeUpdate();
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
    finally
    {
      try
      {
        insertTimeInfo.close();
        connection.close();
      }
      catch (Exception e)
      {
        e.printStackTrace();
      }
    }
  }

  public static void newDayTime(TimeDay timeInfo)
  {
    initialize();

    Connection connection = null;
    PreparedStatement newTimeInfo = null;

    try
    {
      connection = DriverManager.getConnection(URL, USER, PASSWORD);

      newTimeInfo = connection.prepareStatement("INSERT INTO TimeTable" +
          "( timeDate, timeAM1, timeAM2, amLock, timePM1, timePM2, pmLock ) " +
          "VALUES ( ?, ?, ?, ?, ?, ?, ? )");

      newTimeInfo.setString(1, format(timeInfo.getTimeDate()));
      newTimeInfo.setTimestamp(2, new Timestamp(timeInfo.getAm1Date().getTime()));
      newTimeInfo.setTimestamp(3, new Timestamp(timeInfo.getAm2Date().getTime()));
      newTimeInfo.setString(4, Boolean.toString(timeInfo.isAmLock()));
      newTimeInfo.setTimestamp(5, new Timestamp(timeInfo.getPm1Date().getTime()));
      newTimeInfo.setTimestamp(6, new Timestamp(timeInfo.getPm2Date().getTime()));
      newTimeInfo.setString(7, Boolean.toString(timeInfo.isPmLock()));

      newTimeInfo.executeUpdate();
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
    finally
    {
      try
      {
        newTimeInfo.close();
        connection.close();
      }
      catch (Exception e)
      {
        e.printStackTrace();
      }
    }
  }

  public static void replaceDayTime(TimeDay timeInfo)
  {
    initialize();

    Connection connection = null;
    PreparedStatement replaceTimeInfo = null;

    try
    {
      connection = DriverManager.getConnection(URL, USER, PASSWORD);

      replaceTimeInfo = connection.prepareStatement("REPLACE INTO TimeTable" +
          "( timeDate, timeAM1, timeAM2, amLock, timePM1, timePM2, pmLock ) " +
          "VALUES ( ?, ?, ?, ?, ?, ?, ? )");

      replaceTimeInfo.setString(1, format(timeInfo.getTimeDate()));
      replaceTimeInfo.setTimestamp(2, new Timestamp(timeInfo.getAm1Date().getTime()));
      replaceTimeInfo.setTimestamp(3, new Timestamp(timeInfo.getAm2Date().getTime()));
      replaceTimeInfo.setString(4, Boolean.toString(timeInfo.isAmLock()));
      replaceTimeInfo.setTimestamp(5, new Timestamp(timeInfo.getPm1Date().getTime()));
      replaceTimeInfo.setTimestamp(6, new Timestamp(timeInfo.getPm2Date().getTime()));
      replaceTimeInfo.setString(7, Boolean.toString(timeInfo.isPmLock()));

      replaceTimeInfo.executeUpdate();
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
    finally
    {
      try
      {
        replaceTimeInfo.close();
        connection.close();
      }
      catch (Exception e)
      {
        e.printStackTrace();
      }
    }
  }

  // ---------------------------------------------------------------------------
  // C R E A T E T A B L E S
  // ---------------------------------------------------------------------------

  private static void createTimeTable(Connection connection)
  {
    PreparedStatement ps = null;

    try
    {
      String query = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME + " " +
          "( " +
          "  `timeDate` DATE NOT NULL, " +
          "  `timeAM1` TIME DEFAULT NULL, " +
          "  `timeAM2` TIME DEFAULT NULL, " +
          "  `amLock` VARCHAR(10) DEFAULT NULL, " +
          "  `timePM1` TIME DEFAULT NULL, " +
          "  `timePM2` TIME DEFAULT NULL, " +
          "  `pmLock` VARCHAR(10) DEFAULT NULL, " +
          "  PRIMARY KEY (`timeDate`) " +
          ") ENGINE=InnoDB DEFAULT CHARSET=latin1; ";

      ps = connection.prepareStatement(query);
      ps.execute();

    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
    finally
    {
      try
      {
        ps.close();
      }
      catch (Exception e)
      {
        e.printStackTrace();
      }
    }

  }

  // ---------------------------------------------------------------------------
  // U T I L
  // ---------------------------------------------------------------------------

  public static String format(Date value)
  {
    if (value != null)
    {
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
      return sdf.format(value);
    }

    return null;
  }

  public static String formatTime(Date value)
  {
    if (value != null)
    {
      SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
      return sdf.format(value);
    }

    return null;
  }

}
