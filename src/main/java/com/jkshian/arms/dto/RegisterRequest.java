package com.jkshian.arms.dto;

import com.jkshian.arms.User.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
public class RegisterRequest {
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    public RegisterRequest() {}
    public RegisterRequest(String firstname,String lastname,String email,String password){this.firstname=firstname;this.lastname=lastname;this.email=email;this.password=password;}
    public String getFirstname(){return firstname;} public void setFirstname(String v){firstname=v;}
    public String getLastname(){return lastname;} public void setLastname(String v){lastname=v;}
    public String getEmail(){return email;} public void setEmail(String v){email=v;}
    public String getPassword(){return password;} public void setPassword(String v){password=v;}
}
