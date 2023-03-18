package service;

import Classes.Medicine;
import Classes.Pharmacy;

import java.util.List;

public interface MedicineService {
    Medicine addMedicineToPharmacy(List<Pharmacy>pharmacies);
    Medicine findMyByName(List<Pharmacy>pharmacies);
    List<Medicine>getAllMedicine(List<Pharmacy>pharmacies);
    void deleteMedicine(List<Pharmacy>pharmacies);
}
