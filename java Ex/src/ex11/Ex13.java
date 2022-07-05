package ex11;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

public class Ex13 {
    public static void main(String args[]) throws Exception
    {
        SutdaDeck deck = new SutdaDeck();
        deck.shuffle();
        Player[] pArr = {
                new Player("타짜", deck.pick(), deck.pick()),
                new Player("고수", deck.pick(), deck.pick()),
                new Player("물주", deck.pick(), deck.pick()),
                new Player("중수", deck.pick(), deck.pick()),
                new Player("하수", deck.pick(), deck.pick())
        };
        TreeMap rank = new TreeMap(new Comparator<Player>(){
            public int compare(Player p1, Player p2) {
                return deck.getPoint(p2) - deck.getPoint(p1);
            }
        });
        for(int i=0; i < pArr.length;i++) {
            Player p = pArr[i];
            rank.put(p, deck.getPoint(p));
            System.out.println(p+" "+deck.getPoint(p));
        }
        System.out.println();
        System.out.println("1위는 "+rank.firstKey()+"입니다.");
        System.out.println(rank);
    }
}
