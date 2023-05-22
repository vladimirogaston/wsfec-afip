
package wsfecred.afip.gob.ar.fecredservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for InfoSCAType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InfoSCAType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fechaAceptacionFactura" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="informaCBUReceptor" type="{http://ar.gob.afip.wsfecred/FECredService/}SiNoSimpleType"/&gt;
 *         &lt;element name="CBUReceptor" type="{http://ar.gob.afip.wsfecred/FECredService/}CBUSimpleType" minOccurs="0"/&gt;
 *         &lt;element name="CBUValidada" type="{http://ar.gob.afip.wsfecred/FECredService/}SiNoSimpleType" minOccurs="0"/&gt;
 *         &lt;element name="fechaLecturaSCA" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InfoSCAType", propOrder = {
    "fechaAceptacionFactura",
    "informaCBUReceptor",
    "cbuReceptor",
    "cbuValidada",
    "fechaLecturaSCA"
})
public class InfoSCAType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaAceptacionFactura;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected SiNoSimpleType informaCBUReceptor;
    @XmlElement(name = "CBUReceptor")
    protected String cbuReceptor;
    @XmlElement(name = "CBUValidada")
    @XmlSchemaType(name = "string")
    protected SiNoSimpleType cbuValidada;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaLecturaSCA;

    /**
     * Gets the value of the fechaAceptacionFactura property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaAceptacionFactura() {
        return fechaAceptacionFactura;
    }

    /**
     * Sets the value of the fechaAceptacionFactura property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaAceptacionFactura(XMLGregorianCalendar value) {
        this.fechaAceptacionFactura = value;
    }

    /**
     * Gets the value of the informaCBUReceptor property.
     * 
     * @return
     *     possible object is
     *     {@link SiNoSimpleType }
     *     
     */
    public SiNoSimpleType getInformaCBUReceptor() {
        return informaCBUReceptor;
    }

    /**
     * Sets the value of the informaCBUReceptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiNoSimpleType }
     *     
     */
    public void setInformaCBUReceptor(SiNoSimpleType value) {
        this.informaCBUReceptor = value;
    }

    /**
     * Gets the value of the cbuReceptor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCBUReceptor() {
        return cbuReceptor;
    }

    /**
     * Sets the value of the cbuReceptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCBUReceptor(String value) {
        this.cbuReceptor = value;
    }

    /**
     * Gets the value of the cbuValidada property.
     * 
     * @return
     *     possible object is
     *     {@link SiNoSimpleType }
     *     
     */
    public SiNoSimpleType getCBUValidada() {
        return cbuValidada;
    }

    /**
     * Sets the value of the cbuValidada property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiNoSimpleType }
     *     
     */
    public void setCBUValidada(SiNoSimpleType value) {
        this.cbuValidada = value;
    }

    /**
     * Gets the value of the fechaLecturaSCA property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaLecturaSCA() {
        return fechaLecturaSCA;
    }

    /**
     * Sets the value of the fechaLecturaSCA property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaLecturaSCA(XMLGregorianCalendar value) {
        this.fechaLecturaSCA = value;
    }

}
