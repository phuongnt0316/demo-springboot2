package vn.com.devmaster.vervices.demo.demoConfig;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ManagerStudent {
    List<Student> studentList;
}
