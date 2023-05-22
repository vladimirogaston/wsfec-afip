
package wsfecred.afip.gob.ar.fecredservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoRetencionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TipoRetencionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigoJurisdiccion" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="descripcionJurisdiccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="porcentajeRetencion" type="{http://ar.gob.afip.wsfecred/FECredService/}PorcentajeSimpleType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoRetencionType", propOrder = {
    "codigoJurisdiccion",
    "descripcionJurisdiccion",
    "porcentajeRetencion"
})
public class TipoRetencionType {

    protected short codigoJurisdiccion;
    @XmlElement(required = true)
    protected String descripcionJurisdiccion;
    @XmlElement(required = true)
    protected BigDecimal porcentajeRetencion;

    /**
     * Gets the value of the codigoJurisdiccion property.
     * 
     */
    public short getCodigoJurisdiccion() {
        return codigoJurisdiccion;
    }

    /**
     * Sets the value of the codigoJurisdiccion property.
     * 
     */
    public void setCodigoJurisdiccion(short value) {
        this.codigoJurisdiccion = value;
    }

    /**
     * Gets the value of the descripcionJurisdiccion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionJurisdiccion() {
        return descripcionJurisdiccion;
    }

    /**
     * Sets the value of the descripcionJurisdiccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionJurisdiccion(String value) {
        this.descripcionJurisdiccion = value;
    }

    /**
     * Gets the value of the porcentajeRetencion property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPorcentajeRetencion() {
        return porcentajeRetencion;
    }

    /**
     * Sets the value of the porcentajeRetencion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPorcentajeRetencion(BigDecimal value) {
        this.porcentajeRetencion = value;
    }

}
