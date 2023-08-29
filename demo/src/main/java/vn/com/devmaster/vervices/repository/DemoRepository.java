package vn.com.devmaster.vervices.repository;

import org.springframework.stereotype.Repository;
import vn.com.devmaster.vervices.domain.Student;

import java.util.ArrayList;
import java.util.List;

@Repository

public class DemoRepository {
    public  List<Student> getAll(){
        Student student1= Student
                .builder()
                .age(18)
                .firstName("Phuong")
                .lastName("Nguyen")
                .address("HN")
                .userName("phuong")
                .password("123")
                .build();
        Student student2= Student
                .builder()
                .age(19)
                .firstName("Phuong")
                .lastName("Pham")
                .address("HD")
                .userName("phuong123")
                .password("123")
                .build();
        Student student3= Student
                .builder()
                .age(21)
                .firstName("Manh")
                .lastName("Nguyen")
                .address("HN")
                .userName("manh")
                .password("1234")
                .build();
        List<Student> studentList=new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        return studentList;

    }
    public Student getOne(String userName){
        Student student= Student
                .builder()
                .age(18)
                .firstName("Phuong")
                .lastName("Nguyen")
                .address("HN")
                .userName(userName)
                .password("123")
                .build();
        return student;
    }
    public Student getStudent(String userName,String password){
        List<Student>lstStudent=getAll();
        Student student=new Student();
        for(Student st:lstStudent){
            if(st.getUserName().equals(userName)&&st.getPassword().equals(password)){
                student=st;
                break;
            }
        }
        return student;

    }
    public  List<Student> getStudentByName(String name){
        List<Student> lstStudent=getAll();
        List<Student> myList=new ArrayList<>();
        for(Student st:lstStudent){
            if(st.getFirstName().equals(name)){
                myList.add(st);
            }
        }
        return myList;
    }
}
