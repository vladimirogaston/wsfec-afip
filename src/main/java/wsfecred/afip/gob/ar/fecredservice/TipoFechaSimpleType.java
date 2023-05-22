
package wsfecred.afip.gob.ar.fecredservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoFechaSimpleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TipoFechaSimpleType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Emision"/&gt;
 *     &lt;enumeration value="PuestaDispo"/&gt;
 *     &lt;enumeration value="VenPago"/&gt;
 *     &lt;enumeration value="VenAcep"/&gt;
 *     &lt;enumeration value="Acep"/&gt;
 *     &lt;enumeration value="InfoAgDptoCltv"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TipoFechaSimpleType")
@XmlEnum
public enum TipoFechaSimpleType {

    @XmlEnumValue("Emision")
    EMISION("Emision"),
    @XmlEnumValue("PuestaDispo")
    PUESTA_DISPO("PuestaDispo"),
    @XmlEnumValue("VenPago")
    VEN_PAGO("VenPago"),
    @XmlEnumValue("VenAcep")
    VEN_ACEP("VenAcep"),
    @XmlEnumValue("Acep")
    ACEP("Acep"),
    @XmlEnumValue("InfoAgDptoCltv")
    INFO_AG_DPTO_CLTV("InfoAgDptoCltv");
    private final String value;

    TipoFechaSimpleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TipoFechaSimpleType fromValue(String v) {
        for (TipoFechaSimpleType c: TipoFechaSimpleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
