
package org.tutorial.sunsetrise.adapters;

import javax.annotation.Generated;
import org.tutorial.sunsetrise.SunSetRiseConnector;
import org.tutorial.sunsetrise.basic.MetadataAware;


/**
 * A <code>SunSetRiseConnectorMetadataAdapater</code> is a wrapper around {@link SunSetRiseConnector } that adds support for querying metadata about the extension.
 * 
 */
@Generated(value = "Mule DevKit Version 3.4.0", date = "2013-08-11T06:03:22-07:00", comments = "Build 3.4.0.1555.8df15c1")
public class SunSetRiseConnectorMetadataAdapater
    extends SunSetRiseConnectorCapabilitiesAdapter
    implements MetadataAware
{

    private final static String MODULE_NAME = "sunsetrise";
    private final static String MODULE_VERSION = "1.0";
    private final static String DEVKIT_VERSION = "3.4.0";
    private final static String DEVKIT_BUILD = "3.4.0.1555.8df15c1";

    public String getModuleName() {
        return MODULE_NAME;
    }

    public String getModuleVersion() {
        return MODULE_VERSION;
    }

    public String getDevkitVersion() {
        return DEVKIT_VERSION;
    }

    public String getDevkitBuild() {
        return DEVKIT_BUILD;
    }

}
