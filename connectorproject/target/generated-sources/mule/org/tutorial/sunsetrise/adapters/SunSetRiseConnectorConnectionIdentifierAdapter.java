
package org.tutorial.sunsetrise.adapters;

import javax.annotation.Generated;
import org.tutorial.sunsetrise.SunSetRiseConnector;
import org.tutorial.sunsetrise.connection.Connection;


/**
 * A <code>SunSetRiseConnectorConnectionIdentifierAdapter</code> is a wrapper around {@link SunSetRiseConnector } that implements {@link org.mule.devkit.dynamic.api.helper.Connection} interface.
 * 
 */
@Generated(value = "Mule DevKit Version 3.4.0", date = "2013-08-11T06:03:22-07:00", comments = "Build 3.4.0.1555.8df15c1")
public class SunSetRiseConnectorConnectionIdentifierAdapter
    extends SunSetRiseConnectorProcessAdapter
    implements Connection
{


    public String getConnectionIdentifier() {
        return super.connectionId();
    }

}
