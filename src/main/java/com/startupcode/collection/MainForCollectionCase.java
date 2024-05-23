package com.startupcode.collection;

public class MainForCollectionCase {
    public static void main(String[] args) {
        StudentManagerWithCollection manager = new StudentManagerWithCollection();
        //  StudentManagerWithoutCollection manager = new StudentManagerWithoutCollection(10); // 주석 해제 시 StudentManagerWithCollection 대신 사용
        Student kim = new Student(1, "김철수");
        Student park = new Student(2, "박영희");

        manager.addStudent(kim);
        manager.addStudent(park);
        manager.printStudents();

        manager.removeStudent(kim);
        manager.printStudents();
    }
}