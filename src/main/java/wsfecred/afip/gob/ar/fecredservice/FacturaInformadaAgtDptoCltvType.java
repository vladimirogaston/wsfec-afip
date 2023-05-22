
package wsfecred.afip.gob.ar.fecredservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FacturaInformadaAgtDptoCltvType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FacturaInformadaAgtDptoCltvType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idFactura" type="{http://ar.gob.afip.wsfecred/FECredService/}IdComprobanteType"/&gt;
 *         &lt;element name="infoAgtDptoCltv" type="{http://ar.gob.afip.wsfecred/FECredService/}InfoAgtDptoCltvType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacturaInformadaAgtDptoCltvType", propOrder = {
    "idFactura",
    "infoAgtDptoCltv"
})
public class FacturaInformadaAgtDptoCltvType {

    @XmlElement(required = true)
    protected IdComprobanteType idFactura;
    @XmlElement(required = true)
    protected InfoAgtDptoCltvType infoAgtDptoCltv;

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

    /**
     * Gets the value of the infoAgtDptoCltv property.
     * 
     * @return
     *     possible object is
     *     {@link InfoAgtDptoCltvType }
     *     
     */
    public InfoAgtDptoCltvType getInfoAgtDptoCltv() {
        return infoAgtDptoCltv;
    }

    /**
     * Sets the value of the infoAgtDptoCltv property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoAgtDptoCltvType }
     *     
     */
    public void setInfoAgtDptoCltv(InfoAgtDptoCltvType value) {
        this.infoAgtDptoCltv = value;
    }

}
