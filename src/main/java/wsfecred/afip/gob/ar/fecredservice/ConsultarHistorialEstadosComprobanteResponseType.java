
package wsfecred.afip.gob.ar.fecredservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsultarHistorialEstadosComprobanteResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsultarHistorialEstadosComprobanteResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="consultarHistorialEstadosComprobanteReturn" type="{http://ar.gob.afip.wsfecred/FECredService/}ConsultarHistorialEstadosComprobanteReturnType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarHistorialEstadosComprobanteResponseType", propOrder = {
    "consultarHistorialEstadosComprobanteReturn"
})
public class ConsultarHistorialEstadosComprobanteResponseType {

    @XmlElement(required = true)
    protected ConsultarHistorialEstadosComprobanteReturnType consultarHistorialEstadosComprobanteReturn;

    /**
     * Gets the value of the consultarHistorialEstadosComprobanteReturn property.
     * 
     * @return
     *     possible object is
     *     {@link ConsultarHistorialEstadosComprobanteReturnType }
     *     
     */
    public ConsultarHistorialEstadosComprobanteReturnType getConsultarHistorialEstadosComprobanteReturn() {
        return consultarHistorialEstadosComprobanteReturn;
    }

    /**
     * Sets the value of the consultarHistorialEstadosComprobanteReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultarHistorialEstadosComprobanteReturnType }
     *     
     */
    public void setConsultarHistorialEstadosComprobanteReturn(ConsultarHistorialEstadosComprobanteReturnType value) {
        this.consultarHistorialEstadosComprobanteReturn = value;
    }

}
