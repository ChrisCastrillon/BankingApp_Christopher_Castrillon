package com.revature.models;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="applications")
@Access(value=AccessType.FIELD)
public class Application implements Serializable {
   
    /**
     * 
     */
    private static final long serialVersionUID = -8876517907165828078L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String firstname;
    private String lastname;
    private String socialSecurityNumber;
    private double income;
    private String status;
    private Address address;
    
    public Application() {
        super();
    }
    public Application(int id, String firstname, String lastname, String socialSecurityNumber, double income,
            Address address, String status) {
        super();
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.socialSecurityNumber = socialSecurityNumber;
        this.income = income;
        this.address = address;
        this.status = status;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }
    public double getIncome() {
        return income;
    }
    public void setIncome(double income) {
        this.income = income;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((address == null) ? 0 : address.hashCode());
        result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
        result = prime * result + id;
        long temp;
        temp = Double.doubleToLongBits(income);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
        result = prime * result + ((socialSecurityNumber == null) ? 0 : socialSecurityNumber.hashCode());
        result = prime * result + ((status == null) ? 0 : status.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Application other = (Application) obj;
        if (address == null) {
            if (other.address != null)
                return false;
        } else if (!address.equals(other.address))
            return false;
        if (firstname == null) {
            if (other.firstname != null)
                return false;
        } else if (!firstname.equals(other.firstname))
            return false;
        if (id != other.id)
            return false;
        if (Double.doubleToLongBits(income) != Double.doubleToLongBits(other.income))
            return false;
        if (lastname == null) {
            if (other.lastname != null)
                return false;
        } else if (!lastname.equals(other.lastname))
            return false;
        if (socialSecurityNumber == null) {
            if (other.socialSecurityNumber != null)
                return false;
        } else if (!socialSecurityNumber.equals(other.socialSecurityNumber))
            return false;
        if (status == null) {
            if (other.status != null)
                return false;
        } else if (!status.equals(other.status))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Application [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname
                + ", socialSecurityNumber=" + socialSecurityNumber + ", income=" + income + ", address=" + address
                + ", status=" + status + "]";
    }
    
}
   
