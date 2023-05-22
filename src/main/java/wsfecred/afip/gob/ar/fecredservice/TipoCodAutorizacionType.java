
package wsfecred.afip.gob.ar.fecredservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoCodAutorizacionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TipoCodAutorizacionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="A"/&gt;
 *     &lt;enumeration value="E"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TipoCodAutorizacionType")
@XmlEnum
public enum TipoCodAutorizacionType {

    A,
    E;

    public String value() {
        return name();
    }

    public static TipoCodAutorizacionType fromValue(String v) {
        return valueOf(v);
    }

}
