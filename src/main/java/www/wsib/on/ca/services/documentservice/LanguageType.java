
package www.wsib.on.ca.services.documentservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LanguageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LanguageType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;maxLength value="5"/&gt;
 *     &lt;enumeration value="en_US"/&gt;
 *     &lt;enumeration value="fr_CA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LanguageType", namespace = "http://www.wsib.on.ca/services")
@XmlEnum
public enum LanguageType {

    @XmlEnumValue("en_US")
    EN_US("en_US"),
    @XmlEnumValue("fr_CA")
    FR_CA("fr_CA");
    private final String value;

    LanguageType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LanguageType fromValue(String v) {
        for (LanguageType c: LanguageType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
