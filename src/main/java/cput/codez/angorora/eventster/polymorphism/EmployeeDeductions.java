/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cput.codez.angorora.eventster.polymorphism;

/**
 *
 * @author allen
 */
public class EmployeeDeductions implements Costing{

    public double taxCalculation(double grossSalary, double taxRate) {
        return grossSalary*taxRate;
    }
    
}
