package com.xyz.Object.oil;

public class SilverCard extends Card {
    public SilverCard(int id, String name, String phone, double balance) {
        if (balance < 2000.0){
            throw new RuntimeException("余额不足，无法创建白银会员卡");
        }
        super(id, name, phone, balance);
    }
}
