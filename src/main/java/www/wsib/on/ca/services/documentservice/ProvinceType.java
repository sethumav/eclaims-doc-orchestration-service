
package www.wsib.on.ca.services.documentservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProvinceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProvinceType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;maxLength value="2"/&gt;
 *     &lt;enumeration value="AB"/&gt;
 *     &lt;enumeration value="BC"/&gt;
 *     &lt;enumeration value="MB"/&gt;
 *     &lt;enumeration value="NB"/&gt;
 *     &lt;enumeration value="NL"/&gt;
 *     &lt;enumeration value="NS"/&gt;
 *     &lt;enumeration value="NT"/&gt;
 *     &lt;enumeration value="NU"/&gt;
 *     &lt;enumeration value="ON"/&gt;
 *     &lt;enumeration value="PE"/&gt;
 *     &lt;enumeration value="QC"/&gt;
 *     &lt;enumeration value="SK"/&gt;
 *     &lt;enumeration value="YT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ProvinceType", namespace = "http://www.wsib.on.ca/services")
@XmlEnum
public enum ProvinceType {

    AB,
    BC,
    MB,
    NB,
    NL,
    NS,
    NT,
    NU,
    ON,
    PE,
    QC,
    SK,
    YT;

    public String value() {
        return name();
    }

    public static ProvinceType fromValue(String v) {
        return valueOf(v);
    }

}
