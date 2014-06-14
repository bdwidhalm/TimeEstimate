package com.woody.TimeEstimate;

import java.util.Date;

public class TimeDay
{
  private Date timeDate;
  private Date am1Date;
  private Date am2Date;
  private boolean amLock;
  private Date pm1Date;
  private Date pm2Date;
  private boolean pmLock;

  public Date getTimeDate()
  {
    return timeDate;
  }
  public void setTimeDate(Date timeDate)
  {
    this.timeDate = timeDate;
  }
  public Date getAm1Date()
  {
    return am1Date;
  }
  public void setAm1Date(Date am1Date)
  {
    this.am1Date = am1Date;
  }
  public Date getAm2Date()
  {
    return am2Date;
  }
  public void setAm2Date(Date am2Date)
  {
    this.am2Date = am2Date;
  }
  public boolean isAmLock()
  {
    return amLock;
  }
  public void setAmLock(boolean amLock)
  {
    this.amLock = amLock;
  }
  public Date getPm1Date()
  {
    return pm1Date;
  }
  public void setPm1Date(Date pm1Date)
  {
    this.pm1Date = pm1Date;
  }
  public Date getPm2Date()
  {
    return pm2Date;
  }
  public void setPm2Date(Date pm2Date)
  {
    this.pm2Date = pm2Date;
  }
  public boolean isPmLock()
  {
    return pmLock;
  }
  public void setPmLock(boolean pmLock)
  {
    this.pmLock = pmLock;
  }



}
