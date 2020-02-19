package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Practice2 {

    public static void main(String[] args) {
        //分别用for循环、增强for循环、迭代器遍历并打印getNumbers返回的List
        List<Integer> numbers = getNumbers();

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println("\n--------------------");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println("\n--------------------");
        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()) {
            int number = iterator.next();
            System.out.print(number + " ");
        }
    }

    /**
     * 创建一个List 然后在List中添加0到100整数
     */
    public static List<Integer> getNumbers() {
        int maxVal = 100;
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i <= maxVal; i++) {
            numbers.add(i);
        }

        return numbers;
    }


}
