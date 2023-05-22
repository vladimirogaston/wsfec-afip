
package wsfecred.afip.gob.ar.fecredservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AjusteOperacionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AjusteOperacionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="importe" type="{http://ar.gob.afip.wsfecred/FECredService/}ImporteSimpleType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AjusteOperacionType", propOrder = {
    "codigo",
    "importe"
})
public class AjusteOperacionType {

    protected short codigo;
    @XmlElement(required = true)
    protected BigDecimal importe;

    /**
     * Gets the value of the codigo property.
     * 
     */
    public short getCodigo() {
        return codigo;
    }

    /**
     * Sets the value of the codigo property.
     * 
     */
    public void setCodigo(short value) {
        this.codigo = value;
    }

    /**
     * Gets the value of the importe property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImporte() {
        return importe;
    }

    /**
     * Sets the value of the importe property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImporte(BigDecimal value) {
        this.importe = value;
    }

}
