
package wsfecred.afip.gob.ar.fecredservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayFacturasAgtDptoCltvType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayFacturasAgtDptoCltvType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="facturaInformada" type="{http://ar.gob.afip.wsfecred/FECredService/}FacturaInformadaAgtDptoCltvType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayFacturasAgtDptoCltvType", propOrder = {
    "facturaInformada"
})
public class ArrayFacturasAgtDptoCltvType {

    @XmlElement(required = true)
    protected List<FacturaInformadaAgtDptoCltvType> facturaInformada;

    /**
     * Gets the value of the facturaInformada property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facturaInformada property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacturaInformada().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacturaInformadaAgtDptoCltvType }
     * 
     * 
     */
    public List<FacturaInformadaAgtDptoCltvType> getFacturaInformada() {
        if (facturaInformada == null) {
            facturaInformada = new ArrayList<FacturaInformadaAgtDptoCltvType>();
        }
        return this.facturaInformada;
    }

}
