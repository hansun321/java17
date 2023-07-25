package sec4;

import java.util.Arrays;

public class StringEx3 {
    public static void main(String[] args) {
        String str1 = new String();
        str1 += "서광";
        str1 += "/";
        str1 += "이은영";
        str1 += "/";
        str1 += "한선";
        str1 += "/";
        str1 += "이소윤";
        System.out.println(str1);

        StringBuffer str2 = new StringBuffer();
        str2.append("신승원");
        str2.append("/");
        str2.append("오세훈");
        str2.append("/");
        str2.append("구예진");
        str2.append("/");
        str2.append("백준철");
        System.out.println(str2);
        str2.replace(0, 3, "김기태");
        System.out.println(str2);
        System.out.println(str2.toString());

        StringBuilder str3 = new StringBuilder();
        str3.append("황교진");
        str3.append("-");
        str3.append("이슬비");
        str3.append("-");
        str3.append("최상민");
        str3.append("-");
        str3.append("김이호");
        System.out.println(str3.toString());
        str3.insert(4, "박나연-");
        System.out.println(str3.toString());
        System.out.println(str3.substring(4, 7));
        System.out.println(str3.reverse());
        String str = str3.toString(); //String으로 형 변환
        String[] str4 = str.split("-");
        System.out.println(Arrays.toString(str4));
    }
}
