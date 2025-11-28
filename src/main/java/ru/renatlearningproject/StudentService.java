package ru.renatlearningproject;

import java.util.ArrayList;
import java.util.List;

public class StudentService {

    private List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return this.students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student getStudentBYId(int studentId) {
        return students.stream()
                .filter(student -> student.getId() == studentId)
                .findFirst()
                .orElse(null);
    }

    public String[] getStudentNamesByDepartment(String department){
        return students.stream()
                .filter(student-> student.getDepartment().equals(department))
                .map(student -> student.getName())
                .toArray(String[]::new);
    }

    public Integer[] getStudentIdsByDepartment(String department){
        return students.stream()
                .filter(student-> student.getDepartment().equals(department))
                .map(student -> student.getId())
                .toArray(Integer[]::new);
    }

    public Student getStudentByName(String name) {
        return students.stream()
                .filter(student -> student.getName().equals(name))
                .findFirst()
                .orElseThrow(()-> new StudentNotFoundException("Studnet not found with name: " + name));
    }
}
