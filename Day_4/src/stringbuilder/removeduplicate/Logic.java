package stringbuilder.removeduplicate;

import java.util.HashSet;

public class Logic {
    public  String duplicate(String s){
        StringBuilder sb=new StringBuilder("");
        HashSet<Character> h=new HashSet<>();
        for(int i=0;i<s.length();i++){
            char current=s.charAt(i);
            if(!h.contains(current)){
                sb.append(current);
                h.add(current);
            }

        }
        return sb.toString();
    }
}
