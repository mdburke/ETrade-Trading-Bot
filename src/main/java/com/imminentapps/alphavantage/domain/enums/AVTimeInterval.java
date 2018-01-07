package com.imminentapps.alphavantage.domain.enums;

/**
 * Created by mburke on 1/7/18.
 */
public enum AVTimeInterval {
    ONE_MINUTE("1min"),
    FIVE_MINUTE("5min"),
    FIFTEN_MINUTE("15min"),
    THIRTY_MINUTE("30min"),
    SIXTY_MINUTE("60min");

    private final String text;

    private AVTimeInterval(final String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
