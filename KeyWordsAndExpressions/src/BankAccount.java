public class BankAccount {
        private int accNum;
        private double accBal;
        private String accName;
        private String email;
        private int phone;

        //Setters:
        public void setAccNum(int num){

            this.accNum = num;

        }

        public void setAccBal(double accBal) {
            this.accBal = accBal;
        }

        public void setAccName(String accName) {
            this.accName = accName;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setPhone(int phone) {
            this.phone = phone;
        }


        //Getters:
        public int getAccNum(){
            if(this.accNum == 0){
                System.out.println("THE Account number is unassigned");
            }
            return this.accNum;
        }

        public double getAccBal() {
            return accBal;
        }

        public String getAccName() {
            return accName;
        }

        public String getEmail() {
            return email;
        }

        public int getPhone() {
            return phone;
        }


        public double depositFund(double depositAmount){
            if(depositAmount > 0){
                accBal += depositAmount;
                System.out.println("Deposit successful, Your new balance is now: " + accBal);
                return 0.00d;
            }

            System.out.println("Please, deposit a valid amount:... Amount must be greater the 0");
            return 0.00d;

        }

        public double withdrawFund(double withdrawAmount){
            if((withdrawAmount < accBal) && (withdrawAmount > 0)){
                accBal -= withdrawAmount;
                System.out.println("Withdrawal successful, Your new balance is now: " + accBal);
                return 0.00d;
            }else if(withdrawAmount > accBal){
                System.out.println("Insufficient Balance to complete this transaction!!!");
                return 0.00d;
            }
            System.out.println("Please, withdraw a valid amount:... Amount must be greater the 0");
            return 0.00d;

        }

        public void describeAcct(){
            System.out.println("Account Name: " + accName + " Account Balance: " + accBal +
                    " Account Number: " + accNum + " Account Email: " + email);

        }
    }





