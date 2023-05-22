
package wsfecred.afip.gob.ar.fecredservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MotivoRechazoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MotivoRechazoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codMotivo" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="descMotivo" type="{http://ar.gob.afip.wsfecred/FECredService/}Texto250SimpleType"/&gt;
 *         &lt;element name="justificacion" type="{http://ar.gob.afip.wsfecred/FECredService/}Texto250SimpleType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MotivoRechazoType", propOrder = {
    "codMotivo",
    "descMotivo",
    "justificacion"
})
public class MotivoRechazoType {

    protected short codMotivo;
    @XmlElement(required = true)
    protected String descMotivo;
    @XmlElement(required = true)
    protected String justificacion;

    /**
     * Gets the value of the codMotivo property.
     * 
     */
    public short getCodMotivo() {
        return codMotivo;
    }

    /**
     * Sets the value of the codMotivo property.
     * 
     */
    public void setCodMotivo(short value) {
        this.codMotivo = value;
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

    /**
     * Gets the value of the justificacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJustificacion() {
        return justificacion;
    }

    /**
     * Sets the value of the justificacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJustificacion(String value) {
        this.justificacion = value;
    }

}
