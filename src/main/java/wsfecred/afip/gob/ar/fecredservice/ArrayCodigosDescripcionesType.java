
package wsfecred.afip.gob.ar.fecredservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayCodigosDescripcionesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayCodigosDescripcionesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigoDescripcion" type="{http://ar.gob.afip.wsfecred/FECredService/}CodigoDescripcionType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayCodigosDescripcionesType", propOrder = {
    "codigoDescripcion"
})
public class ArrayCodigosDescripcionesType {

    @XmlElement(required = true)
    protected List<CodigoDescripcionType> codigoDescripcion;

    /**
     * Gets the value of the codigoDescripcion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codigoDescripcion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodigoDescripcion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodigoDescripcionType }
     * 
     * 
     */
    public List<CodigoDescripcionType> getCodigoDescripcion() {
        if (codigoDescripcion == null) {
            codigoDescripcion = new ArrayList<CodigoDescripcionType>();
        }
        return this.codigoDescripcion;
    }

}
