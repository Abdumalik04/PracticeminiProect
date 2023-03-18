package PersonServiceMethod;

import Classes.Pharmacy;
import MyException.MeExp;
import service.PharmacyService;

import java.util.List;
import java.util.Scanner;

public class PharmacyServiceMethod implements PharmacyService {
    private static int count;


    @Override
    public Pharmacy addPharmacy(List<Pharmacy> pharmacies) {
        Pharmacy pharmacy = new Pharmacy();
        try {
            System.out.print("Welcome");
            System.out.print("Enter pharmacy name:");
            String name = new Scanner(System.in).nextLine();
            for (Pharmacy p : pharmacies) {
                if (p.getName().equals(name)) {
                    throw new MeExp("Same pharmacy name!");
                }
            }
            System.out.print("Enter pharmacy address:");
            String address = new Scanner(System.in).nextLine();
            pharmacy.setId(count++);
            pharmacy.setName(name);
            pharmacy.setAddress(address);
//add
            pharmacies.add(pharmacy);
            return pharmacy;
        } catch (MeExp e) {
            System.out.println(e.getMessage());
        }
        return pharmacy;
    }

    @Override
    public Pharmacy getPharmacy(List<Pharmacy> pharmacies) {
        try {
            System.out.println(" Enter Pharmacy Id:");
            int id = new Scanner(System.in).nextInt();
            boolean isFalse = false;
            for (Pharmacy p : pharmacies) {
                if (p.getId() == id) {
                    isFalse = false;
                    return p;
                } else {
                    isFalse = true;
                }
            }
            if (isFalse) {
                throw new MeExp("Pharmacy with id: " + id + "not found!");
            }


        } catch (MeExp e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public List<Pharmacy> getAllPharmacy(List<Pharmacy> pharmacies) {
        return pharmacies;
    }

    @Override
    public Pharmacy getPharmacyByAddress(List<Pharmacy> pharmacies) {
        try {
            int counter = 0;
            System.out.println("Enter pharmacy address: ");
            String address = new Scanner(System.in).nextLine();
            for (Pharmacy p : pharmacies) {
                if (p.getAddress().equalsIgnoreCase(address)) {
                    return p;
                } else {
                    counter++;
                }
            }
            if (counter > 0) {
                throw new MeExp("Pharmacy with address:" + address + "not found! ");
            }
        } catch (MeExp e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public Pharmacy updatePharmacy(List<Pharmacy> pharmacies) {
        try {
            System.out.println("Enter pharmacy id:");
            int id = new Scanner(System.in).nextInt();
            boolean isFalse = true;
            for (Pharmacy p : pharmacies) {
                if (p.getId() == id) {
                    isFalse = true;
                    System.out.println("Enter new pharmacy new name");
                    String name = new Scanner(System.in).nextLine();
                    p.setName(name);
                    return p;
                } else {
                    isFalse = false;
                }
            }
            if (isFalse) {
                throw new MeExp("Pharmacy with id:" + id + "not found!");
            }


        }catch (MeExp e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    @Override
    public void deletePharmacy(List<Pharmacy> pharmacies) {
        try {
            boolean davran=true;
            System.out.println("Enter pharmacy id:");
            int id = new Scanner(System.in).nextInt();
            String idString= id+"";
            if (idString.isBlank()){
                throw new MeExp("Id noo");
            }
            for (Pharmacy p : pharmacies) {
                if (p.getId()==id){
                    davran=true;
                    pharmacies.remove(p);
                    System.out.println("Pharmacy with id:"+id+"not found!");
                }else {
                    davran=false;
                }
            }
            if (!davran){
                throw new MeExp("Pharmacy with id:"+id+"deleted!");
            }
        }catch (MeExp e){
            System.out.println(e.getMessage());
        }
    }
}
