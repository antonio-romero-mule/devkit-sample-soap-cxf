/**
 * This file was automatically generated by the Mule Development Kit
 */
package org.tutorial.sunsetrise;

import java.net.URL;

import org.mule.api.annotations.Connector;
import org.mule.api.annotations.Connect;
import org.mule.api.annotations.ValidateConnection;
import org.mule.api.annotations.ConnectionIdentifier;
import org.mule.api.annotations.Disconnect;
import org.mule.api.annotations.param.ConnectionKey;
import org.mule.api.ConnectionException;
import org.mule.api.annotations.Configurable;
import org.mule.api.annotations.Processor;

import org.tutorial.sunsetrise.definition.LatLonDate;
import org.tutorial.sunsetrise.client.SunSetRiseProxyClient;

/**
 * Cloud Connector
 *
 * @author MuleSoft, Inc.
 */
@Connector(name="sunsetrise", schemaVersion="1.0-SNAPSHOT")
public class SunSetRiseConnector
{
private SunSetRiseProxyClient client;

	/**
     * Connect
     *
     * @param username A username
     * @param password A password. (Note that this connector ignores the password.)
     * @throws ConnectionException
     */
    @Connect
    public void connect(@ConnectionKey String username, String password)
        throws ConnectionException {
        /*
         * "Establish connection" here = 
         * "create proxy client and port for later method calls"
         */
    	
        client = new SunSetRiseProxyClient();
        client.initialize();
    }

    /**
     * Disconnect
     */
    @Disconnect
    public void disconnect() {
        client=null;
    }

    /**
     * Are we connected
     */
    @ValidateConnection
    public boolean isConnected() {
        return (client!=null);
    }

    /**
     * Connection Identifier prefix (just a prefix?)
     */
    @ConnectionIdentifier
    public String connectionId() {
        return "SunSetRise-";
    }

    /**
     * Custom processor
     *
     * {@sample.xml ../../../doc/sunsetrise-connector.xml.sample sunsetrise-connector:get-sun-set-rise-time}
     *
     * @param latitude The desired latitude.
     * @param longitude The desired longitude.
     * @param month The desired month
     * @param day The desired day
     * @param year The desired year
     * @return Latitude, Longitude, Date, Sunrise and Sunset times, and a Timezone value in a LatLonDate
     */
    @Processor
    public LatLonDate getSunSetRiseTime(float latitude, float longitude, int month, int day, int year)
    {
        LatLonDate in=new LatLonDate();
        in.setLatitude(latitude);
        in.setLongitude(longitude);
        in.setMonth(month);
        in.setDay(day);
        in.setYear(year);        
        return client.getSunSetRiseTime(in);
    }
}