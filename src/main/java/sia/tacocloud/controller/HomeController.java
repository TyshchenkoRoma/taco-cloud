package sia.tacocloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {
    @RequestMapping("/h")
    public String home() {
        return "home";
    }
    @RequestMapping("/test")
    public String test(Model model) {
        String param = "ttt";
        model.addAttribute("qwerty", param);
        return "index";
    }
}
