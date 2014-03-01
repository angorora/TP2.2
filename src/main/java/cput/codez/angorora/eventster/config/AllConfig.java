/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cput.codez.angorora.eventster.config;

//import cput.codez.angorora.eventster.ocp.ocpCorrection.model.DiscountedAmnt;
import cput.codez.angorora.eventster.dip.correction.model.Notication;
import cput.codez.angorora.eventster.dip.correction.service.Impl.ConferensEvent;
import cput.codez.angorora.eventster.dip.correction.service.Impl.NoticationImpl;
import cput.codez.angorora.eventster.dip.correction.service.Impl.SportEvent;
import cput.codez.angorora.eventster.isp.correction.service.Impl.PayUtilityImpl;
import cput.codez.angorora.eventster.isp.violation.model.PayrollUtility;
import cput.codez.angorora.eventster.isp.violation.service.Impl.PayrollUtilityImpl;
import cput.codez.angorora.eventster.lsp.lspCorrection.model.SuperEmployee;
import cput.codez.angorora.eventster.lsp.lspCorrection.service.Impl.ContractEmplyImpl;
import cput.codez.angorora.eventster.lsp.lspCorrection.service.Impl.PermanentEmplyImpl;
import cput.codez.angorora.eventster.lsp.lspViolation.model.Employee;
import cput.codez.angorora.eventster.lsp.lspViolation.service.Impl.ContractEmployee;
import cput.codez.angorora.eventster.lsp.lspViolation.service.Impl.PermanentEmployee;
import cput.codez.angorora.eventster.ocp.ocpCorrection.model.DiscountedAmnt;
import cput.codez.angorora.eventster.ocp.ocpCorrection.service.Impl.DiscountedAmntImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author allen
 */
@Configuration
public class AllConfig {
     
    @Bean(name="discount")
    public DiscountedAmnt getService()
    {
        return new DiscountedAmntImpl();
    }
    @Bean(name ="contsalary")
    public ContractEmployee getSalaryService()
    {
        return new ContractEmployee();
    }
    @Bean(name ="permsalary")
    public Employee getPermanentSalary()
    {
        return new PermanentEmployee();
    }
    @Bean(name = "lspcontSal")
    public SuperEmployee getContEmployeeService(){
        return new ContractEmplyImpl();
    }
    @Bean(name = "lsppermSal")
    public SuperEmployee getPermEmployeeService(){
        return new PermanentEmplyImpl();
    }
    @Bean(name = "sport") 
    public Notication getSpoNotificationService(){
        return new SportEvent();
    }
    @Bean(name = "confer")
    public Notication getConNotificationService(){
        return new ConferensEvent();
    }
    @Bean(name = "superNote")
    public NoticationImpl getNoticationImplService(){
        return new NoticationImpl();
    }
    @Bean(name = "vioutility")
    public PayrollUtility getPayrollUtilityService(){
        return new PayrollUtilityImpl();
    }
    @Bean(name = "corUtility")
    public PayUtilityImpl getPayUtilityService(){
        return new PayUtilityImpl();
    }
}
