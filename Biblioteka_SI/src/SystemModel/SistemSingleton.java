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
public class SistemSingleton {
    static SoftverskiSistem ss;
    static boolean jedinstvenoPojavljivanje = false;

    public static SoftverskiSistem Instance(EkranskaForma ef1, BrokerBazePodataka bbp1, Kontroler kon1) {
        if (jedinstvenoPojavljivanje == false) {
            ss = new SoftverskiSistem(ef1, bbp1, kon1);
            jedinstvenoPojavljivanje = true;
        }
        return ss;
    }
}
