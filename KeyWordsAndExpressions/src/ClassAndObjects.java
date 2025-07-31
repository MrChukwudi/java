public class ClassAndObjects {
    public static void main(String[] args) {
        // Instantiating my Car Class:
        Car volvo = new Car();



        /*
        //Instantiating my BankAccount:
        BankAccount ubaAcct = new BankAccount();
        ubaAcct.setAccBal(200_000_000.00d);
        ubaAcct.setAccName("Desire Chukwudi");
        ubaAcct.setAccNum(0076675543);
        ubaAcct.setEmail("get3udf@ftail.com");


        ubaAcct.depositFund(567);
        ubaAcct.withdrawFund(7);

        ubaAcct.describeAcct();



         */



        // For my AccountWithCtor:
        AccountWithCtor bobAcct = new AccountWithCtor(112233445, 30000000, "Desires", "get5mux@gmail.com", 240889954);
        bobAcct.describeAcct();

        //accessing the Instance method inside Car:
       // volvo.describeCar();
    }
}
