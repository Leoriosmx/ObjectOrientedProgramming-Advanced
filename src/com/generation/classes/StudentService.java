package com.generation.classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.generation.exceptions.CourseNotFoundException;
import com.generation.exceptions.StudentNotFoundException;

public class StudentService
{
    HashMap<String, Course> courseList = new HashMap<>();

    HashMap<String, Student> students = new HashMap<>();

    HashMap<String, List<Course>> coursesEnrolledByStudents = new HashMap<>();


    public StudentService()
    {
        courseList.put( "Math", new Course( "Math", 10, "Aurelio Baldor" ) );
        courseList.put( "Physics", new Course( "Physics", 10, "Albert Einstein" ) );
        courseList.put( "Art", new Course( "Art", 10, "Pablo Picasso" ) );
        courseList.put( "History", new Course( "History", 10, "Sima Qian" ) );
        courseList.put( "Biology", new Course( "Biology", 10, "Charles Darwin" ) );
    }//StudentService

    public void enrollStudents( String courseName, String studentID ) throws CourseNotFoundException, StudentNotFoundException {
        Course course = courseList.get(courseName);
        // Check if the course exists
        if (course == null) {
            throw new CourseNotFoundException("Course not found: " + courseName);
        }// Check if the student exists
        if (!coursesEnrolledByStudents.containsKey(studentID)) {
            throw new StudentNotFoundException("Student not found: " + studentID);
        }// Enroll the student in the course
        coursesEnrolledByStudents.get(studentID).add(course);}
        

    //    {Course course = courseList.get( courseName );
//      if(!coursesEnrolledByStudents.containsKey(studentID))
//        {coursesEnrolledByStudents.put( studentID, new ArrayList<>());
//        }//if
//        coursesEnrolledByStudents.get( studentID ).add( course );
//    }//enrollStudents

    public void unEnrollStudents( String courseName, String studentID ) throws CourseNotFoundException, StudentNotFoundException {
        Course course = courseList.get(courseName);
     // Check if the course exists
        if (course == null) {
            throw new CourseNotFoundException("Course not found: " + courseName);
        }// Check if the student exists
        HashMap<String, Course> coursesunEnrolledByStudents = null;
		if (!coursesunEnrolledByStudents.containsKey(studentID)) {
            throw new StudentNotFoundException("Student not found: " + studentID);
        }// Enroll the student in the course
        coursesEnrolledByStudents.get(studentID).add(course);}
 //   {Course course = courseList.get(courseName);
 //       if(coursesEnrolledByStudents.containsKey(studentID))
 //       {coursesEnrolledByStudents.get( studentID ).remove(course);
 //       }//if
 //   }//unEnrollStudents

    public void showEnrolledStudents(String courseId){
        //TODO implement using collections loops
    	Course course = courseList.get(courseId);
    	if (coursesEnrolledByStudents.containsKey(course)) {
    		coursesEnrolledByStudents.get(students).remove(course); 
    	}//if
    }//showEnrolledStudents

    public void showAllCourses(){
        //TODO implement using collections loops
    	for (Course course: courseList.values()) {
    		System.out.println(course);
    	}//foreach
    	
    }//showAllCourses

    //------------------------------- Set - Get
    public HashMap<String, Course> getCourseList() {
		return courseList;
	}//HashMap

	public void setCourseList(HashMap<String, Course> courseList) {
		this.courseList = courseList;
	}//setCourseList

	public HashMap<String, Student> getStudents() {
		return students;
	}//HashMap

	public void setStudents(HashMap<String, Student> students) {
		this.students = students;
	}//setStudents

	public HashMap<String, List<Course>> getCoursesEnrolledByStudents() {
		return coursesEnrolledByStudents;
	}//HashMap

	public void setCoursesEnrolledByStudents(HashMap<String, List<Course>> coursesEnrolledByStudents) {
		this.coursesEnrolledByStudents = coursesEnrolledByStudents;
	}//setCoursesEnrolledByStudents

	@Override
	public String toString() {
		return "StudentService [courseList=" + courseList + ", students=" + students + ", coursesEnrolledByStudents="
				+ coursesEnrolledByStudents + ", getCourseList()=" + getCourseList() + ", getStudents()="
				+ getStudents() + ", getCoursesEnrolledByStudents()=" + getCoursesEnrolledByStudents() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}//String toString

	public void addstudents(Student student) {
		students.put(student.getId(), student);
		
	}//addstudents
 
	///---------------
	
    
}//classStudentService