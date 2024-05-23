package com.startupcode.collection;

import java.util.Objects;

public class Student {
    private int id; // 학생 ID
    private String name; // 학생 이름

    // 생성자
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // getter와 setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // hashCode와 equals 메서드를 오버라이드하여 ID가 같으면 같은 객체로 인식하도록 함
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    // toString 메서드 오버라이드
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
