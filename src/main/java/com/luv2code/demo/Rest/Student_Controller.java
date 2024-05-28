package com.luv2code.demo.Rest;

import com.luv2code.demo.Entity.Student_Entity;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class Student_Controller {

    private List<Student_Entity> theStudents= new ArrayList<>();

    @PostConstruct
    public void loadData(){
        theStudents = new ArrayList<>();
        theStudents.add(new Student_Entity("Rafiul","Abeer"));
        theStudents.add(new Student_Entity("Islam","Khan"));
        theStudents.add(new Student_Entity("Abeer","Islam"));

        theStudents.add(new Student_Entity("Abeer","Khan"));
        theStudents.add(new Student_Entity("Rafiul","Islam"));
        theStudents.add(new Student_Entity("Rafiul","Khan"));
    }
@GetMapping("/students")
public List<Student_Entity> getStudents(){


        return  theStudents;
    }

    @GetMapping("/students/{studentID}")
    public Student_Entity getStudentbyID(@PathVariable int studentID){
//just index into the list.. keeping it simple for now

        //check the studentID again list size

        if((studentID >= theStudents.size()) || (studentID < 0)){
            throw new StudentNotFoundException(studentID+ " STUDENT ID NOT FOUND! ");
        }
        return theStudents.get(studentID);
    }

//    @ExceptionHandler
//    public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exc){
//        //create a student error response
//        StudentErrorResponse error = new StudentErrorResponse();
//        error.setStatus(HttpStatus.NOT_FOUND.value());
//        error.setMessage(exc.getMessage());
//        error.setTimeStamp(System.currentTimeMillis());
//
//        //return ResponseEntity
//        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
//    }

//    @ExceptionHandler
//    public ResponseEntity<StudentErrorResponse> handleException(Exception exc){
//        //create a student error response
//        StudentErrorResponse error = new StudentErrorResponse();
//        error.setStatus(HttpStatus.BAD_REQUEST.value());
//        error.setMessage(exc.getMessage());
//        error.setTimeStamp(System.currentTimeMillis());
//
//        //return ResponseEntity
//        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
//    }

}
