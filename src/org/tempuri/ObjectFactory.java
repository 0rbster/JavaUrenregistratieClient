
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import org.datacontract.schemas._2004._07.urenregistratieservice.TaakSet;
import org.datacontract.schemas._2004._07.urenregistratieservice.UserSet;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
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

    private final static QName _LoginGebruikersnaam_QNAME = new QName("http://tempuri.org/", "gebruikersnaam");
    private final static QName _LoginWachtwoord_QNAME = new QName("http://tempuri.org/", "wachtwoord");
    private final static QName _GewerkteUrenOphalenTaak_QNAME = new QName("http://tempuri.org/", "taak");
    private final static QName _TaakOphalenResponseTaakOphalenResult_QNAME = new QName("http://tempuri.org/", "TaakOphalenResult");
    private final static QName _GebruikerOphalenResponseGebruikerOphalenResult_QNAME = new QName("http://tempuri.org/", "GebruikerOphalenResult");
    private final static QName _TakenOphalenResponseTakenOphalenResult_QNAME = new QName("http://tempuri.org/", "TakenOphalenResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GewerkteUrenOphalenResponse }
     * 
     */
    public GewerkteUrenOphalenResponse createGewerkteUrenOphalenResponse() {
        return new GewerkteUrenOphalenResponse();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link TakenOphalen }
     * 
     */
    public TakenOphalen createTakenOphalen() {
        return new TakenOphalen();
    }

    /**
     * Create an instance of {@link TaakVerwijderenResponse }
     * 
     */
    public TaakVerwijderenResponse createTaakVerwijderenResponse() {
        return new TaakVerwijderenResponse();
    }

    /**
     * Create an instance of {@link GebruikerOphalen }
     * 
     */
    public GebruikerOphalen createGebruikerOphalen() {
        return new GebruikerOphalen();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link TaakVerwijderen }
     * 
     */
    public TaakVerwijderen createTaakVerwijderen() {
        return new TaakVerwijderen();
    }

    /**
     * Create an instance of {@link Registreer }
     * 
     */
    public Registreer createRegistreer() {
        return new Registreer();
    }

    /**
     * Create an instance of {@link UrenOpslaanResponse }
     * 
     */
    public UrenOpslaanResponse createUrenOpslaanResponse() {
        return new UrenOpslaanResponse();
    }

    /**
     * Create an instance of {@link GebruikerOphalenResponse }
     * 
     */
    public GebruikerOphalenResponse createGebruikerOphalenResponse() {
        return new GebruikerOphalenResponse();
    }

    /**
     * Create an instance of {@link UrenOpslaan }
     * 
     */
    public UrenOpslaan createUrenOpslaan() {
        return new UrenOpslaan();
    }

    /**
     * Create an instance of {@link TaakOphalen }
     * 
     */
    public TaakOphalen createTaakOphalen() {
        return new TaakOphalen();
    }

    /**
     * Create an instance of {@link GewerkteUrenOphalen }
     * 
     */
    public GewerkteUrenOphalen createGewerkteUrenOphalen() {
        return new GewerkteUrenOphalen();
    }

    /**
     * Create an instance of {@link RegistreerResponse }
     * 
     */
    public RegistreerResponse createRegistreerResponse() {
        return new RegistreerResponse();
    }

    /**
     * Create an instance of {@link TakenOphalenResponse }
     * 
     */
    public TakenOphalenResponse createTakenOphalenResponse() {
        return new TakenOphalenResponse();
    }

    /**
     * Create an instance of {@link TaakOphalenResponse }
     * 
     */
    public TaakOphalenResponse createTaakOphalenResponse() {
        return new TaakOphalenResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "gebruikersnaam", scope = Login.class)
    public JAXBElement<String> createLoginGebruikersnaam(String value) {
        return new JAXBElement<String>(_LoginGebruikersnaam_QNAME, String.class, Login.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "wachtwoord", scope = Login.class)
    public JAXBElement<String> createLoginWachtwoord(String value) {
        return new JAXBElement<String>(_LoginWachtwoord_QNAME, String.class, Login.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "taak", scope = GewerkteUrenOphalen.class)
    public JAXBElement<String> createGewerkteUrenOphalenTaak(String value) {
        return new JAXBElement<String>(_GewerkteUrenOphalenTaak_QNAME, String.class, GewerkteUrenOphalen.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "gebruikersnaam", scope = GewerkteUrenOphalen.class)
    public JAXBElement<String> createGewerkteUrenOphalenGebruikersnaam(String value) {
        return new JAXBElement<String>(_LoginGebruikersnaam_QNAME, String.class, GewerkteUrenOphalen.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "wachtwoord", scope = GewerkteUrenOphalen.class)
    public JAXBElement<String> createGewerkteUrenOphalenWachtwoord(String value) {
        return new JAXBElement<String>(_LoginWachtwoord_QNAME, String.class, GewerkteUrenOphalen.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "gebruikersnaam", scope = TakenOphalen.class)
    public JAXBElement<String> createTakenOphalenGebruikersnaam(String value) {
        return new JAXBElement<String>(_LoginGebruikersnaam_QNAME, String.class, TakenOphalen.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "wachtwoord", scope = TakenOphalen.class)
    public JAXBElement<String> createTakenOphalenWachtwoord(String value) {
        return new JAXBElement<String>(_LoginWachtwoord_QNAME, String.class, TakenOphalen.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaakSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "TaakOphalenResult", scope = TaakOphalenResponse.class)
    public JAXBElement<TaakSet> createTaakOphalenResponseTaakOphalenResult(TaakSet value) {
        return new JAXBElement<TaakSet>(_TaakOphalenResponseTaakOphalenResult_QNAME, TaakSet.class, TaakOphalenResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "taak", scope = UrenOpslaan.class)
    public JAXBElement<String> createUrenOpslaanTaak(String value) {
        return new JAXBElement<String>(_GewerkteUrenOphalenTaak_QNAME, String.class, UrenOpslaan.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "gebruikersnaam", scope = UrenOpslaan.class)
    public JAXBElement<String> createUrenOpslaanGebruikersnaam(String value) {
        return new JAXBElement<String>(_LoginGebruikersnaam_QNAME, String.class, UrenOpslaan.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "wachtwoord", scope = UrenOpslaan.class)
    public JAXBElement<String> createUrenOpslaanWachtwoord(String value) {
        return new JAXBElement<String>(_LoginWachtwoord_QNAME, String.class, UrenOpslaan.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "gebruikersnaam", scope = Registreer.class)
    public JAXBElement<String> createRegistreerGebruikersnaam(String value) {
        return new JAXBElement<String>(_LoginGebruikersnaam_QNAME, String.class, Registreer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "gebruikersnaam", scope = GebruikerOphalen.class)
    public JAXBElement<String> createGebruikerOphalenGebruikersnaam(String value) {
        return new JAXBElement<String>(_LoginGebruikersnaam_QNAME, String.class, GebruikerOphalen.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "taak", scope = TaakVerwijderen.class)
    public JAXBElement<String> createTaakVerwijderenTaak(String value) {
        return new JAXBElement<String>(_GewerkteUrenOphalenTaak_QNAME, String.class, TaakVerwijderen.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "gebruikersnaam", scope = TaakVerwijderen.class)
    public JAXBElement<String> createTaakVerwijderenGebruikersnaam(String value) {
        return new JAXBElement<String>(_LoginGebruikersnaam_QNAME, String.class, TaakVerwijderen.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "wachtwoord", scope = TaakVerwijderen.class)
    public JAXBElement<String> createTaakVerwijderenWachtwoord(String value) {
        return new JAXBElement<String>(_LoginWachtwoord_QNAME, String.class, TaakVerwijderen.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GebruikerOphalenResult", scope = GebruikerOphalenResponse.class)
    public JAXBElement<UserSet> createGebruikerOphalenResponseGebruikerOphalenResult(UserSet value) {
        return new JAXBElement<UserSet>(_GebruikerOphalenResponseGebruikerOphalenResult_QNAME, UserSet.class, GebruikerOphalenResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "taak", scope = TaakOphalen.class)
    public JAXBElement<String> createTaakOphalenTaak(String value) {
        return new JAXBElement<String>(_GewerkteUrenOphalenTaak_QNAME, String.class, TaakOphalen.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "gebruikersnaam", scope = TaakOphalen.class)
    public JAXBElement<String> createTaakOphalenGebruikersnaam(String value) {
        return new JAXBElement<String>(_LoginGebruikersnaam_QNAME, String.class, TaakOphalen.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "TakenOphalenResult", scope = TakenOphalenResponse.class)
    public JAXBElement<ArrayOfstring> createTakenOphalenResponseTakenOphalenResult(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_TakenOphalenResponseTakenOphalenResult_QNAME, ArrayOfstring.class, TakenOphalenResponse.class, value);
    }

}
