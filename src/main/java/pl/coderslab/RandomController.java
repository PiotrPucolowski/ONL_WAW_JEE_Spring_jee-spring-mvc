package pl.coderslab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
public class RandomController {
    @RequestMapping(value = "/show-random", produces = "text/plain;charset=UTF-8")
    @GetMapping("/show-random")
    @ResponseBody
    public String showRandom(){
        Random random = new Random();
        int rand = random.nextInt(100);
        return "Wylosowano liczbę:" + rand;
    }
}
