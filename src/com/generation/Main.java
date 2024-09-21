package com.generation;

import com.generation.classes.Student;
import com.generation.classes.StudentService;
import com.generation.exceptions.CourseNotFoundException;
import com.generation.exceptions.StudentNotFoundException;

public class Main {

    public static void main(String[] args) throws CourseNotFoundException, StudentNotFoundException {
	    StudentService studentService = new StudentService();
	    //TODO refactor this code to use encapsulation inside studentsService
        studentService.addstudents( new Student( "Carlos", "1030", 31 ) );
        studentService.addstudents( new Student( "Ian", "1040", 28 ) );
        studentService.addstudents( new Student( "Elise", "1050", 26 ) );
        studentService.addstudents( new Student( "Santiago", "1020", 333 ) );
        
        

        studentService.enrollStudents( "Math", "1030" );
        
    }//main
}//class Main