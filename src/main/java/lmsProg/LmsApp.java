package lmsProg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Arrays;

@SpringBootApplication
public class LmsApp {
    public static void main(String[] args) {

//        System.out.println(new LmsApp().
//                );
//        Arrays.asList(new SimpleGrantedAuthority(role.toString()));
        SpringApplication.run(LmsApp.class, args);
    }
}
