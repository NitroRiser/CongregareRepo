package br.com.congregare.CongregareApp.config;

import br.com.congregare.CongregareApp.model.User;
import br.com.congregare.CongregareApp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User("Adara Meneur", 20, "6185018187", "6185018187", "6185018187", "cwissbey0@wp.com", "Carry McCallam", "Camella Wissbey");
        User u2 = new User("Gaby Easton", 25, "919319068", "1358431361", "6518544138", "cwissbey0@wp.com", "Bealle Lackney", "Bealle Argabrite\n");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
