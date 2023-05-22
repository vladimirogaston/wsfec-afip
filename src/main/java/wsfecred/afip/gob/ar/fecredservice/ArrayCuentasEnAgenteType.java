
package wsfecred.afip.gob.ar.fecredservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayCuentasEnAgenteType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayCuentasEnAgenteType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cuentaEnAgente" type="{http://ar.gob.afip.wsfecred/FECredService/}CuentaEnAgenteType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayCuentasEnAgenteType", propOrder = {
    "cuentaEnAgente"
})
public class ArrayCuentasEnAgenteType {

    @XmlElement(required = true)
    protected List<CuentaEnAgenteType> cuentaEnAgente;

    /**
     * Gets the value of the cuentaEnAgente property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cuentaEnAgente property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCuentaEnAgente().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CuentaEnAgenteType }
     * 
     * 
     */
    public List<CuentaEnAgenteType> getCuentaEnAgente() {
        if (cuentaEnAgente == null) {
            cuentaEnAgente = new ArrayList<CuentaEnAgenteType>();
        }
        return this.cuentaEnAgente;
    }

}
