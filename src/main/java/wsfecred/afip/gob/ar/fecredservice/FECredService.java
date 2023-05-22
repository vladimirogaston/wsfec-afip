package wsfecred.afip.gob.ar.fecredservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.5.0
 * 2023-05-22T11:18:27.676-03:00
 * Generated source version: 3.5.0
 *
 */
@WebServiceClient(name = "FECredService",
                  wsdlLocation = "file:/C:/Users/Vladimiro/eclipse-workspace/wsfec-afip/src/main/resources/FECredService.wsdl",
                  targetNamespace = "http://ar.gob.afip.wsfecred/FECredService/")
public class FECredService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://ar.gob.afip.wsfecred/FECredService/", "FECredService");
    public final static QName FECredServiceSOAP = new QName("http://ar.gob.afip.wsfecred/FECredService/", "FECredServiceSOAP");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/Vladimiro/eclipse-workspace/wsfec-afip/src/main/resources/FECredService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(FECredService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/Vladimiro/eclipse-workspace/wsfec-afip/src/main/resources/FECredService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public FECredService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public FECredService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public FECredService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public FECredService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public FECredService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public FECredService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns FECredServicePortType
     */
    @WebEndpoint(name = "FECredServiceSOAP")
    public FECredServicePortType getFECredServiceSOAP() {
        return super.getPort(FECredServiceSOAP, FECredServicePortType.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns FECredServicePortType
     */
    @WebEndpoint(name = "FECredServiceSOAP")
    public FECredServicePortType getFECredServiceSOAP(WebServiceFeature... features) {
        return super.getPort(FECredServiceSOAP, FECredServicePortType.class, features);
    }

}
