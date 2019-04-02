package io.pivotal.pa.phoenix.dataaggregator.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.stereotype.Component;

@Component
public class SecurityConfig extends WebSecurityConfigurerAdapter {


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable().httpBasic().and()
        .authorizeRequests().antMatchers("/api/application-instances").fullyAuthenticated().and()
        .authorizeRequests().anyRequest().permitAll();
    }
}
