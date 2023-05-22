
package wsfecred.afip.gob.ar.fecredservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArraySubtotalesIVAType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArraySubtotalesIVAType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="subtotalIVA" type="{http://ar.gob.afip.wsfecred/FECredService/}SubtotalIVAType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArraySubtotalesIVAType", propOrder = {
    "subtotalIVA"
})
public class ArraySubtotalesIVAType {

    @XmlElement(required = true)
    protected List<SubtotalIVAType> subtotalIVA;

    /**
     * Gets the value of the subtotalIVA property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subtotalIVA property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubtotalIVA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubtotalIVAType }
     * 
     * 
     */
    public List<SubtotalIVAType> getSubtotalIVA() {
        if (subtotalIVA == null) {
            subtotalIVA = new ArrayList<SubtotalIVAType>();
        }
        return this.subtotalIVA;
    }

}
