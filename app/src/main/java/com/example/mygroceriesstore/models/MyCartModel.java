package com.example.mygroceriesstore.models;

public class MyCartModel {
    String productName;
    String productPrice;
    String getProductName;
    String totalQuantity;
    int totalPrice;
    String documentId;

    public MyCartModel(){
    }

    public MyCartModel(String productName, String productPrice,String totalQuantity, int totalPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.totalQuantity = totalQuantity;
        this.totalPrice = totalPrice;
    }



    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName){
        this.productName = productName;
    }

    public String getProductPrice() {
        return productPrice;
    }
    public void setProductPrice(String productPrice){
        this.productPrice = productPrice;
    }

    public String getTotalQuantity() {
        return totalQuantity;
    }
    public void setTotalQuantity(String totalQuantity){
        this.totalQuantity = totalQuantity;
    }

    public int getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(int totalPrice){
        this.totalPrice = totalPrice;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }
}
