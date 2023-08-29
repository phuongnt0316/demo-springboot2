package vn.com.devmaster.vervices.demo.demoConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class Config {
    @Bean
    ManagerStudent student(){
        Student student=Student.builder().name("tung").age(18).build();
        List<Student> studentList=new ArrayList<>();
        studentList.add(student);
        studentList.add(student);
        studentList.add(student);
        ManagerStudent managerStudent=new ManagerStudent();
        managerStudent.setStudentList(studentList);
        return managerStudent;
    }
}
