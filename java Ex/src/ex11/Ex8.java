package ex11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Ex8 {
    public static void calculateSchoolRank(List<Student> list) {
        Collections.sort(list); // list . 먼저 를 총점기준 내림차순으로 정렬한다
        int prevRank = 0; // 이전 전교등수
        int prevTotal = 0; // 이전 총점
        int length = list.size();
        for(Student s : list) {
            if(s.total == prevTotal) {
                s.schoolRank = prevRank;
                prevRank++;
            } else {
                s.schoolRank = ++prevRank;
            }
            prevTotal = s.total;
        }
    }
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("홍길동",1,3,100,100,50));
        list.add(new Student("남궁성",1,1,90,70,80));
        list.add(new Student("김자바",1,2,80,80,90));
        list.add(new Student("이자바",2,1,70,90,70));
        list.add(new Student("안자바",2,2,60,100,80));
        calculateSchoolRank(list);
        Iterator it = list.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }
}
