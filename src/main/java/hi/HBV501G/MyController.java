package hi.HBV501G;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/api/greeting")
    public String greeting() {
        return "Hello Team 20, this is one method in your API";
    }
}
// brynjar was here
