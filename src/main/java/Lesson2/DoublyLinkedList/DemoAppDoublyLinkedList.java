package Lesson2.DoublyLinkedList;

import java.util.ArrayList;
import java.util.List;

public class DemoAppDoublyLinkedList {

    public static void main(String[] args) {
        testLinkedList();

        List<Integer> lll = new ArrayList<>();

    }

    private static void testLinkedList() {
        DoublyLinkedList<Integer> list = new DoublyLinkedListImpl<>();

        list.insertHead(1);
        list.insertHead(2);
        list.insertHead(3);
        list.insertHead(4);
        list.insertTail(5);
        list.insertTail(6);
        System.out.println("Исходный список:");
        list.printList();
        System.out.println();

        System.out.println("Количество элементов в списке: " + list.size());
        System.out.println("Первый элемент: " + list.getFirst());
        System.out.println("Последний элемент: " + list.getLast());
        System.out.println("Поиск значения '2': " + list.contains(2));
        System.out.println("Поиск значения '100': " + list.contains(4444));
        System.out.println("Значение первого элемента списка: " + list.getFirst());
        System.out.println("Значение последнего элемента списка: " + list.getLast());
        System.out.println("Значение 4-го элемента списка: " + list.get(3)); // индексация от 0 ~> индекс 4-го элемента = 3
        System.out.println();

        System.out.println("Удалить первый элемент списка:");
        list.removeHead();
        list.printList();

        System.out.println("Удалить элемент со значением '2':");
        list.remove(2);
        list.printList();

        System.out.println("Удалить элемент с индексом 2:");
        list.removeByIndex(2);
        list.printList();

        System.out.println("Удалить последний элемент списка:");
        list.removeTail();
        list.printList();

        System.out.println();
        System.out.println("Удаление из пустого списка:");
        list = new DoublyLinkedListImpl<>();
        try {
            list.removeHead();
        } catch (UnsupportedOperationException e) {
            System.out.println("Удаление первого элемента невозможно, т.к. список пустой!");
        }
        try {
            list.removeTail();
        } catch (UnsupportedOperationException e) {
            System.out.println("Удаление последнего элемента невозможно, т.к. список пустой!");
        }

        System.out.println("Удаление несуществующего элемента, результат: " + list.remove(100)); // ожидаем false

        try {
            list.removeByIndex(4);      // ожидаем exception
        } catch (UnsupportedOperationException e) {
            System.out.println("Удаление заданного элемента невозможно, т.к. список пустой!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Элемента с таким индексом нет в списке!");
        }
    }
}
