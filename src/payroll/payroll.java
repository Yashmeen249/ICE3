/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

/**
 *
 * @author Yashmeen Sharma
 */
public class payroll {

    /**
     * @param args
     * @yashmeen args the command line arguments
     */
    public static void main(String[] args){
        Employee e1 = new Employee("aman",35,100);
        Manager m1 = new Manager("tina", 35,100,1000,100);
        SalesAssociate sl = new SalesAssociate("reetu",35, 1000,1000,1000);
        System.out.println("\n"+e1.calculatePay());
        System.out.println("\n"+m1.calculatePay());
       System.out.println("\n"+sl.calculatePay());
    }
}

