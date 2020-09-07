package org.pg4200.ex03;

import java.util.Comparator;

public class SuperComparator<T> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        if(o1 instanceof GameUser && o2 instanceof GameUser) {
            compare ((GameUser) o1, (GameUser) o2);
        }
        return 0;
    }


    public int compare(GameUser o1, GameUser o2) {

        if(o1.getPoints() < o2.getPoints()) return -1;
        else if(o1.getPoints() > o2.getPoints()) return 1;
        else {
            return o1.getUserId().compareTo(o2.getUserId());
        }
    }
}
