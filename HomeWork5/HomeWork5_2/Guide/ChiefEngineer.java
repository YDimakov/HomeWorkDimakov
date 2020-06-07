package HomeWork5_2.Guide;

import HomeWork5_2.Employee;
import HomeWork5_2.Guide.Chief;

public class ChiefEngineer extends Chief {

    public ChiefEngineer() {
        status = "Главный инженер";
        name = "Николай";
        surName = "Божко";
        age = 39;
        experience = 16;
        salary = 1200;
        familyStatus = "Женат";

    }

    @Override
    public void info() {
        Employee em = new Employee();
        System.out.println(statusString + status);
        System.out.println(nameString + name);
        System.out.println(surNameString + surName);
        System.out.println(ageString + age);
        System.out.println(experienceString + experience);
        System.out.println(salaryString + em.payroll(experience, salary));
        System.out.println(familyStatusString + familyStatus);
    }

    @Override
    public void duties() {
        System.out.println(dutiesString + "Определять техническую политику и направление технического развития организации в условиях рыночной экономики");
    }

}
