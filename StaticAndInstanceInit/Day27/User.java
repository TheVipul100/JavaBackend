class StaticInit {

    String username;
    String userId;
    String mobileNo;


    public StaticInit(String username, String userId, String mobileNo) {

        super();// either super or this()
        System.out.println(username + " " + userId + " " + mobileNo);
        this.username = username;
        this.userId = userId;
        this.mobileNo = mobileNo;


    }

    static{ // static 1st execution just after the class is loaded (obj created ---- )except print statement before it
        System.out.println("static block starts.....");

        for(int i=1;i<=5;i++)
            System.out.print(i + " ");
        System.out.println();
        System.out.println("static block ends");

        while(true){
            System.out.println("dghdb");
            break;
        }

    }
}

public class User{
    static void main(String[] args) {


        System.out.println("welcome");
        StaticInit obj =new StaticInit("vipul", "23456" , "2334546587");
        StaticInit obj1 = new StaticInit("rohan", "245" , "243476545");

    }
}
