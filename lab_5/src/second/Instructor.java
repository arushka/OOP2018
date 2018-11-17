package second;


public class Instructor {
    String firstName;
    String lastName;
    String department;
    String email;

    public Instructor(String firstName, String lastName, String department, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.email = email;
    }

    public void SetFirstName(String firstName){
        this.firstName = firstName;
    }
    public String GetFirstName(){
        return this.firstName;
    }

    public void SetLastName(String lastName){
        this.lastName = lastName;
    }
    public String GetLastName(){
        return this.lastName;
    }

    public void SetDepartment(String department){
        this.department = department;
    }
    public String GetDepartment(){
        return this.department;
    }

    public void SetEmail(String email){
        this.email = email;
    }
    public String GetEmail(){
        return this.email;
    }


    public String  toString(){
        return "Instructor: " + this.firstName + " " + "\nDepartment of " + this.department + "\nemail: " + this.email;
    }

    public Boolean equals(Instructor instructor){
        if(this.firstName == instructor.firstName && this.lastName == instructor.lastName && this.email == instructor.lastName &&  this.department == instructor.department) return true;
        else return false;
    }
}