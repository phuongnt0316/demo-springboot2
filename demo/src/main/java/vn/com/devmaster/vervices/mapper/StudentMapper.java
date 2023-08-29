package vn.com.devmaster.vervices.mapper;

import org.springframework.stereotype.Component;
import vn.com.devmaster.vervices.DTO.StudentDTO;
import vn.com.devmaster.vervices.domain.Student;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentMapper {
    public StudentDTO toDTO(Student entity){
        StudentDTO dto=StudentDTO
                .builder()
                .name(entity.getLastName()+" "+entity.getFirstName())
                .address(entity.getAddress())
                .age(entity.getAge())
                .userName(entity.getUserName())
                .build();
        return dto;
    }
    public List<StudentDTO> toDTO(List<Student> entities){
        List<StudentDTO> dtos=new ArrayList<>();
        entities.forEach(student ->{
            StudentDTO dto=toDTO(student);
            dtos.add(dto);
                });
        return dtos;
    }
}
