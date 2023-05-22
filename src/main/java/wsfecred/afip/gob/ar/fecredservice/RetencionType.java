
package wsfecred.afip.gob.ar.fecredservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetencionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetencionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codTipo" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="importe" type="{http://ar.gob.afip.wsfecred/FECredService/}ImporteSimpleType"/&gt;
 *         &lt;element name="porcentaje" type="{http://ar.gob.afip.wsfecred/FECredService/}PorcentajeSimpleType"/&gt;
 *         &lt;element name="descMotivo" type="{http://ar.gob.afip.wsfecred/FECredService/}Texto250SimpleType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetencionType", propOrder = {
    "codTipo",
    "importe",
    "porcentaje",
    "descMotivo"
})
public class RetencionType {

    protected short codTipo;
    @XmlElement(required = true)
    protected BigDecimal importe;
    @XmlElement(required = true)
    protected BigDecimal porcentaje;
    protected String descMotivo;

    /**
     * Gets the value of the codTipo property.
     * 
     */
    public short getCodTipo() {
        return codTipo;
    }

    /**
     * Sets the value of the codTipo property.
     * 
     */
    public void setCodTipo(short value) {
        this.codTipo = value;
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

    /**
     * Gets the value of the porcentaje property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPorcentaje() {
        return porcentaje;
    }

    /**
     * Sets the value of the porcentaje property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPorcentaje(BigDecimal value) {
        this.porcentaje = value;
    }

    /**
     * Gets the value of the descMotivo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescMotivo() {
        return descMotivo;
    }

    /**
     * Sets the value of the descMotivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescMotivo(String value) {
        this.descMotivo = value;
    }

}
