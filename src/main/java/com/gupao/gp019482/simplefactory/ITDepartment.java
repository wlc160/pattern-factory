package com.gupao.gp019482.simplefactory;

public class ITDepartment implements Department{

    @Override
    public void work() {
        System.out.println("研发部：开发顶级软件");
    }
}
