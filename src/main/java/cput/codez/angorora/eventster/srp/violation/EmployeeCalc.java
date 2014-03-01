/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cput.codez.angorora.eventster.srp.violation;

import cput.codez.angorora.eventster.srp.Taxes;

/**
 *
 * @author allen
 */
public class EmployeeCalc implements Taxes{

    public double taxCalculation(double income, double taxRate) {
        return( income*(taxRate/100));
    }
    public double netSalary(double grossSalary, double taxRate){
        return (grossSalary-taxCalculation(grossSalary, taxRate));
    }
}
