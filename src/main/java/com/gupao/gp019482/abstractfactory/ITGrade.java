package com.gupao.gp019482.abstractfactory;

public class ITGrade implements Grade {
    @Override
    public void score() {
        System.out.println("研发部：99分");
    }
}
