package com.imminentapps.alphavantage;

import com.imminentapps.alphavantage.domain.enums.AVTimeFunction;
import com.imminentapps.alphavantage.domain.enums.AVTimeInterval;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

/**
 * Created by mburke on 1/7/18.
 */
public class AlphaVantageAPIService {
    public final String BASE_URL = "https://www.alphavantage.co/";
    public final String QUERY = "query";

    private String apiKey;

    public AlphaVantageAPIService(String apiKey) {
        this.apiKey = apiKey;
    }

    /* Getters and Setters */
    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    /* API Methods */
    public Response getQuery(AVTimeFunction function, String symbol, AVTimeInterval interval, boolean isCompact) {
        Map<String, String> queryParams = new HashMap<>();
        queryParams.put("function", function.getText());
        queryParams.put("symbol", symbol);
        queryParams.put("apikey", apiKey);
        queryParams.put("datatype", "json");

        if (isCompact) {
            queryParams.put("outputsize", "compact");
        } else {
            queryParams.put("outputsize", "full");
        }

        if (interval != null) {
            queryParams.put("interval", interval.getText());
        }

        return
                given()
                        .baseUri(BASE_URL)
                        .queryParams(queryParams)
                .when()
                        .log().all()
                        .get(QUERY)
                .then()
                        .extract()
                        .response();
    }

    public Response getQuery(AVTimeFunction function, String symbol, boolean isCompact) {
        return getQuery(function, symbol, null, isCompact);
    }

    public Response getQuery(AVTimeFunction function, String symbol) {
        return getQuery(function, symbol, null, true);
    }

    public Response getTimeSeriesIntraday1Min(String symbol) {
        return getQuery(AVTimeFunction.TS_INTRADAY, symbol, AVTimeInterval.ONE_MINUTE, true);
    }

    public Response getTimeSeriesDaily(String symbol) {
        return getQuery(AVTimeFunction.TS_DAILY, symbol);
    }
}
