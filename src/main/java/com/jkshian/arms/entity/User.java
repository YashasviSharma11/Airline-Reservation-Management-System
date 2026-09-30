package com.jkshian.arms.entity;

import com.jkshian.arms.User.Role;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Data
@Builder
@Entity
@Table(name =  "user")
public class User implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Integer id;
    private String firstName;
     private String lastName;
     private String email;
     private String password;
    

     @Enumerated(EnumType.STRING)
     private Role role;
    public User() {}
    public User(Integer id,String firstName,String lastName,String email,String password,Role role){this.id=id;this.firstName=firstName;this.lastName=lastName;this.email=email;this.password=password;this.role=role;}
    public Integer getId(){return id;} public void setId(Integer v){id=v;} public String getFirstName(){return firstName;} public void setFirstName(String v){firstName=v;} public String getLastName(){return lastName;} public void setLastName(String v){lastName=v;} public String getEmail(){return email;} public void setEmail(String v){email=v;} public void setPassword(String v){password=v;} public Role getRole(){return role;} public void setRole(Role v){role=v;}
    public static Builder builder(){return new Builder();}
    public static class Builder { private final User value=new User(); public Builder firstName(String v){value.firstName=v;return this;} public Builder lastName(String v){value.lastName=v;return this;} public Builder email(String v){value.email=v;return this;} public Builder password(String v){value.password=v;return this;} public Builder role(Role v){value.role=v;return this;} public User build(){return value;} }
     

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(role.name()));
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
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
