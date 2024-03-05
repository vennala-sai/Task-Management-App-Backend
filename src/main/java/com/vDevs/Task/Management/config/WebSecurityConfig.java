//package com.vDevs.Task.Management.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//import static org.springframework.security.config.Customizer.withDefaults;
//
////@Configuration
////@EnableWebSecurity
//public class WebSecurityConfig {
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http
//                // Use requestMatcher or similar methods as necessary
//                .authorizeRequests(authorizeRequests ->
//                        authorizeRequests
//                                .requestMatchers("/").permitAll() // Unrestricted access to the homepage
//                                .requestMatchers("/h2-console/**").permitAll()
//                                .anyRequest().authenticated()) // Require authentication for all other requests
//                .formLogin(withDefaults()) // Simplify by using default form login configuration
//                .logout(logout -> logout.logoutSuccessUrl("/").permitAll()); // Customize the logout functionality
//
//        return http.build();
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//    //Working on learning and figuring out spring security and secure ways to do it - This is not final
//    @Bean
//    public UserDetailsService userDetailsService(PasswordEncoder passwordEncoder) {
//        UserDetails user = User.builder()
//                .username("user")
//                .password(passwordEncoder.encode("password")) // Ensure the password is encoded
//                .roles("USER") // Define user roles
//                .build();
////        UserDetails user1 = User.withDefaultPasswordEncoder()
////                .username("mikhail")
////                .password("nikita")
////                .roles("ADMIN")
////                .build();
//        return new InMemoryUserDetailsManager(user);
//    }
//}
