
package wsfecred.afip.gob.ar.fecredservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayCodigosDescripcionesStringType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayCodigosDescripcionesStringType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigoDescripcionString" type="{http://ar.gob.afip.wsfecred/FECredService/}CodigoDescripcionStringType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayCodigosDescripcionesStringType", propOrder = {
    "codigoDescripcionString"
})
public class ArrayCodigosDescripcionesStringType {

    @XmlElement(required = true)
    protected List<CodigoDescripcionStringType> codigoDescripcionString;

    /**
     * Gets the value of the codigoDescripcionString property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codigoDescripcionString property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodigoDescripcionString().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodigoDescripcionStringType }
     * 
     * 
     */
    public List<CodigoDescripcionStringType> getCodigoDescripcionString() {
        if (codigoDescripcionString == null) {
            codigoDescripcionString = new ArrayList<CodigoDescripcionStringType>();
        }
        return this.codigoDescripcionString;
    }

}
