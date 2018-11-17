package second;
public class Course {
    String courseTitle;
    TextBook textBook = new TextBook("2389-8983-893", "Calculus", "Tomas Calculus");
    Instructor instructor = new Instructor("Fuad", "Hadjiev", "FIT", "fuad.hadj@gmai.com");
    public Course(String courseTitle){
        this.courseTitle = courseTitle;
    }

    public void SetCourseTitle(String courseTitle){
        this.courseTitle = courseTitle;
    }
    public String GetCourseTitle(){
        return this.courseTitle;
    }

    public void SetTextbookIsbn(String isbn){
        textBook.SetIsbn(isbn);
    }
    public String GetTextbookIsbn(){
        return textBook.GetIsbn();
    }
    public void SetTextbookTitle(String title){
        textBook.SetTitle(title);
    }
    public String GetTextbookTitle(){
        return textBook.GetTitle();
    }
    public void SetTextbookAuthor(String author){
        textBook.SetAuthor(author);
    }
    public String GetTextbookAuthor(){
        return textBook.GetAuthor();
    }

    public void SetInstructorFirstName(String firstName){
        instructor.SetFirstName(firstName);
    }
    public String GetInstructorFirstName(){
        return instructor.GetFirstName();
    }
    public void SetInstructorLastName(String lastName){
        instructor.SetLastName(lastName);
    }
    public String GetInstructorLastName(){
        return instructor.GetLastName();
    }
    public void SetInstructorDepartment(String department){
        instructor.SetDepartment(department);
    }
    public String GetInstructorDepartment(){
        return instructor.GetDepartment();
    }
    public void SetInstructorEmail(String email){
        instructor.SetEmail(email);
    }
    public String GetInstructorEmail(){
        return instructor.GetEmail();
    }


    @Override
    public String toString() {
        return courseTitle + textBook.toString() + instructor.toString();
    }

    public boolean equals(Course course) {
        if(this.courseTitle == course.courseTitle && this.textBook.equals(course.textBook) && this.instructor.equals(course.instructor)) return true;
        return  false;
    }
}