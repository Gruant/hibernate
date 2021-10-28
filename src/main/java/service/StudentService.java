package service;

import dao.StudentDAO;
import dao.StudentDAOImpl;
import model.Student;

import java.util.List;


public class StudentService {
    private final StudentDAO studentDAO = new StudentDAOImpl();

    public Student findStudent(int id){
        return studentDAO.findById(id);
    }

    public void saveStudent(Student student){
        studentDAO.save(student);
    }

    public void deleteStudent(Student student){
        studentDAO.delete(student);
    }

    public void updateStudent(Student student){
        studentDAO.update(student);
    }

    public List<Student> findAllStudents(){
        return studentDAO.findAll();
    }
}
