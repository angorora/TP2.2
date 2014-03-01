/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cput.codez.angorora.eventster.srp.correction;

/**
 *
 * @author allen
 */
public class NetSalCalc {
    Employeetax emptax = new Employeetax();
    public double netSalary(double grossSalary, double taxRate){
        return (grossSalary-(emptax.taxCalculation(grossSalary, taxRate)));
    }
}
