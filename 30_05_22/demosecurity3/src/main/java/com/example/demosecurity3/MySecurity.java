package com.example.demosecurity3;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class MySecurity extends WebSecurityConfigurerAdapter{
	@Override
	public void configure(AuthenticationManagerBuilder auth)throws Exception
	{
		auth.inMemoryAuthentication()
		.withUser("abc")
		.password("xyz")
		.roles("USER")
		.and()
		.withUser("rushi")
		.password("rushi")
		.roles("Admin");
	}
	@Bean
	public PasswordEncoder getPasswordEncoder()
	{
		return NoOpPasswordEncoder.getInstance();
	}

}
