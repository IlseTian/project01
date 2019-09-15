package com.tammy.java;

import com.tammy.bean.Customer;

import java.util.ArrayList;

/**
 * @author IlseTian
 * @date 2019/9/12 0012- 8:46
 * 1. IDEA代码模板位置： settings- editor -live templates/postfix completion
 * 2. 常用模板
 **/
public class TemplateTest {
    //模板6：prsf：可生成private statis final
    private static final Customer cust = new Customer();
    //psf psfi psfs



    //    模板1：psvm
    public static void main(String[] args) {
        //    模板2：sout
        System.out.println("helloWorld!");
        //变形：soutp / soutm/ soutv/xxx.sout
        System.out.println("args = [" + args + "]");//soutp
        System.out.println("TemplateTest.main");//soutm
        System.out.println("args = " + args);//soutv
        int x = 12;
        System.out.println("x = " + x);//soutv 打印就近的变量
        System.out.println(x);//xxx.sout

//        模板3：fori
        String[] arr = new String[]{"Tom", "Jerry", "Tammy"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //变形：iter
        for (String s : arr) {
            System.out.println(s);
        }
        //变形： itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }
//        模板四：lsit.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);
        for (Object o : list) {

        }
        //变形：list.fori
        for (int i = 0; i < list.size(); i++) {

        }
        //变形：list.forr 逆序遍历
        for (int i = list.size() - 1; i >= 0; i--) {

        }

    }
    public void method(){
        System.out.println("TemplateTest.method");
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);
//        模板5：ifn 判断是否 是null (if null)
        if (list == null) {
            
        }
        //变形：inn 判断是否 不是null (if not null)
        if (list != null) {
            
        }
        //变形：xxx.nn / xxx.null
        if (list != null) {

        }
        if (list == null) {

        }

    }

}
