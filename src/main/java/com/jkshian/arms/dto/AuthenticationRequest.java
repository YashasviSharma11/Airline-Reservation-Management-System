package com.jkshian.arms.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
public class AuthenticationRequest {
    private String email;
    private String password;
    public AuthenticationRequest() {}
    public AuthenticationRequest(String email, String password) { this.email=email; this.password=password; }
    public String getEmail(){return email;} public void setEmail(String v){email=v;}
    public String getPassword(){return password;} public void setPassword(String v){password=v;}
}
