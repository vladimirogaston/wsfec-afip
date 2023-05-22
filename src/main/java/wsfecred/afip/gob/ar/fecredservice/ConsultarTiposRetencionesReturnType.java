
package wsfecred.afip.gob.ar.fecredservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsultarTiposRetencionesReturnType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsultarTiposRetencionesReturnType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arrayTiposRetenciones" type="{http://ar.gob.afip.wsfecred/FECredService/}ArrayTiposRetencionesType" minOccurs="0"/&gt;
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
@XmlType(name = "ConsultarTiposRetencionesReturnType", propOrder = {
    "arrayTiposRetenciones",
    "arrayErroresFormato"
})
public class ConsultarTiposRetencionesReturnType {

    protected ArrayTiposRetencionesType arrayTiposRetenciones;
    protected ArrayCodigosDescripcionesStringType arrayErroresFormato;

    /**
     * Gets the value of the arrayTiposRetenciones property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayTiposRetencionesType }
     *     
     */
    public ArrayTiposRetencionesType getArrayTiposRetenciones() {
        return arrayTiposRetenciones;
    }

    /**
     * Sets the value of the arrayTiposRetenciones property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayTiposRetencionesType }
     *     
     */
    public void setArrayTiposRetenciones(ArrayTiposRetencionesType value) {
        this.arrayTiposRetenciones = value;
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
