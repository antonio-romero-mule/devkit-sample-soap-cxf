
package org.tutorial.sunsetrise.oauth;

import javax.annotation.Generated;

@Generated(value = "Mule DevKit Version 3.4.0", date = "2013-08-11T06:03:22-07:00", comments = "Build 3.4.0.1555.8df15c1")
public interface SaveAccessTokenCallback {

        /**
     * Save access token and secret
     *
     * @param accessToken       Access token to be saved
     * @param accessTokenSecret Access token secret to be saved
     */
    void saveAccessToken(String accessToken, String accessTokenSecret);
}
