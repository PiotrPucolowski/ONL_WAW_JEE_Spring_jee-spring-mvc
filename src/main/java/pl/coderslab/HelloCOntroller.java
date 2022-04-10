package pl.coderslab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

}
