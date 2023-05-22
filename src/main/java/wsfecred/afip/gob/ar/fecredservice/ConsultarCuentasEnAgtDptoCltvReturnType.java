
package wsfecred.afip.gob.ar.fecredservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsultarCuentasEnAgtDptoCltvReturnType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsultarCuentasEnAgtDptoCltvReturnType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arrayCuentasEnAgente" type="{http://ar.gob.afip.wsfecred/FECredService/}ArrayCuentasEnAgenteType" minOccurs="0"/&gt;
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
@XmlType(name = "ConsultarCuentasEnAgtDptoCltvReturnType", propOrder = {
    "arrayCuentasEnAgente",
    "arrayObservacion",
    "arrayErrores",
    "arrayErroresFormato"
})
public class ConsultarCuentasEnAgtDptoCltvReturnType {

    protected ArrayCuentasEnAgenteType arrayCuentasEnAgente;
    protected ArrayCodigosDescripcionesType arrayObservacion;
    protected ArrayCodigosDescripcionesType arrayErrores;
    protected ArrayCodigosDescripcionesStringType arrayErroresFormato;

    /**
     * Gets the value of the arrayCuentasEnAgente property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayCuentasEnAgenteType }
     *     
     */
    public ArrayCuentasEnAgenteType getArrayCuentasEnAgente() {
        return arrayCuentasEnAgente;
    }

    /**
     * Sets the value of the arrayCuentasEnAgente property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayCuentasEnAgenteType }
     *     
     */
    public void setArrayCuentasEnAgente(ArrayCuentasEnAgenteType value) {
        this.arrayCuentasEnAgente = value;
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
