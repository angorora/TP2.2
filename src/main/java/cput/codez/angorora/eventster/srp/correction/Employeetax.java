/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cput.codez.angorora.eventster.srp.correction;

import cput.codez.angorora.eventster.srp.Taxes;

/**
 *
 * @author allen
 */
public class Employeetax implements Taxes{

    public double taxCalculation(double income, double taxRate) {
         return( income*(taxRate/100));
    }

    
    
}
