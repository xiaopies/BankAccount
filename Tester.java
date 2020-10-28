public class Tester{
  public static void main(String[] args){
    BankAccount first = new BankAccount(0.00, 520, "No" );
    double a = Double.parseDouble(args[0]);

    System.out.println(first.deposit(5.10));
    System.out.println(first.deposit(0));
    System.out.println(first.deposit(-5.10));
    System.out.println(first.withdraw(10));
    System.out.println(first.withdraw(0));
    System.out.println(first.withdraw(-2));
    System.out.println(first.withdraw(1.00));
    System.out.println(first.deposit(a));
    System.out.println(first.toString());
    System.out.println(first.balance());
    System.out.println(first.accountID());
  }
}
