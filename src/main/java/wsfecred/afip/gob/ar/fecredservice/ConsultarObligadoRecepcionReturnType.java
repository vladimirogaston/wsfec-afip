
package wsfecred.afip.gob.ar.fecredservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for consultarObligadoRecepcionReturnType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consultarObligadoRecepcionReturnType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="respuesta" type="{http://ar.gob.afip.wsfecred/FECredService/}SiNoSimpleType" minOccurs="0"/&gt;
 *         &lt;element name="desde" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="arrayObservacion" type="{http://ar.gob.afip.wsfecred/FECredService/}ArrayCodigosDescripcionesType" minOccurs="0"/&gt;
 *         &lt;element name="arrayErrores" type="{http://ar.gob.afip.wsfecred/FECredService/}ArrayCodigosDescripcionesType" minOccurs="0"/&gt;
 *         &lt;element name="arrayErroresFormato" type="{http://ar.gob.afip.wsfecred/FECredService/}ArrayCodigosDescripcionesStringType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultarObligadoRecepcionReturnType", propOrder = {
    "respuesta",
    "desde",
    "arrayObservacion",
    "arrayErrores",
    "arrayErroresFormato"
})
public class ConsultarObligadoRecepcionReturnType {

    @XmlSchemaType(name = "string")
    protected SiNoSimpleType respuesta;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar desde;
    protected ArrayCodigosDescripcionesType arrayObservacion;
    protected ArrayCodigosDescripcionesType arrayErrores;
    protected ArrayCodigosDescripcionesStringType arrayErroresFormato;

    /**
     * Gets the value of the respuesta property.
     * 
     * @return
     *     possible object is
     *     {@link SiNoSimpleType }
     *     
     */
    public SiNoSimpleType getRespuesta() {
        return respuesta;
    }

    /**
     * Sets the value of the respuesta property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiNoSimpleType }
     *     
     */
    public void setRespuesta(SiNoSimpleType value) {
        this.respuesta = value;
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
     * Gets the value of the arrayObservacion property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayCodigosDescripcionesType }
     *     
     */
    public ArrayCodigosDescripcionesType getArrayObservacion() {
        return arrayObservacion;
    }

    /**
     * Sets the value of the arrayObservacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayCodigosDescripcionesType }
     *     
     */
    public void setArrayObservacion(ArrayCodigosDescripcionesType value) {
        this.arrayObservacion = value;
    }

    /**
     * Gets the value of the arrayErrores property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayCodigosDescripcionesType }
     *     
     */
    public ArrayCodigosDescripcionesType getArrayErrores() {
        return arrayErrores;
    }

    /**
     * Sets the value of the arrayErrores property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayCodigosDescripcionesType }
     *     
     */
    public void setArrayErrores(ArrayCodigosDescripcionesType value) {
        this.arrayErrores = value;
    }

    /**
     * Gets the value of the arrayErroresFormato property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayCodigosDescripcionesStringType }
     *     
     */
    public ArrayCodigosDescripcionesStringType getArrayErroresFormato() {
        return arrayErroresFormato;
    }

    /**
     * Sets the value of the arrayErroresFormato property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayCodigosDescripcionesStringType }
     *     
     */
    public void setArrayErroresFormato(ArrayCodigosDescripcionesStringType value) {
        this.arrayErroresFormato = value;
    }

}
