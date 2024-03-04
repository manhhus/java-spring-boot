package com.example.demo.security;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import com.example.demo.security.oauth2.CustomerOauth2UserService;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	    
	HttpServletRequest request;
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		   http
	        .authorizeRequests()
	        	.antMatchers("/oauth2/**","/login").permitAll()
	            .anyRequest().authenticated()
	        .and()
	        .formLogin()
            	.loginPage("/login")
            	.permitAll()
            .and()
	        .oauth2Login()
	        	.loginPage("/auth-login")
	            .userInfoEndpoint()
	            .userService(oAuth2UserService)	
	            .and()
	            .successHandler((request, response, authentication) -> {
	                response.sendRedirect(request.getContextPath()+ "/admin/users");
	            })            
	       .and()
	       .logout()
           .logoutSuccessUrl("/login")
           .permitAll();
		   System.out.println("configure");

	}

	
	@Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/css/**", "/js/**","/storage**", "/views/**"); 
    }
	@Autowired
	private CustomerOauth2UserService oAuth2UserService;
	
}