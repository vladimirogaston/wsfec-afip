
package wsfecred.afip.gob.ar.fecredservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsultarFacturasAgtDptoCltvResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsultarFacturasAgtDptoCltvResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="consultarFacturasAgtDptoCltvReturn" type="{http://ar.gob.afip.wsfecred/FECredService/}ConsultarFacturasAgtDptoCltvReturnType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarFacturasAgtDptoCltvResponseType", propOrder = {
    "consultarFacturasAgtDptoCltvReturn"
})
public class ConsultarFacturasAgtDptoCltvResponseType {

    @XmlElement(required = true)
    protected ConsultarFacturasAgtDptoCltvReturnType consultarFacturasAgtDptoCltvReturn;

    /**
     * Gets the value of the consultarFacturasAgtDptoCltvReturn property.
     * 
     * @return
     *     possible object is
     *     {@link ConsultarFacturasAgtDptoCltvReturnType }
     *     
     */
    public ConsultarFacturasAgtDptoCltvReturnType getConsultarFacturasAgtDptoCltvReturn() {
        return consultarFacturasAgtDptoCltvReturn;
    }

    /**
     * Sets the value of the consultarFacturasAgtDptoCltvReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultarFacturasAgtDptoCltvReturnType }
     *     
     */
    public void setConsultarFacturasAgtDptoCltvReturn(ConsultarFacturasAgtDptoCltvReturnType value) {
        this.consultarFacturasAgtDptoCltvReturn = value;
    }

}
