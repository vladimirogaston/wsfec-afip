
package wsfecred.afip.gob.ar.fecredservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="orden" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="unidadesMtx" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="codigoMtx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="codNomMercosur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cantidad" type="{http://ar.gob.afip.wsfecred/FECredService/}DecimalSimpleType" minOccurs="0"/&gt;
 *         &lt;element name="codigoUnidadMedida" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="precioUnitario" type="{http://ar.gob.afip.wsfecred/FECredService/}ImporteSimpleType" minOccurs="0"/&gt;
 *         &lt;element name="importeBonificacion" type="{http://ar.gob.afip.wsfecred/FECredService/}ImporteSimpleType" minOccurs="0"/&gt;
 *         &lt;element name="codigoCondicionIVA" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="importeIVA" type="{http://ar.gob.afip.wsfecred/FECredService/}ImporteSimpleType" minOccurs="0"/&gt;
 *         &lt;element name="importeItem" type="{http://ar.gob.afip.wsfecred/FECredService/}ImporteSimpleType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemType", propOrder = {
    "orden",
    "unidadesMtx",
    "codigoMtx",
    "codigo",
    "descripcion",
    "codNomMercosur",
    "cantidad",
    "codigoUnidadMedida",
    "precioUnitario",
    "importeBonificacion",
    "codigoCondicionIVA",
    "importeIVA",
    "importeItem"
})
public class ItemType {

    protected int orden;
    protected Integer unidadesMtx;
    protected String codigoMtx;
    protected String codigo;
    @XmlElement(required = true)
    protected String descripcion;
    protected String codNomMercosur;
    protected BigDecimal cantidad;
    protected Short codigoUnidadMedida;
    protected BigDecimal precioUnitario;
    protected BigDecimal importeBonificacion;
    protected short codigoCondicionIVA;
    protected BigDecimal importeIVA;
    @XmlElement(required = true)
    protected BigDecimal importeItem;

    /**
     * Gets the value of the orden property.
     * 
     */
    public int getOrden() {
        return orden;
    }

    /**
     * Sets the value of the orden property.
     * 
     */
    public void setOrden(int value) {
        this.orden = value;
    }

    /**
     * Gets the value of the unidadesMtx property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUnidadesMtx() {
        return unidadesMtx;
    }

    /**
     * Sets the value of the unidadesMtx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUnidadesMtx(Integer value) {
        this.unidadesMtx = value;
    }

    /**
     * Gets the value of the codigoMtx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoMtx() {
        return codigoMtx;
    }

    /**
     * Sets the value of the codigoMtx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoMtx(String value) {
        this.codigoMtx = value;
    }

    /**
     * Gets the value of the codigo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Sets the value of the codigo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Gets the value of the descripcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Sets the value of the descripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Gets the value of the codNomMercosur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodNomMercosur() {
        return codNomMercosur;
    }

    /**
     * Sets the value of the codNomMercosur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodNomMercosur(String value) {
        this.codNomMercosur = value;
    }

    /**
     * Gets the value of the cantidad property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCantidad() {
        return cantidad;
    }

    /**
     * Sets the value of the cantidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCantidad(BigDecimal value) {
        this.cantidad = value;
    }

    /**
     * Gets the value of the codigoUnidadMedida property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCodigoUnidadMedida() {
        return codigoUnidadMedida;
    }

    /**
     * Sets the value of the codigoUnidadMedida property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCodigoUnidadMedida(Short value) {
        this.codigoUnidadMedida = value;
    }

    /**
     * Gets the value of the precioUnitario property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrecioUnitario() {
        return precioUnitario;
    }

    /**
     * Sets the value of the precioUnitario property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrecioUnitario(BigDecimal value) {
        this.precioUnitario = value;
    }

    /**
     * Gets the value of the importeBonificacion property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImporteBonificacion() {
        return importeBonificacion;
    }

    /**
     * Sets the value of the importeBonificacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImporteBonificacion(BigDecimal value) {
        this.importeBonificacion = value;
    }

    /**
     * Gets the value of the codigoCondicionIVA property.
     * 
     */
    public short getCodigoCondicionIVA() {
        return codigoCondicionIVA;
    }

    /**
     * Sets the value of the codigoCondicionIVA property.
     * 
     */
    public void setCodigoCondicionIVA(short value) {
        this.codigoCondicionIVA = value;
    }

    /**
     * Gets the value of the importeIVA property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImporteIVA() {
        return importeIVA;
    }

    /**
     * Sets the value of the importeIVA property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImporteIVA(BigDecimal value) {
        this.importeIVA = value;
    }

    /**
     * Gets the value of the importeItem property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImporteItem() {
        return importeItem;
    }

    /**
     * Sets the value of the importeItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImporteItem(BigDecimal value) {
        this.importeItem = value;
    }

}
