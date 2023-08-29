package vn.com.devmaster.vervices.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.com.devmaster.vervices.DTO.StudentDTO;
import vn.com.devmaster.vervices.domain.Student;
import vn.com.devmaster.vervices.mapper.StudentMapper;
import vn.com.devmaster.vervices.repository.DemoRepository;

import java.util.List;

@Service
public class DemoService {
    @Autowired
    private DemoRepository demoRepository;
    @Autowired
    private StudentMapper studentMapper;

    public List<StudentDTO> getAllStudent() {
        List<Student> list = demoRepository.getAll();
        return studentMapper.toDTO(list);
    }
    public StudentDTO getOne(String userNamme){
        Student student=demoRepository.getOne(userNamme);
        return studentMapper.toDTO(student);
    }
    public  StudentDTO getStudent(String userName,String password){
        Student student=demoRepository.getStudent(userName,password);
        return  studentMapper.toDTO(student);
    }
    public List<StudentDTO> getStudentByName(String name){
        List<Student> list=demoRepository.getStudentByName(name);
        return studentMapper.toDTO(list);
    }
}
