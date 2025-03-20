import java.util.Scanner;

public class ArrayInsertionManual {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

       
        System.out.println("Enter the size of the array");
        int n = scn.nextInt();

        int[] arr = new int[n];

        
        System.out.println("Enter the array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        
        System.out.println("Enter the element to be inserted at the beginning");
        int firstElement = scn.nextInt();

        System.out.println("Enter the element to be inserted at the end");
        int lastElement = scn.nextInt();

        
        System.out.println("Enter the index where you want to insert a new element");
        int specificIndex = scn.nextInt();

        

        System.out.println("Enter the element to insert at index " + specificIndex);
        int specificElement = scn.nextInt();

        
        int newSize = arr.length + 3;
        int[] newArr = new int[newSize];

       
        newArr[0] = firstElement;

        
        for (int i = 0; i < specificIndex; i++) {
            newArr[i + 1] = arr[i]; 
        }

        
        newArr[specificIndex + 1] = specificElement;

        
        for (int i = specificIndex; i < arr.length; i++) {
            newArr[i + 2] = arr[i]; 
        }

        
        newArr[newSize - 1] = lastElement;

        
        System.out.print("Updated Array: ");
        for (int num : newArr) {
            System.out.print(num + " ");
        }

        scn.close();
    }
}
