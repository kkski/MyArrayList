public class Main01 {
    public static void main(String[] args) {
//        ObjectList objects = new ObjectList();
//        objects.add("1");
//        objects.add("2");
//        objects.add("3");
//        objects.remove("1");
//        System.out.println(objects.get(0));
//        objects.addAsFirst(9);
//        System.out.println(objects.get(0));
//        objects.removeAll();
//        System.out.println(objects.get(0));


        ObjectLinkedList objects = new ObjectLinkedList();
        objects.add("marek");
        System.out.println(objects.getSize());
        ObjectLinkedList.Node witam = objects.getHead();
        System.out.println(witam.getData());
        objects.add("witam");
        System.out.println(objects.getSize());
        witam = objects.getHead();
        ObjectLinkedList.Node data = witam.getNext();
        System.out.println(data.getData());
        objects.add("marek2");
        System.out.println(objects.getSize());
    }

}
