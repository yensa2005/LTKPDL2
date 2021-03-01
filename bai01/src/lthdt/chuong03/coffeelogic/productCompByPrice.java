/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong03.coffeelogic;

import java.util.Comparator;

/**
 *
 * @author ttysa
 */
public class productCompByPrice implements Comparator<product>{

    @Override
    public int compare(product o1, product o2) {
        double temp = o1.getPrice() - o2.getPrice();
        return (int)temp;
    }
    
}
