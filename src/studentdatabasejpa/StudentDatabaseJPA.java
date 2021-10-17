/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdatabasejpa;

import java.util.List;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
/**
 *
 * @author AN515-43
 */
public class StudentDatabaseJPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Student std1 = new Student(1, "John", 3.98);
       Student std2 = new Student(2, "Marry", 3.10);
       //Student std3 = new Student(3, "GG", 3.15);
      StudentTable.insertStudent(std1);
       StudentTable.insertStudent(std2);
       //Student std;
       //emp = StudentTable.findStudentById(1);
       //if (emp != null) {
       //    emp.setName("Jack");
       //StudentTable.removeStudent(std1);
       //StudentTable.removeStudent(std2);
          // StudentTable.updateStudent(std3);
       //}
       List<Student> stdList = StudentTable.findAllStudent();
       printAllStudent(stdList);
    }
       
    public static void printAllStudent(List<Student> studentList) {
        for(Student std : studentList) {
           System.out.print(std.getId() + " ");
           System.out.print(std.getName() + " ");
           System.out.println(std.getGpa() + " ");
       }
    }
}

