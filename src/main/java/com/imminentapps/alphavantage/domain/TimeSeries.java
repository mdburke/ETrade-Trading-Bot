package com.imminentapps.alphavantage.domain;

import com.imminentapps.alphavantage.domain.enums.AVTimeInterval;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by mburke on 1/7/18.
 */
public class TimeSeries {
    private ArrayList<DataPoint> dataPoints;
    private AVTimeInterval interval;
    private Date beginDate;
    private Date endDate;

    public TimeSeries() {
    }

    public TimeSeries(ArrayList<DataPoint> dataPoints, AVTimeInterval interval) {
        this.dataPoints = dataPoints;
        this.interval = interval;

        // Infer start and end date
        this.beginDate = dataPoints.get(0).getDate();
        this.endDate = dataPoints.get(dataPoints.size() - 1).getDate();
    }

    public TimeSeries(ArrayList<DataPoint> dataPoints, AVTimeInterval interval, Date beginDate, Date endDate) {
        this.dataPoints = dataPoints;
        this.interval = interval;
        this.beginDate = beginDate;
        this.endDate = endDate;
    }

    public ArrayList<DataPoint> getDataPoints() {
        return dataPoints;
    }

    public void setDataPoints(ArrayList<DataPoint> dataPoints) {
        this.dataPoints = dataPoints;
    }

    public AVTimeInterval getInterval() {
        return interval;
    }

    public void setInterval(AVTimeInterval interval) {
        this.interval = interval;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
