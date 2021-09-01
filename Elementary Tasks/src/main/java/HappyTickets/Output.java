package HappyTickets;

 class Output {
    HappyTicket happyTickets = new HappyTicket();
    int easyHappy = happyTickets.countEasyWay();
    int hardHappy = happyTickets.countHardWay();

    public void print() {
        if (easyHappy > hardHappy) {
            System.out.printf("Easy way is more effective, %d happy tickets ", easyHappy);
            System.out.printf("Hard way happy tickets %d \n", hardHappy);
        }
        if (easyHappy < hardHappy) {
            System.out.println("Hard way is more effective,  happy tickets :"+ hardHappy);
            System.out.println("Easy way happy tickets:  "+ easyHappy);
        } else if(easyHappy==hardHappy) {
            System.out.println("Easy way " + easyHappy);
            System.out.println("Hard way " + hardHappy);
        }
    }
}
