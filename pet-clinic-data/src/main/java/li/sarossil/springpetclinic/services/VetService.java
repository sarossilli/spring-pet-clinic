package li.sarossil.springpetclinic.services;
import li.sarossil.springpetclinic.model.Owner;
import li.sarossil.springpetclinic.model.Vet;



public interface VetService extends CrudService<Vet,Long>{
    Owner findByLastName(String lastName);
}
