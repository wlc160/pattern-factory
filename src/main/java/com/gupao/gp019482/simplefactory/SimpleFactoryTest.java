package com.gupao.gp019482.simplefactory;

/**
 * 简单工厂：复杂逻辑，用户简化
 * 使用场景》》》创建逻辑稳定、产品少
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {

        DepartmentFactory factory = new DepartmentFactory();
        Department department1 = factory.create1("IT");
        department1.work();

        Department department2 = factory.create2("com.gupao.gp019482.simplefactory.FinanceDepartment");
        department2.work();

        Department department3 = factory.create3(ITDepartment.class);
        department3.work();
    }
}
