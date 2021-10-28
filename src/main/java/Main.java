import model.Student;
import service.StudentService;

public class Main {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        int mark;
        for (int i=0; i<1000; i++){
            mark = (int) (Math.random()*5+1);
            Student student = new Student("Student_" + i, mark);
            studentService.saveStudent(student);
        }
    }
}
