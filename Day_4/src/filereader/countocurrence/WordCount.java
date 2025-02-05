package filereader.countocurrence;
import java.io.*;
import java.util.*;
public class WordCount {

    public static void main(String[] args) {
        String filename="D:\\week-03\\Day_4\\src\\filereader\\countocurrence\\MyFile";

            Scanner sc=new Scanner(System.in);
            System.out.println("enter the size of array");
            int n=sc.nextInt();
            System.out.println("enter the  array");
            String arr []=new String [n];
            for(int i=0;i< arr.length;i++){
                arr[i]=sc.next();
            }
        System.out.println(Logic.countoccur(arr));
    }
}
