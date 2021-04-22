package Observer;


public class EmployeeOfCompany implements Observer {
    String nameOfEmployee;
    String message;
    Subject subject;

    public EmployeeOfCompany(String name) {
        nameOfEmployee = name;
    }

    @Override
    public void update() {
        message = subject.getUpdate();
        if(message != null){
        System.out.println(String.format("%s has received the message :| %s | ", nameOfEmployee, message));
        } else System.out.println("No need message");
    }

    @Override
    public void setSubject(Subject subject) {
        this.subject = subject;

    }
}
