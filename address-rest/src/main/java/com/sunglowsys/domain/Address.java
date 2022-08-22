package com.sunglowsys.domain;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "address_test")
public class Address {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(nullable = false)
    private String adderssLine1;

    @NotNull
    @Column(nullable = false)
    private String addressLine2;

    @NotNull
    @Column(nullable = false)
    private String city;

    @NotNull
    @Column(nullable = false)
    private String state;

    @NotNull
    @Column(nullable = false)
    private String country;

    @NotNull
    @Column(nullable = false,unique = true)
    private String zipCode;

    public Address () {}

    public Address(String adderssLine1, String addressLine2, String city, String state, String country, String zipCode) {
        this.adderssLine1 = adderssLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipCode = zipCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdderssLine1() {
        return adderssLine1;
    }

    public void setAdderssLine1(String adderssLine1) {
        this.adderssLine1 = adderssLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;
        Address address = (Address) o;
        return Objects.equals (id, address.id) && Objects.equals (adderssLine1, address.adderssLine1) && Objects.equals (addressLine2, address.addressLine2) && Objects.equals (city, address.city) && Objects.equals (state, address.state) && Objects.equals (country, address.country) && Objects.equals (zipCode, address.zipCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash (id, adderssLine1, addressLine2, city, state, country, zipCode);
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", adderssLine1='" + adderssLine1 + '\'' +
                ", addressLine2='" + addressLine2 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}
