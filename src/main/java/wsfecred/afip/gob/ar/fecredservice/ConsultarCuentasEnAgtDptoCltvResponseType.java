
package wsfecred.afip.gob.ar.fecredservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consultarCuentasEnAgtDptoCltvResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consultarCuentasEnAgtDptoCltvResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="consultarCuentasEnAgtDptoCltvReturn" type="{http://ar.gob.afip.wsfecred/FECredService/}ConsultarCuentasEnAgtDptoCltvReturnType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultarCuentasEnAgtDptoCltvResponseType", propOrder = {
    "consultarCuentasEnAgtDptoCltvReturn"
})
public class ConsultarCuentasEnAgtDptoCltvResponseType {

    @XmlElement(required = true)
    protected ConsultarCuentasEnAgtDptoCltvReturnType consultarCuentasEnAgtDptoCltvReturn;

    /**
     * Gets the value of the consultarCuentasEnAgtDptoCltvReturn property.
     * 
     * @return
     *     possible object is
     *     {@link ConsultarCuentasEnAgtDptoCltvReturnType }
     *     
     */
    public ConsultarCuentasEnAgtDptoCltvReturnType getConsultarCuentasEnAgtDptoCltvReturn() {
        return consultarCuentasEnAgtDptoCltvReturn;
    }

    /**
     * Sets the value of the consultarCuentasEnAgtDptoCltvReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultarCuentasEnAgtDptoCltvReturnType }
     *     
     */
    public void setConsultarCuentasEnAgtDptoCltvReturn(ConsultarCuentasEnAgtDptoCltvReturnType value) {
        this.consultarCuentasEnAgtDptoCltvReturn = value;
    }

}
