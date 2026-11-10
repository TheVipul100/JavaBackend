package Pract;

class A {

    int a = 5;
    {
        a = 10;
        System.out.println("block a = " + a);  //10
    }
    A()
    {  // a value updated in instance block 10
        System.out.println("constructor a = " + a);
        a = 20;  // this again updates a to 20
    }
}
public class Pract5 {
    static void main(String[] args) {
          A obj = new A();
      //  System.out.println(obj.a);  // updated a 20
        System.out.println(new A());   // Filename.address(hashcode)
    }
}



// o/p == obj a
// 10
// 10
// 20