
package wsfecred.afip.gob.ar.fecredservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpcionTransferenciaSimpleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="OpcionTransferenciaSimpleType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SCA"/&gt;
 *     &lt;enumeration value="ADC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OpcionTransferenciaSimpleType")
@XmlEnum
public enum OpcionTransferenciaSimpleType {

    SCA,
    ADC;

    public String value() {
        return name();
    }

    public static OpcionTransferenciaSimpleType fromValue(String v) {
        return valueOf(v);
    }

}
