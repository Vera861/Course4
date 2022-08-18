package Lesson2.ArrayList;

import java.util.*;
import java.util.function.UnaryOperator;

public interface CustomArrayList<E> {
    int size();
    boolean isEmpty();
    boolean contains(Object o);
    Object[] toArray();

    boolean add(E value);
    boolean removeValue(Object o);
    void clear();

    void trimCapacity();

    E get(int index);
    E set(int index, E value);
    boolean add(int index, E value);
    E remove(int index);

    // Search Operations
    int indexOf(Object o);
}
