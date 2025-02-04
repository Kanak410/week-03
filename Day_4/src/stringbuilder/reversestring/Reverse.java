package stringbuilder.reversestring;

public class Reverse {
    public static void main(String[] args) {
        String s="hello";

        //Create a new StringBuilder object.
        StringBuilder sb=new StringBuilder();

        //Append the string to the StringBuilder
        sb.append(s);

        // reverse the string
        //System.out.println(sb.reverse());

        //Convert the StringBuilder back to a string
        System.out.println(sb.reverse().toString());

    }
}
