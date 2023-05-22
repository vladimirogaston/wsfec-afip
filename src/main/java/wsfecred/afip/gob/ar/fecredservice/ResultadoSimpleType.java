
package wsfecred.afip.gob.ar.fecredservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResultadoSimpleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ResultadoSimpleType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="A"/&gt;
 *     &lt;enumeration value="O"/&gt;
 *     &lt;enumeration value="R"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ResultadoSimpleType")
@XmlEnum
public enum ResultadoSimpleType {

    A,
    O,
    R;

    public String value() {
        return name();
    }

    public static ResultadoSimpleType fromValue(String v) {
        return valueOf(v);
    }

}
