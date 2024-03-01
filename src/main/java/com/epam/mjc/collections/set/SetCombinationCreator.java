package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {

        Set<String> firstAndSecondSet = firstSet.stream()
                .filter(secondSet::contains)
                .filter(element -> !thirdSet.contains(element))
                .collect(Collectors.toSet());
        Set<String> thirdSecUniqueValues = thirdSet.stream()
                .filter(element -> !firstSet.contains(element) && !secondSet.contains(element))
                .collect(Collectors.toSet());

        Set<String> resultingSet = new HashSet<>(firstAndSecondSet);
        resultingSet.addAll(thirdSecUniqueValues);
        return resultingSet;
    }
}
