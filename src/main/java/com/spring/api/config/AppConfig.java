package com.spring.api.config;

import com.spring.api.DAO.StudentServicesDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class AppConfig {
    @Autowired
    private StudentServicesDAO studentServicesDAO;
    @Bean
    public UserDetailsService userDetailsService(){
        UserDetails UserDetailsVariable = User.builder().username("Dip")
                .password(passwordEncoder().encode("Dip123"))
                .roles("ADMIN").build();
        return new InMemoryUserDetailsManager(UserDetailsVariable);
//        return  username -> studentServicesDAO.findByEmail(username)
//                .orElseThrow(()-> new UsernameNotFoundException("Username Not found"));
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration builder) throws Exception {
        return builder.getAuthenticationManager();
    }
}
