/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pickyourtrailtest.stack;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sougoswa
 */
public class Stack {

  
    private List<Integer> arrList;

    public Stack() {
        arrList=new ArrayList<>();
    }

    public boolean isEmpty() {
        return (arrList.size() == 0);
    }

    public void push(int a) {
       arrList.add(a);
    }

    public void pop() {
       // System.out.println("gfukfkuyyu");
      //  if (!this.isEmpty()) {
            //this.viewTop();
            if(arrList.size()>0){
            arrList.remove(arrList.size()-1);}
          //  System.out.println("gfukfkuyyu  "+tmp);
             viewTop();
       // } 

    }

    public void viewTop() {
        if (!this.isEmpty()) {
            System.out.println(arrList.get(arrList.size()-1));
        } else {
            System.out.println("EMPTY");
        }
    }

//    public static int[] removeTheElement(int[] arr, int index) {
//
//        if (arr == null || index < 0 || index >= arr.length) {
//            return arr;
//        }
//        int[] anotherArray = new int[arr.length - 1];
//        for (int i = 0, k = 0; i < arr.length; i++) {
//            if (i == index) {
//                continue;
//            }
//            anotherArray[k++] = arr[i];
//        }
//        return anotherArray;
//    }
//    
    public void inc(int e,int k){
        if (!this.isEmpty()) {
            if(e>=arrList.size()){
                e=arrList.size();
            }
            for(int i=0;i<e;i++){
                arrList.set(i, arrList.get(i)+k);
            }
        }
    }

}
