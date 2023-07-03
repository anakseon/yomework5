import java.util.LinkedList;

public class homework5<list, str4> {
     public static void main(String[] args) {
        String str1 = new String("Hello World!");
       String str2 = new String("My name is Earl");
       String str3 = new String("I love Java");
       String str4 = new String("I live in Moscow");

       LinkedList<String> earlBio = new LinkedList<>();
       earlBio.add(str1);
       earlBio.add(str2);
       earlBio.add(str3);
       earlBio.add(str4);

       System.out.println(earlBio);
earlBio = reverseLinkedList(earlBio);
        System.out.print("\nElements after reversing: " + earlBio);
    }
    private static LinkedList<String> reverseLinkedList(LinkedList<String> earlBio) {
        return null;
    }
   public static class Queue<str2> {
       String str1 = new String("Hello World!");
       String str2 = new String("My name is Earl");
       String str3 = new String("I love Java");
       String str4 = new String("I live in Moscow");
        LinkedList<String> list = new LinkedList<>();
    public void enqueue(String str4) {
        Queue.addLast(str4);
    }
    private static void addLast(String str4) {
    }
    public str2 dequeue(){
        return Queue.pollFirst(str2);
    }
    
    private  str2 pollFirst(String str2) {
        return null;
    }
    public str3 first() {
        return Queue.peekFirst();
    }
    private static <str3> str3 peekFirst() {
        return null;
    }
    }  
} 