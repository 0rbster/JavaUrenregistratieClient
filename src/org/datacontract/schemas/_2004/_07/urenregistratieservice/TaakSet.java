
package org.datacontract.schemas._2004._07.urenregistratieservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaakSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaakSet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProjectProjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ProjectSet" type="{http://schemas.datacontract.org/2004/07/UrenregistratieService}ProjectSet" minOccurs="0"/>
 *         &lt;element name="TaakId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Uren" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UserSet" type="{http://schemas.datacontract.org/2004/07/UrenregistratieService}UserSet" minOccurs="0"/>
 *         &lt;element name="UserUserId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaakSet", propOrder = {
    "projectProjectId",
    "projectSet",
    "taakId",
    "type",
    "uren",
    "userSet",
    "userUserId"
})
public class TaakSet {

    @XmlElement(name = "ProjectProjectId")
    protected Integer projectProjectId;
    @XmlElementRef(name = "ProjectSet", namespace = "http://schemas.datacontract.org/2004/07/UrenregistratieService", type = JAXBElement.class, required = false)
    protected JAXBElement<ProjectSet> projectSet;
    @XmlElement(name = "TaakId")
    protected Integer taakId;
    @XmlElementRef(name = "Type", namespace = "http://schemas.datacontract.org/2004/07/UrenregistratieService", type = JAXBElement.class, required = false)
    protected JAXBElement<String> type;
    @XmlElement(name = "Uren")
    protected Integer uren;
    @XmlElementRef(name = "UserSet", namespace = "http://schemas.datacontract.org/2004/07/UrenregistratieService", type = JAXBElement.class, required = false)
    protected JAXBElement<UserSet> userSet;
    @XmlElement(name = "UserUserId")
    protected Integer userUserId;

    /**
     * Gets the value of the projectProjectId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProjectProjectId() {
        return projectProjectId;
    }

    /**
     * Sets the value of the projectProjectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProjectProjectId(Integer value) {
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
     * Gets the value of the taakId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTaakId() {
        return taakId;
    }

    /**
     * Sets the value of the taakId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTaakId(Integer value) {
        this.taakId = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setType(JAXBElement<String> value) {
        this.type = value;
    }

    /**
     * Gets the value of the uren property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUren() {
        return uren;
    }

    /**
     * Sets the value of the uren property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUren(Integer value) {
        this.uren = value;
    }

    /**
     * Gets the value of the userSet property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserSet }{@code >}
     *     
     */
    public JAXBElement<UserSet> getUserSet() {
        return userSet;
    }

    /**
     * Sets the value of the userSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserSet }{@code >}
     *     
     */
    public void setUserSet(JAXBElement<UserSet> value) {
        this.userSet = value;
    }

    /**
     * Gets the value of the userUserId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUserUserId() {
        return userUserId;
    }

    /**
     * Sets the value of the userUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUserUserId(Integer value) {
        this.userUserId = value;
    }

}
