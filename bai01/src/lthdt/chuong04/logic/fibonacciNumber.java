/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong04.logic;

/**
 *
 * @author ttysa
 */
public class fibonacciNumber {

    public fibonacciNumber() {
    }
    
    public int calcFibo (int n){
        //dieu kien dung
        if(n == 1)
            return 0;
        if(n == 2)
            return 1;
        //loi goi de qui
        return (calcFibo(n-1) + calcFibo(n-2));
    }
}
