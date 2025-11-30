/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;
import Business.Employee.Employee;
import Business.Role.Admin;
import Business.UserAccount.UserAccount;
/**
 *
 * @author gaganaananda
 */
public class SystemConfiguration {
     public static Ecosystem configure(){
        
        Ecosystem ecosystem = Ecosystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = ecosystem.getEmpDir().createEmployee("admin");
        
        UserAccount userAccount = ecosystem.getUsrAccDir().createUserAccount("admin", "admin", employee, new Admin());
        
        return ecosystem;
    }
}
