package com.revature.models;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Address")
public class Address implements Serializable{
    /**
     * 
     */
    private static final long serialVersionUID = -2425272521775598317L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int address_id;
    
    @ManyToMany(mappedBy = "addresses")
    private Set<User> users = new HashSet<>();
    
    private String street;
    private String town;
    private String city;
    private int zipcode;
    private String country;
    public Address() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Address(int id, Set<User> users, String street, String town, String city, int zipcode, String country) {
        super();
        this.address_id = id;
        this.users = users;
        this.street = street;
        this.town = town;
        this.city = city;
        this.zipcode = zipcode;
        this.country = country;
    }
    public int getId() {
        return address_id;
    }
    public void setId(int id) {
        this.address_id = id;
    }
    public Set<User> getUsers() {
        return users;
    }
    public void setUsers(Set<User> users) {
        this.users = users;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public String getTown() {
        return town;
    }
    public void setTown(String town) {
        this.town = town;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public int getZipcode() {
        return zipcode;
    }
    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public static long getSerialversionuid() {
        return serialVersionUID;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Address other = (Address) obj;
        if (city == null) {
            if (other.city != null)
                return false;
        } else if (!city.equals(other.city))
            return false;
        if (country == null) {
            if (other.country != null)
                return false;
        } else if (!country.equals(other.country))
            return false;
        if (address_id != other.address_id)
            return false;
        if (street == null) {
            if (other.street != null)
                return false;
        } else if (!street.equals(other.street))
            return false;
        if (town == null) {
            if (other.town != null)
                return false;
        } else if (!town.equals(other.town))
            return false;
        if (users == null) {
            if (other.users != null)
                return false;
        } else if (!users.equals(other.users))
            return false;
        if (zipcode != other.zipcode)
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Address [id=" + address_id + ", users=" + users + ", street=" + street + ", town=" + town + ", city=" + city
                + ", zipcode=" + zipcode + ", country=" + country + "]";
    }
   
    
}
