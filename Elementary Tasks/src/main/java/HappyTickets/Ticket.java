package HappyTickets;

 class Ticket {
    private String number;

    public Ticket(String number) {
        this.number = number;
    }

    public boolean checkEasyHappyTicket() {
        boolean happyTicket = false;
        if (number.charAt(1)+number.charAt(2)+number.charAt(3)==number.charAt(4)+number.charAt(5)+number.charAt(6)){
            happyTicket=true;
        }
        return happyTicket;
    }
    public boolean checkHardHappyTicket() {
        boolean happyTicket = false;
        if (number.charAt(1)+number.charAt(3)+number.charAt(5)==number.charAt(2)+number.charAt(4)+number.charAt(6)){
            happyTicket=true;
        }
        return happyTicket;
    }
}
