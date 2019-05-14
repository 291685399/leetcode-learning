package com.wyj.array.containsDuplicate;

import java.util.HashSet;
import java.util.Set;

/**
 * 存在重复具体实现类
 *
 * @author wyj
 * @create 2019-05-11 14:00
 */
public class Solution {
    public boolean containsDuplicate(int[] nums) {
        //效率低
        // boolean flag=false;
        // int i;
        // int j;
        // for(i=0;i<nums.length-1;i++){
        //     for(j=i+1;j<nums.length;j++){
        //         if(nums[i]==nums[j]){
        //             flag=true;
        //             break;
        //         }
        //     }
        // }
        // return flag;

        //18ms
        Set<Integer> set = new HashSet<Integer>();
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            boolean f = set.add(nums[i]);
            if (!f) {
                flag = true;
                break;
            }
        }
        return flag;

        //23ms
        // Set<Integer> set=new HashSet<Integer>();
        // for(int i=0;i<nums.length;i++){
        //     set.add(nums[i]);
        // }
        // if(set.size()<nums.length){
        //     return true;
        // }else{
        //     return false;
        // }
    }
}
