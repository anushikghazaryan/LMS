package lmsProg.comtroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return ("welcome");
    }

    @GetMapping("/teacher")
    public String teacher() {
        return ("teacher");
    }

    @GetMapping("/student")
    public String student() {
        return ("student");
    }
}
