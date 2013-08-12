package org.tutorial.sunsetrise.client;
import java.net.URL;
import org.mule.api.ConnectionException;
import org.mule.api.ConnectionExceptionCode;
import org.tutorial.sunsetrise.definition.SunSetRiseService;
import org.tutorial.sunsetrise.definition.SunSetRiseServiceSoap;
import org.tutorial.sunsetrise.definition.LatLonDate;

public class SunSetRiseProxyClient {
	
		private SunSetRiseServiceSoap port;
		
		public SunSetRiseProxyClient() {}
		
		public void initialize() throws ConnectionException {
			SunSetRiseService svc;

			// pick up the WSDL from the location in the JAR		
			URL url= SunSetRiseService.class.getClassLoader().getResource("wsdl/sunsetriseservice.wsdl");
			svc = new SunSetRiseService(url);
			
			port = svc.getSunSetRiseServiceSoap();
			
			// Configure Authentication headers here, if the service uses them.
			// Add parameters as needed to initialize() to pass them in from connector
		}

		public LatLonDate getSunSetRiseTime(LatLonDate coordinates) {
			return port.getSunSetRiseTime(coordinates); 
		}
		
}
