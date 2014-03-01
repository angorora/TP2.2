/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cput.codez.angorora.eventster.lsp.lspViolation.service.Impl;

import cput.codez.angorora.eventster.lsp.lspViolation.model.Employee;

/**
 *
 * @author allen
 */
public class PermanentEmployee implements Employee{
    
    public double calculateMonthlySalry(double hourlyRate,int hrsWorked) {
       return((hourlyRate*hrsWorked));
    }
    
}
