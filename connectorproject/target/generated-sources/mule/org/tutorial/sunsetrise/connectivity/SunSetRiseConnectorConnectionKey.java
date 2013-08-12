
package org.tutorial.sunsetrise.connectivity;

import javax.annotation.Generated;


/**
 * A tuple of connection parameters
 * 
 */
@Generated(value = "Mule DevKit Version 3.4.0", date = "2013-08-11T06:03:22-07:00", comments = "Build 3.4.0.1555.8df15c1")
public class SunSetRiseConnectorConnectionKey {

    /**
     * 
     */
    private String username;
    /**
     * 
     */
    private String password;

    public SunSetRiseConnectorConnectionKey(String username, String password) {
        this.username = username;
        this.password = password;
    }

    /**
     * Sets username
     * 
     * @param value Value to set
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Retrieves username
     * 
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * Sets password
     * 
     * @param value Value to set
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Retrieves password
     * 
     */
    public String getPassword() {
        return this.password;
    }

    public int hashCode() {
        int hash = 1;
        hash = (hash* 31);
        if (this.username!= null) {
            hash += this.username.hashCode();
        }
        return hash;
    }

    public boolean equals(Object obj) {
        return (((obj instanceof SunSetRiseConnectorConnectionKey)&&(this.username!= null))&&this.username.equals(((SunSetRiseConnectorConnectionKey) obj).username));
    }

}
