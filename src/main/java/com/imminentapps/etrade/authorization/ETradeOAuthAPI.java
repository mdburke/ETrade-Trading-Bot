package com.imminentapps.etrade.authorization;

import com.github.scribejava.core.builder.api.DefaultApi10a;
import com.github.scribejava.core.model.OAuth1RequestToken;

/**
 * Created by mburke on 1/5/18.
 */
public class ETradeOAuthAPI extends DefaultApi10a {
    private static final String AUTHORIZE_URL = "https://us.etrade.com/e/t/etws/authorize?key=%s&token=%s";

    protected ETradeOAuthAPI() {}

    private static class InstanceHolder {
        private static final ETradeOAuthAPI INSTANCE = new ETradeOAuthAPI();
    }

    public static ETradeOAuthAPI instance() {
        return InstanceHolder.INSTANCE;
    }

    @Override
    public String getRequestTokenEndpoint() {
        return "https://etws.etrade.com/oauth/request_token";
    }

    @Override
    public String getAccessTokenEndpoint() {
        return "https://etws.etrade.com/oauth/access_token";
    }

    @Override
    public String getAuthorizationUrl(OAuth1RequestToken oAuth1RequestToken) {
        return String.format(AUTHORIZE_URL, "56925a0f62d3783d8bb8663ffa9dc7a0", oAuth1RequestToken.getToken());
    }
}
