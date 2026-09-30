package com.jkshian.arms.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AuthenticationResponse {
    private String token;
    public AuthenticationResponse() {}
    public AuthenticationResponse(String token) { this.token=token; }
    public String getToken(){return token;} public void setToken(String v){token=v;}
    public static Builder builder(){return new Builder();}
    public static class Builder { private final AuthenticationResponse value=new AuthenticationResponse(); public Builder token(String v){value.token=v;return this;} public AuthenticationResponse build(){return value;} }
}
