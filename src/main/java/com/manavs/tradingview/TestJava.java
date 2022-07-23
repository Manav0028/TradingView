package com.manavs.tradingview;

import org.aspectj.weaver.ast.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class TestJava {

        public int findMaximum(List<Integer> arr, int m) {
            List<Integer> sub = new ArrayList<>();
            List<List<Integer>> subLists = new ArrayList<>();
            HashMap<String, List<Integer>> map = new HashMap<>();
            map = subseq(arr, 0, subLists, m, sub, map);
            //global max

            int globalMax = 0;
            for (Map.Entry<String, List<Integer>> entry : map.entrySet()) {
                List<Integer> list = entry.getValue();
                int currentMin = Integer.MAX_VALUE;
                System.out.println("list " + list.toString());
                for (int i = 0; i < m - 1; i++) {
                    for (int j = i + 1; j < m; j++) {
                        int min = Math.abs(list.get(j) - list.get(i));
                        if (currentMin > min) {
                            currentMin = min;
                            System.out.println("current Min " + currentMin);
                        }

                    }
                }
                globalMax = Math.max(globalMax, currentMin);
            }
            return globalMax;

        }


        public HashMap<String, List<Integer>> subseq(List<Integer> arr, int s, List<List<Integer>> subLists, int m,
                                                            List<Integer> sub, HashMap<String, List<Integer>> map) {
            if (sub.size() == m) {
                if (!map.containsKey(sub.toString()))
                    map.put(sub.toString(), new ArrayList<>(sub));
                subLists.add(new ArrayList<>(sub));
                return map;
            }

            while (s < arr.size()) {
                sub.add(arr.get(s));
                subseq(arr, s + 1, subLists, m, sub, map);
                sub.remove(sub.size() - 1);
                s++;
            }
            return map;
        }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = IntStream.range(0, arrCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine().replaceAll("\\s+$", "");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        int m = Integer.parseInt(bufferedReader.readLine().trim());

        TestJava test = new TestJava();
        int result = test.findMaximum(arr, m);
        System.out.println(result);
        bufferedReader.close();
    }


}
