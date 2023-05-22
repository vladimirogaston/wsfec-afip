
package wsfecred.afip.gob.ar.fecredservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayConfirmarNotasType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayConfirmarNotasType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="confirmarNota" type="{http://ar.gob.afip.wsfecred/FECredService/}ConfirmarNotaDCType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayConfirmarNotasType", propOrder = {
    "confirmarNota"
})
public class ArrayConfirmarNotasType {

    @XmlElement(required = true)
    protected List<ConfirmarNotaDCType> confirmarNota;

    /**
     * Gets the value of the confirmarNota property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the confirmarNota property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfirmarNota().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConfirmarNotaDCType }
     * 
     * 
     */
    public List<ConfirmarNotaDCType> getConfirmarNota() {
        if (confirmarNota == null) {
            confirmarNota = new ArrayList<ConfirmarNotaDCType>();
        }
        return this.confirmarNota;
    }

}
