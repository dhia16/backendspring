import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import Formation.Formation.Jwt.JwtAuthenticationFilter;

@Configuration
public class securityconfig {
    @Value("${jwt.secret}")
    private String jwtSecret;

    @Value("${jwt.expiration}")
    private int jwtExpiration;

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration configuration) throws Exception {
        return configuration.getAuthenticationManager();
    }
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf().disable()
            .authorizeRequests()
               /* .requestMatchers("/auth/**").permitAll() //Autoriser l'accès public*/
	            .requestMatchers("/auth/register", "/auth/login", "/auth/user-info").permitAll() // Accessible à tous
	            .requestMatchers("/auth/users","/Product/**","/Category/Add").hasRole("ADMIN").anyRequest().authenticated() // Tous les autres endpoints nécessitent une authentification
                .and()
                .addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class)// Injectez le filtre personnalisé
                .cors(); // Ajouter la gestion CORS 
            
              //  .httpBasic();// Utilisation de l'authentification HTTP Basic (ou autre mécanisme si préféré)
                //.formLogin(); // Optionnel si vous utilisez un formulaire de login
}
}
