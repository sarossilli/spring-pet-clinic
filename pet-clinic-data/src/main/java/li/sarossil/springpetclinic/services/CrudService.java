package li.sarossil.springpetclinic.services;
import java.util.Set;

public interface CrudService<T,ID> {
    Set<T> findAll();
    T findByID(ID id );
    T save(T item);
    void  delete(T item);
    void deleteById(ID id);

}
