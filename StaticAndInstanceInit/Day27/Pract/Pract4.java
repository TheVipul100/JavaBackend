package Pract;

class Temp {
    static final int X = 10;   // class load hone ke baad to execute ho rha he
    static final int Y = 20;  // this tells as a variable is made constant it skips the static block

    static {   // class load  lives in metaspace stores class metadata replaced permgenn in java 8
        System.out.println("T static");
    }
    //X=24;
}
public class Pract4 {
    public static void main(String[] args) {
            System.out.println(Temp.X);
        System.out.println(Temp.Y);
        }
}

//Where static variables really are
//
//Metaspace stores the description of the static field (name, type, where it sits).
//The value is stored in the Class object on the heap.
//For a static reference like static StringBuilder SB, the reference is in the Class object and the actual StringBuilder is also on the heap.

