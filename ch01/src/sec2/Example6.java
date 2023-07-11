package sec2;

public class Example6 {
    public static void main(String[] args) {
        int a = 100;                                        //10진수
        int b = 0b100; //실제 연산과 논리연산 등을 수행         //2진수
        int c = 0100; //권한 부여 및 수행, 회수              //8진수
        int d = 0x100; //실제 물리적 주소 또는 메모리 주소    //16진수
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        System.out.println("d="+d);

    }
}
