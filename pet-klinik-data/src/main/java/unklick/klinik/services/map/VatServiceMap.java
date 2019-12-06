package unklick.klinik.services.map;

import unklick.klinik.model.Vat;
import unklick.klinik.services.CrudService;
import unklick.klinik.services.VatService;

import java.util.Set;

public class VatServiceMap extends AbstractMapService<Vat, Long> implements VatService {
    @Override
    public Set<Vat> findAll() {
        return super.findAll();
    }

    @Override
    public Vat findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vat save(Vat object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Vat object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

}
