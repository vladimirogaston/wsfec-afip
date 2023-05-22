
package wsfecred.afip.gob.ar.fecredservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InfoCtaCteType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InfoCtaCteType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codCtaCte" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="estadoCtaCte" type="{http://ar.gob.afip.wsfecred/FECredService/}EstadoCtaCteType"/&gt;
 *         &lt;element name="idFacturaCredito" type="{http://ar.gob.afip.wsfecred/FECredService/}IdComprobanteType"/&gt;
 *         &lt;element name="importeTotalFC" type="{http://ar.gob.afip.wsfecred/FECredService/}ImporteSimpleType"/&gt;
 *         &lt;element name="saldo" type="{http://ar.gob.afip.wsfecred/FECredService/}ImporteSimpleType"/&gt;
 *         &lt;element name="saldoAceptado" type="{http://ar.gob.afip.wsfecred/FECredService/}ImporteSimpleType" minOccurs="0"/&gt;
 *         &lt;element name="codMoneda" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="opcionTransferencia" type="{http://ar.gob.afip.wsfecred/FECredService/}OpcionTransferenciaSimpleType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InfoCtaCteType", propOrder = {
    "codCtaCte",
    "estadoCtaCte",
    "idFacturaCredito",
    "importeTotalFC",
    "saldo",
    "saldoAceptado",
    "codMoneda",
    "opcionTransferencia"
})
public class InfoCtaCteType {

    protected long codCtaCte;
    @XmlElement(required = true)
    protected EstadoCtaCteType estadoCtaCte;
    @XmlElement(required = true)
    protected IdComprobanteType idFacturaCredito;
    @XmlElement(required = true)
    protected BigDecimal importeTotalFC;
    @XmlElement(required = true)
    protected BigDecimal saldo;
    protected BigDecimal saldoAceptado;
    @XmlElement(required = true)
    protected String codMoneda;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected OpcionTransferenciaSimpleType opcionTransferencia;

    /**
     * Gets the value of the codCtaCte property.
     * 
     */
    public long getCodCtaCte() {
        return codCtaCte;
    }

    /**
     * Sets the value of the codCtaCte property.
     * 
     */
    public void setCodCtaCte(long value) {
        this.codCtaCte = value;
    }

    /**
     * Gets the value of the estadoCtaCte property.
     * 
     * @return
     *     possible object is
     *     {@link EstadoCtaCteType }
     *     
     */
    public EstadoCtaCteType getEstadoCtaCte() {
        return estadoCtaCte;
    }

    /**
     * Sets the value of the estadoCtaCte property.
     * 
     * @param value
     *     allowed object is
     *     {@link EstadoCtaCteType }
     *     
     */
    public void setEstadoCtaCte(EstadoCtaCteType value) {
        this.estadoCtaCte = value;
    }

    /**
     * Gets the value of the idFacturaCredito property.
     * 
     * @return
     *     possible object is
     *     {@link IdComprobanteType }
     *     
     */
    public IdComprobanteType getIdFacturaCredito() {
        return idFacturaCredito;
    }

    /**
     * Sets the value of the idFacturaCredito property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdComprobanteType }
     *     
     */
    public void setIdFacturaCredito(IdComprobanteType value) {
        this.idFacturaCredito = value;
    }

    /**
     * Gets the value of the importeTotalFC property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImporteTotalFC() {
        return importeTotalFC;
    }

    /**
     * Sets the value of the importeTotalFC property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImporteTotalFC(BigDecimal value) {
        this.importeTotalFC = value;
    }

    /**
     * Gets the value of the saldo property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSaldo() {
        return saldo;
    }

    /**
     * Sets the value of the saldo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSaldo(BigDecimal value) {
        this.saldo = value;
    }

    /**
     * Gets the value of the saldoAceptado property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSaldoAceptado() {
        return saldoAceptado;
    }

    /**
     * Sets the value of the saldoAceptado property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSaldoAceptado(BigDecimal value) {
        this.saldoAceptado = value;
    }

    /**
     * Gets the value of the codMoneda property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodMoneda() {
        return codMoneda;
    }

    /**
     * Sets the value of the codMoneda property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodMoneda(String value) {
        this.codMoneda = value;
    }

    /**
     * Gets the value of the opcionTransferencia property.
     * 
     * @return
     *     possible object is
     *     {@link OpcionTransferenciaSimpleType }
     *     
     */
    public OpcionTransferenciaSimpleType getOpcionTransferencia() {
        return opcionTransferencia;
    }

    /**
     * Sets the value of the opcionTransferencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpcionTransferenciaSimpleType }
     *     
     */
    public void setOpcionTransferencia(OpcionTransferenciaSimpleType value) {
        this.opcionTransferencia = value;
    }

}
