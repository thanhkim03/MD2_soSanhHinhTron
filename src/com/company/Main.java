package com.company;

import SoSanh.ComparableCircle;
import hinhHoc.Circle;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ComparableCircle[] c1 = new ComparableCircle[3];
        c1[0]=new ComparableCircle();
        c1[1]=new ComparableCircle(4,"red",false);
        c1[2]=new ComparableCircle(3,"while", true);
        System.out.println("trươc so sánh");
        for (int i=0;i< c1.length;i++){
            System.out.println(c1[i]);
        }
        Arrays.sort(c1);
        System.out.println("sau so sánh");
        for (int i=0;i< c1.length;i++){
            System.out.println(c1[i]);
        }
    }
}
