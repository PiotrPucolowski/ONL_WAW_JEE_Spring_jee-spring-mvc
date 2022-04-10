package pl.coderslab;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Controller
public class HelloCOntroller {
    //1 metoda
    //@RequestMapping("/hello", method = RequestMethod.GET)
    //2 metoda
    @GetMapping("/hello")
    @ResponseBody
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping(value = "hello/{firstName}/{lastName}", produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String nameAndSurname(@PathVariable String firstName, @PathVariable String lastName){
        return "Witaj " + firstName + " " + lastName;

    }
    @GetMapping("/helloview")
    public String helloView(Model model){
        LocalTime actualTime = LocalTime.now();
        if (actualTime.isAfter(LocalTime.of(8, 0)) && actualTime.isBefore(LocalTime.of(20,0))){
            //pomiedzy 8 a 20, color black background color white
            model.addAttribute("color", "black");
            model.addAttribute("backgroundColor", "white");
        }else{
            //noc
            model.addAttribute("color", "white");
            model.addAttribute("backgroundColor", "black");

        }

        return "home";
    }

}
