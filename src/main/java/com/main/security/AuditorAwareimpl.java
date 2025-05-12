package com.main.security;

import java.util.Optional;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

@Component("auditorProvider")
public class AuditorAwareimpl implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() {
    	//Falta implementar Spring security
        return Optional.of("admin");
    }
}
