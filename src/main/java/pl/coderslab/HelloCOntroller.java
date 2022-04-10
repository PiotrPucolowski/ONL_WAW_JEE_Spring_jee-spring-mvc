package pl.coderslab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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

}
