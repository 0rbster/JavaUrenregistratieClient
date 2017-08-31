package GUI;

/**
 * Created by jeroe on 31-Aug-17.
 */
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import org.tempuri.*;
import org.datacontract.schemas._2004._07.urenregistratieservice.*;
import org.datacontract.schemas._2004._07.urenregistratieservice.ObjectFactory;
import javax.xml.bind.JAXBElement;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;



public class UrenregistratieClient {

    public static void main(String[] args) {

        Urenregistratieservice urenregistratieService = new Urenregistratieservice();
        IUrenregistratieservice client = urenregistratieService.getBasicHttpBindingIUrenregistratieservice();

        ObjectFactory objectFactory = new ObjectFactory();

        boolean login = false;
        String gnaam = "";
        String ww = "";
        Scanner reader = new Scanner(System.in);

        while(login != true){
            System.out.println("Voer uw gebruikersnaam en wachtwoord in:");
            System.out.println("Gebruikersnaam: ");
            String gebruikersnaam =  reader.nextLine();
            System.out.println("Wachtwoord: ");
            String wachtwoord =  reader.nextLine();
            if(client.login(gebruikersnaam,wachtwoord).equals(false)){
                System.out.println("Deze gebruikersnaam/wachtwoord combinatie is bij ons niet bekend, probeer het opnieuw");
            } else {
                login = true;
                gnaam = gebruikersnaam;
                ww = wachtwoord;
            }
        }

        System.out.println("Je bent ingelogd!");

        boolean uitloggen = false;
        while (uitloggen != true) {
            System.out.println("Kies een optie uit het menu:");
            System.out.println("1. Takenlijst ophalen");
            System.out.println("2. Gewerkte uren van een taak aanpassen");
            System.out.println("3. Taak verwijderen");
            System.out.println("4. Uitloggen");
            int keuze = reader.nextInt();

            if (keuze == 1) {
                ArrayOfstring taken = client.takenOphalen(gnaam, ww);
                System.out.println(taken.getString());
            }
            else if (keuze == 2){
                System.out.println("Van welke taak wilt u de gwerkte uren aanpassen? Type de naam: ");
                String skip = reader.nextLine();
                String taak = reader.nextLine();
                System.out.println("Wat zijn de gewerkte uren?:");
                int uren = reader.nextInt();
                if(client.urenOpslaan(taak, uren, gnaam, ww)){
                    System.out.println("Opslaan voltooid!");
                    System.out.println("");
                } else {
                    System.out.println("Opslaan mislukt, controleer de gegevens en probeer het opnieuw");
                    System.out.println("");
                }
            }
            else if (keuze == 3) {
                System.out.println("Welke taak wilt u verwijderen? Type de naam: ");
                String skip = reader.nextLine();
                String taak = reader.nextLine();
                if(client.taakVerwijderen(taak, gnaam, ww)){
                    System.out.println("Verwijderen voltooid!");
                    System.out.println("");
                } else {
                    System.out.println("Er is iets misgegaan, controleer de gegevens en probeer het opnieuw");
                    System.out.println("");
                }
            }
            else if (keuze == 4) {
                uitloggen = true;
            }
        }
    }
}
