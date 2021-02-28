/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong03.coffeelogic;

import java.util.Date;

/**
 *
 * @author ttysa
 */
public class manager extends Person{
    private coffeeshop[] shops;
    private double income;

    public manager() {
        super();
    }

    public manager(coffeeshop[] shops, double income, String hoten, int gioitinh, Date ngaysinh) {
        super(hoten, gioitinh, ngaysinh);
        this.shops = shops;
        this.income = income;
    }

    public coffeeshop[] getShops() {
        return shops;
    }

    public void setShops(coffeeshop[] shops) {
        this.shops = shops;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    @Override
    public String toString() {
        String ketqua = super.toString();
        ketqua += "manager{" + "shops=" + shops + ", income=" + income + '}';
        return ketqua;
    }
    
    
            
}
