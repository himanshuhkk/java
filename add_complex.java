public class add_complex {
    int real;
    int imag;
    public add_complex(int r , int i){
        this.real = r;
        this.imag = i;
    }
    public static add_complex addComplex(add_complex o1 , add_complex o2){
        add_complex c = new add_complex(0,0);
        c.real = o1.real + o2.real;
        c.imag = o1.imag + o2.imag;
        return c;
    }
    public void display(){
        System.out.println(this.real + "+" +  "i " + this.imag);
    }
    public static void main(String[] args) {
        add_complex C1 = new add_complex(2, 4);
        add_complex C2 = new add_complex(6, 6);
        addComplex(C1, C2);
        add_complex res = addComplex(C1 , C2);
        res.display();


    }
}
