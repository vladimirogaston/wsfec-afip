
package wsfecred.afip.gob.ar.fecredservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayIdsComprobantesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayIdsComprobantesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idsComprobantes" type="{http://ar.gob.afip.wsfecred/FECredService/}IdComprobanteType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayIdsComprobantesType", propOrder = {
    "idsComprobantes"
})
public class ArrayIdsComprobantesType {

    @XmlElement(required = true)
    protected List<IdComprobanteType> idsComprobantes;

    /**
     * Gets the value of the idsComprobantes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idsComprobantes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdsComprobantes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdComprobanteType }
     * 
     * 
     */
    public List<IdComprobanteType> getIdsComprobantes() {
        if (idsComprobantes == null) {
            idsComprobantes = new ArrayList<IdComprobanteType>();
        }
        return this.idsComprobantes;
    }

}
