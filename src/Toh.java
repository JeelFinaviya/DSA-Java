import java.util.Scanner;

class Toh {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Of rings.");
        int n = sc.nextInt();
        Tower t = new Tower();
        t.toh(n,'A','C','B');
    }
}
class Tower{
    void toh(int n,char fromRow , char toRow , char auxRow){
        if(n==1){
            System.out.println("Take rod "+n+" from "+ fromRow+" to "+toRow);
        }else{
            toh(n-1,fromRow,auxRow,toRow);
            System.out.println("Take rod "+n+" from "+fromRow+" to "+toRow);
            toh(n-1,auxRow,toRow,fromRow);
        }
    }
}
