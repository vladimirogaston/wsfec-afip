
package wsfecred.afip.gob.ar.fecredservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OtroTributoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OtroTributoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="detalle" type="{http://ar.gob.afip.wsfecred/FECredService/}Texto250SimpleType" minOccurs="0"/&gt;
 *         &lt;element name="baseImponible" type="{http://ar.gob.afip.wsfecred/FECredService/}ImporteSimpleType"/&gt;
 *         &lt;element name="importe" type="{http://ar.gob.afip.wsfecred/FECredService/}ImporteSimpleType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtroTributoType", propOrder = {
    "codigo",
    "detalle",
    "baseImponible",
    "importe"
})
public class OtroTributoType {

    protected short codigo;
    protected String detalle;
    @XmlElement(required = true)
    protected BigDecimal baseImponible;
    @XmlElement(required = true)
    protected BigDecimal importe;

    /**
     * Gets the value of the codigo property.
     * 
     */
    public short getCodigo() {
        return codigo;
    }

    /**
     * Sets the value of the codigo property.
     * 
     */
    public void setCodigo(short value) {
        this.codigo = value;
    }

    /**
     * Gets the value of the detalle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetalle() {
        return detalle;
    }

    /**
     * Sets the value of the detalle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetalle(String value) {
        this.detalle = value;
    }

    /**
     * Gets the value of the baseImponible property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBaseImponible() {
        return baseImponible;
    }

    /**
     * Sets the value of the baseImponible property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBaseImponible(BigDecimal value) {
        this.baseImponible = value;
    }

    /**
     * Gets the value of the importe property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImporte() {
        return importe;
    }

    /**
     * Sets the value of the importe property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImporte(BigDecimal value) {
        this.importe = value;
    }

}
