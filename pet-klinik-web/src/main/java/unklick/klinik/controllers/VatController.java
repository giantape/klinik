package unklick.klinik.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VatController {

    @RequestMapping({"/vets", "vets/index", "vets/index.html"})
    public String index(){
        return "vats/index";
    }
}
