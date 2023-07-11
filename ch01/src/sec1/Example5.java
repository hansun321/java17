package sec1;

public class Example5 {
    public static void main(String[] args) {
        byte b1 = 104;
        //byte b2 = -129;   //해당 표현범위보다 작음(언더플로우)
        //byte b3 = 128;    //해당 표현범위보다 크면(오버플로우)
        char c1 = 'k'; //0~65535
        //char c2 = -1;         //언더플로우
        //char c3 = 65536;      //오버플로우
        short s1 = 365;
        //short s2 = -32769;    //언더플로우
        //short s3 = 32768;     //오버플로우
        int i1 = 34;
        //int i2 = -2147483649; //언더플로우
        //int i3 = 2147483648;  //오버플로우
        long l1 = 21474836473L;
        //long l2 = -9223372036854775809L;  //언더플로우
        //long l3 = 9223372036854775808L;   //오버플로우
        float f1 = 3.14f;
        //float f2 = 1.4e-46f;          //언더플로우
        //float f3 = 3.4028235e+39f     //오버플로우
        double d1 = 3.141592;
        //double d2 = 4.9e-325                  //언더플로우
        //double d3 = 1.7976931348623157e+309;  //오버플로우
    }
}
