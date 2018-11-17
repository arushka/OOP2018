package first;

public class Student {
    private String sname;
    private String name;
    private int score;
    private char grade;

    public Student(String sname, String name, int score) {
        this.sname = sname;
        this.name = name;
        this.score = score;
        this.grade = '_';
    }

    public String getSname() { return sname; }

    public String getName() { return name; }

    public int getScore() { return score; }

    public char getGrade() { return grade; }
    public void setGrade(char grade) { this.grade = grade; }
}