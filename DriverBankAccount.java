public class DriverBankAccount{
  public static void main(String[]args){
      BankAccount b1 = new BankAccount(1000001, "abc123");
      BankAccount b2 = new BankAccount(1000231, "abcasdg23");

      System.out.println("Account b1:");
      b1.deposit(3000.0);
      b2.deposit(1234.0);
      System.out.println(b1);
      System.out.println("Account b2:");
      System.out.println(b2);
      System.out.println();



      double cashAmount = 300.0;
      while(cashAmount < 3000){
        System.out.println(b1.transferTo(b2, 10000, "happyjason"));
        System.out.println(b1);
        System.out.println("Account b2:");
        System.out.println(b2);





        cashAmount *= 2;
      }
    }



}
