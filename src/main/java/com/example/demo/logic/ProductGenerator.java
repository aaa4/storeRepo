package com.example.demo.logic;

import com.example.demo.model.Product;

import java.math.BigDecimal;
import java.util.Locale;

public class ProductGenerator {

    private Product product;
    private String name;
    private BigDecimal unitPrice;
    private String description;
    private String manufacturer;
    private String category = "Smartphone";
    private long unitsInStock;
    private long unitsInOrder;

    public static String[] manufacturers = {
            "Asus", "Xiaomi", "Apple", "Rostech", "Philips",
            "Oppo", "LG", "Moto", "HTC", "Samsung", "Huawei"};


    public ProductGenerator() {
        //this.product = new Product();
        setManufacturer(manufacturers);
        setName(manufacturer);
        setUnitsInStock();
        setUnitsInOrder();
        setUnitPrice();
        setProduct();
    }

    public void setProduct() {
        Product product = new Product();
        product.setManufacturer(manufacturer);
        product.setName(name);
        product.setUnitsInStock(unitsInStock);
        product.setUnitsInOrder(unitsInOrder);
        product.setUnitPrice(unitPrice);
        product.setCategory(category);
        this.product = product;
    }

    public static int randomNumber(int maxRandom) {
        return new MyRandom(maxRandom).randomNumber;

    }

    private void setManufacturer(String[] manufacturers) {
        int currentSizeOfArray = manufacturers.length - 1;  //чтобы не забыть
        this.manufacturer = manufacturers[randomNumber(currentSizeOfArray)];
    }

    private void setName(String manufacturer) {
        int prefixLength = randomNumber(manufacturer.length() - 1);
        int postfixLength = 8;
        PostfixGenerator postfixGenerator = new PostfixGenerator(postfixLength);
        this.name = crop(manufacturer, prefixLength) + "-" + postfixGenerator.getPostfix();
    }

    private void setUnitsInStock() {
        this.unitsInStock = (long) (randomNumber(200) + 6);
    }

    private void setUnitsInOrder() {
        int maxInOrder = (int) (unitsInStock - unitsInStock / 2);
        this.unitsInOrder = (long) randomNumber(maxInOrder);
    }

    public void setUnitPrice() {
        int maxPrice = 2000;
        int constrant = 100;
        this.unitPrice = new BigDecimal(randomNumber(maxPrice) + constrant);
    }


    //crops string S to {$length} size
    private String crop(String input, int length) {
        int prefixLength = length;
        String result = "";
        for (int index = 0; index < prefixLength; index++)
            result = result + input.charAt(index);
        return result;
    }


    public String getManufacturer() {
        return manufacturer;
    }

    public String getName() {
        return name;
    }

    public Product getProduct() {
        return product;
    }

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            ProductGenerator productGenerator = new ProductGenerator();
           System.out.println(productGenerator.getProduct());
        }


    }
}
