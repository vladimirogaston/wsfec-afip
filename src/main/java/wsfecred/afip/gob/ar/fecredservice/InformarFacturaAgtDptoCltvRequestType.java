
package wsfecred.afip.gob.ar.fecredservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InformarFacturaAgtDptoCltvRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InformarFacturaAgtDptoCltvRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="authRequest" type="{http://ar.gob.afip.wsfecred/FECredService/}AuthRequestType"/&gt;
 *         &lt;element name="idCtaCte" type="{http://ar.gob.afip.wsfecred/FECredService/}IdCtaCteType"/&gt;
 *         &lt;element name="ctaAgente" type="{http://ar.gob.afip.wsfecred/FECredService/}CuentaEnAgenteType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformarFacturaAgtDptoCltvRequestType", propOrder = {
    "authRequest",
    "idCtaCte",
    "ctaAgente"
})
public class InformarFacturaAgtDptoCltvRequestType {

    @XmlElement(required = true)
    protected AuthRequestType authRequest;
    @XmlElement(required = true)
    protected IdCtaCteType idCtaCte;
    @XmlElement(required = true)
    protected CuentaEnAgenteType ctaAgente;

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
     * Gets the value of the ctaAgente property.
     * 
     * @return
     *     possible object is
     *     {@link CuentaEnAgenteType }
     *     
     */
    public CuentaEnAgenteType getCtaAgente() {
        return ctaAgente;
    }

    /**
     * Sets the value of the ctaAgente property.
     * 
     * @param value
     *     allowed object is
     *     {@link CuentaEnAgenteType }
     *     
     */
    public void setCtaAgente(CuentaEnAgenteType value) {
        this.ctaAgente = value;
    }

}
