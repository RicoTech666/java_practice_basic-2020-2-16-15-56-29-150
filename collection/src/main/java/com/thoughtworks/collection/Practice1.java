package com.thoughtworks.collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Practice1 {
    public static void main(String[] args) {
        System.out.println(randomNumber());
    }

    /**
     * 生成10个0到20的随机整数，要求不能重复
     */
    public static Collection<Integer> randomNumber() {
        int count = 10;
        int bound = 20;
        Random random = new Random();
        Set<Integer> randomSet = new HashSet<>();

        while (randomSet.size() < count) {
            randomSet.add(random.nextInt(bound));
        }

        return randomSet;
    }

}
