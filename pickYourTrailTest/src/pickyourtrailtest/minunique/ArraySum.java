/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pickyourtrailtest.minunique;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sougoswa
 */
public class ArraySum {

    private int[] originalArr;

    public int[] getOriginalArr() {
        return originalArr;
    }

    public void setOriginalArr(int[] originalArr) {
        this.originalArr = originalArr;
    }

    public static List<Integer> findListOfIndicesOfRepeatVal(List<Integer> myArr, int elemnt) {
        List<Integer> indices = new ArrayList<>();
        int i = 0;
        for (int k : myArr) {
            if (k == elemnt) {
                indices.add(i);
            }
            i++;
        }
        if (indices.size() > 1) {

            return indices;
        } else {
            return new ArrayList<>();
        }
    }

    public static int getMinimumUniqueSum(List<Integer> orig) {

        for (int x : orig) {
            List<Integer> tmpIndices = findListOfIndicesOfRepeatVal(orig, x);
            if (tmpIndices.size() > 0) {
                for (int m = 1; m < tmpIndices.size(); m++) {
                    orig.set(tmpIndices.get(m), (orig.get(tmpIndices.get(m)) + m));
                }
            }

        }

        return sumOfArr(orig);

    }

    static int sumOfArr(List<Integer> arr) {
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        return sum;
    }

}
