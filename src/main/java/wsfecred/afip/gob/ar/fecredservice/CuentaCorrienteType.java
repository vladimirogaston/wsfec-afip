
package wsfecred.afip.gob.ar.fecredservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CuentaCorrienteType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CuentaCorrienteType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codCtaCte" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="estadoCtaCte" type="{http://ar.gob.afip.wsfecred/FECredService/}EstadoCtaCteType"/&gt;
 *         &lt;element name="factura" type="{http://ar.gob.afip.wsfecred/FECredService/}ComprobanteType"/&gt;
 *         &lt;element name="arrayNotasDCAsociadas" type="{http://ar.gob.afip.wsfecred/FECredService/}ArrayComprobantesType" minOccurs="0"/&gt;
 *         &lt;element name="arrayFormasCancelacion" type="{http://ar.gob.afip.wsfecred/FECredService/}ArrayCodigosDescripcionesType" minOccurs="0"/&gt;
 *         &lt;element name="arrayRetenciones" type="{http://ar.gob.afip.wsfecred/FECredService/}ArrayRetencionesType" minOccurs="0"/&gt;
 *         &lt;element name="arrayAjustesOperacion" type="{http://ar.gob.afip.wsfecred/FECredService/}ArrayAjustesOperacionType" minOccurs="0"/&gt;
 *         &lt;element name="importeInicial" type="{http://ar.gob.afip.wsfecred/FECredService/}ImporteSimpleType"/&gt;
 *         &lt;element name="importeTotalNotasDC" type="{http://ar.gob.afip.wsfecred/FECredService/}ImporteSimpleType" minOccurs="0"/&gt;
 *         &lt;element name="importeCancelado" type="{http://ar.gob.afip.wsfecred/FECredService/}ImporteSimpleType" minOccurs="0"/&gt;
 *         &lt;element name="importeTotalRetPesos" type="{http://ar.gob.afip.wsfecred/FECredService/}ImporteSimpleType" minOccurs="0"/&gt;
 *         &lt;element name="importeEmbargoPesos" type="{http://ar.gob.afip.wsfecred/FECredService/}ImporteSimpleType" minOccurs="0"/&gt;
 *         &lt;element name="saldoAceptado" type="{http://ar.gob.afip.wsfecred/FECredService/}ImporteSimpleType" minOccurs="0"/&gt;
 *         &lt;element name="saldo" type="{http://ar.gob.afip.wsfecred/FECredService/}ImporteSimpleType"/&gt;
 *         &lt;element name="codMoneda" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cotizacionMonedaUlt" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CuentaCorrienteType", propOrder = {
    "codCtaCte",
    "estadoCtaCte",
    "factura",
    "arrayNotasDCAsociadas",
    "arrayFormasCancelacion",
    "arrayRetenciones",
    "arrayAjustesOperacion",
    "importeInicial",
    "importeTotalNotasDC",
    "importeCancelado",
    "importeTotalRetPesos",
    "importeEmbargoPesos",
    "saldoAceptado",
    "saldo",
    "codMoneda",
    "cotizacionMonedaUlt"
})
public class CuentaCorrienteType {

    protected long codCtaCte;
    @XmlElement(required = true)
    protected EstadoCtaCteType estadoCtaCte;
    @XmlElement(required = true)
    protected ComprobanteType factura;
    protected ArrayComprobantesType arrayNotasDCAsociadas;
    protected ArrayCodigosDescripcionesType arrayFormasCancelacion;
    protected ArrayRetencionesType arrayRetenciones;
    protected ArrayAjustesOperacionType arrayAjustesOperacion;
    @XmlElement(required = true)
    protected BigDecimal importeInicial;
    protected BigDecimal importeTotalNotasDC;
    protected BigDecimal importeCancelado;
    protected BigDecimal importeTotalRetPesos;
    protected BigDecimal importeEmbargoPesos;
    protected BigDecimal saldoAceptado;
    @XmlElement(required = true)
    protected BigDecimal saldo;
    @XmlElement(required = true)
    protected String codMoneda;
    @XmlElement(required = true)
    protected BigDecimal cotizacionMonedaUlt;

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
     * Gets the value of the factura property.
     * 
     * @return
     *     possible object is
     *     {@link ComprobanteType }
     *     
     */
    public ComprobanteType getFactura() {
        return factura;
    }

