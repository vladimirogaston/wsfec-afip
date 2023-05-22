
package wsfecred.afip.gob.ar.fecredservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for EstadoCmpType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EstadoCmpType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="estado" type="{http://ar.gob.afip.wsfecred/FECredService/}EstadoCmpSimpleType"/&gt;
 *         &lt;element name="fechaHoraEstado" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EstadoCmpType", propOrder = {
    "estado",
    "fechaHoraEstado"
})
public class EstadoCmpType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected EstadoCmpSimpleType estado;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraEstado;

    /**
     * Gets the value of the estado property.
     * 
     * @return
     *     possible object is
     *     {@link EstadoCmpSimpleType }
     *     
     */
    public EstadoCmpSimpleType getEstado() {
        return estado;
    }

    /**
     * Sets the value of the estado property.
     * 
     * @param value
     *     allowed object is
     *     {@link EstadoCmpSimpleType }
     *     
     */
    public void setEstado(EstadoCmpSimpleType value) {
        this.estado = value;
    }

    /**
     * Gets the value of the fechaHoraEstado property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaHoraEstado() {
        return fechaHoraEstado;
    }

    /**
     * Sets the value of the fechaHoraEstado property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaHoraEstado(XMLGregorianCalendar value) {
        this.fechaHoraEstado = value;
    }

}
