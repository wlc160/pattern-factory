package com.gupao.gp019482.abstractfactory;

import com.gupao.gp019482.simplefactory.Department;

public class AbstractFactoryTest {

    public static void main(String[] args) {

        DepartmentFactory factory = new ITDepartmentFactory();
        Department department = factory.createDepart();
        department.work();
        Grade grade = factory.createGrade();
        grade.score();
    }
}
