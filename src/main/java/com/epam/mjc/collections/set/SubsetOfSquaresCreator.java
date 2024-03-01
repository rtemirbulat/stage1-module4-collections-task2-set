package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> ts = new TreeSet<>();
        for (Integer i: sourceList) {
            ts.add(i*i);
        }
        return ts.subSet(lowerBound,true,upperBound,true);
    }
}
