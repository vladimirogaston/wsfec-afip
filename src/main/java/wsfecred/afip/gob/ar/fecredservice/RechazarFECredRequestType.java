
package wsfecred.afip.gob.ar.fecredservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RechazarFECredRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RechazarFECredRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="authRequest" type="{http://ar.gob.afip.wsfecred/FECredService/}AuthRequestType"/&gt;
 *         &lt;element name="idCtaCte" type="{http://ar.gob.afip.wsfecred/FECredService/}IdCtaCteType"/&gt;
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
@XmlType(name = "RechazarFECredRequestType", propOrder = {
    "authRequest",
    "idCtaCte",
    "arrayMotivosRechazo"
})
public class RechazarFECredRequestType {

    @XmlElement(required = true)
    protected AuthRequestType authRequest;
    @XmlElement(required = true)
    protected IdCtaCteType idCtaCte;
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
