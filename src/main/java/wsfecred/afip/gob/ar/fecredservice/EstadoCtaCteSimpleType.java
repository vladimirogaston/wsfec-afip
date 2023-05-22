
package wsfecred.afip.gob.ar.fecredservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EstadoCtaCteSimpleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="EstadoCtaCteSimpleType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Modificable"/&gt;
 *     &lt;enumeration value="Aceptada"/&gt;
 *     &lt;enumeration value="Rechazada"/&gt;
 *     &lt;enumeration value="CanceladaTotal"/&gt;
 *     &lt;enumeration value="InformadaAgDpto"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EstadoCtaCteSimpleType")
@XmlEnum
public enum EstadoCtaCteSimpleType {

    @XmlEnumValue("Modificable")
    MODIFICABLE("Modificable"),
    @XmlEnumValue("Aceptada")
    ACEPTADA("Aceptada"),
    @XmlEnumValue("Rechazada")
    RECHAZADA("Rechazada"),
    @XmlEnumValue("CanceladaTotal")
    CANCELADA_TOTAL("CanceladaTotal"),
    @XmlEnumValue("InformadaAgDpto")
    INFORMADA_AG_DPTO("InformadaAgDpto");
    private final String value;

    EstadoCtaCteSimpleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EstadoCtaCteSimpleType fromValue(String v) {
        for (EstadoCtaCteSimpleType c: EstadoCtaCteSimpleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
