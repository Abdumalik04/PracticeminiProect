package service;

import Classes.Person;
import Classes.Pharmacy;

import java.util.List;

public interface PersonService {
    Person addPersonToPharmacy(List<Pharmacy>pharmacies);
    Person getPersonById(List<Pharmacy>pharmacies);
    Person getPharmacyStaff(List<Pharmacy>pharmacies);
    Person updatePersonName(List<Pharmacy>pharmacies);
    void deletePersonPharmacy(List<Pharmacy>pharmacies);
}
