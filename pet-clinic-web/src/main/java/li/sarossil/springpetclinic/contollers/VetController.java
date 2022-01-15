package li.sarossil.springpetclinic.contollers;

import li.sarossil.springpetclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping("/vets")
    public String vets(Model model){
        model.addAttribute("vets", vetService.findAll());
        return "vets/vetList";
    }
}
