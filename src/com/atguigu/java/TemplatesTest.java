package com.atguigu.java;

import com.atguigu.bean.Customer;

import java.util.ArrayList;

/**
 * @author saukes
 * @create 2018-07-19 08:28
 *
 */
public class TemplatesTest {
    private static final Customer CUST = new Customer();
    public static final int NUM = 10 ;
    public static final int NUM2 = 20 ;
    public static final String STRING = "" ;


    public static void main(String[] args) {
        System.out.println();
        System.out.println("args = [" + args + "]");
        System.out.println("TemplatesTest.main");
        int num = 10 ;
        System.out.println("num = " + num);
        System.out.println(num);
        String [] arr = new String[]{"A","B","C"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (String s : arr) {
            System.out.println(s);
        }
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(678);
        for (Object o : list) {
            System.out.println(o);
        }
        for (int i = 0; i < list.size(); i++) {

        }
        for (int i = list.size() - 1; i >= 0; i--) {

        }

    }
    public  void method () {
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(678);
        if (list == null) {

        }
        if (list != null) {

        }
        if (list == null) {

        }
    }
}
