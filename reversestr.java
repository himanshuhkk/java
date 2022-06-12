import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class reversestr {
    public static void main(String [] args) throws IOException{
        System.out.println("enter a string ");
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String s = r.readLine();
        System.out.println("The reversed String is : " + reverse(s));
    }
    public static String reverse(String s){
        StringBuilder sb = new StringBuilder();
        if(s == null){
            throw new IllegalArgumentException("String is empty");
        }
        else{
            char [] ch = s.toCharArray();
            for(int i = ch.length - 1; i>=0; i--){
                sb.append(ch[i]);
            }
        }
        return sb.toString();
    }
}
