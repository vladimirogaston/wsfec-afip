
package wsfecred.afip.gob.ar.fecredservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoAceptacionSimpleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TipoAceptacionSimpleType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Tacita"/&gt;
 *     &lt;enumeration value="Expresa"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TipoAceptacionSimpleType")
@XmlEnum
public enum TipoAceptacionSimpleType {

    @XmlEnumValue("Tacita")
    TACITA("Tacita"),
    @XmlEnumValue("Expresa")
    EXPRESA("Expresa");
    private final String value;

    TipoAceptacionSimpleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TipoAceptacionSimpleType fromValue(String v) {
        for (TipoAceptacionSimpleType c: TipoAceptacionSimpleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
