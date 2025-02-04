package stringbuffer.concatenatedstring;

public class Concatenate {
    public String concate(String[]s){
        StringBuffer sf=new StringBuffer();
        for(int i=0;i<s.length;i++){
            sf.append(s[i]);

        }
        return  sf.toString();
    }
}
