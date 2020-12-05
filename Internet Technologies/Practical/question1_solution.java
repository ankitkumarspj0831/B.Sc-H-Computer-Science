import java.util.*;

class BankAccount {

  String name;
  String address;
  String accountType;
  int balance;
  int accountNumber;
  int noOfTransactions = 0;
  // Static variable
  static int nextAccountNumber = 1000;

  // Construnctor for Bank Account
  BankAccount(String n, String a, String ty, int b) {
    name = n;
    address = a;
    accountType = ty;
    balance = b;
    generateAccountNumber();
  }

  // Method to generate unique account number for each depositor
  void generateAccountNumber() {
    accountNumber = nextAccountNumber;
    nextAccountNumber += 1;
  }

  // Method to deposit more amount
  void depositBalance(int blnc) {
    balance += blnc;
    noOfTransactions++;
    displayInformation();
  }

  // Method to withdraw some amount
  void withdrawBalance(int blnc) {
    balance -= blnc;
    noOfTransactions++;
    displayInformation();
  }

  // Method to change the address
  void changeAddress(String newAddress) {
    address = newAddress;
    displayInformation();
  }

  // Method to get account number
  int getAccountNumber() {
    return accountNumber;
  }

  int getTransactions() {
    return noOfTransactions;
  }

  // Method to display information and balance of depositor
  void displayInformation() {
    System.out.println();
    System.out.println("Name: " + name);
    System.out.println("Address: " + address);
    System.out.println("Account Type: " + accountType);
    System.out.println("Account Number: BA" + accountNumber);
    System.out.println("Balance: " + balance);
    System.out.println("No of transactions: " + noOfTransactions);
    System.out.println();
  }
}

class bankAssignment {

  public static void main(String args[]) {
    // Array List for BankAccount
    List<BankAccount> bankaccount = new ArrayList<>();
    int choice;
    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.println("1. Add a bank account.");
      System.out.println("2. Print information of a depositor.");
      System.out.println("3. Add amount to an account.");
      System.out.println("4. Withdraw amount from an account.");
      System.out.println("5. Change address of a depositor.");
      System.out.println("6. Exit.");
      System.out.println();
      System.out.println("Enter your choice: ");
      choice = scanner.nextInt();
      switch (choice) {
        case 1:
          {
            System.out.println();
            System.out.println("Enter the name: ");
            String name = scanner.nextLine();
            name = scanner.nextLine();
            System.out.println("Enter the address: ");
            String address = scanner.nextLine();
            System.out.println("Enter the type of account: ");
            String accountType = scanner.nextLine();
            System.out.println("Enter the first deposit amount: ");
            int depositBalance = scanner.nextInt();
            System.out.println();
            bankaccount.add(
              new BankAccount(name, address, accountType, depositBalance)
            );
            break;
          }
        case 2:
          {
            System.out.println("Enter the account number: ");
            String acNo = scanner.nextLine();
            acNo = scanner.nextLine();
            String s = acNo.replaceAll("[^0-9]", "");
            int no = Integer.parseInt(s);
            for (BankAccount ba : bankaccount) {
              //ba.displayInformation();
              if (ba.getAccountNumber() == no) {
                ba.displayInformation();
              }
            }
            break;
          }
        case 3:
          {
            System.out.println("Enter the account number: ");
            String acNo = scanner.nextLine();
            acNo = scanner.nextLine();
            System.out.println("Enter the amount to deposit: ");
            int da = scanner.nextInt();
            String s = acNo.replaceAll("[^0-9]", "");
            int no = Integer.parseInt(s);
            for (BankAccount ba : bankaccount) {
              //ba.displayInformation();
              if (ba.getAccountNumber() == no) {
                ba.depositBalance(da);
              }
            }
            break;
          }
        case 4:
          {
            System.out.println("Enter the account number: ");
            String acNo = scanner.nextLine();
            acNo = scanner.nextLine();
            System.out.println("Enter the amount to withdraw: ");
            int aw = scanner.nextInt();
            String s = acNo.replaceAll("[^0-9]", "");
            int no = Integer.parseInt(s);
            for (BankAccount ba : bankaccount) {
              if (ba.getAccountNumber() == no) {
                ba.withdrawBalance(aw);
              }
            }
            break;
          }
        case 5:
          {
            System.out.println("Enter the account number: ");
            String acNo = scanner.nextLine();
            acNo = scanner.nextLine();
            System.out.println("Enter the new address: ");
            String add = scanner.nextLine();
            String s = acNo.replaceAll("[^0-9]", "");
            int no = Integer.parseInt(s);
            for (BankAccount ba : bankaccount) {
              if (ba.getAccountNumber() == no) {
                ba.changeAddress(add);
              }
            }
            break;
          }
        case 6:
          {
            System.exit(0);
            break;
          }
        default:
          {
            System.out.println("Incorrect input!!");
            System.out.println();
            break;
          }
      }
    }
  }
}
