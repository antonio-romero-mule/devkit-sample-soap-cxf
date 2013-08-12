
package org.tutorial.sunsetrise.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.tutorial.sunsetrise.SunSetRiseConnector;
import org.tutorial.sunsetrise.process.ProcessAdapter;
import org.tutorial.sunsetrise.process.ProcessCallback;
import org.tutorial.sunsetrise.process.ProcessTemplate;
import org.tutorial.sunsetrise.process.ProcessTemplate;


/**
 * A <code>SunSetRiseConnectorProcessAdapter</code> is a wrapper around {@link SunSetRiseConnector } that enables custom processing strategies.
 * 
 */
@Generated(value = "Mule DevKit Version 3.4.0", date = "2013-08-11T06:03:22-07:00", comments = "Build 3.4.0.1555.8df15c1")
public class SunSetRiseConnectorProcessAdapter
    extends SunSetRiseConnectorLifecycleAdapter
    implements ProcessAdapter<SunSetRiseConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, SunSetRiseConnectorCapabilitiesAdapter> getProcessTemplate() {
        final SunSetRiseConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,SunSetRiseConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, SunSetRiseConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, SunSetRiseConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
