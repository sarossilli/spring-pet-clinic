package li.sarossil.springpetclinic.bootstrap;

import li.sarossil.springpetclinic.model.Owner;
import li.sarossil.springpetclinic.model.Vet;
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
        owner2.setId(2L);
        owner2.setFirstName("Sam");
        owner2.setLastName("Rossilli");
        ownerService.save(owner2);

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Bob");
        vet1.setLastName("Donke");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Jim");
        vet2.setLastName("Deene");
        vetService.save(vet2);

        System.out.println("Loaded Bootstrap Data");

    }
}
