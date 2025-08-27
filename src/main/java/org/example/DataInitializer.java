package org.example;

import org.example.model.User;
import org.example.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initUsers(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        return args -> {
            // Eğer kullanıcı yoksa ekle
            if (userRepository.findByUsername("sudenaz").isEmpty()) {
                User user = new User();
                user.setUsername("sudenaz");
                user.setPassword(passwordEncoder.encode("1234")); // şifreyi encode et
                userRepository.save(user);
                System.out.println("Default user added: sudenaz / 1234");
            }
        };
    }
}
