package com.design_shinbi.exercise.sort;

import java.util.ArrayList;

public class Sort2 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("佐藤", 100, 80, 70));
        students.add(new Student("鈴木", 90, 90, 90));
        students.add(new Student("高橋", 50, 50, 100));
        students.add(new Student("山本", 40, 85, 50));
        students.add(new Student("小林", 77, 77, 77));
        students.add(new Student("中村", 83, 46, 60));
        
        students.sort(
            (student1, student2) -> {
                return - (student1.getMath() - student2.getMath());
            }
        );
        
        for(Student student : students) {
            System.out.println(student);
        }
    }
}
