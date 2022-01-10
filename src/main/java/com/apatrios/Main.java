package com.apatrios;

import com.apatrios.dao.StudentDao;
import com.apatrios.entities.Student;

public class Main {
    public static void main(String[] args) {
        StudentDao dao = new StudentDao(SessionFactorySingleton.getSessionFactory());
//        Student st1 = new Student();
//        st1.setName("Mikhail");
//        st1.setMark(5);
//        dao.insert(st1);
        System.out.println(dao.findAll());
    }
}
