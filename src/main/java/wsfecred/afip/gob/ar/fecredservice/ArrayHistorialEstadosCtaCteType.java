
package wsfecred.afip.gob.ar.fecredservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayHistorialEstadosCtaCteType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayHistorialEstadosCtaCteType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="estadoHistorico" type="{http://ar.gob.afip.wsfecred/FECredService/}EstadoCtaCteType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayHistorialEstadosCtaCteType", propOrder = {
    "estadoHistorico"
})
public class ArrayHistorialEstadosCtaCteType {

    @XmlElement(required = true)
    protected List<EstadoCtaCteType> estadoHistorico;

    /**
     * Gets the value of the estadoHistorico property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the estadoHistorico property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEstadoHistorico().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EstadoCtaCteType }
     * 
     * 
     */
    public List<EstadoCtaCteType> getEstadoHistorico() {
        if (estadoHistorico == null) {
            estadoHistorico = new ArrayList<EstadoCtaCteType>();
        }
        return this.estadoHistorico;
    }

}
