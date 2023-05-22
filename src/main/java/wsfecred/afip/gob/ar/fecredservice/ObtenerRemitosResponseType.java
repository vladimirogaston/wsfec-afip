
package wsfecred.afip.gob.ar.fecredservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ObtenerRemitosResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObtenerRemitosResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="obtenerRemitosReturn" type="{http://ar.gob.afip.wsfecred/FECredService/}ObtenerRemitosReturnType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObtenerRemitosResponseType", propOrder = {
    "obtenerRemitosReturn"
})
public class ObtenerRemitosResponseType {

    @XmlElement(required = true)
    protected ObtenerRemitosReturnType obtenerRemitosReturn;

    /**
     * Gets the value of the obtenerRemitosReturn property.
     * 
     * @return
     *     possible object is
     *     {@link ObtenerRemitosReturnType }
     *     
     */
    public ObtenerRemitosReturnType getObtenerRemitosReturn() {
        return obtenerRemitosReturn;
    }

    /**
     * Sets the value of the obtenerRemitosReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObtenerRemitosReturnType }
     *     
     */
    public void setObtenerRemitosReturn(ObtenerRemitosReturnType value) {
        this.obtenerRemitosReturn = value;
    }

}
