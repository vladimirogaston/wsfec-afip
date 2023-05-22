
package wsfecred.afip.gob.ar.fecredservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ComprobanteType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComprobanteType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cuitEmisor" type="{http://ar.gob.afip.wsfecred/FECredService/}CuitSimpleType"/&gt;
 *         &lt;element name="razonSocialEmi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="codTipoCmp" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="ptovta" type="{http://ar.gob.afip.wsfecred/FECredService/}PuntoVentaSimpleType"/&gt;
 *         &lt;element name="nroCmp" type="{http://ar.gob.afip.wsfecred/FECredService/}NumeroComprobanteSimpleType"/&gt;
 *         &lt;element name="cuitReceptor" type="{http://ar.gob.afip.wsfecred/FECredService/}CuitSimpleType"/&gt;
 *         &lt;element name="razonSocialRecep" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tipoCodAuto" type="{http://ar.gob.afip.wsfecred/FECredService/}TipoCodAutorizacionType"/&gt;
 *         &lt;element name="codAutorizacion" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="fechaEmision" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="fechaPuestaDispo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="fechaVenPago" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="fechaVenAcep" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="importeTotal" type="{http://ar.gob.afip.wsfecred/FECredService/}ImporteSimpleType"/&gt;
 *         &lt;element name="codMoneda" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cotizacionMoneda" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CBUEmisor" type="{http://ar.gob.afip.wsfecred/FECredService/}CBUSimpleType" minOccurs="0"/&gt;
 *         &lt;element name="AliasEmisor" type="{http://ar.gob.afip.wsfecred/FECredService/}Texto250SimpleType" minOccurs="0"/&gt;
 *         &lt;element name="esAnulacion" type="{http://ar.gob.afip.wsfecred/FECredService/}SiNoSimpleType" minOccurs="0"/&gt;
 *         &lt;element name="esPostAceptacion" type="{http://ar.gob.afip.wsfecred/FECredService/}SiNoSimpleType" minOccurs="0"/&gt;
 *         &lt;element name="idComprobanteAsociado" type="{http://ar.gob.afip.wsfecred/FECredService/}IdComprobanteType" minOccurs="0"/&gt;
 *         &lt;element name="referenciasComerciales" type="{http://ar.gob.afip.wsfecred/FECredService/}ArrayTexto250SimpleType" minOccurs="0"/&gt;
 *         &lt;element name="arraySubtotalesIVA" type="{http://ar.gob.afip.wsfecred/FECredService/}ArraySubtotalesIVAType" minOccurs="0"/&gt;
 *         &lt;element name="arrayOtrosTributos" type="{http://ar.gob.afip.wsfecred/FECredService/}ArrayOtrosTributosType" minOccurs="0"/&gt;
 *         &lt;element name="arrayItems" type="{http://ar.gob.afip.wsfecred/FECredService/}ArrayItemsType" minOccurs="0"/&gt;
 *         &lt;element name="datosGenerales" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="datosComerciales" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="leyendaComercial" type="{http://ar.gob.afip.wsfecred/FECredService/}Texto250SimpleType" minOccurs="0"/&gt;
 *         &lt;element name="codCtaCte" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="estado" type="{http://ar.gob.afip.wsfecred/FECredService/}EstadoCmpType"/&gt;
 *         &lt;element name="tipoAcep" type="{http://ar.gob.afip.wsfecred/FECredService/}TipoAceptacionSimpleType" minOccurs="0"/&gt;
 *         &lt;element name="fechaHoraAcep" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="arrayMotivosRechazo" type="{http://ar.gob.afip.wsfecred/FECredService/}ArrayMotivosRechazoType" minOccurs="0"/&gt;
 *         &lt;element name="opcionTransferencia" type="{http://ar.gob.afip.wsfecred/FECredService/}OpcionTransferenciaSimpleType" minOccurs="0"/&gt;
 *         &lt;element name="infoTransferencia" type="{http://ar.gob.afip.wsfecred/FECredService/}InfoTransferenciaType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComprobanteType", propOrder = {
    "cuitEmisor",
    "razonSocialEmi",
    "codTipoCmp",
    "ptovta",
    "nroCmp",
    "cuitReceptor",
    "razonSocialRecep",
    "tipoCodAuto",
    "codAutorizacion",
    "fechaEmision",
    "fechaPuestaDispo",
    "fechaVenPago",
    "fechaVenAcep",
    "importeTotal",
    "codMoneda",
    "cotizacionMoneda",
    "cbuEmisor",
    "aliasEmisor",
    "esAnulacion",
    "esPostAceptacion",
    "idComprobanteAsociado",
    "referenciasComerciales",
    "arraySubtotalesIVA",
    "arrayOtrosTributos",
    "arrayItems",
    "datosGenerales",
    "datosComerciales",
    "leyendaComercial",
    "codCtaCte",
    "estado",
    "tipoAcep",
    "fechaHoraAcep",
    "arrayMotivosRechazo",
    "opcionTransferencia",
    "infoTransferencia"
})
public class ComprobanteType {

    protected long cuitEmisor;
    @XmlElement(required = true)
    protected String razonSocialEmi;
    protected short codTipoCmp;
    protected int ptovta;
    @XmlSchemaType(name = "long")
    protected int nroCmp;
    protected long cuitReceptor;
    @XmlElement(required = true)
    protected String razonSocialRecep;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TipoCodAutorizacionType tipoCodAuto;
    protected long codAutorizacion;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaEmision;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaPuestaDispo;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaVenPago;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaVenAcep;
    @XmlElement(required = true)
    protected BigDecimal importeTotal;
    @XmlElement(required = true)
    protected String codMoneda;
    @XmlElement(required = true)
    protected BigDecimal cotizacionMoneda;
    @XmlElement(name = "CBUEmisor")
    protected String cbuEmisor;
    @XmlElement(name = "AliasEmisor")
    protected String aliasEmisor;
    @XmlSchemaType(name = "string")
    protected SiNoSimpleType esAnulacion;
    @XmlSchemaType(name = "string")
    protected SiNoSimpleType esPostAceptacion;
    protected IdComprobanteType idComprobanteAsociado;
    protected ArrayTexto250SimpleType referenciasComerciales;
    protected ArraySubtotalesIVAType arraySubtotalesIVA;
    protected ArrayOtrosTributosType arrayOtrosTributos;
    protected ArrayItemsType arrayItems;
    protected String datosGenerales;
    protected String datosComerciales;
    protected String leyendaComercial;
    protected long codCtaCte;
    @XmlElement(required = true)
    protected EstadoCmpType estado;
    @XmlSchemaType(name = "string")
    protected TipoAceptacionSimpleType tipoAcep;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraAcep;
    protected ArrayMotivosRechazoType arrayMotivosRechazo;
    @XmlSchemaType(name = "string")
    protected OpcionTransferenciaSimpleType opcionTransferencia;
    protected InfoTransferenciaType infoTransferencia;

    /**
     * Gets the value of the cuitEmisor property.
     * 
     */
    public long getCuitEmisor() {
        return cuitEmisor;
    }

    /**
     * Sets the value of the cuitEmisor property.
     * 
     */
    public void setCuitEmisor(long value) {
        this.cuitEmisor = value;
    }

    /**
     * Gets the value of the razonSocialEmi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazonSocialEmi() {
        return razonSocialEmi;
    }

    /**
     * Sets the value of the razonSocialEmi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazonSocialEmi(String value) {
        this.razonSocialEmi = value;
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
     * Gets the value of the ptovta property.
     * 
     */
    public int getPtovta() {
        return ptovta;
    }

    /**
     * Sets the value of the ptovta property.
     * 
     */
    public void setPtovta(int value) {
        this.ptovta = value;
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

    /**
     * Gets the value of the cuitReceptor property.
     * 
     */
    public long getCuitReceptor() {
        return cuitReceptor;
    }

    /**
     * Sets the value of the cuitReceptor property.
     * 
     */
    public void setCuitReceptor(long value) {
        this.cuitReceptor = value;
    }

    /**
     * Gets the value of the razonSocialRecep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazonSocialRecep() {
        return razonSocialRecep;
    }

    /**
     * Sets the value of the razonSocialRecep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazonSocialRecep(String value) {
        this.razonSocialRecep = value;
    }

    /**
     * Gets the value of the tipoCodAuto property.
     * 
     * @return
     *     possible object is
     *     {@link TipoCodAutorizacionType }
     *     
     */
    public TipoCodAutorizacionType getTipoCodAuto() {
        return tipoCodAuto;
    }

    /**
     * Sets the value of the tipoCodAuto property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoCodAutorizacionType }
     *     
     */
    public void setTipoCodAuto(TipoCodAutorizacionType value) {
        this.tipoCodAuto = value;
    }

    /**
     * Gets the value of the codAutorizacion property.
     * 
     */
    public long getCodAutorizacion() {
        return codAutorizacion;
    }

    /**
     * Sets the value of the codAutorizacion property.
     * 
     */
    public void setCodAutorizacion(long value) {
        this.codAutorizacion = value;
    }

    /**
     * Gets the value of the fechaEmision property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaEmision() {
        return fechaEmision;
    }

    /**
     * Sets the value of the fechaEmision property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaEmision(XMLGregorianCalendar value) {
        this.fechaEmision = value;
    }

    /**
     * Gets the value of the fechaPuestaDispo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaPuestaDispo() {
        return fechaPuestaDispo;
    }

    /**
     * Sets the value of the fechaPuestaDispo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaPuestaDispo(XMLGregorianCalendar value) {
        this.fechaPuestaDispo = value;
    }

    /**
     * Gets the value of the fechaVenPago property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaVenPago() {
        return fechaVenPago;
    }

    /**
     * Sets the value of the fechaVenPago property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaVenPago(XMLGregorianCalendar value) {
        this.fechaVenPago = value;
    }

    /**
     * Gets the value of the fechaVenAcep property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaVenAcep() {
        return fechaVenAcep;
    }

    /**
     * Sets the value of the fechaVenAcep property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaVenAcep(XMLGregorianCalendar value) {
        this.fechaVenAcep = value;
    }

    /**
     * Gets the value of the importeTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImporteTotal() {
        return importeTotal;
    }

    /**
     * Sets the value of the importeTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImporteTotal(BigDecimal value) {
        this.importeTotal = value;
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
     * Gets the value of the cotizacionMoneda property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCotizacionMoneda() {
        return cotizacionMoneda;
    }

    /**
     * Sets the value of the cotizacionMoneda property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCotizacionMoneda(BigDecimal value) {
        this.cotizacionMoneda = value;
    }

    /**
     * Gets the value of the cbuEmisor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCBUEmisor() {
        return cbuEmisor;
    }

    /**
     * Sets the value of the cbuEmisor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCBUEmisor(String value) {
        this.cbuEmisor = value;
    }

    /**
     * Gets the value of the aliasEmisor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAliasEmisor() {
        return aliasEmisor;
    }

    /**
     * Sets the value of the aliasEmisor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAliasEmisor(String value) {
        this.aliasEmisor = value;
    }

    /**
     * Gets the value of the esAnulacion property.
     * 
     * @return
     *     possible object is
     *     {@link SiNoSimpleType }
     *     
     */
    public SiNoSimpleType getEsAnulacion() {
        return esAnulacion;
    }

    /**
     * Sets the value of the esAnulacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiNoSimpleType }
     *     
     */
    public void setEsAnulacion(SiNoSimpleType value) {
        this.esAnulacion = value;
    }

    /**
     * Gets the value of the esPostAceptacion property.
     * 
     * @return
     *     possible object is
     *     {@link SiNoSimpleType }
     *     
     */
    public SiNoSimpleType getEsPostAceptacion() {
        return esPostAceptacion;
    }

    /**
     * Sets the value of the esPostAceptacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiNoSimpleType }
     *     
     */
    public void setEsPostAceptacion(SiNoSimpleType value) {
        this.esPostAceptacion = value;
    }

    /**
     * Gets the value of the idComprobanteAsociado property.
     * 
     * @return
     *     possible object is
     *     {@link IdComprobanteType }
     *     
     */
    public IdComprobanteType getIdComprobanteAsociado() {
        return idComprobanteAsociado;
    }

    /**
     * Sets the value of the idComprobanteAsociado property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdComprobanteType }
     *     
     */
    public void setIdComprobanteAsociado(IdComprobanteType value) {
        this.idComprobanteAsociado = value;
    }

    /**
     * Gets the value of the referenciasComerciales property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayTexto250SimpleType }
     *     
     */
    public ArrayTexto250SimpleType getReferenciasComerciales() {
        return referenciasComerciales;
    }

    /**
     * Sets the value of the referenciasComerciales property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayTexto250SimpleType }
     *     
     */
    public void setReferenciasComerciales(ArrayTexto250SimpleType value) {
        this.referenciasComerciales = value;
    }

    /**
     * Gets the value of the arraySubtotalesIVA property.
     * 
     * @return
     *     possible object is
     *     {@link ArraySubtotalesIVAType }
     *     
     */
    public ArraySubtotalesIVAType getArraySubtotalesIVA() {
        return arraySubtotalesIVA;
    }

    /**
     * Sets the value of the arraySubtotalesIVA property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArraySubtotalesIVAType }
     *     
     */
    public void setArraySubtotalesIVA(ArraySubtotalesIVAType value) {
        this.arraySubtotalesIVA = value;
    }

    /**
     * Gets the value of the arrayOtrosTributos property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOtrosTributosType }
     *     
     */
    public ArrayOtrosTributosType getArrayOtrosTributos() {
        return arrayOtrosTributos;
    }

    /**
     * Sets the value of the arrayOtrosTributos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOtrosTributosType }
     *     
     */
    public void setArrayOtrosTributos(ArrayOtrosTributosType value) {
        this.arrayOtrosTributos = value;
    }

    /**
     * Gets the value of the arrayItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayItemsType }
     *     
     */
    public ArrayItemsType getArrayItems() {
        return arrayItems;
    }

    /**
     * Sets the value of the arrayItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayItemsType }
     *     
     */
    public void setArrayItems(ArrayItemsType value) {
        this.arrayItems = value;
    }

    /**
     * Gets the value of the datosGenerales property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatosGenerales() {
        return datosGenerales;
    }

    /**
     * Sets the value of the datosGenerales property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatosGenerales(String value) {
        this.datosGenerales = value;
    }

    /**
     * Gets the value of the datosComerciales property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatosComerciales() {
        return datosComerciales;
    }

    /**
     * Sets the value of the datosComerciales property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatosComerciales(String value) {
        this.datosComerciales = value;
    }

    /**
     * Gets the value of the leyendaComercial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeyendaComercial() {
        return leyendaComercial;
    }

    /**
     * Sets the value of the leyendaComercial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeyendaComercial(String value) {
        this.leyendaComercial = value;
    }

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
     * Gets the value of the estado property.
     * 
     * @return
     *     possible object is
     *     {@link EstadoCmpType }
     *     
     */
    public EstadoCmpType getEstado() {
        return estado;
    }

    /**
     * Sets the value of the estado property.
     * 
     * @param value
     *     allowed object is
     *     {@link EstadoCmpType }
     *     
     */
    public void setEstado(EstadoCmpType value) {
        this.estado = value;
    }

    /**
     * Gets the value of the tipoAcep property.
     * 
     * @return
     *     possible object is
     *     {@link TipoAceptacionSimpleType }
     *     
     */
    public TipoAceptacionSimpleType getTipoAcep() {
        return tipoAcep;
    }

    /**
     * Sets the value of the tipoAcep property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoAceptacionSimpleType }
     *     
     */
    public void setTipoAcep(TipoAceptacionSimpleType value) {
        this.tipoAcep = value;
    }

    /**
     * Gets the value of the fechaHoraAcep property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaHoraAcep() {
        return fechaHoraAcep;
    }

    /**
     * Sets the value of the fechaHoraAcep property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaHoraAcep(XMLGregorianCalendar value) {
        this.fechaHoraAcep = value;
    }

    /**
     * Gets the value of the arrayMotivosRechazo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayMotivosRechazoType }
     *     
     */
    public ArrayMotivosRechazoType getArrayMotivosRechazo() {
        return arrayMotivosRechazo;
    }

    /**
     * Sets the value of the arrayMotivosRechazo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayMotivosRechazoType }
     *     
     */
    public void setArrayMotivosRechazo(ArrayMotivosRechazoType value) {
        this.arrayMotivosRechazo = value;
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

    /**
     * Gets the value of the infoTransferencia property.
     * 
     * @return
     *     possible object is
     *     {@link InfoTransferenciaType }
     *     
     */
    public InfoTransferenciaType getInfoTransferencia() {
        return infoTransferencia;
    }

    /**
     * Sets the value of the infoTransferencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoTransferenciaType }
     *     
     */
    public void setInfoTransferencia(InfoTransferenciaType value) {
        this.infoTransferencia = value;
    }

}
