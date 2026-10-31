package Netflix_Subscription;

public class Driver {
    static void main(String[] args) {
//
          BasicPlan basic = new BasicPlan("1", 199);
          basic.basicPlan();
//
          StandardPlan std = new StandardPlan("2", 299);
          std.strdPlan();
          ProPlan pro = new ProPlan("3", 499);
          pro.proPlan();

          Subscription sb = new Subscription("0",0);
          sb.displayPlan();

//           Subscription[] subs ={basic , std, pro};
//
//           int count = 0;
//           for(Subscription s : subs)
//           {
//               count++;
//               System.out.println("count" + count);
//               s.displayPlan();
//           }
    }
}
