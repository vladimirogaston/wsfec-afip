
package wsfecred.afip.gob.ar.fecredservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayInfosCtaCteType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayInfosCtaCteType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="infoCtaCte" type="{http://ar.gob.afip.wsfecred/FECredService/}InfoCtaCteType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayInfosCtaCteType", propOrder = {
    "infoCtaCte"
})
public class ArrayInfosCtaCteType {

    @XmlElement(required = true)
    protected List<InfoCtaCteType> infoCtaCte;

    /**
     * Gets the value of the infoCtaCte property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infoCtaCte property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfoCtaCte().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InfoCtaCteType }
     * 
     * 
     */
    public List<InfoCtaCteType> getInfoCtaCte() {
        if (infoCtaCte == null) {
            infoCtaCte = new ArrayList<InfoCtaCteType>();
        }
        return this.infoCtaCte;
    }

}
