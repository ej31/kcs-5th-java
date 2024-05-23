package com.startupcode.collection;

import java.util.HashSet;
import java.util.Set;

public class StudentManagerWithCollection {
    private final Set<Student> students;

    // 생성자
    public StudentManagerWithCollection() {
        this.students = new HashSet<>();
    }

    // 학생 추가 메서드
    public void addStudent(Student student) {
        if (students.add(student)) {
            System.out.println(student.getName() + " 학생이 추가되었습니다.");
        } else {
            System.out.println("이미 존재하는 학생입니다.");
        }
    }

    // 학생 삭제 메서드
    public void removeStudent(Student student) {
        if (students.remove(student)) {
            System.out.println(student.getName() + " 학생이 삭제되었습니다.");
        } else {
            System.out.println("존재하지 않는 학생입니다.");
        }
    }

    // 모든 학생 출력 메서드
    public void printStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    // 특정 학생 찾기 메서드
    public boolean findStudent(Student student) {
        return students.contains(student);
    }
}