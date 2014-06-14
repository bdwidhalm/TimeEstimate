package com.woody.TimeEstimate;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class TimeEstimate
{
  private static TimeDay monday;
  private static TimeDay tuesday;
  private static TimeDay wednesday;
  private static TimeDay thursday;
  private static TimeDay friday;
  private static JSpinner timeSpinnerMondayAM1;
  private static JSpinner timeSpinnerMondayAM2;
  private static JCheckBox mondayAM1Lock;
  private static JSpinner timeSpinnerMondayPM1;
  private static JSpinner timeSpinnerMondayPM2;
  private static JCheckBox mondayPM1Lock;
  private static JLabel totalMonday;
  private static JSpinner timeSpinnerTuesdayAM1;
  private static JSpinner timeSpinnerTuesdayAM2;
  private static JCheckBox tuesdayAM1Lock;
  private static JSpinner timeSpinnerTuesdayPM1;
  private static JSpinner timeSpinnerTuesdayPM2;
  private static JCheckBox tuesdayPM1Lock;
  private static JLabel totalTuesday;
  private static JSpinner timeSpinnerWednesdayAM1;
  private static JSpinner timeSpinnerWednesdayAM2;
  private static JCheckBox wednesdayAM1Lock;
  private static JSpinner timeSpinnerWednesdayPM1;
  private static JSpinner timeSpinnerWednesdayPM2;
  private static JCheckBox wednesdayPM1Lock;
  private static JLabel totalWednesday;
  private static JSpinner timeSpinnerThursdayAM1;
  private static JSpinner timeSpinnerThursdayAM2;
  private static JCheckBox thursdayAM1Lock;
  private static JSpinner timeSpinnerThursdayPM1;
  private static JSpinner timeSpinnerThursdayPM2;
  private static JCheckBox thursdayPM1Lock;
  private static JLabel totalThursday;
  private static JSpinner timeSpinnerFridayAM1;
  private static JSpinner timeSpinnerFridayAM2;
  private static JCheckBox fridayAM1Lock;
  private static JSpinner timeSpinnerFridayPM1;
  private static JSpinner timeSpinnerFridayPM2;
  private static JCheckBox fridayPM1Lock;
  private static JLabel totalFriday;
  private static JLabel overAllTotalTitle;
  private static JButton prevButton;
  private static JButton nextButton;
  private static JComboBox weekNumSelector;
  private static final String[] weekNums = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52" };
  private static long hour = 3600000;
  private static TimeRegistry timeRegistry;
  private static Calendar displayDate;
//create a frame to hold panels
  private static JFrame application;

  public static void main(String[] args)
  {
    timeRegistry = new TimeRegistry();

    displayDate = Calendar.getInstance();

    // syncDatabase();

    getWeeksTimeInfo(displayDate);

    display();

  }

  public static void getWeeksTimeInfo(Calendar infoDate)
  {
    // System.out.println("getWeeksTimeInfo(Calendar");

    infoDate.set(Calendar.DAY_OF_WEEK, 2);
    Date monDate = new Date(infoDate.getTime().getTime());
    infoDate.set(Calendar.DAY_OF_WEEK, 3);
    Date tueDate = new Date(infoDate.getTime().getTime());
    infoDate.set(Calendar.DAY_OF_WEEK, 4);
    Date wedDate = new Date(infoDate.getTime().getTime());
    infoDate.set(Calendar.DAY_OF_WEEK, 5);
    Date thuDate = new Date(infoDate.getTime().getTime());
    infoDate.set(Calendar.DAY_OF_WEEK, 6);
    Date friDate = new Date(infoDate.getTime().getTime());

    monday = getTimeInfo(monDate);
    tuesday = getTimeInfo(tueDate);
    wednesday = getTimeInfo(wedDate);
    thursday = getTimeInfo(thuDate);
    friday = getTimeInfo(friDate);
  }

  public static void display()
  {
    // System.out.println("display(");

    // grid layout
    GridLayout timeGridLayout = new GridLayout(0, 8, 5, 2);

    // panel to hold time spinners
    JPanel timeGrid = new JPanel();
    timeGrid.setLayout(timeGridLayout);

    // panel to hold totals
    JPanel totalGrid = new JPanel();
    totalGrid.setLayout(timeGridLayout);

    // panel to hold all panels
    JPanel overallPanel = new JPanel();

    // add title row to grid
    JLabel dayTitle = new JLabel();
    dayTitle.setText("Day");
    timeGrid.add(dayTitle);
    JLabel AM1Title = new JLabel();
    AM1Title.setText("Arrive");
    timeGrid.add(AM1Title);
    JLabel AM2Title = new JLabel();
    AM2Title.setText("Depart");
    timeGrid.add(AM2Title);
    JLabel lockTitle1 = new JLabel();
    lockTitle1.setText("Lock");
    timeGrid.add(lockTitle1);
    JLabel PM1Title = new JLabel();
    PM1Title.setText("Arrive");
    timeGrid.add(PM1Title);
    JLabel PM2Title = new JLabel();
    PM2Title.setText("Depart");
    timeGrid.add(PM2Title);
    JLabel finishTitle = new JLabel();
    finishTitle.setText("Lock");
    timeGrid.add(finishTitle);
    JLabel totalTitle = new JLabel();
    totalTitle.setText("Total");
    timeGrid.add(totalTitle);

    // Monday Label
    JLabel MondayTitle = new JLabel();
    MondayTitle.setText("Monday");
    timeGrid.add(MondayTitle);
    // Monday AM1
    timeSpinnerMondayAM1 = new JSpinner(new SpinnerDateModel());
    timeSpinnerMondayAM1.setEditor(new JSpinner.DateEditor(timeSpinnerMondayAM1, "hh:mm aa"));
    timeSpinnerMondayAM1.setValue(monday.getAm1Date());
    timeGrid.add(timeSpinnerMondayAM1);
    timeSpinnerMondayAM1.addChangeListener(
        new ChangeListener()
        {
          @Override
          public void stateChanged(ChangeEvent evt)
          {
            calcTime(evt);
          }
        });
    // Monday AM2
    timeSpinnerMondayAM2 = new JSpinner(new SpinnerDateModel());
    timeSpinnerMondayAM2.setEditor(new JSpinner.DateEditor(timeSpinnerMondayAM2, "hh:mm aa"));
    timeSpinnerMondayAM2.setValue(monday.getAm2Date());
    timeGrid.add(timeSpinnerMondayAM2);
    timeSpinnerMondayAM2.addChangeListener(
        new ChangeListener()
        {
          @Override
          public void stateChanged(ChangeEvent evt)
          {
            calcTime(evt);
          }
        });
    // MondayAM Lock
    mondayAM1Lock = new JCheckBox();
    mondayAM1Lock.setSelected(monday.isAmLock());
    if (monday.isAmLock())
    {
      timeSpinnerMondayAM1.setEnabled(!monday.isAmLock());
      timeSpinnerMondayAM2.setEnabled(!monday.isAmLock());
    }
    timeGrid.add(mondayAM1Lock);
    mondayAM1Lock.addChangeListener(
        new ChangeListener()
        {
          @Override
          public void stateChanged(ChangeEvent evt)
          {
            lockField(evt);
          }
        });
    // Monday PM1
    timeSpinnerMondayPM1 = new JSpinner(new SpinnerDateModel());
    timeSpinnerMondayPM1.setEditor(new JSpinner.DateEditor(timeSpinnerMondayPM1, "hh:mm aa"));
    timeSpinnerMondayPM1.setValue(monday.getPm1Date());
    timeGrid.add(timeSpinnerMondayPM1);
    timeSpinnerMondayPM1.addChangeListener(
        new ChangeListener()
        {
          @Override
          public void stateChanged(ChangeEvent evt)
          {
            calcTime(evt);
          }
        });
    // Monday PM2
    timeSpinnerMondayPM2 = new JSpinner(new SpinnerDateModel());
    timeSpinnerMondayPM2.setEditor(new JSpinner.DateEditor(timeSpinnerMondayPM2, "hh:mm aa"));
    timeSpinnerMondayPM2.setValue(monday.getPm2Date());
    timeGrid.add(timeSpinnerMondayPM2);
    timeSpinnerMondayPM2.addChangeListener(
        new ChangeListener()
        {
          @Override
          public void stateChanged(ChangeEvent evt)
          {
            calcTime(evt);
          }
        });
    // MondayPM Lock
    mondayPM1Lock = new JCheckBox();
    mondayPM1Lock.setSelected(monday.isPmLock());
    if (monday.isPmLock())
    {
      timeSpinnerMondayPM1.setEnabled(!monday.isPmLock());
      timeSpinnerMondayPM2.setEnabled(!monday.isPmLock());
    }
    timeGrid.add(mondayPM1Lock);
    mondayPM1Lock.addChangeListener(
        new ChangeListener()
        {
          @Override
          public void stateChanged(ChangeEvent evt)
          {
            lockField(evt);
          }
        });
    // Monday Total
    totalMonday = new JLabel(Double.toString(calcHours(monday.getAm1Date(), monday.getAm2Date(), monday.getPm1Date(), monday.getPm2Date())));
    timeGrid.add(totalMonday);

    // Tuesday Label
    JLabel TuesdayTitle = new JLabel();
    TuesdayTitle.setText("Tuesday");
    timeGrid.add(TuesdayTitle);
    // Tuesday AM1
    timeSpinnerTuesdayAM1 = new JSpinner(new SpinnerDateModel());
    timeSpinnerTuesdayAM1.setEditor(new JSpinner.DateEditor(timeSpinnerTuesdayAM1, "hh:mm aa"));
    timeSpinnerTuesdayAM1.setValue(tuesday.getAm1Date());
    timeGrid.add(timeSpinnerTuesdayAM1);
    timeSpinnerTuesdayAM1.addChangeListener(
        new ChangeListener()
        {
          @Override
          public void stateChanged(ChangeEvent evt)
          {
            calcTime(evt);
          }
        });
    // Tuesday AM2
    timeSpinnerTuesdayAM2 = new JSpinner(new SpinnerDateModel());
    timeSpinnerTuesdayAM2.setEditor(new JSpinner.DateEditor(timeSpinnerTuesdayAM2, "hh:mm aa"));
    timeSpinnerTuesdayAM2.setValue(tuesday.getAm2Date());
    timeGrid.add(timeSpinnerTuesdayAM2);
    timeSpinnerTuesdayAM2.addChangeListener(
        new ChangeListener()
        {
          @Override
          public void stateChanged(ChangeEvent evt)
          {
            calcTime(evt);
          }
        });
    // TuesdayAM Lock
    tuesdayAM1Lock = new JCheckBox();
    tuesdayAM1Lock.setSelected(tuesday.isAmLock());
    if (tuesday.isAmLock())
    {
      timeSpinnerTuesdayAM1.setEnabled(!tuesday.isAmLock());
      timeSpinnerTuesdayAM2.setEnabled(!tuesday.isAmLock());
    }
    timeGrid.add(tuesdayAM1Lock);
    tuesdayAM1Lock.addChangeListener(
        new ChangeListener()
        {
          @Override
          public void stateChanged(ChangeEvent evt)
          {
            lockField(evt);
          }
        });
    // Tuesday PM1
    timeSpinnerTuesdayPM1 = new JSpinner(new SpinnerDateModel());
    timeSpinnerTuesdayPM1.setEditor(new JSpinner.DateEditor(timeSpinnerTuesdayPM1, "hh:mm aa"));
    timeSpinnerTuesdayPM1.setValue(tuesday.getPm1Date());
    timeGrid.add(timeSpinnerTuesdayPM1);
    timeSpinnerTuesdayPM1.addChangeListener(
        new ChangeListener()
        {
          @Override
          public void stateChanged(ChangeEvent evt)
          {
            calcTime(evt);
          }
        });
    // Tuesday PM2
    timeSpinnerTuesdayPM2 = new JSpinner(new SpinnerDateModel());
    timeSpinnerTuesdayPM2.setEditor(new JSpinner.DateEditor(timeSpinnerTuesdayPM2, "hh:mm aa"));
    timeSpinnerTuesdayPM2.setValue(tuesday.getPm2Date());
    timeGrid.add(timeSpinnerTuesdayPM2);
    timeSpinnerTuesdayPM2.addChangeListener(
        new ChangeListener()
        {
          @Override
          public void stateChanged(ChangeEvent evt)
          {
            calcTime(evt);
          }
        });
    // TuesdayPM Lock
    tuesdayPM1Lock = new JCheckBox();
    tuesdayPM1Lock.setSelected(tuesday.isPmLock());
    if (tuesday.isPmLock())
    {
      timeSpinnerTuesdayPM1.setEnabled(!tuesday.isPmLock());
      timeSpinnerTuesdayPM2.setEnabled(!tuesday.isPmLock());
    }
    timeGrid.add(tuesdayPM1Lock);
    tuesdayPM1Lock.addChangeListener(
        new ChangeListener()
        {
          @Override
          public void stateChanged(ChangeEvent evt)
          {
            lockField(evt);
          }
        });
    // Tuesday Total
    totalTuesday = new JLabel(Double.toString(calcHours(tuesday.getAm1Date(), tuesday.getAm2Date(), tuesday.getPm1Date(), tuesday.getPm2Date())));
    timeGrid.add(totalTuesday);

    // Wednesday Label
    JLabel WednesdayTitle = new JLabel();
    WednesdayTitle.setText("Wednesday");
    timeGrid.add(WednesdayTitle);
    // Monday AM1
    timeSpinnerWednesdayAM1 = new JSpinner(new SpinnerDateModel());
    timeSpinnerWednesdayAM1.setEditor(new JSpinner.DateEditor(timeSpinnerWednesdayAM1, "hh:mm aa"));
    timeSpinnerWednesdayAM1.setValue(wednesday.getAm1Date());
    timeGrid.add(timeSpinnerWednesdayAM1);
    timeSpinnerWednesdayAM1.addChangeListener(
        new ChangeListener()
        {
          @Override
          public void stateChanged(ChangeEvent evt)
          {
            calcTime(evt);
          }
        });
    // Wednesday AM2
    timeSpinnerWednesdayAM2 = new JSpinner(new SpinnerDateModel());
    timeSpinnerWednesdayAM2.setEditor(new JSpinner.DateEditor(timeSpinnerWednesdayAM2, "hh:mm aa"));
    timeSpinnerWednesdayAM2.setValue(wednesday.getAm2Date());
    timeGrid.add(timeSpinnerWednesdayAM2);
    timeSpinnerWednesdayAM2.addChangeListener(
        new ChangeListener()
        {
          @Override
          public void stateChanged(ChangeEvent evt)
          {
            calcTime(evt);
          }
        });
    // WednesdayAM Lock
    wednesdayAM1Lock = new JCheckBox();
    wednesdayAM1Lock.setSelected(wednesday.isAmLock());
    if (wednesday.isAmLock())
    {
      timeSpinnerWednesdayAM1.setEnabled(!wednesday.isAmLock());
      timeSpinnerWednesdayAM2.setEnabled(!wednesday.isAmLock());
    }
    timeGrid.add(wednesdayAM1Lock);
    wednesdayAM1Lock.addChangeListener(
        new ChangeListener()
        {
          @Override
          public void stateChanged(ChangeEvent evt)
          {
            lockField(evt);
          }
        });
    // Wednesday PM1
    timeSpinnerWednesdayPM1 = new JSpinner(new SpinnerDateModel());
    timeSpinnerWednesdayPM1.setEditor(new JSpinner.DateEditor(timeSpinnerWednesdayPM1, "hh:mm aa"));
    timeSpinnerWednesdayPM1.setValue(wednesday.getPm1Date());
    timeGrid.add(timeSpinnerWednesdayPM1);
    timeSpinnerWednesdayPM1.addChangeListener(
        new ChangeListener()
        {
          @Override
          public void stateChanged(ChangeEvent evt)
          {
            calcTime(evt);
          }
        });
    // Wednesday PM2
    timeSpinnerWednesdayPM2 = new JSpinner(new SpinnerDateModel());
    timeSpinnerWednesdayPM2.setEditor(new JSpinner.DateEditor(timeSpinnerWednesdayPM2, "hh:mm aa"));
    timeSpinnerWednesdayPM2.setValue(wednesday.getPm2Date());
    timeGrid.add(timeSpinnerWednesdayPM2);
    timeSpinnerWednesdayPM2.addChangeListener(
        new ChangeListener()
        {
          @Override
          public void stateChanged(ChangeEvent evt)
          {
            calcTime(evt);
          }
        });
    // WednesdayPM Lock
    wednesdayPM1Lock = new JCheckBox();
    wednesdayPM1Lock.setSelected(wednesday.isPmLock());
    if (wednesday.isPmLock())
    {
      timeSpinnerWednesdayPM1.setEnabled(!wednesday.isPmLock());
      timeSpinnerWednesdayPM2.setEnabled(!wednesday.isPmLock());
    }
    timeGrid.add(wednesdayPM1Lock);
    wednesdayPM1Lock.addChangeListener(
        new ChangeListener()
        {
          @Override
          public void stateChanged(ChangeEvent evt)
          {
            lockField(evt);
          }
        });
    // Wednesday Total
    totalWednesday = new JLabel(Double.toString(calcHours(wednesday.getAm1Date(), wednesday.getAm2Date(), wednesday.getPm1Date(), wednesday.getPm2Date())));
    timeGrid.add(totalWednesday);

    // Thursday Label
    JLabel ThursdayTitle = new JLabel();
    ThursdayTitle.setText("Thursday");
    timeGrid.add(ThursdayTitle);
    // Thursday AM1
    timeSpinnerThursdayAM1 = new JSpinner(new SpinnerDateModel());
    timeSpinnerThursdayAM1.setEditor(new JSpinner.DateEditor(timeSpinnerThursdayAM1, "hh:mm aa"));
    timeSpinnerThursdayAM1.setValue(thursday.getAm1Date());
    timeGrid.add(timeSpinnerThursdayAM1);
    timeSpinnerThursdayAM1.addChangeListener(
        new ChangeListener()
        {
          @Override
          public void stateChanged(ChangeEvent evt)
          {
            calcTime(evt);
          }
        });
    // Thursday AM2
    timeSpinnerThursdayAM2 = new JSpinner(new SpinnerDateModel());
    timeSpinnerThursdayAM2.setEditor(new JSpinner.DateEditor(timeSpinnerThursdayAM2, "hh:mm aa"));
    timeSpinnerThursdayAM2.setValue(thursday.getAm2Date());
    timeGrid.add(timeSpinnerThursdayAM2);
    timeSpinnerThursdayAM2.addChangeListener(
        new ChangeListener()
        {
          @Override
          public void stateChanged(ChangeEvent evt)
          {
            calcTime(evt);
          }
        });
    // ThursdayAM Lock
    thursdayAM1Lock = new JCheckBox();
    thursdayAM1Lock.setSelected(thursday.isAmLock());
    if (thursday.isAmLock())
    {
      timeSpinnerThursdayAM1.setEnabled(!thursday.isAmLock());
      timeSpinnerThursdayAM2.setEnabled(!thursday.isAmLock());
    }
    timeGrid.add(thursdayAM1Lock);
    thursdayAM1Lock.addChangeListener(
        new ChangeListener()
        {
          @Override
          public void stateChanged(ChangeEvent evt)
          {
            lockField(evt);
          }
        });
    // Thursday PM1
    timeSpinnerThursdayPM1 = new JSpinner(new SpinnerDateModel());
    timeSpinnerThursdayPM1.setEditor(new JSpinner.DateEditor(timeSpinnerThursdayPM1, "hh:mm aa"));
    timeSpinnerThursdayPM1.setValue(thursday.getPm1Date());
    timeGrid.add(timeSpinnerThursdayPM1);
    timeSpinnerThursdayPM1.addChangeListener(
        new ChangeListener()
        {
          @Override
          public void stateChanged(ChangeEvent evt)
          {
            calcTime(evt);
          }
        });
    // Thursday PM2
    timeSpinnerThursdayPM2 = new JSpinner(new SpinnerDateModel());
    timeSpinnerThursdayPM2.setEditor(new JSpinner.DateEditor(timeSpinnerThursdayPM2, "hh:mm aa"));
    timeSpinnerThursdayPM2.setValue(thursday.getPm2Date());
    timeGrid.add(timeSpinnerThursdayPM2);
    timeSpinnerThursdayPM2.addChangeListener(
        new ChangeListener()
        {
          @Override
          public void stateChanged(ChangeEvent evt)
          {
            calcTime(evt);
          }
        });
    // ThursdayPM Lock
    thursdayPM1Lock = new JCheckBox();
    thursdayPM1Lock.setSelected(thursday.isPmLock());
    if (thursday.isPmLock())
    {
      timeSpinnerThursdayPM1.setEnabled(!thursday.isPmLock());
      timeSpinnerThursdayPM2.setEnabled(!thursday.isPmLock());
    }
    timeGrid.add(thursdayPM1Lock);
    thursdayPM1Lock.addChangeListener(
        new ChangeListener()
        {
          @Override
          public void stateChanged(ChangeEvent evt)
          {
            lockField(evt);
          }
        });
    // Thursday Total
    totalThursday = new JLabel(Double.toString(calcHours(thursday.getAm1Date(), thursday.getAm2Date(), thursday.getPm1Date(), thursday.getPm2Date())));
    timeGrid.add(totalThursday);

    // Friday Label
    JLabel FridayTitle = new JLabel();
    FridayTitle.setText("Friday");
    timeGrid.add(FridayTitle);
    // Friday AM1
    timeSpinnerFridayAM1 = new JSpinner(new SpinnerDateModel());
    timeSpinnerFridayAM1.setEditor(new JSpinner.DateEditor(timeSpinnerFridayAM1, "hh:mm aa"));
    timeSpinnerFridayAM1.setValue(friday.getAm1Date());
    timeGrid.add(timeSpinnerFridayAM1);
    timeSpinnerFridayAM1.addChangeListener(
        new ChangeListener()
        {
          @Override
          public void stateChanged(ChangeEvent evt)
          {
            calcTime(evt);
          }
        });
    // Friday AM2
    timeSpinnerFridayAM2 = new JSpinner(new SpinnerDateModel());
    timeSpinnerFridayAM2.setEditor(new JSpinner.DateEditor(timeSpinnerFridayAM2, "hh:mm aa"));
    timeSpinnerFridayAM2.setValue(friday.getAm2Date());
    timeGrid.add(timeSpinnerFridayAM2);
    timeSpinnerFridayAM2.addChangeListener(
        new ChangeListener()
        {
          @Override
          public void stateChanged(ChangeEvent evt)
          {
            calcTime(evt);
          }
        });
    // FridayAM Lock
    fridayAM1Lock = new JCheckBox();
    fridayAM1Lock.setSelected(friday.isAmLock());
    if (friday.isAmLock())
    {
      timeSpinnerFridayAM1.setEnabled(!friday.isAmLock());
      timeSpinnerFridayAM2.setEnabled(!friday.isAmLock());
    }
    timeGrid.add(fridayAM1Lock);
    fridayAM1Lock.addChangeListener(
        new ChangeListener()
        {
          @Override
          public void stateChanged(ChangeEvent evt)
          {
            lockField(evt);
          }
        });
    // Friday PM1
    timeSpinnerFridayPM1 = new JSpinner(new SpinnerDateModel());
    timeSpinnerFridayPM1.setEditor(new JSpinner.DateEditor(timeSpinnerFridayPM1, "hh:mm aa"));
    timeSpinnerFridayPM1.setValue(friday.getPm1Date());
    timeGrid.add(timeSpinnerFridayPM1);
    timeSpinnerFridayPM1.addChangeListener(
        new ChangeListener()
        {
          @Override
          public void stateChanged(ChangeEvent evt)
          {
            calcTime(evt);
          }
        });
    // Friday PM2
    timeSpinnerFridayPM2 = new JSpinner(new SpinnerDateModel());
    timeSpinnerFridayPM2.setEditor(new JSpinner.DateEditor(timeSpinnerFridayPM2, "hh:mm aa"));
    timeSpinnerFridayPM2.setValue(friday.getPm2Date());
    timeGrid.add(timeSpinnerFridayPM2);
    timeSpinnerFridayPM2.addChangeListener(
        new ChangeListener()
        {
          @Override
          public void stateChanged(ChangeEvent evt)
          {
            calcTime(evt);
          }
        });
    // FridayPM Lock
    fridayPM1Lock = new JCheckBox();
    fridayPM1Lock.setSelected(friday.isPmLock());
    if (friday.isPmLock())
    {
      timeSpinnerFridayPM1.setEnabled(!friday.isPmLock());
      timeSpinnerFridayPM2.setEnabled(!friday.isPmLock());
    }
    timeGrid.add(fridayPM1Lock);
    fridayPM1Lock.addChangeListener(
        new ChangeListener()
        {
          @Override
          public void stateChanged(ChangeEvent evt)
          {
            lockField(evt);
          }
        });
    // Friday Total
    totalFriday = new JLabel(Double.toString(calcHours(friday.getAm1Date(), friday.getAm2Date(), friday.getPm1Date(), friday.getPm2Date())));
    timeGrid.add(totalFriday);

    // add Total row to grid
    JLabel space1Title = new JLabel();
    space1Title.setText(" ");
    timeGrid.add(space1Title);
    JLabel space2Title = new JLabel();
    space2Title.setText(" ");
    timeGrid.add(space2Title);
    JLabel space3Title = new JLabel();
    space3Title.setText(" ");
    timeGrid.add(space3Title);
    JLabel space4Title = new JLabel();
    space4Title.setText(" ");
    timeGrid.add(space4Title);
    JLabel space5Title = new JLabel();
    space5Title.setText(" ");
    timeGrid.add(space5Title);
    JLabel space6Title = new JLabel();
    space6Title.setText(" ");
    timeGrid.add(space6Title);

    JLabel total2Title = new JLabel();
    total2Title.setText("TOTAL = ");
    timeGrid.add(total2Title);

    overAllTotalTitle = new JLabel();
    overAllTotalTitle.setText("40.0");
    timeGrid.add(overAllTotalTitle);

    // Add Buttons
    prevButton = new JButton();
    prevButton.setText(" < ");
    prevButton.addActionListener(
        new ActionListener()
        {
          @Override
          public void actionPerformed(ActionEvent evt)
          {
            saveTimeInfo();
            displayDate.add(Calendar.WEEK_OF_YEAR, -1);
            getWeeksTimeInfo(displayDate);
            changeDate(evt);
          }
        });
    totalGrid.add(prevButton);
    JLabel space7Title = new JLabel();
    space7Title.setText(" ");
    totalGrid.add(space7Title);
    JLabel weekNumTitle = new JLabel();
    weekNumTitle.setText("Week #: ");
    totalGrid.add(weekNumTitle);
    weekNumSelector = new JComboBox(weekNums);
    weekNumSelector.setSelectedIndex(displayDate.get(Calendar.WEEK_OF_YEAR) - 1);
    weekNumSelector.addActionListener(
        new ActionListener()
        {
          @Override
          public void actionPerformed(ActionEvent evt)
          {
            saveTimeInfo();
            displayDate.set(Calendar.WEEK_OF_YEAR,
            Integer.parseInt((String)weekNumSelector.getSelectedItem()));
            getWeeksTimeInfo(displayDate);
            changeDate(evt);
          }
        });
    totalGrid.add(weekNumSelector);
    JLabel space8Title = new JLabel();
    space8Title.setText(" ");
    totalGrid.add(space8Title);
    nextButton = new JButton();
    nextButton.setText(" > ");
    nextButton.addActionListener(
        new ActionListener()
        {
          @Override
          public void actionPerformed(ActionEvent evt)
          {
            saveTimeInfo();
            displayDate.add(Calendar.WEEK_OF_YEAR, 1);
            getWeeksTimeInfo(displayDate);
            changeDate(evt);
          }
        });
    totalGrid.add(nextButton);

    // create a frame to hold panels
    application = new JFrame();

    // set the frame to exit when closed
    application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    application.setTitle("Work Hours Estimate");
    // application.setResizable(false);

    overallPanel.add(timeGrid);
    overallPanel.add(totalGrid);

    application.add(overallPanel);
    application.setSize(725, 300);
    application.setVisible(true);
    application.addWindowListener(new WindowAdapter()
    {
      public void windowClosing(WindowEvent e)
      {
        saveTimeInfo();
      }
    });

  }

  private static void calcTime(ChangeEvent evt)
  {
    // System.out.println("calcTime(ChangeEvent");

    Date monAM1 = (Date)timeSpinnerMondayAM1.getValue();
    Date monAM2 = (Date)timeSpinnerMondayAM2.getValue();
    Date monPM1 = (Date)timeSpinnerMondayPM1.getValue();
    Date monPM2 = (Date)timeSpinnerMondayPM2.getValue();

    Date tuesAM1 = (Date)timeSpinnerTuesdayAM1.getValue();
    Date tuesAM2 = (Date)timeSpinnerTuesdayAM2.getValue();
    Date tuesPM1 = (Date)timeSpinnerTuesdayPM1.getValue();
    Date tuesPM2 = (Date)timeSpinnerTuesdayPM2.getValue();

    Date wedAM1 = (Date)timeSpinnerWednesdayAM1.getValue();
    Date wedAM2 = (Date)timeSpinnerWednesdayAM2.getValue();
    Date wedPM1 = (Date)timeSpinnerWednesdayPM1.getValue();
    Date wedPM2 = (Date)timeSpinnerWednesdayPM2.getValue();

    Date thursAM1 = (Date)timeSpinnerThursdayAM1.getValue();
    Date thursAM2 = (Date)timeSpinnerThursdayAM2.getValue();
    Date thursPM1 = (Date)timeSpinnerThursdayPM1.getValue();
    Date thursPM2 = (Date)timeSpinnerThursdayPM2.getValue();

    Date friAM1 = (Date)timeSpinnerFridayAM1.getValue();
    Date friAM2 = (Date)timeSpinnerFridayAM2.getValue();
    Date friPM1 = (Date)timeSpinnerFridayPM1.getValue();
    Date friPM2 = (Date)timeSpinnerFridayPM2.getValue();

    monday.setAm1Date(monAM1);
    monday.setAm2Date(monAM2);
    monday.setPm1Date(monPM1);
    monday.setPm2Date(monPM2);

    tuesday.setAm1Date(tuesAM1);
    tuesday.setAm2Date(tuesAM2);
    tuesday.setPm1Date(tuesPM1);
    tuesday.setPm2Date(tuesPM2);

    wednesday.setAm1Date(wedAM1);
    wednesday.setAm2Date(wedAM2);
    wednesday.setPm1Date(wedPM1);
    wednesday.setPm2Date(wedPM2);

    thursday.setAm1Date(thursAM1);
    thursday.setAm2Date(thursAM2);
    thursday.setPm1Date(thursPM1);
    thursday.setPm2Date(thursPM2);

    friday.setAm1Date(friAM1);
    friday.setAm2Date(friAM2);
    friday.setPm1Date(friPM1);
    friday.setPm2Date(friPM2);

    double timeMonday = calcHours(monAM1, monAM2, monPM1, monPM2);
    double timeTuesday = calcHours(tuesAM1, tuesAM2, tuesPM1, tuesPM2);
    double timeWednesday = calcHours(wedAM1, wedAM2, wedPM1, wedPM2);
    double timeThursday = calcHours(thursAM1, thursAM2, thursPM1, thursPM2);
    double timeFriday = calcHours(friAM1, friAM2, friPM1, friPM2);
    double timeOverall = timeMonday + timeTuesday + timeWednesday + timeThursday + timeFriday;

    totalMonday.setText(Double.toString(timeMonday));
    totalTuesday.setText(Double.toString(timeTuesday));
    totalWednesday.setText(Double.toString(timeWednesday));
    totalThursday.setText(Double.toString(timeThursday));
    totalFriday.setText(Double.toString(timeFriday));
    overAllTotalTitle.setText(Double.toString(timeOverall));

  }

  private static void lockField(ChangeEvent evt)
  {
    // System.out.println("lockField(ChangeEvent");

    timeSpinnerMondayAM1.setEnabled(!mondayAM1Lock.isSelected());
    timeSpinnerMondayAM2.setEnabled(!mondayAM1Lock.isSelected());
    timeSpinnerMondayPM1.setEnabled(!mondayPM1Lock.isSelected());
    timeSpinnerMondayPM2.setEnabled(!mondayPM1Lock.isSelected());

    timeSpinnerTuesdayAM1.setEnabled(!tuesdayAM1Lock.isSelected());
    timeSpinnerTuesdayAM2.setEnabled(!tuesdayAM1Lock.isSelected());
    timeSpinnerTuesdayPM1.setEnabled(!tuesdayPM1Lock.isSelected());
    timeSpinnerTuesdayPM2.setEnabled(!tuesdayPM1Lock.isSelected());

    timeSpinnerWednesdayAM1.setEnabled(!wednesdayAM1Lock.isSelected());
    timeSpinnerWednesdayAM2.setEnabled(!wednesdayAM1Lock.isSelected());
    timeSpinnerWednesdayPM1.setEnabled(!wednesdayPM1Lock.isSelected());
    timeSpinnerWednesdayPM2.setEnabled(!wednesdayPM1Lock.isSelected());

    timeSpinnerThursdayAM1.setEnabled(!thursdayAM1Lock.isSelected());
    timeSpinnerThursdayAM2.setEnabled(!thursdayAM1Lock.isSelected());
    timeSpinnerThursdayPM1.setEnabled(!thursdayPM1Lock.isSelected());
    timeSpinnerThursdayPM2.setEnabled(!thursdayPM1Lock.isSelected());

    timeSpinnerFridayAM1.setEnabled(!fridayAM1Lock.isSelected());
    timeSpinnerFridayAM2.setEnabled(!fridayAM1Lock.isSelected());
    timeSpinnerFridayPM1.setEnabled(!fridayPM1Lock.isSelected());
    timeSpinnerFridayPM2.setEnabled(!fridayPM1Lock.isSelected());

    monday.setAmLock(mondayAM1Lock.isSelected());
    monday.setPmLock(mondayPM1Lock.isSelected());
    tuesday.setAmLock(tuesdayAM1Lock.isSelected());
    tuesday.setPmLock(tuesdayPM1Lock.isSelected());
    wednesday.setAmLock(wednesdayAM1Lock.isSelected());
    wednesday.setPmLock(wednesdayPM1Lock.isSelected());
    thursday.setAmLock(thursdayAM1Lock.isSelected());
    thursday.setPmLock(thursdayPM1Lock.isSelected());
    friday.setAmLock(fridayAM1Lock.isSelected());
    friday.setPmLock(fridayPM1Lock.isSelected());

  }

  private static void changeDate(ActionEvent e)
  {
    application.dispose();
    display();

  }

  private static double calcHours(Date AM1, Date AM2, Date PM1, Date PM2)
  {
    // System.out.println("calcHours(Date, Date, Date, Date");

    double doubAM1 = roundTime(AM1);
    double doubAM2 = roundTime(AM2);
    double doubPM1 = roundTime(PM1);
    double doubPM2 = roundTime(PM2);

    double hourTime = (doubAM2 - doubAM1) + (doubPM2 - doubPM1);

    return hourTime;
  }

  private static double roundTime(Date date)
  {
    // System.out.println("roundTime(Date");
    Calendar calDate = Calendar.getInstance();
    calDate.setTime(date);
    double hourTime = calDate.get(Calendar.HOUR_OF_DAY);
    double minTime = calDate.get(Calendar.MINUTE);

    if (minTime >= 0 && minTime <= 7)
    {
      minTime = 0;
    }
    else if (minTime >= 8 && minTime <= 22)
    {
      minTime = 15;
    }
    else if (minTime >= 23 && minTime <= 37)
    {
      minTime = 30;
    }
    else if (minTime >= 38 && minTime <= 52)
    {
      minTime = 45;
    }
    else if (minTime >= 53 && minTime <= 60)
    {
      hourTime++;
      minTime = 0;
    }

    return (hourTime + (minTime / 60));

  }

  private static TimeDay getTimeInfo(Date date)
  {
    // System.out.println("getTimeInfo(Date");

    TimeDay timeDay;

    timeDay = TimeCloudRegistry.getDayTime(date);

    Date AM2Date = new Date();
    Date PM1Date = new Date();
    Date PM2Date = new Date();

    AM2Date.setTime(date.getTime() + (4 * hour));
    PM1Date.setTime((long)(date.getTime() + (4.5 * hour)));
    PM2Date.setTime((long)(date.getTime() + (8.5 * hour)));

    try
    {
      if (timeDay.getTimeDate().equals(null))
      {
        //do nothing
      }
    }
    catch (NullPointerException nullPointer)
    {
      // using try-catch to check for null
      timeDay.setTimeDate(date);
      timeDay.setAm1Date(date);
      timeDay.setAm2Date(AM2Date);
      timeDay.setPm1Date(PM1Date);
      timeDay.setPm2Date(PM2Date);
      timeDay.setAmLock(false);
      timeDay.setPmLock(false);
      timeRegistry.newDayTime(timeDay);
      TimeCloudRegistry.newDayTime(timeDay);
    }

    return timeDay;

  }

  private static void saveTimeInfo()
  {
    // System.out.println("saveTimeInfo(");

    timeRegistry.setDayTime(monday);
    timeRegistry.setDayTime(tuesday);
    timeRegistry.setDayTime(wednesday);
    timeRegistry.setDayTime(thursday);
    timeRegistry.setDayTime(friday);

    TimeCloudRegistry.setDayTime(monday);
    TimeCloudRegistry.setDayTime(tuesday);
    TimeCloudRegistry.setDayTime(wednesday);
    TimeCloudRegistry.setDayTime(thursday);
    TimeCloudRegistry.setDayTime(friday);
  }

//  private static void syncDatabase()
//  {
//    ArrayList<TimeDay> allDays = timeRegistry.selectAll();
//
//    for (TimeDay day : allDays)
//    {
//      TimeCloudRegistry.replaceDayTime(day);
//    }
//  }
}
