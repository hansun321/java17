package sec1;


class Chanwon { //생성자에 의한 접근
    private int seq;
    private int data;

    public Chanwon() {
        this(1);
    }

    public Chanwon(int seq) {
        this(seq, 100);
    }

    public Chanwon(int seq, int data) {
        this.seq = seq;
        this.data = data;
    }
}

class Sehun { //getter/setter에 의한 접근
    private int num;
    private String Data;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getData() {
        return Data;
    }

    public void setData(String data) {
        Data = data;
    }
}

public class Chunjae {
    //멤버 필드 = 변수, 상수
    private int no;
    protected int point;
    int partNo;
    public String name;
    public final static double PI = 3.141592; //상수

    public void setValue(int no) { //private 멤버는 클래스 내부에서만 this로 접근 가능
        this.no = no;
    }
}
