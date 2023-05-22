
package wsfecred.afip.gob.ar.fecredservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RechazarNotaDCReturnType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RechazarNotaDCReturnType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idComprobante" type="{http://ar.gob.afip.wsfecred/FECredService/}IdComprobanteType"/&gt;
 *         &lt;element name="resultado" type="{http://ar.gob.afip.wsfecred/FECredService/}ResultadoSimpleType"/&gt;
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
@XmlType(name = "RechazarNotaDCReturnType", propOrder = {
    "idComprobante",
    "resultado",
    "evento",
    "arrayObservaciones",
    "arrayErrores",
    "arrayErroresFormato"
})
public class RechazarNotaDCReturnType {

    @XmlElement(required = true)
    protected IdComprobanteType idComprobante;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ResultadoSimpleType resultado;
    protected CodigoDescripcionType evento;
    protected ArrayCodigosDescripcionesType arrayObservaciones;
    protected ArrayCodigosDescripcionesType arrayErrores;
    protected ArrayCodigosDescripcionesStringType arrayErroresFormato;

    /**
     * Gets the value of the idComprobante property.
     * 
     * @return
     *     possible object is
     *     {@link IdComprobanteType }
     *     
     */
    public IdComprobanteType getIdComprobante() {
        return idComprobante;
    }

    /**
     * Sets the value of the idComprobante property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdComprobanteType }
     *     
     */
    public void setIdComprobante(IdComprobanteType value) {
        this.idComprobante = value;
    }

    /**
     * Gets the value of the resultado property.
     * 
     * @return
     *     possible object is
     *     {@link ResultadoSimpleType }
     *     
     */
    public ResultadoSimpleType getResultado() {
        return resultado;
    }

    /**
     * Sets the value of the resultado property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultadoSimpleType }
     *     
     */
    public void setResultado(ResultadoSimpleType value) {
        this.resultado = value;
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
