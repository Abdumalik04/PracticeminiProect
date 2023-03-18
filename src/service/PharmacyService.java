package service;

import Classes.Pharmacy;

import java.util.List;

public interface PharmacyService {
    Pharmacy  addPharmacy(List<Pharmacy>pharmacies);
    Pharmacy getPharmacy(List<Pharmacy>pharmacies);
    List<Pharmacy>getAllPharmacy(List<Pharmacy>pharmacies);
    Pharmacy getPharmacyByAddress(List<Pharmacy>pharmacies);
    Pharmacy updatePharmacy(List<Pharmacy>pharmacies);
    void deletePharmacy(List<Pharmacy>pharmacies);
}
