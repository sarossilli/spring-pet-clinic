package li.sarossil.springpetclinic.bootstrap;

import li.sarossil.springpetclinic.model.Owner;
import li.sarossil.springpetclinic.services.OwnerService;
import li.sarossil.springpetclinic.services.VetService;
import li.sarossil.springpetclinic.services.map.OwnerServiceMapImpl;
import li.sarossil.springpetclinic.services.map.VetServiceMapImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInit implements CommandLineRunner {
    public final OwnerService ownerService;
    public final VetService vetService;


    public DataInit(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }


    //May need to throw exception
    @Override
    public void run(String... args) {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Bri");
        owner1.setLastName("Martin");
        ownerService.save(owner1);


        Owner owner2 = new Owner();
        owner1.setId(2L);
        owner1.setFirstName("Sam");
        owner1.setLastName("Rossilli");
        ownerService.save(owner2);

        Owner vet1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Bob");
        owner1.setLastName("Donke");
        ownerService.save(vet1);

        Owner vet2 = new Owner();
        owner1.setId(2L);
        owner1.setFirstName("Jim");
        owner1.setLastName("Deene");
        ownerService.save(vet2);

        System.out.println("Loaded Bootstrap Data");

    }
}
