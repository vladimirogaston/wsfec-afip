
package wsfecred.afip.gob.ar.fecredservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consultarObligadoRecepcionRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consultarObligadoRecepcionRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="authRequest" type="{http://ar.gob.afip.wsfecred/FECredService/}AuthRequestType"/&gt;
 *         &lt;element name="cuitConsultada" type="{http://ar.gob.afip.wsfecred/FECredService/}CuitSimpleType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultarObligadoRecepcionRequestType", propOrder = {
    "authRequest",
    "cuitConsultada"
})
public class ConsultarObligadoRecepcionRequestType {

    @XmlElement(required = true)
    protected AuthRequestType authRequest;
    protected long cuitConsultada;

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
     * Gets the value of the cuitConsultada property.
     * 
     */
    public long getCuitConsultada() {
        return cuitConsultada;
    }

    /**
     * Sets the value of the cuitConsultada property.
     * 
     */
    public void setCuitConsultada(long value) {
        this.cuitConsultada = value;
    }

}
