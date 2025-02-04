package stringbuilder.removeduplicate;

import java.util.*;

public class RemoveDup {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the string: ");
        String str=sc.nextLine();
       Logic ob =new Logic();
        String dup = ob.duplicate(str);
        System.out.println(dup);

    }
}
