 class UseCase {

      String userId;
      String userName;
      String type;
      static int liveUserCount =0;

      public UseCase(String userId,String userName,String type){
          super();
          this.userId=userId;
          this.userName=userName;
          this.type=type;
      }

    public UseCase(String userName,String type) {
        this.type=type;
        this.userName = userName;
    }

    {
        liveUserCount +=1;
    }
}

public class Driver
{
    static void main(String[] args) {

        for(int i=1;i<=10;i++)
        {
            new UseCase("user" , "paid");
        }

        UseCase use = new UseCase("1234","vipul","free");
        System.out.println(UseCase.liveUserCount);

    }
}
