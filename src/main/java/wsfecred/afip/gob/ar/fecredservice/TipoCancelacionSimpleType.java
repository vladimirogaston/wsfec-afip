
package wsfecred.afip.gob.ar.fecredservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoCancelacionSimpleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TipoCancelacionSimpleType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PAR"/&gt;
 *     &lt;enumeration value="TOT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TipoCancelacionSimpleType")
@XmlEnum
public enum TipoCancelacionSimpleType {

    PAR,
    TOT;

    public String value() {
        return name();
    }

    public static TipoCancelacionSimpleType fromValue(String v) {
        return valueOf(v);
    }

}
