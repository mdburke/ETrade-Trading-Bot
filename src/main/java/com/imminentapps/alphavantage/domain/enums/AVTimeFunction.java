package com.imminentapps.alphavantage.domain.enums;

/**
 * Created by mburke on 1/7/18.
 */
public enum AVTimeFunction {
    TS_INTRADAY("TIME_SERIES_INTRADAY"),
    TS_DAILY("TIME_SERIES_DAILY"),
    TS_DAILY_ADJUSTED("TIME_SERIES_DAILY_ADJUSTED"),
    TS_WEEKLY("TIME_SERIES_WEEKLY"),
    TS_WEEKLY_ADJUSTED("TIME_SERIES_WEEKLY_ADJUSTED"),
    TS_MONTHLY("TIME_SERIES_MONTHLY"),
    TS_MONTHLY_ADJUSTED("TIME_SERIES_MONTHLY_ADJUSTED"),
    BATCH_STOCK_QUOTES("BATCH_STOCK_QUOTES");

    private final String text;

    private AVTimeFunction(final String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
