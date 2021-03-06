package com.uns.ac.rs.userservice.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AuthenticationResponse {

    private Boolean authenticated;
    private String authenticationResponse;
    private String role;
}
