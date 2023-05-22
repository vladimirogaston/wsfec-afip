
package wsfecred.afip.gob.ar.fecredservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EstadoCmpSimpleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="EstadoCmpSimpleType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PendienteRecepcion"/&gt;
 *     &lt;enumeration value="Recepcionado"/&gt;
 *     &lt;enumeration value="Aceptado"/&gt;
 *     &lt;enumeration value="Rechazado"/&gt;
 *     &lt;enumeration value="InformadaAgDpto"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EstadoCmpSimpleType")
@XmlEnum
public enum EstadoCmpSimpleType {

    @XmlEnumValue("PendienteRecepcion")
    PENDIENTE_RECEPCION("PendienteRecepcion"),
    @XmlEnumValue("Recepcionado")
    RECEPCIONADO("Recepcionado"),
    @XmlEnumValue("Aceptado")
    ACEPTADO("Aceptado"),
    @XmlEnumValue("Rechazado")
    RECHAZADO("Rechazado"),
    @XmlEnumValue("InformadaAgDpto")
    INFORMADA_AG_DPTO("InformadaAgDpto");
    private final String value;

    EstadoCmpSimpleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EstadoCmpSimpleType fromValue(String v) {
        for (EstadoCmpSimpleType c: EstadoCmpSimpleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
