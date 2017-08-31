
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gebruikersnaam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wachtwoord" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "gebruikersnaam",
    "wachtwoord"
})
@XmlRootElement(name = "TakenOphalen")
public class TakenOphalen {

    @XmlElementRef(name = "gebruikersnaam", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> gebruikersnaam;
    @XmlElementRef(name = "wachtwoord", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> wachtwoord;

    /**
     * Gets the value of the gebruikersnaam property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGebruikersnaam() {
        return gebruikersnaam;
    }

    /**
     * Sets the value of the gebruikersnaam property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGebruikersnaam(JAXBElement<String> value) {
        this.gebruikersnaam = value;
    }

    /**
     * Gets the value of the wachtwoord property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWachtwoord() {
        return wachtwoord;
    }

    /**
     * Sets the value of the wachtwoord property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWachtwoord(JAXBElement<String> value) {
        this.wachtwoord = value;
    }

}
