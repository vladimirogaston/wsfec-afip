
package wsfecred.afip.gob.ar.fecredservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsultarCtaCteResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsultarCtaCteResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="consultarCtaCteReturn" type="{http://ar.gob.afip.wsfecred/FECredService/}ConsultarCtaCteReturnType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarCtaCteResponseType", propOrder = {
    "consultarCtaCteReturn"
})
public class ConsultarCtaCteResponseType {

    @XmlElement(required = true)
    protected ConsultarCtaCteReturnType consultarCtaCteReturn;

    /**
     * Gets the value of the consultarCtaCteReturn property.
     * 
     * @return
     *     possible object is
     *     {@link ConsultarCtaCteReturnType }
     *     
     */
    public ConsultarCtaCteReturnType getConsultarCtaCteReturn() {
        return consultarCtaCteReturn;
    }

    /**
     * Sets the value of the consultarCtaCteReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultarCtaCteReturnType }
     *     
     */
    public void setConsultarCtaCteReturn(ConsultarCtaCteReturnType value) {
        this.consultarCtaCteReturn = value;
    }

}
