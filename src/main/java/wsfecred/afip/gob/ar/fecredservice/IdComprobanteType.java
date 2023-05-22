
package wsfecred.afip.gob.ar.fecredservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IdComprobanteType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdComprobanteType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CUITEmisor" type="{http://ar.gob.afip.wsfecred/FECredService/}CuitSimpleType"/&gt;
 *         &lt;element name="codTipoCmp" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="ptoVta" type="{http://ar.gob.afip.wsfecred/FECredService/}PuntoVentaSimpleType"/&gt;
 *         &lt;element name="nroCmp" type="{http://ar.gob.afip.wsfecred/FECredService/}NumeroComprobanteSimpleType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdComprobanteType", propOrder = {
    "cuitEmisor",
    "codTipoCmp",
    "ptoVta",
    "nroCmp"
})
public class IdComprobanteType {

    @XmlElement(name = "CUITEmisor")
    protected long cuitEmisor;
    protected short codTipoCmp;
    protected int ptoVta;
    @XmlSchemaType(name = "long")
    protected int nroCmp;

    /**
     * Gets the value of the cuitEmisor property.
     * 
     */
    public long getCUITEmisor() {
        return cuitEmisor;
    }

    /**
     * Sets the value of the cuitEmisor property.
     * 
     */
    public void setCUITEmisor(long value) {
        this.cuitEmisor = value;
    }

    /**
     * Gets the value of the codTipoCmp property.
     * 
     */
    public short getCodTipoCmp() {
        return codTipoCmp;
    }

    /**
     * Sets the value of the codTipoCmp property.
     * 
     */
    public void setCodTipoCmp(short value) {
        this.codTipoCmp = value;
    }

    /**
     * Gets the value of the ptoVta property.
     * 
     */
    public int getPtoVta() {
        return ptoVta;
    }

    /**
     * Sets the value of the ptoVta property.
     * 
     */
    public void setPtoVta(int value) {
        this.ptoVta = value;
    }

    /**
     * Gets the value of the nroCmp property.
     * 
     */
    public int getNroCmp() {
        return nroCmp;
    }

    /**
     * Sets the value of the nroCmp property.
     * 
     */
    public void setNroCmp(int value) {
        this.nroCmp = value;
    }

}
