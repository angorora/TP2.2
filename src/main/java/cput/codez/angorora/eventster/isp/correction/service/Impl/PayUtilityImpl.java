/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cput.codez.angorora.eventster.isp.correction.service.Impl;

import cput.codez.angorora.eventster.isp.correction.model.GrossPay;
import cput.codez.angorora.eventster.isp.correction.model.Overtime;
import cput.codez.angorora.eventster.isp.correction.model.RegularPay;

/**
 *
 * @author allen
 */
public class PayUtilityImpl implements GrossPay,RegularPay{

    public double regularPay(double hrlyRate, int hrsWorked) {
         return( hrlyRate*hrsWorked);
    }

    public double totalPay(double regularPay, double overTimePay) {
         return (regularPay+overTimePay);
    }

    
}
