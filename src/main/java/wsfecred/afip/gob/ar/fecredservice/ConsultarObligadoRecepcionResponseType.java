
package wsfecred.afip.gob.ar.fecredservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consultarObligadoRecepcionResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consultarObligadoRecepcionResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="consultarObligadoRecepcionReturn" type="{http://ar.gob.afip.wsfecred/FECredService/}consultarObligadoRecepcionReturnType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultarObligadoRecepcionResponseType", propOrder = {
    "consultarObligadoRecepcionReturn"
})
public class ConsultarObligadoRecepcionResponseType {

    @XmlElement(required = true)
    protected ConsultarObligadoRecepcionReturnType consultarObligadoRecepcionReturn;

    /**
     * Gets the value of the consultarObligadoRecepcionReturn property.
     * 
     * @return
     *     possible object is
     *     {@link ConsultarObligadoRecepcionReturnType }
     *     
     */
    public ConsultarObligadoRecepcionReturnType getConsultarObligadoRecepcionReturn() {
        return consultarObligadoRecepcionReturn;
    }

    /**
     * Sets the value of the consultarObligadoRecepcionReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultarObligadoRecepcionReturnType }
     *     
     */
    public void setConsultarObligadoRecepcionReturn(ConsultarObligadoRecepcionReturnType value) {
        this.consultarObligadoRecepcionReturn = value;
    }

}
