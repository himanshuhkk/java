import javax.lang.model.util.ElementScanner6;

//import javax.swing.plaf.synth.SynthScrollBarUI;

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;

// public class ways_input {
//     public static void main(String[] args) throws IOException {
//         BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
//         String text = r.readLine();
//         System.out.println(text);
//     }
// }

//2nd method by scanner class using nextline or nextint or nextfloat etc.

// public class ways_input{
//     public static void main(String[] args) {
//         String text = System.console().readLine();
//         System.out.println(text);
//     }
    
// }

public class ways_input{
    public static void main(String[] args) {
        if(args.length>0){
            System.out.println("command line arguments are :- ");
            for(String s: args)
            System.out.println(s);
        }
        else{
            System.out.println("no cmd argmnts");
        }
        
    }
}


