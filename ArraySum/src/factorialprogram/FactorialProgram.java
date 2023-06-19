package factorialprogram;

public class FactorialProgram {
    public static void main(String[] args) {
        int a=1;
        int num=5;
        for(int i=0; i<=5; i++){
            a=a*num;
        }
        System.out.println("factorial number:"+a);
    }
}
