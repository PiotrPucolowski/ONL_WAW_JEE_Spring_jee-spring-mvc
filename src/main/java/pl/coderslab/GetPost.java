package pl.coderslab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Controller
@RequestMapping("/first")
public class GetPost {

    @GetMapping(value = "/form", produces = "text/plain;charset=UTF-8")
    @RequestMapping("/form")
    public String getHello() {
        return "form.jsp";
    }

    @PostMapping(value = "/form", produces = "text/html; charset=UTF-8")
    @ResponseBody
    public String valueForm(@RequestParam String paramName, @RequestParam String paramDate) {
        LocalDate data = LocalDate.parse(paramDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        return "ParamName = " + paramName + ". Data = " + data;
    }
}
