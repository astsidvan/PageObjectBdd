package ru.netology.web.data;

import lombok.Value;

import java.util.Random;

public class DataHelper {
    private DataHelper(){}

    @Value
    public static class AuthInfo {
        private String login;
        private String password;
    }

    public static AuthInfo getAuthInfo() {
        return new AuthInfo("vasya", "qwerty123");
    }

    @Value
    public static class VerificationCode {
        private String code;
    }

    public static VerificationCode getVerificationCodeFor(AuthInfo authInfo) {
        return new VerificationCode("12345");
    }

    public static int generateValidAmount(int balance){
        return new Random().nextInt(balance + 1);
    }

    public static int generateInvalidAmount(int balance){
        return Math.abs(balance) + new Random().nextInt(10000);
    }

    @Value
    public static class CardNumber {
        private String numberCard;
        private int index;
    }

    public static CardNumber getCardNumber1(){
        return new CardNumber("5559 0000 0000 0001", 0);
    }

    public static CardNumber getCardNumber2(){
        return new CardNumber("5559 0000 0000 0002", 1);
    }
}