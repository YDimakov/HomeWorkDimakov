package HomeWork5_2.Guide;

import HomeWork5_2.Employee;
import HomeWork5_2.Guide.Chief;

public class DeputyHead extends Chief {

    public DeputyHead() {
        status = "Заместитель начальника";
        name = "Ольга";
        surName = "Романович";
        age = 37;
        experience = 13;
        salary = 1100;
        familyStatus = "Разведена";

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
        System.out.println(dutiesString + "Помощь в руководстве предприятния");
    }

}
