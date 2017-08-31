
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.urenregistratieservice.UserSet;


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
 *         &lt;element name="GebruikerOphalenResult" type="{http://schemas.datacontract.org/2004/07/UrenregistratieService}UserSet" minOccurs="0"/>
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
    "gebruikerOphalenResult"
})
@XmlRootElement(name = "GebruikerOphalenResponse")
public class GebruikerOphalenResponse {

    @XmlElementRef(name = "GebruikerOphalenResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<UserSet> gebruikerOphalenResult;

    /**
     * Gets the value of the gebruikerOphalenResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserSet }{@code >}
     *     
     */
    public JAXBElement<UserSet> getGebruikerOphalenResult() {
        return gebruikerOphalenResult;
    }

    /**
     * Sets the value of the gebruikerOphalenResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserSet }{@code >}
     *     
     */
    public void setGebruikerOphalenResult(JAXBElement<UserSet> value) {
        this.gebruikerOphalenResult = value;
    }

}
