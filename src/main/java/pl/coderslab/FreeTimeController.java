package pl.coderslab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;
import java.util.logging.Logger;

@Controller
public class FreeTimeController {

    @RequestMapping(value = "/local", produces = "text/plain;charset=UTF-8")
    @GetMapping("/local")
    @ResponseBody
    public String Time(){
        LocalDateTime local = (LocalDateTime.now());
        String day="";
        switch (local.getDayOfWeek()){
            case SATURDAY: day="Wolne";
                break;
            case SUNDAY: day="Wolne";
                break;
            default: day="";
                break;
        }
        String work = "";
        if (day.equals("") && local.getHour() < 17 && local.getHour() > 9){
            work = "Pracuje, nie dzwoń";
        } else if(day.equals("") && (local.getHour() > 17 || local.getHour() < 9)){
            work = "Po pracy";
        }

        return day +" "+ work;
    }
}