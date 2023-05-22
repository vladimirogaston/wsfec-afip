
package wsfecred.afip.gob.ar.fecredservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsultarFacturasAgtDptoCltvRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsultarFacturasAgtDptoCltvRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="authRequest" type="{http://ar.gob.afip.wsfecred/FECredService/}AuthRequestType"/&gt;
 *         &lt;element name="idCtaCte" type="{http://ar.gob.afip.wsfecred/FECredService/}IdCtaCteType" minOccurs="0"/&gt;
 *         &lt;element name="filtroFecha" type="{http://ar.gob.afip.wsfecred/FECredService/}FiltroFechaType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarFacturasAgtDptoCltvRequestType", propOrder = {
    "authRequest",
    "idCtaCte",
    "filtroFecha"
})
public class ConsultarFacturasAgtDptoCltvRequestType {

    @XmlElement(required = true)
    protected AuthRequestType authRequest;
    protected IdCtaCteType idCtaCte;
    protected FiltroFechaType filtroFecha;

    /**
     * Gets the value of the authRequest property.
     * 
     * @return
     *     possible object is
     *     {@link AuthRequestType }
     *     
     */
    public AuthRequestType getAuthRequest() {
        return authRequest;
    }

    /**
     * Sets the value of the authRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthRequestType }
     *     
     */
    public void setAuthRequest(AuthRequestType value) {
        this.authRequest = value;
    }

    /**
     * Gets the value of the idCtaCte property.
     * 
     * @return
     *     possible object is
     *     {@link IdCtaCteType }
     *     
     */
    public IdCtaCteType getIdCtaCte() {
        return idCtaCte;
    }

    /**
     * Sets the value of the idCtaCte property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdCtaCteType }
     *     
     */
    public void setIdCtaCte(IdCtaCteType value) {
        this.idCtaCte = value;
    }

    /**
     * Gets the value of the filtroFecha property.
     * 
     * @return
     *     possible object is
     *     {@link FiltroFechaType }
     *     
     */
    public FiltroFechaType getFiltroFecha() {
        return filtroFecha;
    }

    /**
     * Sets the value of the filtroFecha property.
     * 
     * @param value
     *     allowed object is
     *     {@link FiltroFechaType }
     *     
     */
    public void setFiltroFecha(FiltroFechaType value) {
        this.filtroFecha = value;
    }

}
