public class BankCard
{    
    //these are the 5 different attributes(instance varables) of class BankCard.
    private int cardId;
    private String clientName;
    private String issuerBank;
    private String  bankAccount;
    private int balanceAmount;
    
    //BankCard is a constructor in which parameters are passed.
    public BankCard(int cardId, String bankAccount, String issuerBank, int balanceAmount)
    {
        //attributes are assigned with parameter values(updated) 
        this.cardId=cardId;
        this.bankAccount=bankAccount;
        this.issuerBank=issuerBank;
        this.balanceAmount=balanceAmount;
        clientName = ""; //empty string is initialized for clientName
    }
    
    //accessor method is defined here
    public int getCardId()
    {
        return this.cardId;
    }
    
    public String getIssuerBank()
    {
        return this.issuerBank;
    }
    
    public String getBankAccount()
    {
        return this.bankAccount;
    }
    
    public String getClientName()
    {
        return this.clientName;
    }
    
    public int getbalanceAmount()
    {
        return this.balanceAmount;
    }
    
    //mutator method is defined here
    public void setclientName(String clientName)
    {
        this.clientName = clientName;
    }
    
    public void setbalanceAmount(int balanceAmount)
    {
        this.balanceAmount = balanceAmount;
    }
    
    //Display method is created below and display variables are suitably annotated
    public void display()
    {   
        if(this.clientName==(""))   //if-else loop is used to display a suitable message if the Client name is not assigned.
        {
            System.out.println("The Client name is not assigned.");
        }
        else
        {
            System.out.println("The Client name is " + clientName);
            System.out.println("The Card ID is " + cardId); 
            System.out.println("The Issuer bank is " + issuerBank);
            System.out.println("The Bank account is " + bankAccount);
            System.out.println("The Balance amount is" + balanceAmount);
        }
    }
}