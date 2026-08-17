import java.util.Scanner;

class Push {
    int top=-1,n;
    int[] s;

    Push(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of Stack");
        int n = sc.nextInt();
        s= new int[n];
    }
    void push(int x1) {
        if (top == n - 1) {
            System.out.println("overflow");
        } else {
            top++;
            s[top] = x1;
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Underflow");
        } else {
            System.out.println(s[top] + " Pop");
            top--;
        }
    }

    void peep(int i) {
        if (top - i + 1 <= -1) {
            System.out.println("Underflow");
        } else {
            System.out.println(s[top - i + 1]);
        }
    }

    void change(int i, int x) {
        if (top - i + 1 <= -1) {
            System.out.println("Underflow");
        } else {
            s[top - i + 1] = x;
            System.out.println(x);
        }
    }
}
    class Hello{
        public static void main(String[] args) {
            Push p = new Push();
            p.push(12);
            p.pop();
        }
    }
