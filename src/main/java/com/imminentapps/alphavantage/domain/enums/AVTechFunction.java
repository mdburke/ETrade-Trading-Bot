package com.imminentapps.alphavantage.domain.enums;

/**
 * Created by mburke on 1/7/18.
 */
public enum AVTechFunction {
    SMA("SMA"),
    EMA("EMA"),
    WMA("WMA"),
    DEMA("DEMA"),
    TEMA("TEMA"),
    TRIMA("TRIMA"),
    KAMA("KAMA"),
    MAMA("MAMA"),
    T3("T3"),
    MACD("MACD"),
    MACDEXT("MACDEXT"),
    STOCH("STOCH"),
    RSI("RSI");

    private final String text;

    private AVTechFunction(final String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
