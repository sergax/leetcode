package com.sergax.tasks.search_insert_position;

import lombok.AllArgsConstructor;

import java.util.*;

/**
 * by Aksenchenko Serhii on 04.05.2022
 */

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int rightSide = nums.length - 1;
        int leftSide = 0;
        int midOfArray;

        while (rightSide >= leftSide) {
            midOfArray = leftSide + (rightSide - leftSide) / 2;

            if (nums[midOfArray] == target) return midOfArray;

            if (target < nums[midOfArray]) {
                rightSide = midOfArray - 1;
            } else {
                leftSide = midOfArray + 1;
            }
        }
        return leftSide;
    }
}

