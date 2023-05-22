
package wsfecred.afip.gob.ar.fecredservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsultarHistorialEstadosComprobanteReturnType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsultarHistorialEstadosComprobanteReturnType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idComprobante" type="{http://ar.gob.afip.wsfecred/FECredService/}IdComprobanteType"/&gt;
 *         &lt;element name="arrayHistorialEstados" type="{http://ar.gob.afip.wsfecred/FECredService/}ArrayHistorialEstadosComprobanteType"/&gt;
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
@XmlType(name = "ConsultarHistorialEstadosComprobanteReturnType", propOrder = {
    "idComprobante",
    "arrayHistorialEstados",
    "arrayErrores",
    "arrayErroresFormato"
})
public class ConsultarHistorialEstadosComprobanteReturnType {

    @XmlElement(required = true)
    protected IdComprobanteType idComprobante;
    @XmlElement(required = true)
    protected ArrayHistorialEstadosComprobanteType arrayHistorialEstados;
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
     * Gets the value of the arrayHistorialEstados property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayHistorialEstadosComprobanteType }
     *     
     */
    public ArrayHistorialEstadosComprobanteType getArrayHistorialEstados() {
        return arrayHistorialEstados;
    }

    /**
     * Sets the value of the arrayHistorialEstados property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayHistorialEstadosComprobanteType }
     *     
     */
    public void setArrayHistorialEstados(ArrayHistorialEstadosComprobanteType value) {
        this.arrayHistorialEstados = value;
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
