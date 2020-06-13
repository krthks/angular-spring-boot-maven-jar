package krthk.springbootbackend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/api")
    public String api() {
        return "Spring Boot API Home";
    }
}
