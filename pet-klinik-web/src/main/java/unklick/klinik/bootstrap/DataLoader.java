package unklick.klinik.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import unklick.klinik.model.Owner;
import unklick.klinik.model.Vat;
import unklick.klinik.services.OwnerService;
import unklick.klinik.services.VatService;
import unklick.klinik.services.map.OwnerServiceMap;
import unklick.klinik.services.map.VatServiceMap;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VatService vatService;

    public DataLoader(OwnerService ownerService, VatService vatService){
        this.ownerService = ownerService;
        this.vatService = vatService;
    }
    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("Johnny");
        owner1.setLastName("Goodboy");
        ownerService.save(owner1);
        Owner owner2 = new Owner();
        owner2.setFirstName("Konstantin");
        owner2.setLastName("Diyachkov");
        ownerService.save(owner2);

        System.out.println("Loaded owner...");

        Vat vat1 = new Vat();
        vat1.setFirstName("Giant");
        vat1.setLastName("Ape");

        vatService.save(vat1);
        Vat vat2 = new Vat();
        vat2.setFirstName("Konstantin");
        vat2.setLastName("Diyachkov");
        vatService.save(vat2);

        System.out.println("Loaded vat...");
    }
}
