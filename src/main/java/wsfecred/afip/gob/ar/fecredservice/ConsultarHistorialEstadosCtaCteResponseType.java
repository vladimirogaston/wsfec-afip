
package wsfecred.afip.gob.ar.fecredservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consultarHistorialEstadosCtaCteResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consultarHistorialEstadosCtaCteResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="consultarHistorialEstadosCtaCteReturn" type="{http://ar.gob.afip.wsfecred/FECredService/}consultarHistorialEstadosCtaCteReturnType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultarHistorialEstadosCtaCteResponseType", propOrder = {
    "consultarHistorialEstadosCtaCteReturn"
})
public class ConsultarHistorialEstadosCtaCteResponseType {

    @XmlElement(required = true)
    protected ConsultarHistorialEstadosCtaCteReturnType consultarHistorialEstadosCtaCteReturn;

    /**
     * Gets the value of the consultarHistorialEstadosCtaCteReturn property.
     * 
     * @return
     *     possible object is
     *     {@link ConsultarHistorialEstadosCtaCteReturnType }
     *     
     */
    public ConsultarHistorialEstadosCtaCteReturnType getConsultarHistorialEstadosCtaCteReturn() {
        return consultarHistorialEstadosCtaCteReturn;
    }

    /**
     * Sets the value of the consultarHistorialEstadosCtaCteReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultarHistorialEstadosCtaCteReturnType }
     *     
     */
    public void setConsultarHistorialEstadosCtaCteReturn(ConsultarHistorialEstadosCtaCteReturnType value) {
        this.consultarHistorialEstadosCtaCteReturn = value;
    }

}
