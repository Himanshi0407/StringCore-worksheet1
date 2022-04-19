package com.SpringSheet1.wire;

public class Address {
    private String street;
    private int pinCode;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getPinCode() {
        return pinCode;
    }



    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }
    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", pinCode=" + pinCode +
                '}';
    }
}