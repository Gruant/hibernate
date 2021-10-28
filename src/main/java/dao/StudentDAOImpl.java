package dao;

import model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateSessionFactoryUtil;

import java.util.List;

public class StudentDAOImpl implements StudentDAO{

    private final SessionFactory sessionFactory;

    public StudentDAOImpl() {
        this.sessionFactory = HibernateSessionFactoryUtil.getSessionFactory();
    }

    @Override
    public Student findById(int id) {
        Session session = sessionFactory.openSession();
        Transaction tx1 = session.beginTransaction();
        Student student = session.get(Student.class, id);
        tx1.commit();
        session.close();
        return student;
    }

    @Override
    public void save(Student student){
        Session session = sessionFactory.openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(student);
        tx1.commit();
        session.close();
    }

    @Override
    public void update(Student student) {
        Session session = sessionFactory.openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(student);
        tx1.commit();
        session.close();
    }

    @Override
    public void delete(Student student) {
        Session session = sessionFactory.openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(student);
        tx1.commit();
        session.close();
    }

    @Override
    public List<Student> findAll() {
        Session session = sessionFactory.getCurrentSession();
        List<Student> students =  session.createQuery("select * from students", Student.class).getResultList();
        session.close();
        return students;
    }
}
