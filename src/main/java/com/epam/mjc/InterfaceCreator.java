package com.epam.mjc;

import java.util.ArrayList;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        Operation<Integer> op = x -> {
            ArrayList<Integer> result = new ArrayList<>();
          for(Integer iter: x){
              result.add(iter/divider);
          }
          return result;
        };
        return op;
    }
}
