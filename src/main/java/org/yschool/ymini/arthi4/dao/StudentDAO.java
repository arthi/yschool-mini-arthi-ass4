/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yschool.ymini.arthi4.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class StudentDAO {

    EntityManagerFactory entityManagerFactory;
    EntityManager entityManager;

    public StudentDAO() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("yschool-mini-arthi");
        this.entityManager = entityManagerFactory.createEntityManager();
    }

    public List<Student> getStudentList() {
        Query query = entityManager.createQuery("select s from Student s");
        return query.getResultList();
    }


    public boolean createStudent(final Student student) {
        if (student == null) {
            return false;
        }
        entityManager.getTransaction().begin();
        entityManager.persist(student);
        entityManager.getTransaction().commit();
        return true;
    }
        public List<Student> searchStudent(String student_name,int grade) {
        List<Student> s;
        Query query=entityManager.createQuery("Select s from Student s where student_name='"+student_name+"' && student_grade='"+grade+"'");
        s=query.getResultList();
        return s;
    }
    

   
}
