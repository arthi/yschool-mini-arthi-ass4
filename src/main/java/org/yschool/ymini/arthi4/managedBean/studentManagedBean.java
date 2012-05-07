/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yschool.ymini.arthi4.managedBean;

import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.yschool.ymini.arthi4.dao.Student;
import org.yschool.ymini.arthi4.dao.StudentDAO;

/**
 *
 * @author Lukshy
 */
@ManagedBean(name = "studentManagedBean")
@SessionScoped
public class studentManagedBean implements Serializable{
        //private static final Logger logger = LoggerFactory.getLogger(studentManagedBean.class);
   
    private Student selectedStudent;
    private String message;
    StudentDAO studentDAO;

    public studentManagedBean() {
        this.selectedStudent = new Student();
        this.studentDAO = new StudentDAO();

        //logger.info("Initiated StudentManagedBean");
    }

    public List<Student> getStudentList() {
        return this.studentDAO.getStudentList();
    }
    
        public void searchStudent() {
        this.studentDAO.getStudentList();
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, " Student searched successfully ", null));

        //logger.info("Searched Student");
    }


    public void createStudent() {
        this.studentDAO.createStudent(selectedStudent);
        selectedStudent = new Student();
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, " Student added successfully ", null));

        //logger.info("Added new Student");
    }
    
       

    public Student getSelectedStudent() {
        return selectedStudent;
    }

    public void setSelectedStudent(Student selectedStudent) {
        this.selectedStudent = selectedStudent;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
