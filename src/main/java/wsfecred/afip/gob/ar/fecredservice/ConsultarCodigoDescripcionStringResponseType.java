
package wsfecred.afip.gob.ar.fecredservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsultarCodigoDescripcionStringResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsultarCodigoDescripcionStringResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigoDescripcionReturn" type="{http://ar.gob.afip.wsfecred/FECredService/}ConsultarCodigoDescripcionStringReturnType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarCodigoDescripcionStringResponseType", propOrder = {
    "codigoDescripcionReturn"
})
public class ConsultarCodigoDescripcionStringResponseType {

    @XmlElement(required = true)
    protected ConsultarCodigoDescripcionStringReturnType codigoDescripcionReturn;

    /**
     * Gets the value of the codigoDescripcionReturn property.
     * 
     * @return
     *     possible object is
     *     {@link ConsultarCodigoDescripcionStringReturnType }
     *     
     */
    public ConsultarCodigoDescripcionStringReturnType getCodigoDescripcionReturn() {
        return codigoDescripcionReturn;
    }

    /**
     * Sets the value of the codigoDescripcionReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultarCodigoDescripcionStringReturnType }
     *     
     */
    public void setCodigoDescripcionReturn(ConsultarCodigoDescripcionStringReturnType value) {
        this.codigoDescripcionReturn = value;
    }

}
