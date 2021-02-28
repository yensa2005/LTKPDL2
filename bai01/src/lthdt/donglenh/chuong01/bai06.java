/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.donglenh.chuong01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author ttysa
 */
public class bai06 {
    public static void main(String[] args) throws ParseException{
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        String input = "11-03-2000";
        Date ngaysinh = df.parse(input);
        Person person = new Person("Nguyen Van A", 1, ngaysinh);
        System.out.println("Ho ten: " + person.getHoten() + "; Gioi tinh: " + person.getGioitinh()
                + "; Ngay sinh: " + df.format(person.getNgaysinh()));
        
        student sinhvien = new student();
        sinhvien.setHoten("Nguyen Van B");
        sinhvien.setGioitinh(1);
        sinhvien.setNgaysinh(df.parse("12-12-2002"));
        sinhvien.setTruonghoc("Dai hoc Hue");
        System.out.println(sinhvien.getHoten() + "; Gioi tinh: " + sinhvien.getGioitinh() +
                "; Ngay sinh: " + df.format(sinhvien.getNgaysinh())+ "; " + sinhvien.getTruonghoc());
        System.out.println(sinhvien.calcTax(1200));
        
        worker congnhan = new worker();
        congnhan.setHoten("Nguyen Thi C");
        congnhan.setGioitinh(0);
        congnhan.setNgaysinh(df.parse("02-09-2003"));
        congnhan.setCongty("IBM");
        System.out.println(congnhan.getHoten() + "; Gioi tinh: " + congnhan.getGioitinh() +
                "; Ngay sinh: " + df.format(congnhan.getNgaysinh())+ "; " + congnhan.getCongty());
        System.out.println(congnhan.calcTax(2000));

    }
}
