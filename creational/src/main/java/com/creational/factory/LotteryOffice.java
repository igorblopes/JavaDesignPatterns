package com.creational.factory;

public class LotteryOffice {

    private static final LotteryMachine lotteryMachine = new LotteryMachine();

    public static void main(String[] args) {
        buyLottoTicket();
        buyPowerBallTicket();
    }

    public static void buyLottoTicket() {
        var ticket = lotteryMachine.createTicket("Lotto");
        System.out.println("Lottery Ticket purchase for $" + ticket.getPrice());
    }

    public static void buyPowerBallTicket() {
        var ticket = lotteryMachine.createTicket("PowerBall");
        System.out.println("Lottery Ticket purchase for $" + ticket.getPrice());
    }
}
