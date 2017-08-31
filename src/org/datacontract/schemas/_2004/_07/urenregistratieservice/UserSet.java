
package org.datacontract.schemas._2004._07.urenregistratieservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserSet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Gebruikersnaam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectProjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ProjectSet" type="{http://schemas.datacontract.org/2004/07/UrenregistratieService}ProjectSet" minOccurs="0"/>
 *         &lt;element name="TaakSet" type="{http://schemas.datacontract.org/2004/07/UrenregistratieService}ArrayOfTaakSet" minOccurs="0"/>
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Wachtwoord" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserSet", propOrder = {
    "gebruikersnaam",
    "projectProjectId",
    "projectSet",
    "taakSet",
    "userId",
    "wachtwoord"
})
public class UserSet {

    @XmlElementRef(name = "Gebruikersnaam", namespace = "http://schemas.datacontract.org/2004/07/UrenregistratieService", type = JAXBElement.class, required = false)
    protected JAXBElement<String> gebruikersnaam;
    @XmlElementRef(name = "ProjectProjectId", namespace = "http://schemas.datacontract.org/2004/07/UrenregistratieService", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> projectProjectId;
    @XmlElementRef(name = "ProjectSet", namespace = "http://schemas.datacontract.org/2004/07/UrenregistratieService", type = JAXBElement.class, required = false)
    protected JAXBElement<ProjectSet> projectSet;
    @XmlElementRef(name = "TaakSet", namespace = "http://schemas.datacontract.org/2004/07/UrenregistratieService", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTaakSet> taakSet;
    @XmlElement(name = "UserId")
    protected Integer userId;
    @XmlElementRef(name = "Wachtwoord", namespace = "http://schemas.datacontract.org/2004/07/UrenregistratieService", type = JAXBElement.class, required = false)
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
     * Gets the value of the projectProjectId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getProjectProjectId() {
        return projectProjectId;
    }

    /**
     * Sets the value of the projectProjectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setProjectProjectId(JAXBElement<Integer> value) {
        this.projectProjectId = value;
    }

    /**
     * Gets the value of the projectSet property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProjectSet }{@code >}
     *     
     */
    public JAXBElement<ProjectSet> getProjectSet() {
        return projectSet;
    }

    /**
     * Sets the value of the projectSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProjectSet }{@code >}
     *     
     */
    public void setProjectSet(JAXBElement<ProjectSet> value) {
        this.projectSet = value;
    }

    /**
     * Gets the value of the taakSet property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTaakSet }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTaakSet> getTaakSet() {
        return taakSet;
    }

    /**
     * Sets the value of the taakSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTaakSet }{@code >}
     *     
     */
    public void setTaakSet(JAXBElement<ArrayOfTaakSet> value) {
        this.taakSet = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUserId(Integer value) {
        this.userId = value;
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
