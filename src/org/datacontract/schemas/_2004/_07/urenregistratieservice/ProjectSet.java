
package org.datacontract.schemas._2004._07.urenregistratieservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProjectSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProjectSet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Naam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TaakSet" type="{http://schemas.datacontract.org/2004/07/UrenregistratieService}ArrayOfTaakSet" minOccurs="0"/>
 *         &lt;element name="UserSet" type="{http://schemas.datacontract.org/2004/07/UrenregistratieService}ArrayOfUserSet" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProjectSet", propOrder = {
    "naam",
    "projectId",
    "taakSet",
    "userSet"
})
public class ProjectSet {

    @XmlElementRef(name = "Naam", namespace = "http://schemas.datacontract.org/2004/07/UrenregistratieService", type = JAXBElement.class, required = false)
    protected JAXBElement<String> naam;
    @XmlElement(name = "ProjectId")
    protected Integer projectId;
    @XmlElementRef(name = "TaakSet", namespace = "http://schemas.datacontract.org/2004/07/UrenregistratieService", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTaakSet> taakSet;
    @XmlElementRef(name = "UserSet", namespace = "http://schemas.datacontract.org/2004/07/UrenregistratieService", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUserSet> userSet;

    /**
     * Gets the value of the naam property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNaam() {
        return naam;
    }

    /**
     * Sets the value of the naam property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNaam(JAXBElement<String> value) {
        this.naam = value;
    }

    /**
     * Gets the value of the projectId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProjectId() {
        return projectId;
    }

    /**
     * Sets the value of the projectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProjectId(Integer value) {
        this.projectId = value;
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
     * Gets the value of the userSet property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUserSet }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUserSet> getUserSet() {
        return userSet;
    }

    /**
     * Sets the value of the userSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUserSet }{@code >}
     *     
     */
    public void setUserSet(JAXBElement<ArrayOfUserSet> value) {
        this.userSet = value;
    }

}
