/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong03.donglenh;

import java.util.Arrays;
import lthdt.chuong03.coffeelogic.product;
import lthdt.chuong03.coffeelogic.productCompByName;
import lthdt.chuong03.coffeelogic.productCompByPrice;

/**
 *
 * @author ttysa
 */
public class testProductArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Tao mang ca san pham
        product[] sp = new product[]{new product("Chuot",12),
                                     new product("Loa",5),
                                     new product("Loa",8),
                                     new product("Ban Phim",2),
                                     new product("CPU",23)};
        System.out.println("Mang ban dau la");
        System.out.println(Arrays.toString(sp));
//        product temp;
//        for (int i = 0; i < sp.length - 1; i++)
//             for (int j = i + 1; j < sp.length; j++)
//                 if(sp[i].getPrice() > sp[j].getPrice()){
//                     temp = sp[i];
//                     sp[i] = sp[j];
//                     sp[j] = temp;
//                 }
        //Sap xep theo mang tang dan
//        Arrays.sort(sp, new productCompByPrice());
//        System.out.println("Mang sap xep tang dan theo gia ca");
//        System.out.println(Arrays.toString(sp));
        System.out.println("Sap xep theo ten san pham");
        Arrays.sort(sp, new productCompByName());
        System.out.println(Arrays.toString(sp));
        
        int index = Arrays.binarySearch(sp, new product("Loa",12), new productCompByName());
        if(index < 0){
            System.out.println("Khong tim thay");
        } else {
            System.out.println("Phan tu thu " + index + " chua gia tri can tim");
            System.out.println(sp[index]);
        }
        
    }
    
}
