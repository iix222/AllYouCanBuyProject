package com.finalproject.allyoucanbuyproject.security;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;


@EnableWebSecurity
    public class SecurityConfig
            extends WebSecurityConfig {


        @Override
        protected void
        configure(AuthenticationManagerBuilder auth)
                throws Exception
        {
            auth.inMemoryAuthentication()
                    .passwordEncoder(passwordEncoder())
                    .withUser("gfg")
                    .password(passwordEncoder().encode("pass"))
                    .roles("ADMIN")
                    .and()
                    .passwordEncoder(passwordEncoder())
                    .withUser("user")
                    .password(passwordEncoder().encode("pass"))
                    .roles("BASIC");
        }

        // Annotation
        @Bean
        // Method
        public PasswordEncoder passwordEncoder()
        {
            return new BCryptPasswordEncoder();
        }

        // Annotation
        @Override
        //Method
        protected void configure(HttpSecurity http) throws Exception {
            http.authorizeRequests()
                    .antMatchers("/main").permitAll() // Update the URL of your main page
                    .antMatchers("/admin").hasRole("ADMIN")
                    .anyRequest().authenticated()
                    .and()
                    .formLogin()
                    .loginPage("/login")
                    .permitAll()
                    .and()
                    .logout()
                    .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                    .permitAll()
                    .and()
                    .authorizeRequests()
                    .anyRequest()
                    .access("hasRole('BASIC') or hasRole('ADMIN')");
        }
    }


