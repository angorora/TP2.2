/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cput.codez.angorora.eventster.isp.violation.service.Impl;

import cput.codez.angorora.eventster.isp.violation.model.PayrollUtility;
import java.util.Calendar;

/**
 *
 * @author allen
 */
public class PayrollUtilityImpl implements PayrollUtility{

    public int overtimeHrsWorked(int regularHrs, int hrsWorked) {
        return (hrsWorked-regularHrs);
    }

    public double regularPay(double hrlyRate, int hrsWorked) {
      return( hrlyRate*hrsWorked);
    }

    public double totalPay(double regularPay, double overTimePay) {
       return (regularPay+overTimePay);
    }
    
}
