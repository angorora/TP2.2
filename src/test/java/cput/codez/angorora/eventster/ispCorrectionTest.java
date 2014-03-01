/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cput.codez.angorora.eventster;

import cput.codez.angorora.eventster.config.AllConfig;
import cput.codez.angorora.eventster.isp.correction.service.Impl.PayUtilityImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author allen
 */
public class ispCorrectionTest {
    static PayUtilityImpl payUt;
    static int hrsWorked;
    static double hrlyRate;
    static double overtime;
    static double regularPay;
    
    public ispCorrectionTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testRegularPay() {
         hrlyRate= 100;
         hrsWorked=8;
         Assert.assertEquals(payUt.regularPay(hrlyRate, hrsWorked), 800, 0.01);
     }
     @Test
     public  void testGrossPay(){
         hrlyRate= 100;
         hrsWorked=8;
         overtime = 1200;
         regularPay= payUt.regularPay(hrlyRate, hrsWorked);
         Assert.assertEquals(payUt.totalPay(regularPay, overtime), 2000, 0.01);
     }
    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AllConfig.class);
        payUt = (PayUtilityImpl)ctx.getBean("corUtility");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}