/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong03.donglenh;

/**
 *
 * @author ttysa
 */
public class testString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String content = "Co cong mai sac \n Co ngay nen kim";
        System.out.println(content);
        
        //Thao tac 1: Tim vi tri cua 1 ki tu
        System.out.println("Vi tri cua ki tu a trong chuoi la: " + content.indexOf('a'));
        System.out.println("Vi tri cua ki tu kim trong chuoi la: " + content.indexOf("kim"));
        
        //Thao tac 2: kiem tra khoi dau va ket thuc
        System.out.println("Chuoi mo dau bang cum tu Co: " + content.startsWith("Co"));
        System.out.println("Chuoi ket thuc bang cum tu kim: " + content.endsWith("kim"));
        
        //Thao tac 3: cat chuoi theo vi tri
        String temp = content.substring(20,26);
        System.out.println("Chuoi con la: " + temp);
        
        //Thao tac 4: phan tach chuoi
        String[] result = content.split("\n");
        for (int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
        
        //Thao tac 5: loai bo khoan trang dau - cuoi chuoi
        for (int i = 0; i < result.length; i++){
            System.out.println(result[i].trim());
        }
        
        //Thao tac 6: thay the ki tu
        temp = content.replace('a','z');
        System.out.println(temp);
        
        //Thao tac 7: chuyen kieu
        temp = content.toUpperCase();
        System.out.println(temp);
        temp = content.toLowerCase();
        System.out.println(temp);
        
        //Thao tac 8: so sanh chuoi
        temp = "Nguyen";
        if(temp.compareToIgnoreCase("Nguyen") == 0){
            System.out.println("2 chuoi bang nhau");
        } else {
        System.out.println("2 chuoi khong bang nhau");    
        }
        
        //Thao tac 9: Noi chuoi
        temp = temp.concat(" Van A");
        System.out.println(temp);
        
        //Thao tac 10: truy xuat bang chi so
        for(int i = 0; i < temp.length(); i++){
            System.out.print(temp.charAt(i));
        }
        System.out.println();
        
        //Thao tac 11: su dung stringbuilder
        StringBuilder sb = new StringBuilder();
        sb.append("Co cong mai sac \n");
        sb.append("Co ngay nen kim \n");
        temp = sb.toString();
        System.out.println(sb);
    }
    
}
