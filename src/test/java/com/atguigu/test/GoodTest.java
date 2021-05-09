package com.atguigu.test;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GoodTest {
    public static void main(String[] args) {
        int[] lista={1,3,4,3,2,2,2};
        List<int[]> strList= Arrays.asList(lista);
        List<Integer> Arrist=new ArrayList<Integer>();
        Arrist.add(1);
         Arrist.add(2);
        Arrist.add(2);
        Arrist.add(2); Arrist.add(2);
        Arrist.add(2);
        System.out.println(Arrist.size());
        for (int i =  Arrist.size()-1; i >=0; i--) {

        }

        System.out.println("你好欢迎来到java的世界");
    }
}
