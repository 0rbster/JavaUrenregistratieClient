
package org.datacontract.schemas._2004._07.urenregistratieservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.urenregistratieservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TaakSet_QNAME = new QName("http://schemas.datacontract.org/2004/07/UrenregistratieService", "TaakSet");
    private final static QName _ArrayOfUserSet_QNAME = new QName("http://schemas.datacontract.org/2004/07/UrenregistratieService", "ArrayOfUserSet");
    private final static QName _ArrayOfTaakSet_QNAME = new QName("http://schemas.datacontract.org/2004/07/UrenregistratieService", "ArrayOfTaakSet");
    private final static QName _ProjectSet_QNAME = new QName("http://schemas.datacontract.org/2004/07/UrenregistratieService", "ProjectSet");
    private final static QName _UserSet_QNAME = new QName("http://schemas.datacontract.org/2004/07/UrenregistratieService", "UserSet");
    private final static QName _UserSetGebruikersnaam_QNAME = new QName("http://schemas.datacontract.org/2004/07/UrenregistratieService", "Gebruikersnaam");
    private final static QName _UserSetProjectProjectId_QNAME = new QName("http://schemas.datacontract.org/2004/07/UrenregistratieService", "ProjectProjectId");
    private final static QName _UserSetWachtwoord_QNAME = new QName("http://schemas.datacontract.org/2004/07/UrenregistratieService", "Wachtwoord");
    private final static QName _ProjectSetNaam_QNAME = new QName("http://schemas.datacontract.org/2004/07/UrenregistratieService", "Naam");
    private final static QName _TaakSetType_QNAME = new QName("http://schemas.datacontract.org/2004/07/UrenregistratieService", "Type");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.urenregistratieservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UserSet }
     * 
     */
    public UserSet createUserSet() {
        return new UserSet();
    }

    /**
     * Create an instance of {@link TaakSet }
     * 
     */
    public TaakSet createTaakSet() {
        return new TaakSet();
    }

    /**
     * Create an instance of {@link ArrayOfTaakSet }
     * 
     */
    public ArrayOfTaakSet createArrayOfTaakSet() {
        return new ArrayOfTaakSet();
    }

    /**
     * Create an instance of {@link ArrayOfUserSet }
     * 
     */
    public ArrayOfUserSet createArrayOfUserSet() {
        return new ArrayOfUserSet();
    }

    /**
     * Create an instance of {@link ProjectSet }
     * 
     */
    public ProjectSet createProjectSet() {
        return new ProjectSet();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaakSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UrenregistratieService", name = "TaakSet")
    public JAXBElement<TaakSet> createTaakSet(TaakSet value) {
        return new JAXBElement<TaakSet>(_TaakSet_QNAME, TaakSet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUserSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UrenregistratieService", name = "ArrayOfUserSet")
    public JAXBElement<ArrayOfUserSet> createArrayOfUserSet(ArrayOfUserSet value) {
        return new JAXBElement<ArrayOfUserSet>(_ArrayOfUserSet_QNAME, ArrayOfUserSet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTaakSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UrenregistratieService", name = "ArrayOfTaakSet")
    public JAXBElement<ArrayOfTaakSet> createArrayOfTaakSet(ArrayOfTaakSet value) {
        return new JAXBElement<ArrayOfTaakSet>(_ArrayOfTaakSet_QNAME, ArrayOfTaakSet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProjectSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UrenregistratieService", name = "ProjectSet")
    public JAXBElement<ProjectSet> createProjectSet(ProjectSet value) {
        return new JAXBElement<ProjectSet>(_ProjectSet_QNAME, ProjectSet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UrenregistratieService", name = "UserSet")
    public JAXBElement<UserSet> createUserSet(UserSet value) {
        return new JAXBElement<UserSet>(_UserSet_QNAME, UserSet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UrenregistratieService", name = "Gebruikersnaam", scope = UserSet.class)
    public JAXBElement<String> createUserSetGebruikersnaam(String value) {
        return new JAXBElement<String>(_UserSetGebruikersnaam_QNAME, String.class, UserSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProjectSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UrenregistratieService", name = "ProjectSet", scope = UserSet.class)
    public JAXBElement<ProjectSet> createUserSetProjectSet(ProjectSet value) {
        return new JAXBElement<ProjectSet>(_ProjectSet_QNAME, ProjectSet.class, UserSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UrenregistratieService", name = "ProjectProjectId", scope = UserSet.class)
    public JAXBElement<Integer> createUserSetProjectProjectId(Integer value) {
        return new JAXBElement<Integer>(_UserSetProjectProjectId_QNAME, Integer.class, UserSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UrenregistratieService", name = "Wachtwoord", scope = UserSet.class)
    public JAXBElement<String> createUserSetWachtwoord(String value) {
        return new JAXBElement<String>(_UserSetWachtwoord_QNAME, String.class, UserSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTaakSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UrenregistratieService", name = "TaakSet", scope = UserSet.class)
    public JAXBElement<ArrayOfTaakSet> createUserSetTaakSet(ArrayOfTaakSet value) {
        return new JAXBElement<ArrayOfTaakSet>(_TaakSet_QNAME, ArrayOfTaakSet.class, UserSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UrenregistratieService", name = "Naam", scope = ProjectSet.class)
    public JAXBElement<String> createProjectSetNaam(String value) {
        return new JAXBElement<String>(_ProjectSetNaam_QNAME, String.class, ProjectSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUserSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UrenregistratieService", name = "UserSet", scope = ProjectSet.class)
    public JAXBElement<ArrayOfUserSet> createProjectSetUserSet(ArrayOfUserSet value) {
        return new JAXBElement<ArrayOfUserSet>(_UserSet_QNAME, ArrayOfUserSet.class, ProjectSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTaakSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UrenregistratieService", name = "TaakSet", scope = ProjectSet.class)
    public JAXBElement<ArrayOfTaakSet> createProjectSetTaakSet(ArrayOfTaakSet value) {
        return new JAXBElement<ArrayOfTaakSet>(_TaakSet_QNAME, ArrayOfTaakSet.class, ProjectSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProjectSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UrenregistratieService", name = "ProjectSet", scope = TaakSet.class)
    public JAXBElement<ProjectSet> createTaakSetProjectSet(ProjectSet value) {
        return new JAXBElement<ProjectSet>(_ProjectSet_QNAME, ProjectSet.class, TaakSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UrenregistratieService", name = "UserSet", scope = TaakSet.class)
    public JAXBElement<UserSet> createTaakSetUserSet(UserSet value) {
        return new JAXBElement<UserSet>(_UserSet_QNAME, UserSet.class, TaakSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UrenregistratieService", name = "Type", scope = TaakSet.class)
    public JAXBElement<String> createTaakSetType(String value) {
        return new JAXBElement<String>(_TaakSetType_QNAME, String.class, TaakSet.class, value);
    }

}
