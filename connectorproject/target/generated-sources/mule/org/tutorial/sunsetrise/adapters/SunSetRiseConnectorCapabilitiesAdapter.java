
package org.tutorial.sunsetrise.adapters;

import javax.annotation.Generated;
import org.tutorial.sunsetrise.SunSetRiseConnector;
import org.tutorial.sunsetrise.basic.Capabilities;
import org.tutorial.sunsetrise.basic.Capability;


/**
 * A <code>SunSetRiseConnectorCapabilitiesAdapter</code> is a wrapper around {@link SunSetRiseConnector } that implements {@link org.mule.api.Capabilities} interface.
 * 
 */
@Generated(value = "Mule DevKit Version 3.4.0", date = "2013-08-11T06:03:22-07:00", comments = "Build 3.4.0.1555.8df15c1")
public class SunSetRiseConnectorCapabilitiesAdapter
    extends SunSetRiseConnector
    implements Capabilities
{


    /**
     * Returns true if this module implements such capability
     * 
     */
    public boolean isCapableOf(Capability capability) {
        if (capability == Capability.LIFECYCLE_CAPABLE) {
            return true;
        }
        if (capability == Capability.CONNECTION_MANAGEMENT_CAPABLE) {
            return true;
        }
        return false;
    }

}
