package com.revature.models;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User implements Serializable {
    
    /**
     * 
     */
    private static final long serialVersionUID = -5655972649874207859L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int user_id;
    
    private String firstname;
    private String lastname;
    private String email;
    private String username;
    private String password;
    private Role role;
    
   
    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(
            name="user_address",
            joinColumns = @JoinColumn(name = "user_id"), 
            inverseJoinColumns = @JoinColumn(name = "address_id"))
    private Set<Address> addresses = new HashSet<>();
    
    
    private int socialSecurtyNumber;
    
    @OneToMany(mappedBy="user")
    private Set<Account> accounts = new HashSet<>();
    
    private Application application;
    
    public User() {
        super();
        // TODO Auto-generated constructor stub
    }
    public User(int user_id, String firstname, String lastname, String email, String username, String password,
            Role role, Set<Address> addresses, int socialSecurtyNumber, Set<Account> accounts,
            Application application) {
        super();
        this.user_id = user_id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.username = username;
        this.password = password;
        this.role = role;
        this.addresses = addresses;
        this.socialSecurtyNumber = socialSecurtyNumber;
        this.accounts = accounts;
        this.application = application;
    }
    public int getUser_id() {
        return user_id;
    }
    public void setUser_id(int user_id) {
        this.user_id = user_id;
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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Role getRole() {
        return role;
    }
    public void setRole(Role role) {
        this.role = role;
    }
    public Set<Address> getAddresses() {
        return addresses;
    }
    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }
    public int getSocialSecurtyNumber() {
        return socialSecurtyNumber;
    }
    public void setSocialSecurtyNumber(int socialSecurtyNumber) {
        this.socialSecurtyNumber = socialSecurtyNumber;
    }
    public Set<Account> getAccounts() {
        return accounts;
    }
    public void setAccounts(Set<Account> accounts) {
        this.accounts = accounts;
    }
    public Application getApplication() {
        return application;
    }
    public void setApplication(Application application) {
        this.application = application;
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
        User other = (User) obj;
        if (accounts == null) {
            if (other.accounts != null)
                return false;
        } else if (!accounts.equals(other.accounts))
            return false;
        if (addresses == null) {
            if (other.addresses != null)
                return false;
        } else if (!addresses.equals(other.addresses))
            return false;
        if (application == null) {
            if (other.application != null)
                return false;
        } else if (!application.equals(other.application))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (firstname == null) {
            if (other.firstname != null)
                return false;
        } else if (!firstname.equals(other.firstname))
            return false;
        if (lastname == null) {
            if (other.lastname != null)
                return false;
        } else if (!lastname.equals(other.lastname))
            return false;
        if (password == null) {
            if (other.password != null)
                return false;
        } else if (!password.equals(other.password))
            return false;
        if (role == null) {
            if (other.role != null)
                return false;
        } else if (!role.equals(other.role))
            return false;
        if (socialSecurtyNumber != other.socialSecurtyNumber)
            return false;
        if (user_id != other.user_id)
            return false;
        if (username == null) {
            if (other.username != null)
                return false;
        } else if (!username.equals(other.username))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "User [user_id=" + user_id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
                + ", username=" + username + ", password=" + password + ", role=" + role + ", addresses=" + addresses
                + ", socialSecurtyNumber=" + socialSecurtyNumber + ", accounts=" + accounts + ", application="
                + application + "]";
    }
    
    
    
  

    
}
