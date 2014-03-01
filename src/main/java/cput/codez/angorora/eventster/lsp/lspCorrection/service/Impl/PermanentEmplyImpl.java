/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cput.codez.angorora.eventster.lsp.lspCorrection.service.Impl;

import cput.codez.angorora.eventster.lsp.lspCorrection.model.PermanentEmply;

/**
 *
 * @author allen
 */
public class PermanentEmplyImpl implements PermanentEmply{

  

    public double calculateMonthlySalary(double allowance, double baseSal) {
        return (allowance + baseSal);
    }

    public double calculateTax(double pay,double taxRate) {
         return(pay*(taxRate/100));
    }
    
}
