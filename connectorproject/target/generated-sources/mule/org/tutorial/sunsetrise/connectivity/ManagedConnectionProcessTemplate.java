
package org.tutorial.sunsetrise.connectivity;

import javax.annotation.Generated;
import org.mule.api.MuleContext;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.tutorial.sunsetrise.adapters.SunSetRiseConnectorConnectionIdentifierAdapter;
import org.tutorial.sunsetrise.connection.ConnectionManager;
import org.tutorial.sunsetrise.process.ManagedConnectionProcessInterceptor;
import org.tutorial.sunsetrise.process.ProcessCallback;
import org.tutorial.sunsetrise.process.ProcessCallbackProcessInterceptor;
import org.tutorial.sunsetrise.process.ProcessInterceptor;
import org.tutorial.sunsetrise.process.ProcessTemplate;
import org.tutorial.sunsetrise.process.RetryProcessInterceptor;

@Generated(value = "Mule DevKit Version 3.4.0", date = "2013-08-11T06:03:22-07:00", comments = "Build 3.4.0.1555.8df15c1")
public class ManagedConnectionProcessTemplate<P >implements ProcessTemplate<P, SunSetRiseConnectorConnectionIdentifierAdapter>
{

    private final ProcessInterceptor<P, SunSetRiseConnectorConnectionIdentifierAdapter> processInterceptor;

    public ManagedConnectionProcessTemplate(ConnectionManager<SunSetRiseConnectorConnectionKey, SunSetRiseConnectorConnectionIdentifierAdapter> connectionManager, MuleContext muleContext) {
        ProcessInterceptor<P, SunSetRiseConnectorConnectionIdentifierAdapter> processCallbackProcessInterceptor = new ProcessCallbackProcessInterceptor<P, SunSetRiseConnectorConnectionIdentifierAdapter>();
        ProcessInterceptor<P, SunSetRiseConnectorConnectionIdentifierAdapter> managedConnectionProcessInterceptor = new ManagedConnectionProcessInterceptor<P>(processCallbackProcessInterceptor, connectionManager, muleContext);
        ProcessInterceptor<P, SunSetRiseConnectorConnectionIdentifierAdapter> retryProcessInterceptor = new RetryProcessInterceptor<P, SunSetRiseConnectorConnectionIdentifierAdapter>(managedConnectionProcessInterceptor, muleContext, connectionManager.getRetryPolicyTemplate());
        processInterceptor = retryProcessInterceptor;
    }

    public P execute(ProcessCallback<P, SunSetRiseConnectorConnectionIdentifierAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
        throws Exception
    {
        return processInterceptor.execute(processCallback, null, messageProcessor, event);
    }

    public P execute(ProcessCallback<P, SunSetRiseConnectorConnectionIdentifierAdapter> processCallback, Filter filter, MuleMessage message)
        throws Exception
    {
        return processInterceptor.execute(processCallback, null, filter, message);
    }

}
