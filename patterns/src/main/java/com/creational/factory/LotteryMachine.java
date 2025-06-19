package com.creational.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class LotteryMachine {

    private static final Map<String, Supplier<Ticket>> ticketMap = new HashMap<>();

    static {
        ticketMap.put("Lotto", () -> new LottoTicket());
        ticketMap.put("PowerBall", () -> new PowerBallTicket());
    }

    Ticket createTicket(String ticketType) {

        if(ticketMap.containsKey(ticketType)){
            return ticketMap.get(ticketType).get();
        }

        throw new IllegalArgumentException("Ticket Type not exists.");

    }

}
