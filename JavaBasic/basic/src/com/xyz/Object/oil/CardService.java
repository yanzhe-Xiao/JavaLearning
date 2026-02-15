package com.xyz.Object.oil;

import java.util.ArrayList;

public class CardService {
    private final ArrayList<Card> cards = new ArrayList<>();

    public void addCard(Card card) {
        cards.add(card);
    }

    public Card getCardById(int id) {
        for (Card card : cards) {
            if (card.getId() == id) {
                return card;
            }
        }
        return null; // 如果没有找到对应的会员卡，返回null
    }

    public void pay(int cardId, double amount) {
        Card card = getCardById(cardId);
        if (card == null) {
            throw new RuntimeException("会员卡不存在");
        }
        if(card instanceof GoldCard){
            if(card.getBalance() < amount * 0.8){
                throw new RuntimeException("余额不足，无法支付");
            }
            card.setBalance(card.getBalance() - amount * 0.8);
            if(amount >= 200){
                System.out.println("提供打印免费洗车服务");
            }
        }
        else if(card instanceof SilverCard){
            if(card.getBalance() < amount * 0.9){
                throw new RuntimeException("余额不足，无法支付");
            }
            card.setBalance(card.getBalance() - amount * 0.9);
        }
        else {
            if(card.getBalance() < amount){
                throw new RuntimeException("余额不足，无法支付");
            }
            card.setBalance(card.getBalance() - amount);
        }
    }

    public void show(){
        for (Card card : cards) {
            System.out.println("card = " + card);
        }
    }
}
