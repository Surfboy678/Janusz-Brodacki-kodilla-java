package com.kodilla.good.paterns.challenges.challenges2;

public class ProductHealthyShop {
    private String nameShop;
    private String productType;
    private int quantityProduct;

    public ProductHealthyShop(String nameShop, String productType, int quantityProduct) {
        this.nameShop = nameShop;
        this.productType = productType;
        this.quantityProduct = quantityProduct;
    }

    public String getNameShop() {
        return nameShop;
    }

    public String getProductType() {
        return productType;
    }

    public int getQuantityProduct() {
        return quantityProduct;
    }

    @Override
    public String toString() {
        return "Name Shop:" + " " + nameShop +
                ", Product Type:" + "" + productType  +
                ", Quantity Product:" + "" + quantityProduct;

    }

}
