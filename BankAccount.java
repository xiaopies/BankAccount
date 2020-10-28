public class BankAccount{

  private double balance;
  private int accountID;
  private String password;

  public BankAccount(double b, int a, String p){
    balance = b;
    b = 0;
    accountID = a;
    password = p;
  }
  public double balance(){
    return balance;
  }
  public int accountID(){
    return accountID;
  }
  public String password(){
    return password;
  }
  public boolean deposit(double amount){
    if (amount >= 0){
      balance+=amount;
      return true;
    }
    return false;
  }
  public boolean withdraw(double amount){
    if (amount>=0 && amount <=b){
      balance-=amount;
      return true;
    }
    return false;
  }


}
