package com.frogensource.mx.apiapp.security

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter

@EnableWebSecurity
open class WebSecurityConfiguration(/* private val customUserDetailsService: CustomUserDetailsService,
                                    private val passwordEncoderAndMatcher: PasswordEncoder,
                                    private val refererRedirectionAuthenticationSuccessHandler: RefererRedirectionAuthenticationSuccessHandler */)
    : WebSecurityConfigurerAdapter() {

    override fun configure(http: HttpSecurity) {
        http.csrf().disable()
        http.authorizeRequests()
                .antMatchers("/api/*").authenticated()
                .anyRequest().permitAll()
                .and()
                .formLogin().permitAll()
    }

    override fun configure(auth: AuthenticationManagerBuilder) {
        /* auth.userDetailsService(customUserDetailsService)
                .passwordEncoder(passwordEncoderAndMatcher) */
    }
}
