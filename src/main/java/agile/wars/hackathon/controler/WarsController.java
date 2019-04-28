package agile.wars.hackathon.controler;


import agile.wars.hackathon.Service.UserService;
import agile.wars.hackathon.data.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class WarsController {


    @Autowired
    private UserService userService;


    @GetMapping("/")
    public ModelAndView getStartIndex() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @GetMapping("/shop")
    String getShop() {
        return "shop";
    }

    @GetMapping("/map")
    String getMap() {
        return "map";
    }

    @GetMapping("/profile")
    ModelAndView getProfile() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("User", userService.getUserById(1));
        modelAndView.setViewName("profile");
        return modelAndView;
    }

}
