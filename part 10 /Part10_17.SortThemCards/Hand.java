
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import java.util.Iterator;
import java.util.List;

public class Hand implements Comparable<Hand> {

    private List<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void add(Card card) {
        this.cards.add(card);
    }

    public void print() {
        Iterator<Card> iterator = cards.iterator();
        while (iterator.hasNext()) {
            Card next = iterator.next();
            System.out.println(next);

        }

    }

    public void sort() {
        Collections.sort(this.cards);

    }

    public void sortBySuit() {
        Collections.sort(cards, new BySuitInValueOrder());

    }

    @Override
    public int compareTo(Hand other) {
        int hand1 = this.cards.stream()
                .map(c -> c.getValue())
                .reduce(0, (a, b) -> a + b);
        int hand2 = other.cards.stream()
                .map(c -> c.getValue())
                .reduce(0, (a, b) -> a + b);

        return hand1 - hand2;

    }

}
