public class vowelStr {
    public static void main(String[] args) {
        String s = "rhythm" ;
        boolean ifPresent = contains(s);  
        if(ifPresent){
            System.out.println("vowel is present in the given String");
        }    
        else{
            System.out.println("vowel is not present in the given String");
        }
    }
    static boolean contains(String s){
        return s.toLowerCase().matches(".*[aeiou].*");
    }
}
