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
}
