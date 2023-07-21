package sec1;

import java.util.ArrayList;
import java.util.List;

//컬렉션 프레임워크(Collection Framework) : 여러 데이터의 모음을 저장할 자료구조 틀
//Stack, Queue, Deque, Set, Map, List,...
//List : 데이터의 순서가 있고, 데이터 중복이 허용되며, 순서 유지가 됨. -> *ArrayList, Vector, LinkedList
//Set : 일반적인 집합을 말하며, 순서 유지가 되지 않지만, 데이터 중복 허용되지 않음 -> *HashSet, TreeSet
//Map : 키와 값을 쌍으로 저장, 키의 중복은 허용되지 않지만, 값은 중복이 허용됨 -> *HashMap, HashTable, TreeMap, +Properties
// 1:{"kor":100, "eng":100, "mat":100}, 2:{"kor":100, "eng":100, "mat":100}..,,,..
//Stack : 일반적인 데이터, 최신의 데이터를 저장하는 자료구조로 데이터 입출력이 LIFO 로서 데이터 거꾸로 진행되는 자료구조임
//Queue : 데이터 입출력이 FIFO 로서 순서대로 진행되는 자료구조로 CPU 스케줄링 -> 쓰레드의 우선순위 또는 발생순으로 처리
//Deque : FIFO/LIFO 운영방식이 모두 가능한 자료구조
public class ListEx1 {
    public static void main(String[] args) {
        String[] author = {"신승원", "김승원", "박승원", "이승원", "최승원", "정승원"};
        List<Board> lst = new ArrayList<>();
        Board bd1;
        for (int i = 1; i < 6; i++) {
            bd1 = new Board();
            bd1.setNo(i);
            bd1.setTitle("더미 제목" + i);
            bd1.setContent("더미 글 내용" + i);
            bd1.setAuthor(author[i]);
            bd1.setResdate("2023-07-19");
            lst.add(bd1);
        }
        prt(lst);
    }

    public static void prt(List<Board> lst) {
        for (Board bd : lst) {
            System.out.println("글번호 : " + bd.getNo());
            System.out.println("글제목 : " + bd.getTitle());
            System.out.println("작성자 : " + bd.getAuthor());
            System.out.println("작성일 : " + bd.getResdate());
        }
    }
}
