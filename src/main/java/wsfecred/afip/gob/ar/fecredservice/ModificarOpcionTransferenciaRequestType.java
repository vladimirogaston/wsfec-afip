
package wsfecred.afip.gob.ar.fecredservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModificarOpcionTransferenciaRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModificarOpcionTransferenciaRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="authRequest" type="{http://ar.gob.afip.wsfecred/FECredService/}AuthRequestType"/&gt;
 *         &lt;element name="idCtaCte" type="{http://ar.gob.afip.wsfecred/FECredService/}IdCtaCteType"/&gt;
 *         &lt;element name="opcionTransferencia" type="{http://ar.gob.afip.wsfecred/FECredService/}OpcionTransferenciaSimpleType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModificarOpcionTransferenciaRequestType", propOrder = {
    "authRequest",
    "idCtaCte",
    "opcionTransferencia"
})
public class ModificarOpcionTransferenciaRequestType {

    @XmlElement(required = true)
    protected AuthRequestType authRequest;
    @XmlElement(required = true)
    protected IdCtaCteType idCtaCte;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected OpcionTransferenciaSimpleType opcionTransferencia;

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
     * Gets the value of the opcionTransferencia property.
     * 
     * @return
     *     possible object is
     *     {@link OpcionTransferenciaSimpleType }
     *     
     */
    public OpcionTransferenciaSimpleType getOpcionTransferencia() {
        return opcionTransferencia;
    }

    /**
     * Sets the value of the opcionTransferencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpcionTransferenciaSimpleType }
     *     
     */
    public void setOpcionTransferencia(OpcionTransferenciaSimpleType value) {
        this.opcionTransferencia = value;
    }

}
