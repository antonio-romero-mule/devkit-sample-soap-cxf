
package org.tutorial.sunsetrise.processors;

import java.util.List;
import javax.annotation.Generated;
import org.mule.api.MessagingException;
import org.mule.api.MuleContext;
import org.mule.api.MuleEvent;
import org.mule.api.MuleException;
import org.mule.api.construct.FlowConstruct;
import org.mule.api.lifecycle.Disposable;
import org.mule.api.lifecycle.Initialisable;
import org.mule.api.lifecycle.InitialisationException;
import org.mule.api.lifecycle.Startable;
import org.mule.api.lifecycle.Stoppable;
import org.mule.api.processor.MessageProcessor;
import org.mule.config.i18n.CoreMessages;
import org.tutorial.sunsetrise.SunSetRiseConnector;
import org.tutorial.sunsetrise.connectivity.SunSetRiseConnectorConnectionManager;
import org.tutorial.sunsetrise.process.ProcessAdapter;
import org.tutorial.sunsetrise.process.ProcessCallback;
import org.tutorial.sunsetrise.process.ProcessTemplate;


/**
 * GetSunSetRiseTimeMessageProcessor invokes the {@link org.tutorial.sunsetrise.SunSetRiseConnector#getSunSetRiseTime(float, float, int, int, int)} method in {@link SunSetRiseConnector }. For each argument there is a field in this processor to match it.  Before invoking the actual method the processor will evaluate and transform where possible to the expected argument type.
 * 
 */
@Generated(value = "Mule DevKit Version 3.4.0", date = "2013-08-11T06:03:22-07:00", comments = "Build 3.4.0.1555.8df15c1")
public class GetSunSetRiseTimeMessageProcessor
    extends AbstractMessageProcessor<Object>
    implements Disposable, Initialisable, Startable, Stoppable, MessageProcessor
{

    protected Object latitude;
    protected float _latitudeType;
    protected Object longitude;
    protected float _longitudeType;
    protected Object month;
    protected int _monthType;
    protected Object day;
    protected int _dayType;
    protected Object year;
    protected int _yearType;

    /**
     * Obtains the expression manager from the Mule context and initialises the connector. If a target object  has not been set already it will search the Mule registry for a default one.
     * 
     * @throws InitialisationException
     */
    public void initialise()
        throws InitialisationException
    {
    }

    public void start()
        throws MuleException
    {
    }

    public void stop()
        throws MuleException
    {
    }

    public void dispose() {
    }

    /**
     * Set the Mule context
     * 
     * @param context Mule context to set
     */
    public void setMuleContext(MuleContext context) {
        super.setMuleContext(context);
    }

    /**
     * Sets flow construct
     * 
     * @param flowConstruct Flow construct to set
     */
    public void setFlowConstruct(FlowConstruct flowConstruct) {
        super.setFlowConstruct(flowConstruct);
    }

    /**
     * Sets month
     * 
     * @param value Value to set
     */
    public void setMonth(Object value) {
        this.month = value;
    }

    /**
     * Sets year
     * 
     * @param value Value to set
     */
    public void setYear(Object value) {
        this.year = value;
    }

    /**
     * Sets longitude
     * 
     * @param value Value to set
     */
    public void setLongitude(Object value) {
        this.longitude = value;
    }

    /**
     * Sets day
     * 
     * @param value Value to set
     */
    public void setDay(Object value) {
        this.day = value;
    }

    /**
     * Sets latitude
     * 
     * @param value Value to set
     */
    public void setLatitude(Object value) {
        this.latitude = value;
    }

    /**
     * Invokes the MessageProcessor.
     * 
     * @param event MuleEvent to be processed
     * @throws MuleException
     */
    public MuleEvent process(final MuleEvent event)
        throws MuleException
    {
        Object moduleObject = null;
        try {
            moduleObject = findOrCreate(SunSetRiseConnectorConnectionManager.class, true, event);
            final Float _transformedLatitude = ((Float) evaluateAndTransform(getMuleContext(), event, GetSunSetRiseTimeMessageProcessor.class.getDeclaredField("_latitudeType").getGenericType(), null, latitude));
            final Float _transformedLongitude = ((Float) evaluateAndTransform(getMuleContext(), event, GetSunSetRiseTimeMessageProcessor.class.getDeclaredField("_longitudeType").getGenericType(), null, longitude));
            final Integer _transformedMonth = ((Integer) evaluateAndTransform(getMuleContext(), event, GetSunSetRiseTimeMessageProcessor.class.getDeclaredField("_monthType").getGenericType(), null, month));
            final Integer _transformedDay = ((Integer) evaluateAndTransform(getMuleContext(), event, GetSunSetRiseTimeMessageProcessor.class.getDeclaredField("_dayType").getGenericType(), null, day));
            final Integer _transformedYear = ((Integer) evaluateAndTransform(getMuleContext(), event, GetSunSetRiseTimeMessageProcessor.class.getDeclaredField("_yearType").getGenericType(), null, year));
            Object resultPayload;
            ProcessTemplate<Object, Object> processTemplate = ((ProcessAdapter<Object> ) moduleObject).getProcessTemplate();
            resultPayload = processTemplate.execute(new ProcessCallback<Object,Object>() {


                public List<Class> getManagedExceptions() {
                    return null;
                }

                public boolean isProtected() {
                    return false;
                }

                public Object process(Object object)
                    throws Exception
                {
                    return ((SunSetRiseConnector) object).getSunSetRiseTime(_transformedLatitude, _transformedLongitude, _transformedMonth, _transformedDay, _transformedYear);
                }

            }
            , this, event);
            overwritePayload(event, resultPayload);
            return event;
        } catch (MessagingException messagingException) {
            messagingException.setProcessedEvent(event);
            throw messagingException;
        } catch (Exception e) {
            throw new MessagingException(CoreMessages.failedToInvoke("getSunSetRiseTime"), event, e);
        }
    }

}
