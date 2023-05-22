
package wsfecred.afip.gob.ar.fecredservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CuentaEnAgenteType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CuentaEnAgenteType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cuitAgente" type="{http://ar.gob.afip.wsfecred/FECredService/}CuitSimpleType"/&gt;
 *         &lt;element name="razonSocialAgente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idCuenta" type="{http://ar.gob.afip.wsfecred/FECredService/}IdCuentaAgenteSimpleType"/&gt;
 *         &lt;element name="denominacion" type="{http://ar.gob.afip.wsfecred/FECredService/}Texto250SimpleType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CuentaEnAgenteType", propOrder = {
    "cuitAgente",
    "razonSocialAgente",
    "idCuenta",
    "denominacion"
})
public class CuentaEnAgenteType {

    protected long cuitAgente;
    protected String razonSocialAgente;
    @XmlElement(required = true)
    protected String idCuenta;
    protected String denominacion;

    /**
     * Gets the value of the cuitAgente property.
     * 
     */
    public long getCuitAgente() {
        return cuitAgente;
    }

    /**
     * Sets the value of the cuitAgente property.
     * 
     */
    public void setCuitAgente(long value) {
        this.cuitAgente = value;
    }

    /**
     * Gets the value of the razonSocialAgente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazonSocialAgente() {
        return razonSocialAgente;
    }

    /**
     * Sets the value of the razonSocialAgente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazonSocialAgente(String value) {
        this.razonSocialAgente = value;
    }

    /**
     * Gets the value of the idCuenta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCuenta() {
        return idCuenta;
    }

    /**
     * Sets the value of the idCuenta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCuenta(String value) {
        this.idCuenta = value;
    }

    /**
     * Gets the value of the denominacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDenominacion() {
        return denominacion;
    }

    /**
     * Sets the value of the denominacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDenominacion(String value) {
        this.denominacion = value;
    }

}
