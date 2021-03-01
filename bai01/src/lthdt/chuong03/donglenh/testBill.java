/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong03.donglenh;

import lthdt.chuong03.coffeelogic.bill;
import lthdt.chuong03.coffeelogic.product;

/**
 *
 * @author ttysa
 */
public class testBill {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws CloneNotSupportedException{
        // TODO code application logic here
        bill a = new bill(12,new product[]{
                             new product("Hoa", 12),
                             new product("Thu", 3)});
        
        System.out.println("a = " + a);
        
        bill temp = (bill) a.clone();
        temp.setBillID(15);
        
        System.out.println("a = " + a);
        System.out.println("temp = " + temp);
    }
    
}
