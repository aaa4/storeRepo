package com.example.demo.model;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by Nyansus on 16.11.2017.
 */
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long productId;

    @Column(name = "name")
    private String name;
  //  @Column(name = "unitPrice")
    private BigDecimal unitPrice;
  //  @Column(name = "description")
    private String description="";
 //  @Column(name = "manufacturer")
    private String manufacturer;
   // @Column(name = "category")
    private String category;
  //  @Column(name = "unitsInStock")
    private long unitsInStock;
    //@Column(name = "unitsInOrder")
    private long unitsInOrder;

    //private boolean discontinued;
   // private String condition;


    public String toString(){
        return "name = ["+name+"] "+
                "unitPrice = ["+unitPrice+"] "+
                "manufacturer = ["+manufacturer+"] "+
                "category = ["+category+"] "+
                "unitsInStock = ["+unitsInStock+"] "+
                "unitsInOrder = ["+unitsInOrder+"] ";
    }

    public Product() {
    }

    public Product(String name, BigDecimal unitPrice, String description, String manufacturer, String category, long unitsInStock, long unitsInOrder) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.description = description;
        this.manufacturer = manufacturer;
        this.category = category;
        this.unitsInStock = unitsInStock;
        this.unitsInOrder = unitsInOrder;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public long getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(long unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

    public long getUnitsInOrder() {
        return unitsInOrder;
    }

    public void setUnitsInOrder(long unitsInOrder) {
        this.unitsInOrder = unitsInOrder;
    }

   /* public boolean isDiscontinued() {
        return discontinued;
    }

    public void setDiscontinued(boolean discontinued) {
        this.discontinued = discontinued;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }*/
}
