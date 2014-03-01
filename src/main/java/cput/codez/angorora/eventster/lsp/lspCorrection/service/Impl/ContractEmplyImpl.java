/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cput.codez.angorora.eventster.lsp.lspCorrection.service.Impl;

import cput.codez.angorora.eventster.lsp.lspCorrection.model.ContractEmpl;
import cput.codez.angorora.eventster.lsp.lspCorrection.model.SuperEmployee;

/**
 *
 * @author allen
 */
public class ContractEmplyImpl implements ContractEmpl{
  
    public double calculateTax(double pay,double  taxRate) {
        return(pay*(taxRate/100));
    }

   public double calculatePay(double hrsWorked, double hrlyRate) {
          return (hrsWorked*hrlyRate);
    }
}
   

    

