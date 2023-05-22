
package wsfecred.afip.gob.ar.fecredservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsultarTiposRetencionesResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsultarTiposRetencionesResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="consultarTiposRetencionesReturn" type="{http://ar.gob.afip.wsfecred/FECredService/}ConsultarTiposRetencionesReturnType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarTiposRetencionesResponseType", propOrder = {
    "consultarTiposRetencionesReturn"
})
public class ConsultarTiposRetencionesResponseType {

    @XmlElement(required = true)
    protected ConsultarTiposRetencionesReturnType consultarTiposRetencionesReturn;

    /**
     * Gets the value of the consultarTiposRetencionesReturn property.
     * 
     * @return
     *     possible object is
     *     {@link ConsultarTiposRetencionesReturnType }
     *     
     */
    public ConsultarTiposRetencionesReturnType getConsultarTiposRetencionesReturn() {
        return consultarTiposRetencionesReturn;
    }

    /**
     * Sets the value of the consultarTiposRetencionesReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultarTiposRetencionesReturnType }
     *     
     */
    public void setConsultarTiposRetencionesReturn(ConsultarTiposRetencionesReturnType value) {
        this.consultarTiposRetencionesReturn = value;
    }

}
