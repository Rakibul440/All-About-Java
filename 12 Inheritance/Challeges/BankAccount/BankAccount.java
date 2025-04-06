class Account{
    //Properties
    private String accountNo;
    private String name;
    private String address;
    private String phoneNo;
    private String DOB;

    //Constructor
    public Account(String accountNo,String name,String DOB){
        this.accountNo = accountNo;
        this.name = name;
        this.address = "Contact your bank";
        this.phoneNo = "Contact your bank to link your phone no.";
        this.DOB = DOB;
    }

    //Get and Set methods
    public String getAccountNo() {
        return accountNo;
    }
    public String getAddress() {
        return address;
    }
    public String getDOB() {
        return DOB;
    }
    public String getName() {
        return name;
    }
    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    //Methods
    public void userDetails(){
        System.out.println("A/C No : "+ getAccountNo());
        System.out.println("Name : " + getName());
        System.out.println("Address : " + getAddress());
        System.out.println("Phone No : "+ getPhoneNo());
        System.out.println("Date of Birth : " + getDOB());
    }
}

class SavingAccount extends Account{
    private int balance;

    public SavingAccount(String accountNo, String name, String dob,int balance){
        super(accountNo,name,dob);
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    };
    //Methods 
    public void deposit(){
        System.out.println("Your amount is successfully deposited!");
    }
    public void withdraw(){
        System.out.println("You've successfully withdraw your money");
    }
}

class LoanAccount extends Account{
    private int loanAmount;

    public LoanAccount(String accountNo, String name, String dob,int amount){
        super(accountNo, name, dob);
        this.loanAmount = amount;
    }

    public int getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(int loanAmount) {
        this.loanAmount = loanAmount;
    }

    public void payEMI(){
        System.out.println("Payment is completed successfully!");
    }
}

public class BankAccount {
    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount("58964236499", "Rakibul Islam", "21-10-2002", 4231);
        sa.setPhoneNo("832766xxxx");
        sa.userDetails();
        System.out.println("");
        sa.deposit();
    }
}
