
package wsfecred.afip.gob.ar.fecredservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperacionFECredResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperacionFECredResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="operacionFECredReturn" type="{http://ar.gob.afip.wsfecred/FECredService/}OperacionFECredReturnType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperacionFECredResponseType", propOrder = {
    "operacionFECredReturn"
})
public class OperacionFECredResponseType {

    @XmlElement(required = true)
    protected OperacionFECredReturnType operacionFECredReturn;

    /**
     * Gets the value of the operacionFECredReturn property.
     * 
     * @return
     *     possible object is
     *     {@link OperacionFECredReturnType }
     *     
     */
    public OperacionFECredReturnType getOperacionFECredReturn() {
        return operacionFECredReturn;
    }

    /**
     * Sets the value of the operacionFECredReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperacionFECredReturnType }
     *     
     */
    public void setOperacionFECredReturn(OperacionFECredReturnType value) {
        this.operacionFECredReturn = value;
    }

}
