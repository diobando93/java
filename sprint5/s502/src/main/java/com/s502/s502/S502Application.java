package com.s502.s502;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.s502.s502.security.JWTAuthorizationFilter;


@SpringBootApplication
public class S502Application {

	public static void main(String[] args) {
		SpringApplication.run(S502Application.class, args);
	}
	
	@EnableWebSecurity
	@Configuration
	class WebSecurityConfig extends WebSecurityConfigurerAdapter {

		@Override
		protected void configure(HttpSecurity http) throws Exception {
			http.csrf().disable()
			.addFilterAfter(new JWTAuthorizationFilter(), UsernamePasswordAuthenticationFilter.class)
			.authorizeRequests()
            	.antMatchers(HttpMethod.POST, "/login").permitAll()
            	.antMatchers(HttpMethod.POST, "/playersm").permitAll()
            	.anyRequest().authenticated();
				
		}
	}

}
