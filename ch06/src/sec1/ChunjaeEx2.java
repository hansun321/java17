package sec1;

public class ChunjaeEx2 {
    public static void main(String[] args) {
        Chunjae c1 = new Chunjae();

        //c1.no = 10; - private이므로 같은 클래스 내부에서만 접근 가능하므로 접근 불가
        c1.partNo = 1234; //default이므로 같은 패키지에서만 접근 가능하므로 접근 가능
        c1.point = 200; //protected이므로 같은 패키지에 있거나 상속 관계에 있을 때만 가능하므로 접근 가능
        c1.name = "김기태"; //public이므로 어느 패키지나 클래스에 관계없이 모두 접근 가능하므로 접근 가능
        System.out.println(Chunjae.PI * 20 * 20);
        //public > protected > default > private
        Sehun s1 = new Sehun(); //같은 패키지에 있는 클래스이므로 사용 가능
        Chanwon ch1 = new Chanwon();

        Sehun[] s = new Sehun[10]; //객체 배열 s[0], s[1] ~ s[9]
        //s[0].num ~ s[9].num
        //s[0].data ~ s[9].data

        for (int a = 0; a < s.length; a++) {
            s[a] = new Sehun();
            s[a].setNum(a + 1);
            s[a].setData("세훈" + (a + 1));
        }

        for (int a = 0; a < s.length; a++) {
            System.out.println(s[a].getNum());
            System.out.println(s[a].getData());
            System.out.println("-----------------------");
        }

    }
}
