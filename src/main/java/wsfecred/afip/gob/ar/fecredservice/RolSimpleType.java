
package wsfecred.afip.gob.ar.fecredservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RolSimpleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RolSimpleType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Emisor"/&gt;
 *     &lt;enumeration value="Receptor"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RolSimpleType")
@XmlEnum
public enum RolSimpleType {

    @XmlEnumValue("Emisor")
    EMISOR("Emisor"),
    @XmlEnumValue("Receptor")
    RECEPTOR("Receptor");
    private final String value;

    RolSimpleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RolSimpleType fromValue(String v) {
        for (RolSimpleType c: RolSimpleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
