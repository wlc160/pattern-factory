package com.gupao.gp019482.simplefactory;

public class DepartmentFactory {

    public Department create1(String name){
        if (null != name && !"".equals(name)){
            if ("IT".equals(name)){
                return new ITDepartment();
            }else if ("finance".equals(name)){
                return new FinanceDepartment();
            }
        }
        return null;
    }

    public Department create2(String classname){
        try{
            if (null != classname && !"".equals(classname)){
                return  (Department)Class.forName(classname).newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return  null;
    }

    public Department create3(Class cls){
        try{
            if (cls != null){
                return (Department)cls.newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

}
