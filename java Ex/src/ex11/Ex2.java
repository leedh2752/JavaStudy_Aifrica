package ex11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;
import java.util.TreeSet;

public class Ex2 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(3);
        list.add(6);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(7);
        HashSet set = new HashSet(list); // 3 6 2 7
        TreeSet tset = new TreeSet(set); // 2 3 6 7
        Stack stack = new Stack(); // 2 3 6 7순으로 저장되고 stack은 LIFO 이기에 7 6 3 2 로 나옴
        stack.addAll(tset);
        while(!stack.empty())
            System.out.println(stack.pop());
    }
}
