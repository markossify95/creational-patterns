/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModel;

import AbstractProductA.EkranskaForma;
import AbstractProductB.BrokerBazePodataka;
import AbstractProductC.Kontroler;

/**
 *
 * @author mark
 */
public class SoftverskiSistem {

    EkranskaForma ef; // AbstractProductA 
    BrokerBazePodataka bbp; // AbstractProductB 
    Kontroler kon; // AbstractProductC 

    public SoftverskiSistem(EkranskaForma ef1, BrokerBazePodataka bbp1, Kontroler kon1) {
        ef = ef1;
        bbp = bbp1;
        kon = kon1;
    }

    public void prikaziEkranskuFormu() {
        ef.prikaziEkranskuFormu();
    }

}
