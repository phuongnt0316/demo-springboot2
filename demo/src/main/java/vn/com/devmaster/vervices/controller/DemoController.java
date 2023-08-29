package vn.com.devmaster.vervices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import vn.com.devmaster.vervices.DTO.StudentDTO;
import vn.com.devmaster.vervices.domain.Student;
import vn.com.devmaster.vervices.services.DemoService;

import java.util.List;

@RestController
public class DemoController{
    @Autowired
    private DemoService demoService;

    @RequestMapping(method = RequestMethod.GET,value = "/students")
    List<StudentDTO> getStudents(){
        return demoService.getAllStudent();
    }
    @RequestMapping(method = RequestMethod.GET,value = "/student")
    StudentDTO getOne(@RequestParam("userName") String userName){
        return demoService.getOne(userName);
    }
    @RequestMapping(method = RequestMethod.GET,value = "/student1")
    StudentDTO getStudent(@RequestParam("userName") String userName,@RequestParam("password") String password){
        return demoService.getStudent(userName,password);
    }



}
