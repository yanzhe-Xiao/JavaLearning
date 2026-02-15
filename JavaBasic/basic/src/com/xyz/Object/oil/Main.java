package com.xyz.Object.oil;

public class Main {
    public static void main(String[] args) {
        try {
            GoldCard goldCard = new GoldCard(1, "张三", "1234567890", 6000.0);
//            System.out.println("黄金会员卡创建成功: " + goldCard.getName());
            System.out.println("goldCard = " + goldCard);
            SilverCard silverCard = new SilverCard(2, "李四", "0987654321", 3000.0);
//            System.out.println("白银会员卡创建成功: " + silverCard.getName());
            System.out.println("silverCard = " + silverCard);
            CardService cardService = new CardService();
            cardService.addCard(goldCard);
            cardService.addCard(silverCard);

            cardService.show();

            cardService.pay(1, 1000.0); // 黄金会员卡支付1000元
            System.out.println("黄金会员卡支付成功，剩余余额: " + goldCard.getBalance());
            cardService.pay(2, 1000.0); // 白银会员卡支付1000元
            System.out.println("白银会员卡支付成功，剩余余额: " + silverCard.getBalance());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        GoldCard goldCard = new GoldCard(1, "张三", "1234567890", 4999);
        System.out.println("黄金会员卡创建成功: " + goldCard.getName());
    }


}
