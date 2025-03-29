package com.march.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableAutoConfiguration
public class SecurityConfig {
	
	@Bean
	PasswordEncoder encoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	SecurityFilterChain security(HttpSecurity httpSecurity) throws Exception{
		return httpSecurity.csrf(csrf->csrf.disable())
				.cors(cors->cors.disable())
				.authorizeHttpRequests(request->request
						.requestMatchers("/users/connect/**").permitAll()
						.requestMatchers("/users/**", "/profiles/**").authenticated())
				.formLogin(login->login.loginPage("/login"))
				.logout(logout->logout.logoutUrl("/logout"))
				.httpBasic(Customizer.withDefaults())
				.build();
	}
}
