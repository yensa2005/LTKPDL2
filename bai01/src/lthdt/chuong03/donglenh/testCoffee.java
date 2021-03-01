/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong03.donglenh;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Locale;
import lthdt.chuong03.coffeelogic.coffeeshop;
import lthdt.chuong03.coffeelogic.manager;

/**
 *
 * @author ttysa
 */
public class testCoffee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        coffeeshop[] a = new coffeeshop[]{new coffeeshop("Kha Coffee", "2 Nguyen Trai"),
                                          new coffeeshop("White Coffee", "42 Nguyen Hue"),
                                          new coffeeshop("red Coffee", "92 Nguyen Trai")};
        manager[] managers = new manager[]{
                            new manager(a, 100, "Nguyen Van A", 0, df.parse("12-12-1999")),
                            new manager( new coffeeshop[]{
                                                new coffeeshop("Hoang Hac", "35 Nguyen Hue")
                                        },
                                        2000,"Nguyen Van B", 1, df.parse("12-12-1999"))
                            };
        System.out.println(Arrays.toString(managers));
    }
    
}
