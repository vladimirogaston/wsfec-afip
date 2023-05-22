
package wsfecred.afip.gob.ar.fecredservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DummyReturnType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DummyReturnType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="appserver" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="authserver" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dbserver" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DummyReturnType", propOrder = {
    "appserver",
    "authserver",
    "dbserver"
})
public class DummyReturnType {

    @XmlElement(required = true)
    protected String appserver;
    @XmlElement(required = true)
    protected String authserver;
    @XmlElement(required = true)
    protected String dbserver;

    /**
     * Gets the value of the appserver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppserver() {
        return appserver;
    }

    /**
     * Sets the value of the appserver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppserver(String value) {
        this.appserver = value;
    }

    /**
     * Gets the value of the authserver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthserver() {
        return authserver;
    }

    /**
     * Sets the value of the authserver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthserver(String value) {
        this.authserver = value;
    }

    /**
     * Gets the value of the dbserver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbserver() {
        return dbserver;
    }

    /**
     * Sets the value of the dbserver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbserver(String value) {
        this.dbserver = value;
    }

}
