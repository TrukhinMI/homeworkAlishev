package Day6;

public class Task2 {
    public static void main(String[] args) {
        Student student = new Student("Иванов");
        Teacher teacher = new Teacher("Зайцев", "Математика");

        teacher.evaluate(student);
    }
}
