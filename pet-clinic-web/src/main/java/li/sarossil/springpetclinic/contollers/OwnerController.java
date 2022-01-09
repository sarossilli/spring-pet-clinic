package li.sarossil.springpetclinic.contollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {

    @RequestMapping("/owners")
    public String owners(){
        return "owners/ownerList";
    }
}
