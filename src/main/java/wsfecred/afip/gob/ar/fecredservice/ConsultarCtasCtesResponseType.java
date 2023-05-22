
package wsfecred.afip.gob.ar.fecredservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsultarCtasCtesResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsultarCtasCtesResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="consultarCtasCtesReturn" type="{http://ar.gob.afip.wsfecred/FECredService/}ConsultarCtasCtesReturnType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarCtasCtesResponseType", propOrder = {
    "consultarCtasCtesReturn"
})
public class ConsultarCtasCtesResponseType {

    @XmlElement(required = true)
    protected ConsultarCtasCtesReturnType consultarCtasCtesReturn;

    /**
     * Gets the value of the consultarCtasCtesReturn property.
     * 
     * @return
     *     possible object is
     *     {@link ConsultarCtasCtesReturnType }
     *     
     */
    public ConsultarCtasCtesReturnType getConsultarCtasCtesReturn() {
        return consultarCtasCtesReturn;
    }

    /**
     * Sets the value of the consultarCtasCtesReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultarCtasCtesReturnType }
     *     
     */
    public void setConsultarCtasCtesReturn(ConsultarCtasCtesReturnType value) {
        this.consultarCtasCtesReturn = value;
    }

}
