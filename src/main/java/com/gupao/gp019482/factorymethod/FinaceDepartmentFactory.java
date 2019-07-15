package com.gupao.gp019482.factorymethod;

import com.gupao.gp019482.simplefactory.Department;
import com.gupao.gp019482.simplefactory.FinanceDepartment;

public class FinaceDepartmentFactory implements DepartmentFactory {
    @Override
    public Department create() {
        return new FinanceDepartment();
    }
}
