package com.gupao.gp019482.abstractfactory;

import com.gupao.gp019482.simplefactory.Department;
import com.gupao.gp019482.simplefactory.ITDepartment;

public class ITDepartmentFactory implements DepartmentFactory {
    @Override
    public Department createDepart() {
        return new ITDepartment();
    }

    @Override
    public Grade createGrade() {
        return new ITGrade();
    }
}
