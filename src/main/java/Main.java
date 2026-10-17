
public class Main {

    public static void main(String[] args) {

        Cookie cookieOne = new Cookie ("green");
        Cookie cookieTwo = new Cookie ("blue");


        System.out.println(cookieOne.getColor());
        System.out.println(cookieTwo.getColor());
    }

    /*
     * Common methods in DS:
     * public class LinkedList {
     *  public LinkedList(int value) {...}
     *
     * public void append (int value) {...}
     *
     * public Node removeLast () {...}
     *
     * public void prepend (int value) {...}
     *
     * public boolean insert (int index, int value) {...}
     *
     * public Node remove (int index) {...}
     *
     *  */


    /**
     * Variables vs References in JAVA:
     * Variables:
     * ex:
     * int num1 = 11; #(num1 holds a value 11)
     * int num2 = num1; # (this means num2 = num1 = 11)
     * if we change num1 to 22, num2 will still stay 11
     *
     *
     * References:
     * map1 = {
     *     "value" = 11
     * }
     *
     * this means that map1 holds an address that points to the hashmaps, that means it holds a reference
     *
     * if we do map1 = map2, then that'd mean map2 is pointing to the same hash map in the memory
     *
     * Now, if we change the value of map1 to 22, map2s value will also be changed to 22.
     *
     *
     * Now, if we add another hashmap, map3, then:
     *
     * map3 = {
     *     "value" = 33;
     * }
     *
     * and we say map2 = map3 and map1 = map2, then this'd mean that map1, map2 and map3 point to the value 33
     *
     * with this being said, the value 11 is orphaned and will hence be picked up for Garbage collection as it's
     * occupying space in memory and there's no pointers to that in memory.
     *
     *
     * */

}