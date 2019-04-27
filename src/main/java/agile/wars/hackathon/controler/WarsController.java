package agile.wars.hackathon.controler;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WarsController {

    @GetMapping("/")
    String getStartIndex() {
        return "index";
    }
}
