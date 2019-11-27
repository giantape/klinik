package unklick.klinik.services;

import unklick.klinik.model.Vat;

import java.util.Set;

public interface VatService {
    Vat findById(Long id);
    Vat save(Vat vat);
    Set<Vat> findAll();
}
