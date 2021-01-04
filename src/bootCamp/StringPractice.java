package bootCamp;

public class StringPractice {

    public static void main(String[] args) {
        // String is immutable of char sequence
        String str = new String("Batch 20");
        // all the object is stored in the Heap
        String str2 = "Batch 20";
        str2.concat(" is the best");
        System.out.println(str2);
        // String literal is inside the heap inside String pool that is the reason they are Immutable

        // the non mutable version of char sequence is String Builder and String Buffer
        StringBuilder sBuilder = new StringBuilder("Batch 20");
        //StringBuilder sBuilder1 = "Batch 20"; you can not create string builder literal
        sBuilder.append(" is the best");
        System.out.println(sBuilder);
        //Builder : not Thread-safe, is faster than Buffer
        //Buffer : Thread Safety it is Synchronized

        StringBuffer sBuffer = new StringBuffer("Batch 20");
        sBuffer.append(" is the best");
        System.out.println(sBuffer);
    }
}
