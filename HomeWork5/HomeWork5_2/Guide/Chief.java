package HomeWork5_2.Guide;

import HomeWork5_2.Employee;

public class Chief extends Employee {

    protected String familyStatus;
    protected final String familyStatusString = " Семейное положение - ";
    protected final String dutiesString = " Обязанности - ";

    public Chief() {
        status = "Начальник";
        name = "Дмитрий";
        surName = "Волохин";
        age = 54;
        experience = 28;
        salary = 2100;

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
    }

    public void duties() {
        System.out.println(dutiesString + "Руководить орзанизацией");
    }
}
