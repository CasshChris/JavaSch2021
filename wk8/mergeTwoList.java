// Assignment 7.31 - Merge two sorted list
// this program will Merge and sort to list
import java.util.Scanner;

public class mergeTwoList {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        // get first list and save to array
        System.out.print("Enter size & content of list1: ");
        int size = scan.nextInt();
        int[] list1 = new int[size];
        for (int i = 0; i < list1.length; i++) {
            list1[i] = scan.nextInt();
        }

        // get second list and save to array
        System.out.print("Enter size & content of list2: ");
        size = scan.nextInt();
        int[] list2 = new int[size];
        for (int i = 0; i < list2.length; i++) {
            list2[i] = scan.nextInt();
        }
        
        // merge the list
        int[] mergedList = merge(list1, list2);

        // output list1 
        System.out.print("List1 is ");
        for (int i = 0; i < list1.length; i++) {
            System.out.printf("%d ", list1[i]);
        }
        System.out.println();
        
        System.out.print("List2 is ");
        for (int i = 0; i < list2.length; i++) {
            System.out.printf("%d ", list2[i]);
        }
        System.out.println();

        // output merged list
        System.out.print("the merge list is ");
        for (int i = 0; i < mergedList.length; i++) {
            System.out.printf("%d ", mergedList[i]);
        }

        // close scanner object
        scan.close();
    }

    public static int[] merge(int[] list1, int[] list2) {
        // Create the merge list 
        int[] merge = new int[list1.length + list2.length];
        int m = 0, l1 = 0, l2 = 0;
        boolean isList1Finished = false;
        boolean isL2Finished = false;

        do {
            if (l1 == list1.length) {
                isList1Finished = true;
            } 
            if (l2 == list2.length) {
                isL2Finished = true;
            } 

            if (isList1Finished && isL2Finished) {
                break;
            }

            if (!isList1Finished && isL2Finished) {
                merge[m++] = list1[l1++];
            }
            else if (!isL2Finished && isList1Finished) {
                merge[m++] = list2[l2++];
            }
            else if (list1[l1] <= list2[l2]) { 
                merge[m++] = list1[l1++];
            }
            else if (list2[l2] <= list1[l1]) {
                merge[m++] = list2[l2++];
            }

        } while (!isList1Finished || !isL2Finished);

        return merge;
    }


}
