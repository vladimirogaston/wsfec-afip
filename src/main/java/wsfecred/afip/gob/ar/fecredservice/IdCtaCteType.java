
package wsfecred.afip.gob.ar.fecredservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IdCtaCteType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdCtaCteType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="codCtaCte" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *           &lt;element name="idFactura" type="{http://ar.gob.afip.wsfecred/FECredService/}IdComprobanteType"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdCtaCteType", propOrder = {
    "codCtaCte",
    "idFactura"
})
public class IdCtaCteType {

    protected Long codCtaCte;
    protected IdComprobanteType idFactura;

    /**
     * Gets the value of the codCtaCte property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodCtaCte() {
        return codCtaCte;
    }

    /**
     * Sets the value of the codCtaCte property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodCtaCte(Long value) {
        this.codCtaCte = value;
    }

    /**
     * Gets the value of the idFactura property.
     * 
     * @return
     *     possible object is
     *     {@link IdComprobanteType }
     *     
     */
    public IdComprobanteType getIdFactura() {
        return idFactura;
    }

    /**
     * Sets the value of the idFactura property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdComprobanteType }
     *     
     */
    public void setIdFactura(IdComprobanteType value) {
        this.idFactura = value;
    }

}
