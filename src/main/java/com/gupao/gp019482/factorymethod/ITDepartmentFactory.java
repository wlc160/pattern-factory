package com.gupao.gp019482.factorymethod;

import com.gupao.gp019482.simplefactory.Department;
import com.gupao.gp019482.simplefactory.ITDepartment;

public class ITDepartmentFactory implements DepartmentFactory {

    @Override
    public Department create() {
        return new ITDepartment();
    }
}
