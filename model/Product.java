package model;

import utils.DateUtils;

import java.time.Instant;
import java.util.Date;

public class Product {
    private long id;
    private String name;
    private float price;
    private int amount;
    private String manufacturer;
    private Date createAt;
    private Instant updateAt;

    public Product(){

    }

    public Product(long id, String name, float price, int amount, String manufacturer, Date createAt, Instant updateAt) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.manufacturer = manufacturer;
        this.createAt = createAt;
        this.updateAt = updateAt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Instant getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Instant updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public String toString() {
        String dateCreateAt = DateUtils.formatDateToString(this.createAt);
        String dateUpdateAt = DateUtils.formatInstanstToString(this.updateAt);
        return String.format("%5s, %15s, %5s, %5s, %5s, %5s, %5s\n", this.id, this.name, this.price,
                this.amount, this.manufacturer, dateCreateAt, dateUpdateAt);
    }
}
