package com.startupcode.collection;

public class StudentManagerWithoutCollection {
    private final Student[] students;
    private int size; // 실제 학생 수

    // 생성자
    public StudentManagerWithoutCollection(int capacity) {
        students = new Student[capacity];
        size = 0;
    }

    // 학생 추가 메서드
    public void addStudent(Student student) {
        if (size == students.length) {
            System.out.println("학생 명단이 꽉 찼습니다.");
            return;
        }
        for (int i = 0; i < size; i++) {
            if (students[i].equals(student)) {
                System.out.println(student.getName() + " 학생이 이미 목록에 있습니다.");
                return;
            }
        }
        students[size++] = student;
        System.out.println(student.getName() + " 학생을 추가했습니다.");
    }

    // 학생 삭제 메서드
    public void removeStudent(Student student) {
        for (int i = 0; i < size; i++) {
            if (students[i].equals(student)) {
                students[i] = students[size - 1];
                students[size - 1] = null;
                size--;
                System.out.println(student.getName() + " 학생을 삭제했습니다.");
                return;
            }
        }
        System.out.println("존재하지 않는 학생입니다.");
    }

    // 모든 학생 출력 메서드
    public void printStudents() {
        for (int i = 0; i < size; i++) {
            System.out.println(students[i]);
        }
    }

    // 특정 학생 찾기 메서드
    public boolean findStudent(Student student) {
        for (int i = 0; i < size; i++) {
            if (students[i].equals(student)) {
                return true;
            }
        }
        return false;
    }
}