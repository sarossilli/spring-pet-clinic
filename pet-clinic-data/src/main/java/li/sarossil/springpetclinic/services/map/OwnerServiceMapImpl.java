package li.sarossil.springpetclinic.services.map;

import li.sarossil.springpetclinic.model.Owner;
import li.sarossil.springpetclinic.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerServiceMapImpl extends AbstractMap<Owner,Long> implements OwnerService {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findByID(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner item) {
        return super.save(item);
    }

    @Override
    public void delete(Owner item) {
        super.delete(item);

    }

    @Override
    public void deleteById(Long id) {
        super.deleteByID(id);

    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