    /**
     * Sets the value of the factura property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComprobanteType }
     *     
     */
    public void setFactura(ComprobanteType value) {
        this.factura = value;
    }

    /**
     * Gets the value of the arrayNotasDCAsociadas property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayComprobantesType }
     *     
     */
    public ArrayComprobantesType getArrayNotasDCAsociadas() {
        return arrayNotasDCAsociadas;
    }

    /**
     * Sets the value of the arrayNotasDCAsociadas property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayComprobantesType }
     *     
     */
    public void setArrayNotasDCAsociadas(ArrayComprobantesType value) {
        this.arrayNotasDCAsociadas = value;
    }

    /**
     * Gets the value of the arrayFormasCancelacion property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayCodigosDescripcionesType }
     *     
     */
    public ArrayCodigosDescripcionesType getArrayFormasCancelacion() {
        return arrayFormasCancelacion;
    }

    /**
     * Sets the value of the arrayFormasCancelacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayCodigosDescripcionesType }
     *     
     */
    public void setArrayFormasCancelacion(ArrayCodigosDescripcionesType value) {
        this.arrayFormasCancelacion = value;
    }

    /**
     * Gets the value of the arrayRetenciones property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayRetencionesType }
     *     
     */
    public ArrayRetencionesType getArrayRetenciones() {
        return arrayRetenciones;
    }

    /**
     * Sets the value of the arrayRetenciones property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayRetencionesType }
     *     
     */
    public void setArrayRetenciones(ArrayRetencionesType value) {
        this.arrayRetenciones = value;
    }

    /**
     * Gets the value of the arrayAjustesOperacion property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayAjustesOperacionType }
     *     
     */
    public ArrayAjustesOperacionType getArrayAjustesOperacion() {
        return arrayAjustesOperacion;
    }

    /**
     * Sets the value of the arrayAjustesOperacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayAjustesOperacionType }
     *     
     */
    public void setArrayAjustesOperacion(ArrayAjustesOperacionType value) {
        this.arrayAjustesOperacion = value;
    }

    /**
     * Gets the value of the importeInicial property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImporteInicial() {
        return importeInicial;
    }

    /**
     * Sets the value of the importeInicial property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImporteInicial(BigDecimal value) {
        this.importeInicial = value;
    }

    /**
     * Gets the value of the importeTotalNotasDC property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImporteTotalNotasDC() {
        return importeTotalNotasDC;
    }

    /**
     * Sets the value of the importeTotalNotasDC property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImporteTotalNotasDC(BigDecimal value) {
        this.importeTotalNotasDC = value;
    }

    /**
     * Gets the value of the importeCancelado property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImporteCancelado() {
        return importeCancelado;
    }

    /**
     * Sets the value of the importeCancelado property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImporteCancelado(BigDecimal value) {
        this.importeCancelado = value;
    }

    /**
     * Gets the value of the importeTotalRetPesos property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImporteTotalRetPesos() {
        return importeTotalRetPesos;
    }

    /**
     * Sets the value of the importeTotalRetPesos property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImporteTotalRetPesos(BigDecimal value) {
        this.importeTotalRetPesos = value;
    }

    /**
     * Gets the value of the importeEmbargoPesos property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImporteEmbargoPesos() {
        return importeEmbargoPesos;
    }

    /**
     * Sets the value of the importeEmbargoPesos property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImporteEmbargoPesos(BigDecimal value) {
        this.importeEmbargoPesos = value;
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
     * Gets the value of the cotizacionMonedaUlt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCotizacionMonedaUlt() {
        return cotizacionMonedaUlt;
    }

    /**
     * Sets the value of the cotizacionMonedaUlt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCotizacionMonedaUlt(BigDecimal value) {
        this.cotizacionMonedaUlt = value;
    }

}
