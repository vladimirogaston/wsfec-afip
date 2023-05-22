
package wsfecred.afip.gob.ar.fecredservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FiltroFechaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FiltroFechaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tipo" type="{http://ar.gob.afip.wsfecred/FECredService/}TipoFechaSimpleType"/&gt;
 *         &lt;element name="desde" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="hasta" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FiltroFechaType", propOrder = {
    "tipo",
    "desde",
    "hasta"
})
public class FiltroFechaType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TipoFechaSimpleType tipo;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar desde;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar hasta;

    /**
     * Gets the value of the tipo property.
     * 
     * @return
     *     possible object is
     *     {@link TipoFechaSimpleType }
     *     
     */
    public TipoFechaSimpleType getTipo() {
        return tipo;
    }

    /**
     * Sets the value of the tipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoFechaSimpleType }
     *     
     */
    public void setTipo(TipoFechaSimpleType value) {
        this.tipo = value;
    }

    /**
     * Gets the value of the desde property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDesde() {
        return desde;
    }

    /**
     * Sets the value of the desde property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDesde(XMLGregorianCalendar value) {
        this.desde = value;
    }

    /**
     * Gets the value of the hasta property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHasta() {
        return hasta;
    }

    /**
     * Sets the value of the hasta property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHasta(XMLGregorianCalendar value) {
        this.hasta = value;
    }

}
