package li.sarossil.springpetclinic.services;

import li.sarossil.springpetclinic.model.Pet;
import li.sarossil.springpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);

    Vet save(Vet owner);

    Set<Vet> findAll();
}
