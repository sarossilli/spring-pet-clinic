package li.sarossil.springpetclinic.model;

import java.time.LocalDate;

public class Pet extends BaseEntity{
    private LocalDate birthDate;
    private PetType petType;
    private Owner owner;
}
