/* Sef.java
 * @autor  prof. dr Sinisa Vlajic,
 * Univerzitet u Beogradu
 * Fakultet organizacionih nauka 
 * Katedra za softversko inzenjerstvo
 * Laboratorija za softversko inzenjerstvo
 * 06.11.2017
 */
package Client;

import AbstractFactory.*;
import AbstractProductA.*;
import AbstractProductB.*;
import AbstractProductC.*;
import SystemModel.SistemSingleton;
import SystemModel.SoftverskiSistem;

public class Sef { // Client

    Projektant proj; // Abstract Factory   
    static SoftverskiSistem ss;

    Sef(Projektant proj1) {
        proj = proj1;
    }

    public static void main(String args[]) {
        Sef sef;
        Projektant proj = new Projektant1(); // Promenljivo!!! 
        sef = new Sef(proj);
        sef.Kreiraj();
    }

    void Kreiraj() {
        EkranskaForma ef = proj.kreirajEkranskuFormu();
        BrokerBazePodataka bbp = proj.kreirajBrokerBazePodataka();
        Kontroler kon = proj.kreirajKontroler(ef, bbp);
        ss = SistemSingleton.Instance(ef, bbp, kon);
        System.out.println("Prvo pojavljivanje: " + ss);
        ss.prikaziEkranskuFormu();
        ss = SistemSingleton.Instance(ef, bbp, kon);
        System.out.println("Drugo pojavljivanje (ista adresa): " + ss);
        ss.prikaziEkranskuFormu();
    }

}
