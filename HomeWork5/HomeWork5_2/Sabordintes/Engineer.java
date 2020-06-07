package HomeWork5_2.Sabordintes;

import HomeWork5_2.Employee;
import HomeWork5_2.Guide.ChiefEngineer;

public class Engineer extends ChiefEngineer {

    public Engineer() {
        status = "Инженер";
        name = "Сергей";
        surName = "Морозов";
        age = 34;
        experience = 12;
        salary = 800;
        familyStatus = "Не женат";

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
        System.out.println(dutiesString + "Осуществлять работу по кругу своих обязанностей");
    }

}
