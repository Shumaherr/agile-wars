package agile.wars.hackathon.controler;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class WarsController {

    @GetMapping("/")
    String getStartIndex() {
        return "index";
    }

    @GetMapping("/shop")
    String getShop() {
        return "shop";
    }

    @GetMapping("/map")
    String getMap() {
        return "map";
    }

}
