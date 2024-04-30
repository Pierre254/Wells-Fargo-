package com.wellsfargo.counselor.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
                .antMatchers("/public/**").permitAll() // Allow public access
                .anyRequest().authenticated() // Require authentication for all other requests
                .and()
            .formLogin() // Enable form-based login
                .loginPage("/login") // Custom login page URL
                .permitAll() // Allow access to login page
                .and()
            .logout() // Enable logout support
                .permitAll(); // Allow access to logout URL
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        // In-memory user authentication (for demonstration purposes)
        auth
            .inMemoryAuthentication()
            .withUser("user").password("{noop}password").roles("USER");
    }
}
