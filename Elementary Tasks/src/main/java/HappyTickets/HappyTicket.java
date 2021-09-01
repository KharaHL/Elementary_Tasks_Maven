package HappyTickets;

 class HappyTicket {
    Input input = new Input();
    int minimal = input.inputMinimalTicket();
    int max = input.inputMaximumlTicket();

    public int countEasyWay() {
        int happyTickets = 0;
        for (int i = minimal; i < max; i++) {
            String tic = Integer.toString(i);
            Ticket ticket = new Ticket(tic);
            if (ticket.checkEasyHappyTicket()) {
                happyTickets++;
            }
        }
        return happyTickets;
    }
    public int countHardWay() {
        int happyTickets = 0;
        for (int i = minimal; i < max; i++) {
            String tic = Integer.toString(i);
            Ticket ticket = new Ticket(tic);
            if (ticket.checkHardHappyTicket()) {
                happyTickets++;
            }
        }
        return happyTickets;
    }
}
