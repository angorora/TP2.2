/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cput.codez.angorora.eventster.isp.violation.model;

import java.util.Calendar;

/**
 *
 * @author allen
 */
public interface PayrollUtility {
     public double regularPay(double hrlyRate,int hrsWorked);
     public int overtimeHrsWorked(int regularHrs,int hrsWorked);
     public double totalPay(double regularPay,double overTimePay);
  
}
