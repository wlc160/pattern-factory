package com.gupao.gp019482.abstractfactory;

import com.gupao.gp019482.simplefactory.Department;

public interface DepartmentFactory {

    public Department createDepart();

    public Grade createGrade();

}
