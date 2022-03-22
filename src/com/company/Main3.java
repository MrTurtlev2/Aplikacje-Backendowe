package com.company;

import static com.company.Main3.choseMiddle;

public class Main3 {

    public static int result;

    public static int choseMiddle(int[] array, int value) {


        int index = 0;
        int length = array.length - 1;

        while (index <= length) {
            int point = (int) Math.ceil((index + length) / 2);
            int entry = array[point];

            if(value > entry) {
                index = point + 1;
            }
            if (value < entry) {
                length = point -1;
            }
        }
        System.out.println(length);
        result = length;
        return result;
    }

    public static void main(String[] args) {
        int[] myIntArray = new int[]{4, 5, 7, 11, 12, 15, 15, 21, 40, 45};
        int value = 11;

            choseMiddle(myIntArray, value);

            System.out.println(result);
    }

}





//    function searchIndex(array, value) {
//        var index = 0;
//        var limit = array.length - 1;
//        while (index <= limit) {
//            var point = Math.ceil((index + limit) / 2);
//            var entry = array[point];
//            if (value > entry) {
//                index = point + 1;
//                continue;
//            }
//            if (value < entry) {
//                limit = point - 1;
//                continue;
//            }
//            return point; // value == entry
//        }
//        return -1;
//    }
//
//
//// Usage example:
//
//    // for this implementation array must be sorted from smallest to biggest!
//    var array = [ 4, 5, 7, 11, 12, 15, 15, 21, 40, 45 ];
//        var index = searchIndex(array, 11); // we want to find index for 11
//
//        console.log(index);  // 3