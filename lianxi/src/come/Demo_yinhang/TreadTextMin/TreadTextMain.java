package come.Demo_yinhang.TreadTextMin;

import come.Demo_yinhang.ATM.ATM;
import come.Demo_yinhang.User.User;

import java.util.ArrayList;
import java.util.List;

public class TreadTextMain {
    public static void main(String[] args) throws Exception {
        User u = new User("赵云", "132466", "123", "100");
        User uu = new User("鲁班", "4600882", "123", "0");
        List<User> list = new ArrayList<>();
        list.add(u);
        list.add(uu);
        ATM atm = new ATM(list);//初始化数据 模拟
        Thread t = new Thread() {
            public void run() {
//                ATM atm = new ATM(list);
                for (int i = 0; i < 20; i++) {
                    atm.saveMoney("132466", "123", "12");
                    atm.delayTime(250);
                    atm.getMoney("4600882", "123", "14");
                    atm.delayTime(250);
                }
//                atm.balanceEnquiry("4600882", "123");
//                atm.balanceEnquiry("132466", "123");
            }
        };

        Thread tt = new Thread() {
            public void run() {
//                ATM atm = new ATM(list);
                for (int i = 0; i < 20; i++) {
                    atm.getMoney("132466", "123", "2");
                    atm.delayTime(250);
                    atm.saveMoney("4600882", "123", "12");
                    atm.delayTime(250);
                }
//                atm.balanceEnquiry("4600882", "123");
//                atm.balanceEnquiry("132466", "123");

            }
        };
        t.start();
        tt.start();
//        atm.balanceEnquiry("4600882", "123");
//        atm.balanceEnquiry("132466", "123");
    }
}

