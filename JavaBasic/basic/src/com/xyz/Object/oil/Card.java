package com.xyz.Object.oil;

import java.time.LocalDate;

public class Card {
    private int id;
    private String name;
    private String phone;
    private double balance;
    private final LocalDate creationDate; // New attribute for creation date

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public Card(int id, String name, String phone, double balance) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.balance = balance;
        this.creationDate = LocalDate.now(); // Automatically set creation date to current system date
    }

    @Override
    public String toString() {
        String cardType = this instanceof GoldCard ? "GoldCard" : this instanceof SilverCard ? "SilverCard" : "Card";
        return cardType + "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", balance=" + balance +
                ", creationDate=" + creationDate +
                '}';
    }
}
