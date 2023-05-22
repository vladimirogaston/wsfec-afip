
package wsfecred.afip.gob.ar.fecredservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsultarCtasCtesRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsultarCtasCtesRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="authRequest" type="{http://ar.gob.afip.wsfecred/FECredService/}AuthRequestType"/&gt;
 *         &lt;element name="rolCUITRepresentada" type="{http://ar.gob.afip.wsfecred/FECredService/}RolSimpleType"/&gt;
 *         &lt;element name="CUITContraparte" type="{http://ar.gob.afip.wsfecred/FECredService/}CuitSimpleType" minOccurs="0"/&gt;
 *         &lt;element name="fecha" type="{http://ar.gob.afip.wsfecred/FECredService/}FiltroFechaType" minOccurs="0"/&gt;
 *         &lt;element name="estadoCtaCte" type="{http://ar.gob.afip.wsfecred/FECredService/}EstadoCtaCteSimpleType" minOccurs="0"/&gt;
 *         &lt;element name="nroPagina" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="opcionTransferencia" type="{http://ar.gob.afip.wsfecred/FECredService/}OpcionTransferenciaSimpleType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarCtasCtesRequestType", propOrder = {
    "authRequest",
    "rolCUITRepresentada",
    "cuitContraparte",
    "fecha",
    "estadoCtaCte",
    "nroPagina",
    "opcionTransferencia"
})
public class ConsultarCtasCtesRequestType {

    @XmlElement(required = true)
    protected AuthRequestType authRequest;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected RolSimpleType rolCUITRepresentada;
    @XmlElement(name = "CUITContraparte")
    protected Long cuitContraparte;
    protected FiltroFechaType fecha;
    @XmlSchemaType(name = "string")
    protected EstadoCtaCteSimpleType estadoCtaCte;
    protected Short nroPagina;
    @XmlSchemaType(name = "string")
    protected OpcionTransferenciaSimpleType opcionTransferencia;

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
     * Gets the value of the rolCUITRepresentada property.
     * 
     * @return
     *     possible object is
     *     {@link RolSimpleType }
     *     
     */
    public RolSimpleType getRolCUITRepresentada() {
        return rolCUITRepresentada;
    }

    /**
     * Sets the value of the rolCUITRepresentada property.
     * 
     * @param value
     *     allowed object is
     *     {@link RolSimpleType }
     *     
     */
    public void setRolCUITRepresentada(RolSimpleType value) {
        this.rolCUITRepresentada = value;
    }

    /**
     * Gets the value of the cuitContraparte property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCUITContraparte() {
        return cuitContraparte;
    }

    /**
     * Sets the value of the cuitContraparte property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCUITContraparte(Long value) {
        this.cuitContraparte = value;
    }

    /**
     * Gets the value of the fecha property.
     * 
     * @return
     *     possible object is
     *     {@link FiltroFechaType }
     *     
     */
    public FiltroFechaType getFecha() {
        return fecha;
    }

    /**
     * Sets the value of the fecha property.
     * 
     * @param value
     *     allowed object is
     *     {@link FiltroFechaType }
     *     
     */
    public void setFecha(FiltroFechaType value) {
        this.fecha = value;
    }

    /**
     * Gets the value of the estadoCtaCte property.
     * 
     * @return
     *     possible object is
     *     {@link EstadoCtaCteSimpleType }
     *     
     */
    public EstadoCtaCteSimpleType getEstadoCtaCte() {
        return estadoCtaCte;
    }

    /**
     * Sets the value of the estadoCtaCte property.
     * 
     * @param value
     *     allowed object is
     *     {@link EstadoCtaCteSimpleType }
     *     
     */
    public void setEstadoCtaCte(EstadoCtaCteSimpleType value) {
        this.estadoCtaCte = value;
    }

    /**
     * Gets the value of the nroPagina property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNroPagina() {
        return nroPagina;
    }

    /**
     * Sets the value of the nroPagina property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNroPagina(Short value) {
        this.nroPagina = value;
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
