/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cput.codez.angorora.eventster.lsp.lspCorrection.model;

import cput.codez.angorora.eventster.lsp.lspViolation.model.Employee;

/**
 *
 * @author allen
 */
public interface PermanentEmply extends SuperEmployee{
    public double calculateMonthlySalary(double allowance,double baseSal);
}
