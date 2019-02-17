package org.litespring.util;

import java.util.Arrays;
import java.util.List;

/**
 * @author ercargo  on 2018/10/16
 * @DESCRIBE
 */
public class Demo7 {
    public static void main(String[] args){
        List<Integer> values = Arrays.asList(10,20,30,40);
        int result = new Demo7().add(values);
        System.out.println(result);
    }

    public int add(List<Integer> values){
        return values.parallelStream().mapToInt(a->a).sum();
    }
}
