
package wsfecred.afip.gob.ar.fecredservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsultarComprobantesResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsultarComprobantesResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="consultarCmpReturn" type="{http://ar.gob.afip.wsfecred/FECredService/}ConsultarCmpReturnType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarComprobantesResponseType", propOrder = {
    "consultarCmpReturn"
})
public class ConsultarComprobantesResponseType {

    @XmlElement(required = true)
    protected ConsultarCmpReturnType consultarCmpReturn;

    /**
     * Gets the value of the consultarCmpReturn property.
     * 
     * @return
     *     possible object is
     *     {@link ConsultarCmpReturnType }
     *     
     */
    public ConsultarCmpReturnType getConsultarCmpReturn() {
        return consultarCmpReturn;
    }

    /**
     * Sets the value of the consultarCmpReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultarCmpReturnType }
     *     
     */
    public void setConsultarCmpReturn(ConsultarCmpReturnType value) {
        this.consultarCmpReturn = value;
    }

}
