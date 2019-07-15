package com.gupao.gp019482.factorymethod;

import com.gupao.gp019482.simplefactory.Department;

public class FactoryMethodTest {

    public static void main(String[] args) {
        DepartmentFactory factory = new ITDepartmentFactory();
        Department department = factory.create();
        department.work();
    }
}
