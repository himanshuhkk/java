public class stack_array {
    static final int N = 100;
    int a[] = new int [N];
    int top;
    boolean isEmpty(){
        return (top<0);
    }
    stack_array(){
        top=-1;
    }
    void push(int x){
        if(top >= N-1){
            System.out.println("stack is full");
        }
        else{
            a[++top] = x;
            System.out.println("element " + x + " is inserted");
        }
    }
    void pop(){
        if(top<0){
            System.out.println("stack is empty");
        }
        else{
            int x = a[top--];
            System.out.println(x + " poped from stack");
        }
    }
    void peek(){
        if(top<0){
            System.out.println("stack is empty");
        }
        System.out.println("peek is " + a[top]);
    }
    void display(){
        while(top>0){
            System.out.println("elements in stack are " + a[top]);
            top--;
        }
    }
    public static void main(String[] args) {
        stack_array s = new stack_array();
        s.push(3);
        s.peek();
        s.push(5);
        s.pop();
        s.push(7);
        s.display();

    }
}
