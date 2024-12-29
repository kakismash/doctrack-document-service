package com.kaki.doctrack.document_service.filter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.server.WebFilter;

@Configuration
public class WebFluxConfigFilters {

    @Bean
    public WebFilter contextSetupFilter() {
        return new ContextSetupFilter();
    }
}
