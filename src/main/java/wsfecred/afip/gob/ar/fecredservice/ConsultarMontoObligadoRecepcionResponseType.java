
package wsfecred.afip.gob.ar.fecredservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsultarMontoObligadoRecepcionResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsultarMontoObligadoRecepcionResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="consultarMontoObligadoRecepcionReturn" type="{http://ar.gob.afip.wsfecred/FECredService/}ConsultarMontoObligadoRecepcionReturnType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarMontoObligadoRecepcionResponseType", propOrder = {
    "consultarMontoObligadoRecepcionReturn"
})
public class ConsultarMontoObligadoRecepcionResponseType {

    @XmlElement(required = true)
    protected ConsultarMontoObligadoRecepcionReturnType consultarMontoObligadoRecepcionReturn;

    /**
     * Gets the value of the consultarMontoObligadoRecepcionReturn property.
     * 
     * @return
     *     possible object is
     *     {@link ConsultarMontoObligadoRecepcionReturnType }
     *     
     */
    public ConsultarMontoObligadoRecepcionReturnType getConsultarMontoObligadoRecepcionReturn() {
        return consultarMontoObligadoRecepcionReturn;
    }

    /**
     * Sets the value of the consultarMontoObligadoRecepcionReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultarMontoObligadoRecepcionReturnType }
     *     
     */
    public void setConsultarMontoObligadoRecepcionReturn(ConsultarMontoObligadoRecepcionReturnType value) {
        this.consultarMontoObligadoRecepcionReturn = value;
    }

}
