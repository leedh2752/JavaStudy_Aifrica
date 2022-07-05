package ex11;

import java.util.*;

import static ex11.Ex8.calculateSchoolRank;

public class Ex9 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("이자바", 2, 1, 70, 90, 70));
        list.add(new Student("안자바", 2, 2, 60, 100, 80));
        list.add(new Student("홍길동", 1, 3, 100, 100, 100));
        list.add(new Student("남궁성", 1, 1, 90, 70, 80));
        list.add(new Student("김자바", 1, 2, 80, 80, 90));

        calculateSchoolRank(list);
        calculateClassRank(list);
        Iterator<Student> it = list.iterator();
        while (it.hasNext())
            System.out.println(it.next());
    }

    public static void calculateClassRank(List<Student> list) {
// . 먼저 반별 총점기준 내림차순으로 정렬한다
        Collections.sort(list, new ClassTotalComparator());
        int prevBan = 0;
        int prevRank = 0;
        int prevTotal = 0;
        int length = list.size();
        for(Student s : list) {
            if(s.ban != prevBan) {
                prevRank = 0;
                prevTotal = 0;
                prevBan = s.ban;
            }
            if(s.total == prevTotal) {
                s.classRank = prevRank;
            } else {
                s.classRank = ++prevRank;
                prevTotal = s.total;
            }
        }
    } // public static void calculateClassRank(List list) {
    public static void calculateSchoolRank(List list) {
//        Collections.sort(list); // list . 먼저 를 총점기준 내림차순으로 정렬한다
//        int prevRank = -1; // 이전 전교등수
//        int prevTotal = -1; // 이전 총점
//        int length = list.size();
//        for(int i=0;i < length; i++) {
//            Student s = (Student)list.get(i);
//            if(s.total==prevTotal) {
//                s.schoolRank = prevRank;
//            } else {
//                s.schoolRank = i + 1;
//            }
//            prevRank = s.schoolRank;
//            prevTotal = s.total;
//        } // for
    }

}

class ClassTotalComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        int result = s1.ban - s2.ban;
        if(result == 0) {
            return s2.classRank - s1.classRank;
        }
        return result;
    }
}
