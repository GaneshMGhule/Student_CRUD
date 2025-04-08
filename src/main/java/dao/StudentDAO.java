package dao;


import java.util.List;

import org.hibernate.Session;

import model.Student;
import util.HibernateUtil;

public class StudentDAO {
    // No need to create SessionFactory here anymore
    public void savestudent(Student student) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.persist(student);
            session.getTransaction().commit();
        } catch (Exception e) {
            throw new RuntimeException("Error saving student: " + e.getMessage());
        }
    }

    public List<Student> getAllstudents() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("FROM Student", Student.class).list();
        } catch (Exception e) {
            throw new RuntimeException("Error fetching students: " + e.getMessage());
        }
    }

    public Student getstudent(int id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(Student.class, id);
        } catch (Exception e) {
            throw new RuntimeException("Error fetching student: " + e.getMessage());
        }
    }

    public void updatestudent(Student student) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.merge(student);
            session.getTransaction().commit();
        } catch (Exception e) {
            throw new RuntimeException("Error updating student: " + e.getMessage());
        }
    }

    public void deletestudent(int id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            Student student = session.get(Student.class, id);
            if (student != null) {
                session.remove(student);
            }
            session.getTransaction().commit();
        } catch (Exception e) {
            throw new RuntimeException("Error deleting student: " + e.getMessage());
        }
    }
}