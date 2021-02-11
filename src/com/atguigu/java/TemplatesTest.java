package com.atguigu.java;

import com.atguige.bean.Customer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author shkstart
 * @create 2021-02-04 18:45
 * @date 2021/2/4-18:45
 *
 * 1.IDEA中 代码模板所处的位置：settings-editor -live templates / postfix completion
 * 2.常用的模板。
 *
 */
public class TemplatesTest {
    //模板六：prsf
    private static final Customer cust = new Customer();

    //变形：psf
    public static final  int NUM = 1;
    //变形：psfi
    public static final int NUM2 = 2;
    //变形：psfs
    public static final String NATION = "CHINA";
    //模板一：psvm/main  敲出 ，选择跳出的第一行
    public static void main(String[] args) {
        //模板二： 敲出sout，选择跳出的第一行
        System.out.println("hello");
        // 变形：soutp /soutm /soutv /   选择跳出的第一行
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("TemplatesTest.main");
        
        int num = 101;
        System.out.println("num = " + num);

        // 模板三：fori
        String[] arr = new String[]{"TOM","JERRY"};
        for(int i = 0;i < arr.length;i++){
            //敲击 arr[i].sout即可
            System.out.println(arr[i]);

        }
        //变形 ：iter
        for (String s : arr) {
            System.out.println(s);
        }
        //变形：itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        //模板四：list.for  增强for循环
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);

        for (Object o : list) {

        }

        //变形；list.fori  普通for循环
        for (int i = 0; i < list.size(); i++) {

        }
        //变形：list.forr  逆序遍历
        for (int i = list.size() - 1; i >= 0; i--) {

        }


    }

    public  void method(){
        System.out.println("TemplatesTest.method");
        //模板五；ifn
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);
        if ( list == null) {

        }
        //变形：inn
        if (list != null) {

        }
        //变形：xxx.nn / xxx.null
        if (list != null) {

        }
        if (list == null) {

        }

    }

}
