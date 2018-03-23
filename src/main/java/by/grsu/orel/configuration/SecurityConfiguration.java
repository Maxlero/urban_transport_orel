package by.grsu.orel.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers(
                        "/register",
                        "/js/**",
                        "/img/**",
                        "/css/**",
                        "/leaflet/**",
                        "/Leaflet.Snap/**",
                        "/confirm",
                        "/login").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/index")     // not authorized users will redirected here
                .permitAll();

    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}