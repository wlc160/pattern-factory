package com.gupao.gp019482.simplefactory;

/**
 * 财务部
 */
public class FinanceDepartment implements Department{
    @Override
    public void work() {
        System.out.println("财务部:算账");
    }
}
