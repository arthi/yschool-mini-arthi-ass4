/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yschool.ymini.arthi4.dao;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Lukshy
 */
@Entity
public class Student implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    
    @Column(name = "student_name")
    
    private String name;
    @Column(name = "student_address")
    private String address;
    @Column(name = "student_grade")
    private int grade;
    @Column(name = "student_parentName")
    private String parentName;
    
    
    
        public Student() {
        
    }

    public Student(String name, String address, int grade, String parentName) {
        this.name = name;
        this.address = address;
        this.address = address;
        this.grade = grade;
        this.parentName = parentName;
        
    }
   
    public String getName() {
    return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    
    
}
