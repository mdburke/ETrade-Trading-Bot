package com.imminentapps.alphavantage.domain;

import com.imminentapps.alphavantage.domain.enums.AVTimeInterval;

import java.util.Date;
import java.util.TimeZone;

/**
 * Created by mburke on 1/7/18.
 */
public class TimeSeriesResponse {
    private TimeSeries timeSeries;
    private String information;
    private String symbol;
    private Date lastRefreshed;
    private AVTimeInterval timeInterval;
    private String outputSize;
    private TimeZone timeZone;

    public TimeSeriesResponse() {
    }

    public TimeSeriesResponse(TimeSeries timeSeries, String information, String symbol, Date lastRefreshed, AVTimeInterval timeInterval, String outputSize, TimeZone timeZone) {
        this.timeSeries = timeSeries;
        this.information = information;
        this.symbol = symbol;
        this.lastRefreshed = lastRefreshed;
        this.timeInterval = timeInterval;
        this.outputSize = outputSize;
        this.timeZone = timeZone;
    }

    public TimeSeries getTimeSeries() {
        return timeSeries;
    }

    public void setTimeSeries(TimeSeries timeSeries) {
        this.timeSeries = timeSeries;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Date getLastRefreshed() {
        return lastRefreshed;
    }

    public void setLastRefreshed(Date lastRefreshed) {
        this.lastRefreshed = lastRefreshed;
    }

    public AVTimeInterval getTimeInterval() {
        return timeInterval;
    }

    public void setTimeInterval(AVTimeInterval timeInterval) {
        this.timeInterval = timeInterval;
    }

    public String getOutputSize() {
        return outputSize;
    }

    public void setOutputSize(String outputSize) {
        this.outputSize = outputSize;
    }

    public TimeZone getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(TimeZone timeZone) {
        this.timeZone = timeZone;
    }
}
