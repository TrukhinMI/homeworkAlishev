package Day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void evaluate(Student student){
        Random random = new Random();
        int grade = random.nextInt(2,6);
        String gradeString;
        if (grade == 5)
            gradeString = "отлично";
        else if (grade == 4)
            gradeString = "хорошо";
        else if (grade == 3)
            gradeString = "удовлетворительно";
        else
            gradeString = "неудовлетворительно";

        System.out.println( "Преподаватель " + name + " оценил студента с именем " + student.getName() + " по предмету " + subject + " на оценку " + gradeString +".");

    }
}
