
package wsfecred.afip.gob.ar.fecredservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsultarFacturasAgtDptoCltvReturnType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsultarFacturasAgtDptoCltvReturnType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arrayFacturasAgtDptoCltv" type="{http://ar.gob.afip.wsfecred/FECredService/}ArrayFacturasAgtDptoCltvType" minOccurs="0"/&gt;
 *         &lt;element name="evento" type="{http://ar.gob.afip.wsfecred/FECredService/}CodigoDescripcionType" minOccurs="0"/&gt;
 *         &lt;element name="arrayObservaciones" type="{http://ar.gob.afip.wsfecred/FECredService/}ArrayCodigosDescripcionesType" minOccurs="0"/&gt;
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
@XmlType(name = "ConsultarFacturasAgtDptoCltvReturnType", propOrder = {
    "arrayFacturasAgtDptoCltv",
    "evento",
    "arrayObservaciones",
    "arrayErrores",
    "arrayErroresFormato"
})
public class ConsultarFacturasAgtDptoCltvReturnType {

    protected ArrayFacturasAgtDptoCltvType arrayFacturasAgtDptoCltv;
    protected CodigoDescripcionType evento;
    protected ArrayCodigosDescripcionesType arrayObservaciones;
    protected ArrayCodigosDescripcionesType arrayErrores;
    protected ArrayCodigosDescripcionesStringType arrayErroresFormato;

    /**
     * Gets the value of the arrayFacturasAgtDptoCltv property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayFacturasAgtDptoCltvType }
     *     
     */
    public ArrayFacturasAgtDptoCltvType getArrayFacturasAgtDptoCltv() {
        return arrayFacturasAgtDptoCltv;
    }

    /**
     * Sets the value of the arrayFacturasAgtDptoCltv property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayFacturasAgtDptoCltvType }
     *     
     */
    public void setArrayFacturasAgtDptoCltv(ArrayFacturasAgtDptoCltvType value) {
        this.arrayFacturasAgtDptoCltv = value;
    }

    /**
     * Gets the value of the evento property.
     * 
     * @return
     *     possible object is
     *     {@link CodigoDescripcionType }
     *     
     */
    public CodigoDescripcionType getEvento() {
        return evento;
    }

    /**
     * Sets the value of the evento property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodigoDescripcionType }
     *     
     */
    public void setEvento(CodigoDescripcionType value) {
        this.evento = value;
    }

    /**
     * Gets the value of the arrayObservaciones property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayCodigosDescripcionesType }
     *     
     */
    public ArrayCodigosDescripcionesType getArrayObservaciones() {
        return arrayObservaciones;
    }

    /**
     * Sets the value of the arrayObservaciones property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayCodigosDescripcionesType }
     *     
     */
    public void setArrayObservaciones(ArrayCodigosDescripcionesType value) {
        this.arrayObservaciones = value;
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