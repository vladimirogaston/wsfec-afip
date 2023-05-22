
package wsfecred.afip.gob.ar.fecredservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RechazarNotaDCResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RechazarNotaDCResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rechazarNotaDCReturn" type="{http://ar.gob.afip.wsfecred/FECredService/}RechazarNotaDCReturnType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RechazarNotaDCResponseType", propOrder = {
    "rechazarNotaDCReturn"
})
public class RechazarNotaDCResponseType {

    @XmlElement(required = true)
    protected RechazarNotaDCReturnType rechazarNotaDCReturn;

    /**
     * Gets the value of the rechazarNotaDCReturn property.
     * 
     * @return
     *     possible object is
     *     {@link RechazarNotaDCReturnType }
     *     
     */
    public RechazarNotaDCReturnType getRechazarNotaDCReturn() {
        return rechazarNotaDCReturn;
    }

    /**
     * Sets the value of the rechazarNotaDCReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RechazarNotaDCReturnType }
     *     
     */
    public void setRechazarNotaDCReturn(RechazarNotaDCReturnType value) {
        this.rechazarNotaDCReturn = value;
    }

}
