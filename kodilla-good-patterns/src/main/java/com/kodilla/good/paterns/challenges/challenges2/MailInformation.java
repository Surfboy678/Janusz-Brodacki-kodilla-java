package com.kodilla.good.paterns.challenges.challenges2;

public class MailInformation implements InormatinSevice {
    @Override
    public boolean mailService() {
        System.out.println("Your order is ready");
        return true;
    }
}
