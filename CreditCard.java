 public class CreditCard extends BankCard
{
    //instance variable
    private int CVCnumber;
    private double CreditLimit;
    private double InterestRate;
    private String ExpirationDate;
    private int GracePeriod;
    private boolean isGranted = false;
    
    //constructor
    public CreditCard(int cardId, String clientName, String issuerBank, String bankAccount, int balanceAmount, int CVCnumber, double InterestRate, String ExpirationDate)
    {
        super(cardId, bankAccount, issuerBank, balanceAmount );
        setclientName(clientName);
        this.CVCnumber = CVCnumber;
        this.InterestRate = InterestRate;
        this.ExpirationDate = ExpirationDate;
        isGranted = false; 
    }
    
    //accessor method
    public int getCVCnumber() 
    {
        return this.CVCnumber;
    }
    
    public double getCreditLimit() 
    {   
        return this.CreditLimit;
    }
    
    public double getInterestRate() 
    {
        return this.InterestRate;
    }
    
    public String getExpirationDate() 
    {
        return this.ExpirationDate;
    }
    
    public int getGracePeriod() 
    {
        return this.GracePeriod;
    }
    
    public boolean getisGranted() 
    {
        return this.isGranted;
    }
    
    //mutator method
    public void setCreditLimit(double Creditlimit, int Graceperiod)
    {
        if(Creditlimit <= 2.5 * getbalanceAmount())
        {
            this.CreditLimit = Creditlimit;
            this.GracePeriod = Graceperiod;
            isGranted = true;
            System.out.println("Credit has been granted.");
        }
        else
        {
            System.out.println("Credit can't be issued. Check your balance before you try again!");
        }
    }
    
    //method for cancelCreditCard 
    public void cancelCreditCard()
    {
        this.CVCnumber = 0;
        this.CreditLimit = 0;
        this.GracePeriod = 0;
        this.isGranted = false;
        System.out.println("Your Credit Card has been removed");
    }
    
    //display method
    public void display()
    {
        
        if(isGranted) 
        {
            //super class display() method is also called and printed
            super.display();
            System.out.println("CVC Number: " + CVCnumber);
            System.out.println("Credit Limit: " + CreditLimit);
            System.out.println("Interest Rate: " + InterestRate);
            System.out.println("Expiration Date: " + ExpirationDate);
            System.out.println("Grace Period: " + GracePeriod);
            System.out.println("The issue to grant the credit has been a success");
        }
        else
        {   
            //super class display() method is also called and printed
            super.display();
            System.out.println("Credit has not been granted.");
        }    
    }
}