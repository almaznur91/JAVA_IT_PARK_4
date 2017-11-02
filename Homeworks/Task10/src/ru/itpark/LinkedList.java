package ru.itpark;

public class LinkedList implements List {

    // указатель на начало списка
    private Node head;

    // указатель на конец списка
    private Node tail;

    private int count;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.count = 0;
    }

    @Override
    public void add(Object element) {
        Node newNode = new Node(element);
        if (tail == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        count++;
//    // создаем новый узел
//    Node newNode = new Node(element);
//    // заводим бегунок, который будет
//    // бегать по элементам списка
//    // начиная с первого
//    Node currentNode = head;
//    // пока после текущего есть элементы
//    // смещаем бегунок дальше
//    while (currentNode.next != null) {
//      currentNode = currentNode.next;
//    }
//    // когда элементы закончились,
//    // новый элемент будет следующим после
//    // последнего
//    currentNode.next = newNode;
    }

    @Override
    public void addToBegin(Object object) {
        Node newNode = new Node(object);

        if (head == null) {
            tail = newNode;
        }

        // для нового узла следующий элемент -
        // тот, который был первым в списке
        newNode.next = head;
        // теперь первый элемент списка - новый
        head = newNode;
        count++;
    }

    @Override
    public Object get(int index) {
        if (index < 0 && index >= count) {
            throw new IllegalArgumentException();
        }
        // начинаем с первого элемнта
        Node currentNode = head;
        // пока i меньше, чем index идем дальше
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        // значение currentNode
        return currentNode.value;
    }

    @Override
    public void remove(Object object) {

<<<<<<< HEAD
        if (object.equals(head.value)) {
            head = head.next;
            count--;
        } else {

            Node currentNode = head;
            for (int i = 1; i < count; i++) {

                if (object.equals(currentNode.next.value)) {
                    currentNode.next = currentNode.next.next;
                    count--;
                    break;
                }
                currentNode = currentNode.next;
            }
        }
    }


    @Override
    public int indexOf(Object object) {
        return 0;
=======

    }

    @Override
    public int indexOf(Object object) {
        Node currentnode=head;
        int cound=0;
        while (currentnode!=null){
        if (object.equals(currentnode.value)){
            return cound;
        }
        cound++;
        currentnode=currentnode.next;}

        return -1;
>>>>>>> b132824fdb44c5855147292c2ce7c3215c9657fc
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public Iterator iterator() {
        return new LinkedListIterator();
    }

<<<<<<< HEAD
=======

>>>>>>> b132824fdb44c5855147292c2ce7c3215c9657fc
    private class LinkedListIterator implements Iterator {

        private Node currentNode = head;

        @Override
        public Object next() {
            Object element = currentNode.value;
            currentNode = currentNode.next;
            return element;
        }

        @Override
        public boolean hasNext() {
            return currentNode != null;
        }
    }

    private static class Node {
        // значение, которое хранит узел
        Object value;
        // указатель на следующий узел
        Node next;

        Node(Object value) {
            this.value = value;
        }
    }


}
