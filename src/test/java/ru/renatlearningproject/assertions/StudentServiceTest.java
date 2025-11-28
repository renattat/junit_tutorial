package ru.renatlearningproject.assertions;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import ru.renatlearningproject.Student;
import ru.renatlearningproject.StudentNotFoundException;
import ru.renatlearningproject.StudentService;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    @Test
    public void getStudentTest() {
        StudentService studentService = new StudentService();
        Student student = new Student(1, "Renat");
        List<Student> listOFStudents = studentService.getStudents();
        studentService.addStudent(student);
        boolean actualResult = listOFStudents.isEmpty();

//        assertTrue(actualResult);
//        assertTrue(() -> actualResult);
//        assertTrue(actualResult, "List of students is empty!");
//        assertTrue(() -> actualResult, "!!List of students is empty!");

//        assertTrue(actualResult, ()-> ">>List of students is empty!");

        assertTrue(() -> actualResult, () -> "List of student is empty");
    }

    @Test
    public void getStudentsTestUsingAssertFalse() {
        StudentService studentService = new StudentService();
        List<Student> studentList = studentService.getStudents();
        Student student = new Student(1, "Renat");
//        studentService.addStudent(student);
        boolean actualResult = studentList.isEmpty();

//        assertFalse(actualResult);
//        assertFalse(actualResult, "Student list should not be empty!");
//        assertFalse(()->actualResult);
//        assertFalse(()->actualResult, "Student list should not be empty");
//        assertFalse(actualResult, ()-> "Student list should not be empty");
        assertFalse(() -> actualResult, () -> "Student list should not be empty");
    }

    @Test
    public void getStudentByIdTestUsingAssertNull() {
        StudentService studentService = new StudentService();
        Student student = new Student(1, "Renat");
        studentService.addStudent(student);

        Student actualObject = studentService.getStudentBYId(1);

//        assertNull(actualObject);
//        assertNull(actualObject, "Student object is NOT NULL");
        assertNull(actualObject, () -> "Student object is NOT NULL");
    }

    @Test
    public void getStudentByIdTestUsingAssertNotNull() {
        StudentService studentService = new StudentService();
        Student student = new Student(1, "Renat");
        studentService.addStudent(student);

        Student actualObject = studentService.getStudentBYId(1);
//        assertNotNull(actualObject);
//        assertNotNull(actualObject, "Student is null");
        assertNotNull(actualObject, () -> "Student is null");

    }

    @Test
    public void getStudentByIdTestUsingAssertEquals() {
        StudentService studentService = new StudentService();
        Student student = new Student(1, "Renat");
        studentService.addStudent(student);

        Student actualObject = studentService.getStudentBYId(1);

//        assertEquals(1, actualObject.getId());
//        assertEquals("Renat", actualObject.getName());
//        assertEquals(student, actualObject);
//        assertEquals(1, actualObject.getId(), "Student id is not equal");
        assertEquals("Renat", actualObject.getName(), () -> "Student name is not equal");
    }


    @Test
    public void getStudentNamesByDepartmentTestUsingArrayEquals(){
        StudentService studentService = new StudentService();
        Student student = new Student(1, "Renat", "Science");
        Student student1 = new Student(2, "Alex", "Science");
        Student student2 = new Student(3, "Max", "Arts");
        studentService.addStudent(student);
        studentService.addStudent(student1);
        studentService.addStudent(student2);

        String[] actualArray = studentService.getStudentNamesByDepartment("Science");
//        String[] expectedArray = {"Renat", "Alex"};
        String[] expectedArray = {"Renat", "Alex", "Max"};

//        assertArrayEquals(expectedArray, actualArray);
//        assertArrayEquals(expectedArray, actualArray, "Student names are not equal");

//        assertArrayEquals(expectedArray, actualArray, ()->"Student names are not equal");

        Integer[] actualStudentIds = studentService.getStudentIdsByDepartment("Science");
        Integer[] expectedStudentIds = {1,2};

        assertArrayEquals(expectedStudentIds , actualStudentIds);
    }

    @Test
    public void getStudentByNameTestUsingAssertThrows(){

        StudentService studentService = new StudentService();
        Student student = new Student(1, "Renat", "Science");
        studentService.addStudent(student);


//        assertThrows(StudentNotFoundException.class, ()-> studentService.getStudentByName("1Renat"));
//        assertThrows(NullPointerException.class, ()-> studentService.getStudentByName("Renat"));

        assertThrows(RuntimeException.class, ()-> studentService.getStudentByName("1Renat"));

    }

    @Test
    public void getStudentByNameTestUsingAssertThrowsExactly(){

        StudentService studentService = new StudentService();
        Student student = new Student(1, "Renat", "Science");
        studentService.addStudent(student);


        assertThrowsExactly(StudentNotFoundException.class, ()-> studentService.getStudentByName("1Renat"));

//        assertThrowsExactly(RuntimeException.class, ()-> studentService.getStudentByName("1Renat"));

    }
}