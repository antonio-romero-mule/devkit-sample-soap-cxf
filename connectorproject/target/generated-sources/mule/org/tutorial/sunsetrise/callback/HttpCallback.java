
package org.tutorial.sunsetrise.callback;

import javax.annotation.Generated;
import org.mule.api.context.MuleContextAware;
import org.mule.api.lifecycle.Startable;
import org.mule.api.lifecycle.Stoppable;

@Generated(value = "Mule DevKit Version 3.4.0", date = "2013-08-11T06:03:22-07:00", comments = "Build 3.4.0.1555.8df15c1")
public interface HttpCallback extends MuleContextAware, Startable, Stoppable
{

    String getUrl();
}
