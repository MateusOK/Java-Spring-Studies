package br.com.compass.pb.restdemo.rest;

import br.com.compass.pb.restdemo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> theStudents;
    @PostConstruct
    public void loadData(){

        theStudents = new ArrayList<>();

        theStudents.add(new Student("Mateus", "Ribeiro"));
        theStudents.add(new Student("Guga", "Eyros"));
        theStudents.add(new Student("Gabriel", "Zwamp"));
    }


    @GetMapping("/students")
    public List<Student> getStudents(){
        List<Student> theStudents = new ArrayList<>();


        return theStudents;
    }

    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable Integer studentId){

        if(studentId > theStudents.size() || studentId < 0){
            throw new StudentNotFoundException("Student id not found" + studentId);
        }
        return theStudents.get(studentId);
    }

}
