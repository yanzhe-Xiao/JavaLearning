package com.xyz.Object.oil;

public class GoldCard extends Card{
    public GoldCard(int id, String name, String phone, double balance) {
        if (balance < 5000.0){
//            System.out.println("余额不足，无法创建黄金会员卡");
            throw new RuntimeException("余额不足，无法创建黄金会员卡");
        }
        super(id, name, phone, balance);
//        super(0, "黄金会员", "1234567890", initialBalance);
    }

}
