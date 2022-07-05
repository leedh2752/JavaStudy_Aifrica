package ex11;

public class Student implements Comparable {
    String name;
    int ban;
    int no;
    int kor, eng, math;

    int total, schoolRank, classRank;

    Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;

        total = kor + eng + math;
    }

    int getTotal() {
        return total;
    }

    float getAverage() {
        return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
    }

    public String toString() {
        return name +
                ", " + ban +
                ", " + no +
                ", " + kor +
                ", " + eng +
                ", " + math +
                ", " + getTotal() +
                ", " + getAverage() +
                ", " + schoolRank +
                ", " + classRank;
    }

    // 이름 순 정렬
//    public int compareTo(Object obj) {
//        if (obj instanceof Student) {
//            Student s = (Student) obj;
//            return name.compareTo(s.name);
//        } else {
//            return -1;
//        }
//    }

    public int compareTo(Object obj) {
        if(obj instanceof Student) {
            return ((Student) obj).total - total; //내림차순 - param값이 더 크면 return 양수가 되고 양수가 리턴되면 값이 바뀐다.
        } else {
            return -1;
        }
    }
}
