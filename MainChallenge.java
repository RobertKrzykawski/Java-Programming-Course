package dev.lpa.challenge;

import dev.lpa.domain.Employee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MainChallenge {

    public static void main(String[] args) {
        EmployeeChallenge e1 = new EmployeeChallenge("Minnie", "Mouse", "01/02/2015");
        EmployeeChallenge e2 = new EmployeeChallenge("Mickie", "Mouse", "05/08/2000");
        EmployeeChallenge e3 = new EmployeeChallenge("Daffy", "Duck", "11/02/2011");
        EmployeeChallenge e4 = new EmployeeChallenge("Daisy", "Mouse", "05/03/2013");
        EmployeeChallenge e5 = new EmployeeChallenge("Goofy", "Dog", "23/07/2020");

        List<EmployeeChallenge> list = new ArrayList<>(Arrays.asList(e1, e2, e3, e4, e5));

        printOrderedList(list, "name");
        System.out.println();
        printOrderedList(list, "year");
    }

    public static void printOrderedList(List<EmployeeChallenge> eList, String sortField) {
        int currentYear = LocalDate.now().getYear();

        class MyEmployee {
            EmployeeChallenge containedEmployee;
            int yearsWorked;
            String fullName;

            public MyEmployee(EmployeeChallenge containedEmployee) {
                this.containedEmployee = containedEmployee;
                yearsWorked = currentYear - Integer.parseInt(containedEmployee.hireDate().split("/")[2]);
                fullName = String.join(" ", containedEmployee.first(), containedEmployee.last());
            }

            @Override
            public String toString() {
                return "%s has been an employee for %d years".formatted(fullName, yearsWorked);
            }
        }

        List<MyEmployee> list = new ArrayList<>();
        for (EmployeeChallenge employee : eList) {
            list.add(new MyEmployee(employee));
        }

        var comparator = new Comparator<MyEmployee>() {
            @Override
            public int compare(MyEmployee o1, MyEmployee o2) {
                if (sortField.equals("name")) {
                    return o1.fullName.compareTo(o2.fullName);
                }
                return o1.yearsWorked - o2.yearsWorked;
            }
        };

        list.sort(comparator);

        for (MyEmployee myEmployee : list) {
            System.out.println(myEmployee);
        }
    }
}
