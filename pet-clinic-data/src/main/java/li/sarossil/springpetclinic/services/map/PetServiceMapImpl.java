package li.sarossil.springpetclinic.services.map;

import li.sarossil.springpetclinic.model.Pet;
import li.sarossil.springpetclinic.services.CrudService;
import li.sarossil.springpetclinic.services.PetService;

import java.util.Set;

public class PetServiceMapImpl extends AbstractMap<Pet,Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findByID(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet item) {
        return super.save(item.getId(), item);
    }

    @Override
    public void delete(Pet item) {
        super.delete(item);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteByID(id);
    }
}
