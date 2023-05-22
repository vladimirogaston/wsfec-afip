
package wsfecred.afip.gob.ar.fecredservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for InfoAgtDptoCltvType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InfoAgtDptoCltvType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fechaInfo" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="ctaAgente" type="{http://ar.gob.afip.wsfecred/FECredService/}CuentaEnAgenteType"/&gt;
 *         &lt;element name="recibida" type="{http://ar.gob.afip.wsfecred/FECredService/}SiNoSimpleType"/&gt;
 *         &lt;element name="fechaLectura" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="fechaRecep" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="aceptada" type="{http://ar.gob.afip.wsfecred/FECredService/}SiNoSimpleType" minOccurs="0"/&gt;
 *         &lt;element name="motivoRechazo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idPagoAgtDptoCltv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CBUAgtDptoCltv" type="{http://ar.gob.afip.wsfecred/FECredService/}CBUSimpleType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InfoAgtDptoCltvType", propOrder = {
    "fechaInfo",
    "ctaAgente",
    "recibida",
    "fechaLectura",
    "fechaRecep",
    "aceptada",
    "motivoRechazo",
    "idPagoAgtDptoCltv",
    "cbuAgtDptoCltv"
})
public class InfoAgtDptoCltvType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaInfo;
    @XmlElement(required = true)
    protected CuentaEnAgenteType ctaAgente;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected SiNoSimpleType recibida;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaLectura;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaRecep;
    @XmlSchemaType(name = "string")
    protected SiNoSimpleType aceptada;
    protected String motivoRechazo;
    protected String idPagoAgtDptoCltv;
    @XmlElement(name = "CBUAgtDptoCltv")
    protected String cbuAgtDptoCltv;

    /**
     * Gets the value of the fechaInfo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaInfo() {
        return fechaInfo;
    }

    /**
     * Sets the value of the fechaInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaInfo(XMLGregorianCalendar value) {
        this.fechaInfo = value;
    }

    /**
     * Gets the value of the ctaAgente property.
     * 
     * @return
     *     possible object is
     *     {@link CuentaEnAgenteType }
     *     
     */
    public CuentaEnAgenteType getCtaAgente() {
        return ctaAgente;
    }

    /**
     * Sets the value of the ctaAgente property.
     * 
     * @param value
     *     allowed object is
     *     {@link CuentaEnAgenteType }
     *     
     */
    public void setCtaAgente(CuentaEnAgenteType value) {
        this.ctaAgente = value;
    }

    /**
     * Gets the value of the recibida property.
     * 
     * @return
     *     possible object is
     *     {@link SiNoSimpleType }
     *     
     */
    public SiNoSimpleType getRecibida() {
        return recibida;
    }

    /**
     * Sets the value of the recibida property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiNoSimpleType }
     *     
     */
    public void setRecibida(SiNoSimpleType value) {
        this.recibida = value;
    }

    /**
     * Gets the value of the fechaLectura property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaLectura() {
        return fechaLectura;
    }

    /**
     * Sets the value of the fechaLectura property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaLectura(XMLGregorianCalendar value) {
        this.fechaLectura = value;
    }

    /**
     * Gets the value of the fechaRecep property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaRecep() {
        return fechaRecep;
    }

    /**
     * Sets the value of the fechaRecep property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaRecep(XMLGregorianCalendar value) {
        this.fechaRecep = value;
    }

    /**
     * Gets the value of the aceptada property.
     * 
     * @return
     *     possible object is
     *     {@link SiNoSimpleType }
     *     
     */
    public SiNoSimpleType getAceptada() {
        return aceptada;
    }

    /**
     * Sets the value of the aceptada property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiNoSimpleType }
     *     
     */
    public void setAceptada(SiNoSimpleType value) {
        this.aceptada = value;
    }

    /**
     * Gets the value of the motivoRechazo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivoRechazo() {
        return motivoRechazo;
    }

    /**
     * Sets the value of the motivoRechazo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivoRechazo(String value) {
        this.motivoRechazo = value;
    }

    /**
     * Gets the value of the idPagoAgtDptoCltv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPagoAgtDptoCltv() {
        return idPagoAgtDptoCltv;
    }

    /**
     * Sets the value of the idPagoAgtDptoCltv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPagoAgtDptoCltv(String value) {
        this.idPagoAgtDptoCltv = value;
    }

    /**
     * Gets the value of the cbuAgtDptoCltv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCBUAgtDptoCltv() {
        return cbuAgtDptoCltv;
    }

    /**
     * Sets the value of the cbuAgtDptoCltv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCBUAgtDptoCltv(String value) {
        this.cbuAgtDptoCltv = value;
    }

}
