package HomeWork5_2.Sabordintes;

import HomeWork5_2.Employee;
import HomeWork5_2.Guide.DeputyHead;

public class СhiefAccountant extends DeputyHead {

    public СhiefAccountant() {
        status = "Главный бухгалтер";
        name = "Виктория";
        surName = "Малащук";
        age = 31;
        experience = 6;
        salary = 790;
        familyStatus = "Замужем";

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
        System.out.println(dutiesString + "Грамотное руководство денежными средствами организации");
    }

    @Override
    public int payroll(int experience, int salary) {
        return salary -= 100;
    }
}
