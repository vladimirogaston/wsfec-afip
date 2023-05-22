
package wsfecred.afip.gob.ar.fecredservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InfoTransferenciaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InfoTransferenciaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="infoAgtDptoCltv" type="{http://ar.gob.afip.wsfecred/FECredService/}InfoAgtDptoCltvType"/&gt;
 *           &lt;element name="infoSCA" type="{http://ar.gob.afip.wsfecred/FECredService/}InfoSCAType"/&gt;
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
@XmlType(name = "InfoTransferenciaType", propOrder = {
    "infoAgtDptoCltv",
    "infoSCA"
})
public class InfoTransferenciaType {

    protected InfoAgtDptoCltvType infoAgtDptoCltv;
    protected InfoSCAType infoSCA;

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

    /**
     * Gets the value of the infoSCA property.
     * 
     * @return
     *     possible object is
     *     {@link InfoSCAType }
     *     
     */
    public InfoSCAType getInfoSCA() {
        return infoSCA;
    }

    /**
     * Sets the value of the infoSCA property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoSCAType }
     *     
     */
    public void setInfoSCA(InfoSCAType value) {
        this.infoSCA = value;
    }

}
