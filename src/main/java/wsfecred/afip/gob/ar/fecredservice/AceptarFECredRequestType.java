
package wsfecred.afip.gob.ar.fecredservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AceptarFECredRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AceptarFECredRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="authRequest" type="{http://ar.gob.afip.wsfecred/FECredService/}AuthRequestType"/&gt;
 *         &lt;element name="idCtaCte" type="{http://ar.gob.afip.wsfecred/FECredService/}IdCtaCteType"/&gt;
 *         &lt;element name="arrayConfirmarNotasDC" type="{http://ar.gob.afip.wsfecred/FECredService/}ArrayConfirmarNotasType" minOccurs="0"/&gt;
 *         &lt;element name="arrayFormasCancelacion" type="{http://ar.gob.afip.wsfecred/FECredService/}ArrayCodigosDescripcionesType" minOccurs="0"/&gt;
 *         &lt;element name="arrayRetenciones" type="{http://ar.gob.afip.wsfecred/FECredService/}ArrayRetencionesType" minOccurs="0"/&gt;
 *         &lt;element name="arrayAjustesOperacion" type="{http://ar.gob.afip.wsfecred/FECredService/}ArrayAjustesOperacionType" minOccurs="0"/&gt;
 *         &lt;element name="tipoCancelacion" type="{http://ar.gob.afip.wsfecred/FECredService/}TipoCancelacionSimpleType" minOccurs="0"/&gt;
 *         &lt;element name="importeCancelado" type="{http://ar.gob.afip.wsfecred/FECredService/}ImporteSimpleType" minOccurs="0"/&gt;
 *         &lt;element name="importeTotalRetPesos" type="{http://ar.gob.afip.wsfecred/FECredService/}ImporteSimpleType" minOccurs="0"/&gt;
 *         &lt;element name="importeEmbargoPesos" type="{http://ar.gob.afip.wsfecred/FECredService/}ImporteSimpleType" minOccurs="0"/&gt;
 *         &lt;element name="saldoAceptado" type="{http://ar.gob.afip.wsfecred/FECredService/}ImporteSimpleType"/&gt;
 *         &lt;element name="codMoneda" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cotizacionMonedaUlt" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="informaCBU" type="{http://ar.gob.afip.wsfecred/FECredService/}SiNoSimpleType" minOccurs="0"/&gt;
 *         &lt;element name="CBUComprador" type="{http://ar.gob.afip.wsfecred/FECredService/}CBUSimpleType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AceptarFECredRequestType", propOrder = {
    "authRequest",
    "idCtaCte",
    "arrayConfirmarNotasDC",
    "arrayFormasCancelacion",
    "arrayRetenciones",
    "arrayAjustesOperacion",
    "tipoCancelacion",
    "importeCancelado",
    "importeTotalRetPesos",
    "importeEmbargoPesos",
    "saldoAceptado",
    "codMoneda",
    "cotizacionMonedaUlt",
    "informaCBU",
    "cbuComprador"
})
public class AceptarFECredRequestType {

    @XmlElement(required = true)
    protected AuthRequestType authRequest;
    @XmlElement(required = true)
    protected IdCtaCteType idCtaCte;
    protected ArrayConfirmarNotasType arrayConfirmarNotasDC;
    protected ArrayCodigosDescripcionesType arrayFormasCancelacion;
    protected ArrayRetencionesType arrayRetenciones;
    protected ArrayAjustesOperacionType arrayAjustesOperacion;
    @XmlSchemaType(name = "string")
    protected TipoCancelacionSimpleType tipoCancelacion;
    protected BigDecimal importeCancelado;
    protected BigDecimal importeTotalRetPesos;
    protected BigDecimal importeEmbargoPesos;
    @XmlElement(required = true)
    protected BigDecimal saldoAceptado;
    @XmlElement(required = true)
    protected String codMoneda;
    @XmlElement(required = true)
    protected BigDecimal cotizacionMonedaUlt;
    @XmlSchemaType(name = "string")
    protected SiNoSimpleType informaCBU;
    @XmlElement(name = "CBUComprador")
    protected String cbuComprador;

    /**
     * Gets the value of the authRequest property.
     * 
     * @return
     *     possible object is
     *     {@link AuthRequestType }
     *     
     */
    public AuthRequestType getAuthRequest() {
        return authRequest;
    }

    /**
     * Sets the value of the authRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthRequestType }
     *     
     */
    public void setAuthRequest(AuthRequestType value) {
        this.authRequest = value;
    }

    /**
     * Gets the value of the idCtaCte property.
     * 
     * @return
     *     possible object is
     *     {@link IdCtaCteType }
     *     
     */
    public IdCtaCteType getIdCtaCte() {
        return idCtaCte;
    }

    /**
     * Sets the value of the idCtaCte property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdCtaCteType }
     *     
     */
    public void setIdCtaCte(IdCtaCteType value) {
        this.idCtaCte = value;
    }

    /**
     * Gets the value of the arrayConfirmarNotasDC property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayConfirmarNotasType }
     *     
     */
    public ArrayConfirmarNotasType getArrayConfirmarNotasDC() {
        return arrayConfirmarNotasDC;
    }

    /**
     * Sets the value of the arrayConfirmarNotasDC property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayConfirmarNotasType }
     *     
     */
    public void setArrayConfirmarNotasDC(ArrayConfirmarNotasType value) {
        this.arrayConfirmarNotasDC = value;
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
     * Gets the value of the tipoCancelacion property.
     * 
     * @return
     *     possible object is
     *     {@link TipoCancelacionSimpleType }
     *     
     */
    public TipoCancelacionSimpleType getTipoCancelacion() {
        return tipoCancelacion;
    }

    /**
     * Sets the value of the tipoCancelacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoCancelacionSimpleType }
     *     
     */
    public void setTipoCancelacion(TipoCancelacionSimpleType value) {
        this.tipoCancelacion = value;
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

    /**
     * Gets the value of the informaCBU property.
     * 
     * @return
     *     possible object is
     *     {@link SiNoSimpleType }
     *     
     */
    public SiNoSimpleType getInformaCBU() {
        return informaCBU;
    }

    /**
     * Sets the value of the informaCBU property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiNoSimpleType }
     *     
     */
    public void setInformaCBU(SiNoSimpleType value) {
        this.informaCBU = value;
    }

    /**
     * Gets the value of the cbuComprador property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCBUComprador() {
        return cbuComprador;
    }

    /**
     * Sets the value of the cbuComprador property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCBUComprador(String value) {
        this.cbuComprador = value;
    }

}
