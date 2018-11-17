package first;
import java.io.*;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<Student> students = new Vector<Student>();

        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("C:/Users/kuatb/IdeaProjects/lab_5/src/first/scores.txt"));

            String line = br.readLine();

            while (line != null) {
                String[] data = line.split(" ");

                String sname = data[0];
                String name = data[1];
                int score = Integer.decode(data[2]);

                Student s = new Student(sname, name, score);

                students.add(s);

                line = br.readLine();
            }

            br.close();

            Calculator c = new Calculator(students.get(0).getScore());

            for (int i = 1; i < students.size(); ++i) {
                c.setMax(Math.max(c.getMax(), students.get(i).getScore()));
                c.setMin(Math.min(c.getMin(), students.get(i).getScore()));

                c.alterSum(students.get(i).getScore());
            }

            for (Student s: students) {
                if (s.getScore() >= c.getMax() - 10) s.setGrade('A');

                else if (s.getScore() >= c.getMax() - 20) s.setGrade('B');

                else if (s.getScore() >= c.getMax() - 30) s.setGrade('C');

                else if (s.getScore() >= c.getMax() - 40) s.setGrade('D');

                else s.setGrade('F');
            }

            try {
                BufferedWriter bf = new BufferedWriter(new FileWriter("C:/Users/kuatb/IdeaProjects/lab_5/src/first/grades.txt"));

                for (Student s: students) {
                    bf.write(s.getSname() + " ");
                    bf.write(s.getName() + " ");
                    bf.write(s.getGrade());

                    bf.newLine();
                }

                bf.newLine();

                bf.write(String.format("Average - %d", c.getSum() / students.size()));
                bf.newLine();

                bf.write(String.format("Maximum - %d", c.getMax()));
                bf.newLine();

                bf.write(String.format("Minimum - %d", c.getMin()));
                bf.newLine();

                bf.close();

                System.out.println("Success!");
            }
            catch (FileNotFoundException fe) {
                System.out.println("File not found");
            }
            catch (IOException e) {
                System.out.println("Cannot write to file");
            }

        }
        catch (FileNotFoundException fe) {
            System.out.println("File not found");
        }
        catch (IOException e) {
            System.out.println("Cannot read from file");
        }
    }
}