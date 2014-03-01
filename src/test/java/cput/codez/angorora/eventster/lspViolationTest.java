/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cput.codez.angorora.eventster;

import cput.codez.angorora.eventster.config.AllConfig;
import cput.codez.angorora.eventster.lsp.lspViolation.model.Employee;
import cput.codez.angorora.eventster.lsp.lspViolation.service.Impl.ContractEmployee;
import cput.codez.angorora.eventster.lsp.lspViolation.service.Impl.PermanentEmployee;
import java.util.ArrayList;
import java.util.List;
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
public class lspViolationTest {
    static ContractEmployee cnt;
    static PermanentEmployee pmt;
    static ApplicationContext ctx;
    static int hrsWorked;
    static double hourlyRate;
    public lspViolationTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test(expectedExceptions = UnsupportedOperationException.class)
        public void testLspViolation()throws UnsupportedOperationException{
        List<Employee>emplist = new ArrayList<Employee>();
        emplist.add( new ContractEmployee());
        emplist.add(new PermanentEmployee());
        hourlyRate = 10;
        hrsWorked = 10;
        System.out.println("/nLSP violation done\n");
        System.out.println("Here the idea was that the Super interface Employee declares a\nmethod calculateMonthlySalary but then not all the subclasses of Employee are claculating monthly\nsalary as the contract employee might be paid weekly\nso the contract employee here cant be substituted for the super Employee class here.");
     

        Assert.assertEquals(pmt.calculateMonthlySalry(10, 10),100, 0.01);
        Assert.assertEquals(cnt.calculateMonthlySalry(10, 10),100, 0.01);
        for(Employee s: emplist)
        {
            s.calculateMonthlySalry(hourlyRate, hrsWorked);
        }
       }

    @BeforeClass
    public static void setUpClass() throws Exception {
      ctx = new AnnotationConfigApplicationContext(AllConfig.class);
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        cnt=(ContractEmployee) ctx.getBean("contsalary");
        pmt= (PermanentEmployee) ctx.getBean("permsalary");
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}