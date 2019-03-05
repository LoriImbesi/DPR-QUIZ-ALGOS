package com.company;

/* Perform a binary search in a sorted array in Java.
Return location of element in array.

 */

public class binarySearch {

    public static void main(String args[]) {

        int[] sortedArray = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31};
        int min = 0; //The variable that tells us where the beginning of the remaining list is. Initial value is 0.
        int n = sortedArray.length;
        int max = n - 1; //The length of the array is 11 elements, but index starts at 0, so it is n-1.
        //This is the end of the remaining list.
        int target = 11;
        int mid = 0;


        while (max >= min) {  //This tells the computer to keep going until "min" is greater than or equal to "max."
            mid = (min + max) / 2; //This is the calculation to divide the list into half.
            if (sortedArray[mid] == target) { //If we found the target number, print the index of the target.
                System.out.println("The target number is at index " + mid);
                break;
            } else if (sortedArray[mid] < target) //If the item in the middle is less than the target, we should
                // look for the target in the top half of the list. Calculate
                // for a new "min."
                min = mid + 1;

            else if (sortedArray[mid] > target)
                max = mid - 1;  //Else, calculate for the new "max."
        }
    }
}


/*
I don't think my code is doing all that it should be doing. I understand what binary search is, and how it
works, but I'm not sure how to translate it into code. I looked at numerous examples online and this is
where I ended up. I know there are ways to show binary search iteratively and recursively. I understand
that iterating is via instructions and recursive is the method calling itself - though I don't have a clear
picture of recursion.
In some examples, the code had a line: return -1 for when the target was not in the list. I couldn't get that
to work. I look forward to going over this with you. Thanks!
 */