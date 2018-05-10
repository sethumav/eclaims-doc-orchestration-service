
package www.wsib.on.ca.services.documentservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClientIDType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ClientIDType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CC"/&gt;
 *     &lt;enumeration value="PC"/&gt;
 *     &lt;enumeration value="BC"/&gt;
 *     &lt;enumeration value="CM"/&gt;
 *     &lt;enumeration value="ESB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ClientIDType", namespace = "http://www.wsib.on.ca/services")
@XmlEnum
public enum ClientIDType {

    CC,
    PC,
    BC,
    CM,
    ESB;

    public String value() {
        return name();
    }

    public static ClientIDType fromValue(String v) {
        return valueOf(v);
    }

}
