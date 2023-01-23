public class Account {
    private String Number;
    private double Balance;
      private String CustomerName;
      private String CustomerEmail;
      private String CustomerPhoneNumber;
  
      public Account(String Number, double balance, String customerName, String customerEmail, String customerPhoneNumber) {
          this.Number = Number;
          this.Balance = balance;
          this.CustomerName = customerName;
          this.CustomerEmail = customerEmail;
          this.CustomerPhoneNumber = customerPhoneNumber;
      }
      public void DepositMoney(double DepositedMoney){
          this.Balance += DepositedMoney;
          System.out.println("You have deposited " + DepositedMoney + " and your new balance is " + this.Balance);
      }
      public void WithDraw(double WithdrawnMoney){
          if (WithdrawnMoney > this.Balance){
              System.out.println("You have insufficient funds");
          } else {
              this.Balance -= WithdrawnMoney;
              System.out.println("You have withdrawn " + WithdrawnMoney + " and your new balance is " + this.Balance);
          }
      }
  
      public String getCustomerPhoneNumber() {
  
          return CustomerPhoneNumber;
      }
  
      public void setCustomerPhoneNumber(String customerPhoneNumber) {
  
          CustomerPhoneNumber = customerPhoneNumber;
      }
  
      public String getCustomerEmail() {
  
          return CustomerEmail;
      }
  
      public void setCustomerEmail(String customerEmail) {
  
          CustomerEmail = customerEmail;
      }
  
      public double getBalance() {
  
          return Balance;
      }
  
      public void setBalance(double balance) {
  
          Balance = balance;
      }
  
      public String getCustomerName() {
  
          return CustomerName;
      }
  
      public void setCustomerName(String customerName) {
  
          CustomerName = customerName;
      }
  
      public String getNumber() {
  
          return Number;
      }
  
      public void setNumber(String number) {
  
          Number = number;
      }
  }
