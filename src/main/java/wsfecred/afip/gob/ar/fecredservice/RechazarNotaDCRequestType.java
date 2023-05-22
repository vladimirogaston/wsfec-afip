
package wsfecred.afip.gob.ar.fecredservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RechazarNotaDCRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RechazarNotaDCRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="authRequest" type="{http://ar.gob.afip.wsfecred/FECredService/}AuthRequestType"/&gt;
 *         &lt;element name="idComprobante" type="{http://ar.gob.afip.wsfecred/FECredService/}IdComprobanteType"/&gt;
 *         &lt;element name="arrayMotivosRechazo" type="{http://ar.gob.afip.wsfecred/FECredService/}ArrayMotivosRechazoType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RechazarNotaDCRequestType", propOrder = {
    "authRequest",
    "idComprobante",
    "arrayMotivosRechazo"
})
public class RechazarNotaDCRequestType {

    @XmlElement(required = true)
    protected AuthRequestType authRequest;
    @XmlElement(required = true)
    protected IdComprobanteType idComprobante;
    @XmlElement(required = true)
    protected ArrayMotivosRechazoType arrayMotivosRechazo;

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
     * Gets the value of the idComprobante property.
     * 
     * @return
     *     possible object is
     *     {@link IdComprobanteType }
     *     
     */
    public IdComprobanteType getIdComprobante() {
        return idComprobante;
    }

    /**
     * Sets the value of the idComprobante property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdComprobanteType }
     *     
     */
    public void setIdComprobante(IdComprobanteType value) {
        this.idComprobante = value;
    }

    /**
     * Gets the value of the arrayMotivosRechazo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayMotivosRechazoType }
     *     
     */
    public ArrayMotivosRechazoType getArrayMotivosRechazo() {
        return arrayMotivosRechazo;
    }

    /**
     * Sets the value of the arrayMotivosRechazo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayMotivosRechazoType }
     *     
     */
    public void setArrayMotivosRechazo(ArrayMotivosRechazoType value) {
        this.arrayMotivosRechazo = value;
    }

}
