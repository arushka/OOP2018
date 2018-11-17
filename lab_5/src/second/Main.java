package second;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        int cntlines = 2;
        try {

            Date date;
            Scanner scr = new Scanner(System.in);
            Boolean isAdmin = false;
            FileReader in_file = new FileReader("C:/Users/kuatb/IdeaProjects/lab_5/src/second/admin.txt");
            FileWriter out_file = new FileWriter("C:/Users/kuatb/IdeaProjects/lab_5/src/second/admin.txt", true);
            FileWriter out_file2 = new FileWriter("C:/Users/kuatb/IdeaProjects/lab_5/src/second/admin.txt", true);
            FileWriter out_file3 = new FileWriter("C:/Users/kuatb/IdeaProjects/lab_5/src/second/admin.txt", true);
            FileWriter out_file4 = new FileWriter("C:/Users/kuatb/IdeaProjects/lab_5/src/second/admin.txt", true);



            // BufferedReader br = new BufferedReader(in_file);
            // BufferedWriter bw = new BufferedWriter(out_file);

            System.out.println("Press 1 to enter as admin, or any another number to enter as user...");
            int a = scr.nextInt();
            if (a == 1) {

                while (true) {

                    System.out.println("Enter the password...");
                    String enteredPassword = scr.next();
                    int hashedPassword = Objects.hash(enteredPassword);


                    if (hashedPassword == 48721) {//123
                        String s = "";
                        isAdmin = true;
                        System.out.println("You entered as Admin");


                        date = new Date();
                        String ss = date + " admin logged in to a system\n";
                        BufferedWriter bw = new BufferedWriter(out_file);
                        bw.write(ss);
                        bw.close();
                        break;
                    } else {
                        System.out.println("Password is incorrect");
                    }
                }

            } else {
                System.out.println("You entered as User!");
                isAdmin = false;
                BufferedReader bfr = new BufferedReader(in_file);
                String sss = bfr.readLine();

                while (sss != null){
                    //System.out.println(sss);
                    String[] strings = sss.split(" ");
                    for(int j = 0; j < strings.length; j++){
                        if(strings[j].equals("course")){
                            System.out.println("Course : " + strings[j+1]);
                            break;
                        }else if(strings[j].equals("textbook")){
                            System.out.println("Textbook : " + strings[j+1]);
                            break;
                        }else if(strings[j].equals("instructor")){
                            System.out.println("Instructor : " + strings[j+1] + " " + strings[j + 2]);
                            break;
                        }
                    }

                    sss = bfr.readLine();
                }
                bfr.close();
            }


            if (isAdmin) {
                Vector<TextBook> textbooks = new Vector<>();
                Vector<Instructor> instructors = new Vector<>();
                Vector<Course> courses = new Vector<>();
                String s = "";

                boolean ok = true;
                while (ok){
                    s = "";
                    System.out.println("As Admin you can add new Textbooks(press 1 to create), Courses(press 2 to create) and Instructors(press 3 to create)\nPress 0 to exit");
                    int pressedKey = scr.nextInt();
                    date = new Date();


                    switch (pressedKey){
                        case 1:
                            System.out.println("Type isbn, title, author in following order...");
                            String isbn = scr.next();
                            String title= scr.next();
                            String author = scr.next();
                            textbooks.add(new TextBook(isbn, title, author));
                            BufferedWriter bwr = new BufferedWriter(out_file2);
                            bwr.write(date + " admin added new textbook " + title + "\n");
                            bwr.close();
                            cntlines++;
                            break;
                        case 2:
                            System.out.println("Type course title...");
                            String courseTitle = scr.next();
                            courses.add(new Course(courseTitle));
                            BufferedWriter bwr2 = new BufferedWriter(out_file3);
                            bwr2.write(date + " admin added new course " + courseTitle + "\n");
                            bwr2.close();
                            cntlines++;
                            break;
                        case 3:
                            System.out.println("Type first name, last name, department, email in following order...");
                            String firstName = scr.next();
                            String lastName= scr.next();
                            String department = scr.next();
                            String email = scr.next();
                            instructors.add(new Instructor(firstName, lastName, department, email));
                            BufferedWriter bwr3 = new BufferedWriter(out_file4);
                            bwr3.write(date + " admin added new instructor " + firstName + " "  + lastName + "\n");
                            bwr3.close();
                            cntlines++;
                            break;
                        case 0:
                            ok = false;
                            break;
                    }

                }
            } else {

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}