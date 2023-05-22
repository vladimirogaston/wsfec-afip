
package wsfecred.afip.gob.ar.fecredservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DummyResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DummyResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dummyReturn" type="{http://ar.gob.afip.wsfecred/FECredService/}DummyReturnType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DummyResponseType", propOrder = {
    "dummyReturn"
})
public class DummyResponseType {

    @XmlElement(required = true)
    protected DummyReturnType dummyReturn;

    /**
     * Gets the value of the dummyReturn property.
     * 
     * @return
     *     possible object is
     *     {@link DummyReturnType }
     *     
     */
    public DummyReturnType getDummyReturn() {
        return dummyReturn;
    }

    /**
     * Sets the value of the dummyReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DummyReturnType }
     *     
     */
    public void setDummyReturn(DummyReturnType value) {
        this.dummyReturn = value;
    }

}
