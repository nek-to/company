package com.source;

public class Company {
    private String address;

    public Company(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void address() {
        System.out.println(address);
    }

    @Override
    public String toString() {
        return "Company - " +
                address;
    }
}
