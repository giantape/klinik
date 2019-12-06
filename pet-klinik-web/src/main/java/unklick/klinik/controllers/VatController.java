package unklick.klinik.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import unklick.klinik.services.VatService;

@Controller
public class VatController {

    private final VatService vatService;

    public VatController(VatService vatService){
        this.vatService = vatService;
    }
    @RequestMapping({"/vets", "vets/index", "vets/index.html"})
    public String index(Model model){
        model.addAttribute("vets", vatService.findAll());
        return "vats/index";
    }
}
