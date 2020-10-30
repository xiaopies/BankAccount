public class BankAccount{

  private double balance;
  private int AccountID;
  private String password;

  public BankAccount(int AccountID, String p){
    this.balance = balance;
    this.AccountID = AccountID;
    password = p;
  }
  public double balance(){
    return balance;
  }
  public int getAccountID(){
    return AccountID;
  }
  public void setPassword(String newPass){
    password=newPass;
  }
  public boolean deposit(double amount){
    if (amount >= 0){
      balance+=amount;
      return true;
    }
    return false;
  }
  public boolean withdraw(double amount){
    if (amount>=0 && amount <=balance){
      balance-=amount;
      return true;
    }
    return false;
  }
  public String toString(){
    return "#" + AccountID + "\t" + "$" + balance;
  }
  private boolean authenticate(String password){
    return password== this.password;
  }
  public boolean transferTo(BankAccount other, double amount, String password){
    if (authenticate(password)){
      System.out.println("Attempt to move $"+amount+" from the b1 to b2 account:");
      if(this.withdraw(amount) ){
        if(other.deposit(amount)){
          System.out.println(this);
          System.out.println(other);
          System.out.println();
          return true;

        }else{
          //This should never happen.
          //Error message provided to make sure that is the case
          System.out.println("CRITICAL ERROR! $"+amount +
                             " withdrawn from Account #" +  this.getAccountID() +
                             "Failed to add to Account #"+other.getAccountID());

        }
      }else{
        System.out.println("Transfer Failed");

      }
    }
    return false;
  }
}
