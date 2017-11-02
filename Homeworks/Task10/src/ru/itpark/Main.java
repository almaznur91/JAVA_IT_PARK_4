package ru.itpark;

public class Main {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("First");
        linkedList.add("Second");
        linkedList.add("Third");
        linkedList.add("Fourth");
        linkedList.add("Fifth");
        linkedList.addToBegin("Zeroth");
<<<<<<< HEAD
=======
        System.out.println(linkedList.indexOf("3"));
>>>>>>> b132824fdb44c5855147292c2ce7c3215c9657fc

//        for (int i = 0; i < linkedList.size(); i++) {
//            System.out.println(linkedList.get(i));
//        }
<<<<<<< HEAD
        linkedList.remove("Zeroth");
=======
>>>>>>> b132824fdb44c5855147292c2ce7c3215c9657fc

        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
