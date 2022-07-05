package ex11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Ex7 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        list.add(new Student("홍길동",1,3,100,100,100));
        list.add(new Student("남궁성",1,1,90,70,80));
        list.add(new Student("김자바",1,2,80,80,90));
        list.add(new Student("이자바",2,1,70,90,70));
        list.add(new Student("안자바",2,2,60,100,80));

//        Collections.sort(list);
        Collections.sort(list, new BanNoAscending());
        Iterator it = list.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }
}

class BanNoAscending implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {

        int result = s1.ban - s2.ban;

        if(result == 0) {
            return s1.no - s2.no;
        }
        return result;
    }
}

