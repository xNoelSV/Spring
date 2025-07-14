### Contents of this section
<br>

SpringBootWebSecurityConfiguration
@Bean
@Order(SecurityProperties.BASIC_AUTH_ORDER)
SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
    http.authorizeHttpRequests((requests) -> requests.anyRequest().authenticated()); // DETERMINES THE AUTHENTICATION FOR ALL REQUESTS
    http.formLogin(withDefaults()); // PROVIDES A FORM TO LOG IN
    http.httpBasic(withDefaults()); // USES HTTP HEADER TO PROVIDE THE FORM INFO
    return http.build();
}

Some properties of Spring Security (not recommended for production use):
- spring.security.user.name= xxx
- spring.security.user.password= xxx

To do security configurations above Spring Security tool, we must create a configuration class and override method:
SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception

Parameters to http.authorizeHttpRequests():
- .requestMatchers("/", "/home").permitAll() // GRANT ACCESS TO "/" AND "/HOME" TO EVERYBODY
- .requestMatchers("/", "/home").authenticated() // LOG IN TO ACCESS TO "/" AND "/HOME" TO EVERYBODY

CSRF (Cross Site Request Forgery):
Cloning a token that validates your identity (common way of hacking). Thymeleaf manages this by default. To avoid CSRF block we must put another parameter to http:
- .csrf((requests) -> requests.disable())

We can add configurations for login and logout:
.formLogin(loginConfigurer -> loginConfigurer
.loginPage("/login")
.defaultSuccessUrl("/dashboard")
.failureUrl("/login?error=true")
.permitAll())

.logout(logoutConfigurer -> logoutConfigurer
.logoutSuccessUrl("/login?logout=true")
.invalidateHttpSession(true)
.permitAll())

Thymeleaf annotations to control access:
sec:authorize="isAnonymous()" // Shows if no login
sec:authorize="isAuthenticated()" // Shows only to authenticated (logged in) user