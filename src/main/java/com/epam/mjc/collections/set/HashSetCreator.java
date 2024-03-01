package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> newSet = new HashSet<>();
        for (Integer i:sourceList) {
            if(i%2==0){
                int temp = i;
                newSet.add(i);
                while(temp>1){
                    temp = temp/2;
                    newSet.add(temp);
                }
            }
            else{
                newSet.add(i);
                newSet.add(2*i);
            }

        }
        return newSet;
    }
}
