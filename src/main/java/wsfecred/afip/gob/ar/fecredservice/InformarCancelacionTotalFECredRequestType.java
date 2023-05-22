
package wsfecred.afip.gob.ar.fecredservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InformarCancelacionTotalFECredRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InformarCancelacionTotalFECredRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="authRequest" type="{http://ar.gob.afip.wsfecred/FECredService/}AuthRequestType"/&gt;
 *         &lt;element name="idCtaCte" type="{http://ar.gob.afip.wsfecred/FECredService/}IdCtaCteType"/&gt;
 *         &lt;element name="arrayFormasCancelacion" type="{http://ar.gob.afip.wsfecred/FECredService/}ArrayCodigosDescripcionesType"/&gt;
 *         &lt;element name="importeCancelacion" type="{http://ar.gob.afip.wsfecred/FECredService/}ImporteSimpleType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformarCancelacionTotalFECredRequestType", propOrder = {
    "authRequest",
    "idCtaCte",
    "arrayFormasCancelacion",
    "importeCancelacion"
})
public class InformarCancelacionTotalFECredRequestType {

    @XmlElement(required = true)
    protected AuthRequestType authRequest;
    @XmlElement(required = true)
    protected IdCtaCteType idCtaCte;
    @XmlElement(required = true)
    protected ArrayCodigosDescripcionesType arrayFormasCancelacion;
    @XmlElement(required = true)
    protected BigDecimal importeCancelacion;

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
     * Gets the value of the arrayFormasCancelacion property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayCodigosDescripcionesType }
     *     
     */
    public ArrayCodigosDescripcionesType getArrayFormasCancelacion() {
        return arrayFormasCancelacion;
    }

    /**
     * Sets the value of the arrayFormasCancelacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayCodigosDescripcionesType }
     *     
     */
    public void setArrayFormasCancelacion(ArrayCodigosDescripcionesType value) {
        this.arrayFormasCancelacion = value;
    }

    /**
     * Gets the value of the importeCancelacion property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImporteCancelacion() {
        return importeCancelacion;
    }

    /**
     * Sets the value of the importeCancelacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImporteCancelacion(BigDecimal value) {
        this.importeCancelacion = value;
    }

}
