package com.SpringSheet1.wire.annotation;

import com.SpringSheet1.wire.Address;
import org.springframework.beans.factory.annotation.Autowired;
public class Student {
    @Autowired
    private com.SpringSheet1.wire.Address address;

    public com.SpringSheet1.wire.Address getAddress() {
        return address;
    }

    public void setAddress(com.SpringSheet1.wire.Address address) {
        this.address = address;
    }

    public Student(Address address) {
        this.address = address;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "address=" + address +
                '}';
    }
}
