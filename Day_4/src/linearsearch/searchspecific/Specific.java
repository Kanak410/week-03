package linearsearch.searchspecific;

public class Specific {
    public static String searchelement(String []s,String w){
        for(String f:s){
            if (f.contains(w)) {

                return f;
            }
        }
        return "not found";
    }

}
