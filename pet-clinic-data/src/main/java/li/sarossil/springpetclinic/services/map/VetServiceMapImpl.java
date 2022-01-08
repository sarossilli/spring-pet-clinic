package li.sarossil.springpetclinic.services.map;

import li.sarossil.springpetclinic.model.Vet;
import li.sarossil.springpetclinic.services.CrudService;

import java.util.Set;

public class VetServiceMapImpl extends AbstractMap<Vet,Long> implements CrudService<Vet,Long> {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findByID(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Vet save(Vet item) {
        return super.save(item.getId(),item);
    }

    @Override
    public void delete(Vet item) {
        super.delete(item);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteByID(aLong);

    }
}