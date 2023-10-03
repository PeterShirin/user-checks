package com.intellekta.user_checks;

public class Product {
	private String productName;
    private double productPrice;
    private int productCount;

    public Product(String productName, double productPrice, int productCount) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productCount = productCount;
    }
    
    public String getProductName() {
    	return productName;
    }
    
    public void setProductName(String productName) {
    	this.productName = productName;   
    }
    
    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        if (productPrice >= 0) {
            this.productPrice = productPrice;
        } else {
            throw new IllegalArgumentException("Product price cannot be negative");
        }
    }
    
    public int getProductCount() {
    	return productCount;
    }
    
    public void setProductCount(int productCount) {
    	this.productCount = productCount;
    }
    
    public boolean productAvailable() {
        return productCount > 0;
    }
}
