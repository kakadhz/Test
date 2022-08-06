package com.gxs.type;

import java.util.ArrayList;
import java.util.Iterator;

public class ListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("111");
        list.add("222");
        list.add("333");
        //迭代器遍历
       /* Iterator<Object> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }*/
       /* for (String o : list) {
            System.out.println(o);
        }*/
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
