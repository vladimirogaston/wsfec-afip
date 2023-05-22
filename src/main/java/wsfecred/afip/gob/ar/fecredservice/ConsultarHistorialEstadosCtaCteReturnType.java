
package wsfecred.afip.gob.ar.fecredservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consultarHistorialEstadosCtaCteReturnType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consultarHistorialEstadosCtaCteReturnType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idCtaCte" type="{http://ar.gob.afip.wsfecred/FECredService/}IdCtaCteType"/&gt;
 *         &lt;element name="arrayHistorialEstados" type="{http://ar.gob.afip.wsfecred/FECredService/}ArrayHistorialEstadosCtaCteType"/&gt;
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
@XmlType(name = "consultarHistorialEstadosCtaCteReturnType", propOrder = {
    "idCtaCte",
    "arrayHistorialEstados",
    "arrayErrores",
    "arrayErroresFormato"
})
public class ConsultarHistorialEstadosCtaCteReturnType {

    @XmlElement(required = true)
    protected IdCtaCteType idCtaCte;
    @XmlElement(required = true)
    protected ArrayHistorialEstadosCtaCteType arrayHistorialEstados;
    protected ArrayCodigosDescripcionesType arrayErrores;
    protected ArrayCodigosDescripcionesStringType arrayErroresFormato;

    /**
     * Gets the value of the idCtaCte property.
     * 
     * @return
     *     possible object is
     *     {@link IdCtaCteType }
     *     
     */
    public IdCtaCteType getIdCtaCte() {
        return idCtaCte;
    }

    /**
     * Sets the value of the idCtaCte property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdCtaCteType }
     *     
     */
    public void setIdCtaCte(IdCtaCteType value) {
        this.idCtaCte = value;
    }

    /**
     * Gets the value of the arrayHistorialEstados property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayHistorialEstadosCtaCteType }
     *     
     */
    public ArrayHistorialEstadosCtaCteType getArrayHistorialEstados() {
        return arrayHistorialEstados;
    }

    /**
     * Sets the value of the arrayHistorialEstados property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayHistorialEstadosCtaCteType }
     *     
     */
    public void setArrayHistorialEstados(ArrayHistorialEstadosCtaCteType value) {
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
