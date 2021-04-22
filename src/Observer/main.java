package Observer;

public class main {
    public static void main(String[] args) {
        OwnerOfCompany ceo = new OwnerOfCompany();
        EmployeeOfCompany employeeNumberOne = new EmployeeOfCompany("John");
        EmployeeOfCompany employeeNumberTwo = new EmployeeOfCompany("Jake");
        EmployeeOfCompany employeeNumberThree = new EmployeeOfCompany("Jack");
        EmployeeOfCompany employeeNumberFour = new EmployeeOfCompany("Jessica");

        ceo.addObserver(employeeNumberOne);
        ceo.addObserver(employeeNumberTwo);
        ceo.addObserver(employeeNumberThree);
        ceo.addObserver(employeeNumberFour);

        ceo.setMessage("You need to complete this project till Friday");
        ceo.setMessage("Update you have time till end of next week");

    }
}
