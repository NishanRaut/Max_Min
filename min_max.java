import java.util.Scanner;

public class min_max{
    
    public static void main(String args[]){
        
        Scanner input=new Scanner(System.in);
        int length,number,max,min;
        System.out.println("Enter the length of an array: ");
        length=input.nextInt();
        int arr[]=new int[length];
        System.out.println("Enter Number: ");
        for(int i=0;i<arr.length;i++){
            number=input.nextInt();
            arr[i]=number;
        }
        max=arr[0];
        min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max>arr[i]){
                max=arr[i];
            }
            if(min<arr[i]){
                min=arr[i];
            }
        }
        System.out.println("Maximiun Number from the given array is: "+max);
        System.out.println("Minimum Number from the given array is: "+min);
    }
}