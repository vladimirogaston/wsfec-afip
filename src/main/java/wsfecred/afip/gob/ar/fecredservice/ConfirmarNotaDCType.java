
package wsfecred.afip.gob.ar.fecredservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfirmarNotaDCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfirmarNotaDCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="acepta" type="{http://ar.gob.afip.wsfecred/FECredService/}SiNoSimpleType"/&gt;
 *         &lt;element name="idNota" type="{http://ar.gob.afip.wsfecred/FECredService/}IdComprobanteType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfirmarNotaDCType", propOrder = {
    "acepta",
    "idNota"
})
public class ConfirmarNotaDCType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected SiNoSimpleType acepta;
    @XmlElement(required = true)
    protected IdComprobanteType idNota;

    /**
     * Gets the value of the acepta property.
     * 
     * @return
     *     possible object is
     *     {@link SiNoSimpleType }
     *     
     */
    public SiNoSimpleType getAcepta() {
        return acepta;
    }

    /**
     * Sets the value of the acepta property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiNoSimpleType }
     *     
     */
    public void setAcepta(SiNoSimpleType value) {
        this.acepta = value;
    }

    /**
     * Gets the value of the idNota property.
     * 
     * @return
     *     possible object is
     *     {@link IdComprobanteType }
     *     
     */
    public IdComprobanteType getIdNota() {
        return idNota;
    }

    /**
     * Sets the value of the idNota property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdComprobanteType }
     *     
     */
    public void setIdNota(IdComprobanteType value) {
        this.idNota = value;
    }

}
