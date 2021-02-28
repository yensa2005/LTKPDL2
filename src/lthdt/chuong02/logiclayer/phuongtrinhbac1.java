/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong02.logiclayer;

/**
 *
 * @author ttysa
 */
public class phuongtrinhbac1 implements phuongtrinhInterface{
    private double a;
    private double b;
    private double nghiem_x;
    private String ketqua;

    public phuongtrinhbac1() {
    }

    public phuongtrinhbac1(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void giaiphuongtrinh() {
        if(a != 0 ) {
            nghiem_x = -b/a;
        } else {
            if(b != 0){
               ketqua = "Phuong trinh bac 1 vo nghiem"; 
            } else{
               ketqua = "Phuong trinh bac 1 co vo so nghiem";  
            }
        }
    }

    @Override
    public String toString() {
        if(ketqua == null || ketqua.isEmpty()){
            giaiphuongtrinh();
        }
        return ketqua;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getNghiem_x() {
        return nghiem_x;
    }

    public void setNghiem_x(double nghiem_x) {
        this.nghiem_x = nghiem_x;
    }

    public String getKetqua() {
        return ketqua;
    }

    public void setKetqua(String ketqua) {
        this.ketqua = ketqua;
    }
    
    
}
