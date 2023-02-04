package com.udemy.sdjpa.config;

import org.springframework.boot.autoconfigure.flyway.FlywayMigrationStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfBeans {

    /**
     * optional bean, not recommended on prd
     */
    @Bean
    public FlywayMigrationStrategy flywayStrategy() {
        return flyway -> {
          flyway.migrate();
          flyway.validate();
        };
    }

}
