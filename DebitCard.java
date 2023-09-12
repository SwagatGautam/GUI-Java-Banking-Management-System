public class DebitCard extends BankCard 
{
    private int pinNumber;
    private int withdrawalAmount;
    private String DateOfWithdrawal;
    private boolean hasWithdrawn;
    
    //constructor
    public DebitCard(int balanceAmount, String bankAccount, int cardId, String issuerBank, String clientName, int pinNumber)
    {
        super(cardId, bankAccount, issuerBank, balanceAmount );
        setclientName(clientName);
        this.pinNumber = pinNumber;
        hasWithdrawn = false;     
    }
    
    //accessor method
    public int getpinNumber() 
    {
        return this.pinNumber;
    }

    public int getWithdrawalAmount() 
    {
        return this.withdrawalAmount;
    }

    public String getDateOfWithdrawal()
    {
        return this.DateOfWithdrawal;
    }

    public boolean getHasWithdrawn() 
    {
        return this.hasWithdrawn;
    }
    
    //mutator method
    public void setWithdrawalAmount(int withdrawalAmount)
    {
        this.withdrawalAmount = withdrawalAmount;
    }
    
    //Withdraw method checks the valid pin number and sufficient balance amount before the further transaction process
    public void Withdraw(int withdrawalAmount, String DateOfWithdrawal, int pinNumber)
    {
        if(this.pinNumber == pinNumber)
        {
            if(withdrawalAmount <= getbalanceAmount())
            {
                hasWithdrawn = true;
                setbalanceAmount(getbalanceAmount() - withdrawalAmount);
                System.out.println("The amount " + withdrawalAmount + " has been withdrawn. Your new balance is " + getbalanceAmount());
                this.withdrawalAmount = withdrawalAmount;
                this.DateOfWithdrawal = DateOfWithdrawal;
            }
            else
            {
                System.out.println("Insufficient Balance");
            }
        }
        else
        {
            System.out.println("Wrong pin number");
        }
    }
    
    //Display method
    public void display() 
    {   
        if(hasWithdrawn)
        {
            //super class display() method is also called and printed
            super.display();
            System.out.println("The PIN Number is " + pinNumber);
            System.out.println("The Withdrawal Amount is " + withdrawalAmount);
            System.out.println("The Date of Withdrawal is " + DateOfWithdrawal);
            System.out.println("The amount has been withdrawn");
        }
        else
        {
            super.display();   //super class display() method is also called and printed
            
        }
    }
}