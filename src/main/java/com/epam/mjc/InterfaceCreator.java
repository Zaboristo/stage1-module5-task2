package com.epam.mjc;

import java.util.ArrayList;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return x -> {
            ArrayList<Integer> result = new ArrayList<>();
            for (Integer iter : x) {
                result.add(iter / divider);
            }
            return result;
        };
    }
}
