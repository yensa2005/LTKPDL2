/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong03.coffeelogic;

/**
 *
 * @author ttysa
 */
public class bill implements Cloneable{
    private int billID;
    private product[] products;

    public bill() {
    }

    public bill(int billID, product[] products) {
        this.billID = billID;
        this.products = products;
    }

    public int getBillID() {
        return billID;
    }

    public void setBillID(int billID) {
        this.billID = billID;
    }

    public product[] getProducts() {
        return products;
    }

    public void setProducts(product[] products) {
        this.products = products;
    }

    @Override
    public String toString() {
        String ketqua = "Bill " + this.billID + " \n";
        for(int i = 0; i < products.length; i++) {
            ketqua += "\t " + products[i].toString() + "\n";
        }
        return ketqua;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        bill temp = (bill) super.clone();
        temp.setBillID(this.billID);
        temp.products = new product[this.products.length];
        for (int i = 0; i < this.products.length; i++){
            temp.products[i] = new product(this.products[i].getName(),
                                            this.products[i].getPrice());
        }
        return temp;
    }
    
    
}
