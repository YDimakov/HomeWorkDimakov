package HomeWork5_2;

public class Employee {

    protected String status;
    protected String name;
    protected String surName;
    protected int age;
    protected int experience;
    protected int salary;
    protected final String statusString = " Должность - ";
    protected final String nameString = " Имя - ";
    protected final String surNameString = " Фамилия - ";
    protected final String ageString = " Возраст - ";
    protected final String experienceString = " Общий стаж работы - ";
    protected final String salaryString = " Заработаня плата($) - ";

    public int payroll(int experience, int salary) {
        if (experience >= 5 && experience <= 10) {
            return salary += 150;
        } else if (experience >= 11&& experience <= 15) {
            return salary += 350;
        } else {
            return salary += 500;
        }
    }

    public void info() {
        System.out.println("Краткая информация о сотрудниках");
    }

}
