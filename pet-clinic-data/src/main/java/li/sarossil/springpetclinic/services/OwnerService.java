package li.sarossil.springpetclinic.services;
import li.sarossil.springpetclinic.model.Owner;


public interface OwnerService extends CrudService<Owner,Long> {
    Owner findByLastName(String lastName);
}
