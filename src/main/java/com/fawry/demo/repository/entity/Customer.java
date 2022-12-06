package com.fawry.demo.repository.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "CUSTOMERS")
public class Customer implements Serializable, UserDetails {

    private static final long serialVersionUID = -7168715675685919727L;
    @Id
    @SequenceGenerator(sequenceName = "customer_gen", allocationSize = 1, name = "customers_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_gen")

    @Column(name = "ID")
    private Long id;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "PHONE")
    private String phone ;
    @Enumerated(EnumType.STRING)
    private CustomerRole customerRole;
    private Boolean locked = false;
    private Boolean enabled = false;
    @ToString.Exclude
    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
    private List<Order> orderList;

    public Customer(String firstName,
                   String lastName,
                   String email,
                   String password,
                   CustomerRole customerRole) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.customerRole = customerRole;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        SimpleGrantedAuthority authority =
                new SimpleGrantedAuthority(customerRole.name());
        return Collections.singletonList(authority);
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return !locked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }
}