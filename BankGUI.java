//importing awt, swing, event, arraylist, font
import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Font;

//class implementing respective action events
public class BankGUI implements ActionListener
{
    //creating objects for different components
    private JFrame frame, CreditCardFrame, WithdrawFrame, CreditDetailsFrame, SetCreditFrame, CancelCreditFrame;
    
    //Labels
    private JLabel Debit_CreditLabel, CardIdLabel, CardIdCredit, CardIdCreditDetails, CreditLimitCreditDetails,
    GracePeriodCreditDetails, CardIdWithdraw, ClientNameLabel, IssuerBankLabel, BankAccountLabel, BalanceAmountLabel, PINNumberLabel,
    CVCNumberLabel, InterestRateLabel, ExpirationDateLabel, AdditionalForCreditLabel, AmountWithdrawalLabel, WithdrawalAmountWithdraw,
    PINNumberWithdraw, DateOfWithdrawalWithdraw, SetCancelCreditCreditDetails, HorizontalLine, HorizontalLineMain, ForCredit, Info, 
    CardIdCancelCredit, CancelCreditCancel; 
    
    //Textfields
    private JTextField CardIdTF, ClientNameTF, IssuerBankTF, BankAccountTF, BalanceAmountTF, PINNumberTF, WithdrawalAmountTF,
    CVCNumberTF, InterestRateTF, CardIdWithdrawTF, WithdrawalAmountWithdrawTF, PinNumberWithdrawTF, CardIdCreditDetailsTF,
    CreditLimitCreditDetailsTF, GracePeriodCreditDetailsTF, CardIdCancelCreditTF;
    
    //combobox
    private JComboBox<String> DateOfWithdrawalCB, ExpirationDateCB, DateOfWithdrawalDayCB, DateOfWithdrawalMonthCB, 
    DateOfWithdrawalYearCB, ExpirationDateDayCB, ExpirationDateMonthCB, ExpirationDateYearCB;    
    
    //JButtons
    private JButton AddCreditBtn, AddDebitBtn, CreditDetailsBtn, WithdrawBtn1, WithdrawBtn2, DisplayDebitBtn, DisplayCreditBtn,
    ClearCreditBtn, ClearDebitBtn, SetCreditBtn, CancelCreditBtn1, CancelCreditBtn2;
    
    //Declaring Arraylist of DebitCard
    ArrayList<BankCard> ArrayListAL = new ArrayList<BankCard>();
    
    
    //constructor for BankGUI class
    public BankGUI()
    {
        //frame
        frame = new JFrame("Add Debit/Credit Card");
        CreditCardFrame = new JFrame("Credit Card");
        WithdrawFrame = new JFrame("Withdraw");
        CreditDetailsFrame = new JFrame("Set/Cancel Credit");
        CancelCreditFrame = new JFrame("Cancel Credit");
        
        //Label
        Debit_CreditLabel = new JLabel("Debit/Credit");
        CardIdLabel = new JLabel("Card ID: *");
        CardIdWithdraw = new JLabel("Card ID:");
        CardIdCredit = new JLabel("Card ID");
        ClientNameLabel = new JLabel("Client Name: *");
        IssuerBankLabel = new JLabel("Issuer Bank: *");
        BankAccountLabel = new JLabel("Bank Account: *");
        BalanceAmountLabel = new JLabel("Balance Amount: *");
        PINNumberLabel = new JLabel("PIN Number:");
        CVCNumberLabel = new JLabel("CVC Number: *");
        InterestRateLabel = new JLabel("Interest Rate: *");
        ExpirationDateLabel = new JLabel("Expiration Date: *");
        AdditionalForCreditLabel = new JLabel("Additional for Credit");
        AmountWithdrawalLabel = new JLabel("Amount Withdrawal");
        WithdrawalAmountWithdraw = new JLabel("Withdrawal Amount");
        PINNumberWithdraw = new JLabel("PIN Number");
        DateOfWithdrawalWithdraw = new JLabel("Date of Withdrawal");
        CardIdCreditDetails = new JLabel("Card ID:");
        CreditLimitCreditDetails = new JLabel("Credit Limit:");
        GracePeriodCreditDetails = new JLabel("Grace Period:");
        SetCancelCreditCreditDetails = new JLabel("Set / Cancel Credit Card");
        HorizontalLine = new JLabel("____________________________________________________________________________________________________________________________________________________________________________________________________________________");
        HorizontalLineMain = new JLabel("________________________________________________________________________________________________________________________________________________________________________________________________________________");
        ForCredit = new JLabel("* marked fields are for Credit Card.");
        Info = new JLabel("Upper Section is for both Debit and Credit Cards");
        CardIdCancelCredit = new JLabel("Card Id: ");
        CancelCreditCancel = new JLabel("Cancel Card");
        
        //TextField
        CardIdTF = new JTextField();
        ClientNameTF = new JTextField();
        IssuerBankTF = new JTextField();
        BankAccountTF = new JTextField();
        BalanceAmountTF = new JTextField();
        PINNumberTF = new JTextField();
        CVCNumberTF = new JTextField();
        InterestRateTF = new JTextField();
        WithdrawalAmountTF = new JTextField();
        CardIdWithdrawTF = new JTextField();
        WithdrawalAmountWithdrawTF = new JTextField();
        PinNumberWithdrawTF = new JTextField();
        CardIdCreditDetailsTF = new JTextField();
        CreditLimitCreditDetailsTF = new JTextField();
        GracePeriodCreditDetailsTF = new JTextField();
        CardIdCancelCreditTF = new JTextField();
        
        String DateOfWithdrawalDay[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18",
        "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
        DateOfWithdrawalDayCB = new JComboBox<String>(DateOfWithdrawalDay);
        
        String DateOfWithdrawalMonth[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
        DateOfWithdrawalMonthCB = new JComboBox<String>(DateOfWithdrawalMonth);
        
        String DateOfWithdrawalYear[] = {"2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021",
        "2022", "2023", "2024", "2025"}; 
        DateOfWithdrawalYearCB = new JComboBox<String>(DateOfWithdrawalYear);
        
        String ExpirationDateDay[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18",
        "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
        ExpirationDateDayCB = new JComboBox<String>(ExpirationDateDay);
        
        String ExpirationDateMonth[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
        ExpirationDateMonthCB = new JComboBox<String>(ExpirationDateMonth);
        
        String ExpirationDateYear[] = {"2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021",
        "2022", "2023", "2024", "2025"}; 
        ExpirationDateYearCB = new JComboBox<String>(ExpirationDateYear);
        
        //buttons
        AddDebitBtn = new JButton("Add Debit");
        AddCreditBtn = new JButton("Add Credit");
        WithdrawBtn1 = new JButton("Withdraw");
        WithdrawBtn2 = new JButton("Withdraw");
        DisplayDebitBtn = new JButton("Display");
        DisplayCreditBtn = new JButton("Display");
        ClearCreditBtn = new JButton("Clear");
        ClearDebitBtn = new JButton("Clear");
        CreditDetailsBtn = new JButton("Credit Details");
        SetCreditBtn = new JButton("Set Credit");
        CancelCreditBtn1 = new JButton("Cancel Credit");
        CancelCreditBtn2 = new JButton("Cancel Credit");
        
        
        //adding label components to frame
        frame.add(Debit_CreditLabel);
        frame.add(CardIdLabel);
        frame.add(ClientNameLabel);
        frame.add(IssuerBankLabel);
        frame.add(BankAccountLabel);
        frame.add(BalanceAmountLabel);
        frame.add(PINNumberLabel);
        frame.add(CVCNumberLabel);
        frame.add(InterestRateLabel);
        frame.add(ExpirationDateLabel);
        frame.add(AdditionalForCreditLabel);
        frame.add(HorizontalLine);
        frame.add(HorizontalLineMain);
        frame.add(ForCredit);
        frame.add(Info);
        
        
        //adding textfiend components to frame
        frame.add(CardIdTF);
        frame.add(ClientNameTF);
        frame.add(IssuerBankTF);
        frame.add(BankAccountTF);
        frame.add(BalanceAmountTF);
        frame.add(PINNumberTF);
        frame.add(WithdrawalAmountTF);
        frame.add(CVCNumberTF);
        frame.add(InterestRateTF);
        
        //frame.add(ExpirationDateCB);
        frame.add(ExpirationDateDayCB);
        frame.add(ExpirationDateMonthCB);
        frame.add(ExpirationDateYearCB);
        
        //adding buttons to the frame
        frame.add(AddDebitBtn);
        frame.add(AddCreditBtn);
        frame.add(CreditDetailsBtn);
        frame.add(WithdrawBtn1);
        frame.add(DisplayDebitBtn);
        frame.add(DisplayCreditBtn);
        frame.add(ClearCreditBtn);
        frame.add(ClearDebitBtn);
        
        //frame layout
        frame.setLayout(null);  
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setSize(850, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //adding label components to WithdrawFrame
        WithdrawFrame.add(AmountWithdrawalLabel);
        WithdrawFrame.add(CardIdWithdraw);
        WithdrawFrame.add(WithdrawalAmountWithdraw);
        WithdrawFrame.add(PINNumberWithdraw);
        WithdrawFrame.add(DateOfWithdrawalDayCB);
        WithdrawFrame.add(DateOfWithdrawalMonthCB);
        WithdrawFrame.add(DateOfWithdrawalYearCB);
        
        //adding label components to CreditDetailsFrame
        CreditDetailsFrame.add(CardIdCreditDetails);
        CreditDetailsFrame.add(CreditLimitCreditDetails);
        CreditDetailsFrame.add(GracePeriodCreditDetails);
        CreditDetailsFrame.add(SetCancelCreditCreditDetails);
        
        //adding TextField components to CreditDetailsFrame
        CreditDetailsFrame.add(CardIdCreditDetailsTF);
        CreditDetailsFrame.add(CreditLimitCreditDetailsTF);
        CreditDetailsFrame.add(GracePeriodCreditDetailsTF);
        
        //adding button components to CreditDetailsFrame
        CreditDetailsFrame.add(SetCreditBtn);
        CreditDetailsFrame.add(CancelCreditBtn1);
        CancelCreditFrame.add(CardIdCancelCreditTF);
        CancelCreditFrame.add(CancelCreditBtn2);
        CancelCreditFrame.add(CancelCreditCancel);
        
        //cancelcredit frame
        CancelCreditFrame.add(CardIdCancelCredit); 
        
        //button to WithdrawFrame
        WithdrawFrame.add(WithdrawBtn2);
        
        //adding TextField and ComboBox Components to WithdrawFrame
        WithdrawFrame.add(CardIdWithdrawTF);
        WithdrawFrame.add(WithdrawalAmountWithdrawTF);
        WithdrawFrame.add(PinNumberWithdrawTF);
        WithdrawFrame.add(DateOfWithdrawalWithdraw);
        
        //setting bounds for labels
        Debit_CreditLabel.setBounds(365, 12, 141, 20);
        CardIdLabel.setBounds(40, 83, 56, 20);
        ClientNameLabel.setBounds(40, 133, 85, 20);
        IssuerBankLabel.setBounds(40, 183, 85, 20);
        BankAccountLabel.setBounds(384, 83, 90, 20);
        BalanceAmountLabel.setBounds(384, 133, 106, 20);
        PINNumberLabel.setBounds(384, 183, 78, 20);
        CVCNumberLabel.setBounds(40, 354, 87, 20);
        InterestRateLabel.setBounds(385, 354, 84, 20);
        ExpirationDateLabel.setBounds(40, 402, 100, 20);
        AdditionalForCreditLabel.setBounds(335, 297, 190, 25);
        AmountWithdrawalLabel.setBounds(270, 16, 200, 20);
        HorizontalLine.setBounds(0, 480, 850, 32);
        HorizontalLineMain.setBounds(0, 265, 850, 32);
        ForCredit.setBounds(335, 510, 250, 32);
        Info.setBounds(300, 538, 290, 32);
        
        //setting bounds for text fields for frame
        CardIdTF.setBounds(155, 77, 180, 32);
        ClientNameTF.setBounds(155, 127, 180, 32);
        IssuerBankTF.setBounds(155, 178, 180, 32);
        BankAccountTF.setBounds(501, 77, 180, 32);
        BalanceAmountTF.setBounds(501, 127, 180, 32);
        PINNumberTF.setBounds(501, 178, 180, 32);
        CVCNumberTF.setBounds(155, 348,180,32);
        InterestRateTF.setBounds(501, 349, 180, 32);
        
        //setting bounds for cancel credit 
        CardIdCancelCredit.setBounds(18, 60, 52, 20);
        CardIdCancelCreditTF.setBounds(121, 54, 180, 32);
        CancelCreditCancel.setBounds(80, 10, 230, 20);
        CancelCreditCancel.setFont(new Font("TimesNewRoman",Font.BOLD, 20));
        
        //setting bounds for Withdraw Labels
        CardIdWithdraw.setBounds(15, 73, 52, 20);
        PINNumberWithdraw.setBounds(372, 73, 85, 20);
        WithdrawalAmountWithdraw.setBounds(15, 123, 125, 20);
        DateOfWithdrawalWithdraw.setBounds(372, 123, 122, 20);
        
        //setting bounds for withdraw Textfields and ComboBox
        CardIdWithdrawTF.setBounds(159, 67, 180, 32);
        WithdrawalAmountWithdrawTF.setBounds(159, 117, 180, 32);
        PinNumberWithdrawTF.setBounds(516, 67, 180, 32);
        DateOfWithdrawalDayCB.setBounds(516, 117, 40, 32);
        DateOfWithdrawalMonthCB.setBounds(560, 117, 40, 32);
        DateOfWithdrawalYearCB.setBounds(605, 117, 90, 32);
        
        //settingbounds for CreditDetailsFrame label
        CardIdCreditDetails.setBounds(18, 60, 52, 20);
        CreditLimitCreditDetails.setBounds(18, 110, 75, 20);
        GracePeriodCreditDetails.setBounds(18, 156, 86, 20);
        SetCancelCreditCreditDetails.setBounds(29, 10, 230, 20);
        
        //setting bounds for CreditDetailsFrame TextFields
        CardIdCreditDetailsTF.setBounds(121, 54, 180, 32);
        CreditLimitCreditDetailsTF.setBounds(121, 103, 180, 32);
        GracePeriodCreditDetailsTF.setBounds(121, 154, 180, 32);
        
        //ExpirationDateCB.setBounds(155, 396, 180, 32);
        ExpirationDateDayCB.setBounds(155, 396, 40, 32);
        ExpirationDateMonthCB.setBounds(205, 396, 40, 32);
        ExpirationDateYearCB.setBounds(255, 396, 80, 32);
        
        //setting bounds for buttons for AddDebit/CreditFrame
        AddDebitBtn.setBounds(385, 240, 120, 32);
        AddCreditBtn.setBounds(385, 443, 120, 32);
        WithdrawBtn1.setBounds(700, 77, 120, 32);
        ClearCreditBtn.setBounds(700, 443, 120, 32);
        ClearDebitBtn.setBounds(700, 178, 120, 32);
        DisplayDebitBtn.setBounds(700, 127, 120, 32);
        DisplayCreditBtn.setBounds(700, 396, 120, 32);
        CreditDetailsBtn.setBounds(700, 349, 120, 32);
        
        //AddDebit/CreditFrame
        ForCredit.setForeground(Color.red);
        Info.setForeground(Color.red);
        
        //setting bounds for buttons for Set/Cancel Credit
        SetCreditBtn.setBounds(22, 210, 120, 32);
        CancelCreditBtn1.setBounds(175, 210, 120, 32);
        CancelCreditBtn2.setBounds(100, 150, 120, 32);
        
        //setting bounds for Withdraw2 button
        WithdrawBtn2.setBounds(308, 163, 120, 32);
        
        //fonts and colors for CreditCard Labels
        Debit_CreditLabel.setFont(new Font("TimesNewRoman",Font.BOLD, 20));
        AdditionalForCreditLabel.setFont(new Font("TimesNewRoman",Font.BOLD, 20));
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);
        
        //fonts and colors for CreditDetailsFrame Labels
        SetCancelCreditCreditDetails.setFont(new Font("TimesNewRoman",Font.BOLD, 20));
        CreditDetailsFrame.getContentPane().setBackground(Color.LIGHT_GRAY);
        
        //fonts and color for Withdraw frame
        AmountWithdrawalLabel.setFont(new Font("Arial", Font.BOLD, 20));
        WithdrawFrame.getContentPane().setBackground(Color.LIGHT_GRAY);
        HorizontalLine.setForeground(Color.gray);
        HorizontalLineMain.setForeground(Color.gray);
        
        //adding action listeners to the different buttons
        AddCreditBtn.addActionListener(this);
        AddDebitBtn.addActionListener(this);
        WithdrawBtn1.addActionListener(this);
        WithdrawBtn2.addActionListener(this);
        ClearCreditBtn.addActionListener(this);
        ClearDebitBtn.addActionListener(this);
        CreditDetailsBtn.addActionListener(this);
        SetCreditBtn.addActionListener(this);
        CancelCreditBtn1.addActionListener(this);
        CancelCreditBtn2.addActionListener(this);
        DisplayDebitBtn.addActionListener(this);
        DisplayCreditBtn.addActionListener(this);
    }
    
    //overriding
    /*This methodholds the even handling for different buttons that have been used in the GUI. The AddDebitBtn on click holds object of Debit Card Class in Arraylist and vice versa
       for Credit Card as well. Clear button clears the textfields of different components. Set Credit button adds the Card Id to grant the Credit Card for the respective Card Id.
       Cancel Credit Button cancels the Card Id for the respective Credit Card. Display buttons display the necessary information added into the arraylist.*/
       
    @Override
    public void actionPerformed(ActionEvent e) //action event, 'e' is a reference name to ActionEvent  
    {
        //datatype for variables
        String ClientName, IssuerBank, BankAccount, ExpirationDate, ExpirationDateDay, ExpirationDateMonth, ExpirationDateYear, DateOfWithdrawal, DateOfWithdrawalDay, DateOfWithdrawalMonth, DateOfWithdrawalYear;
        int CardId, BalanceAmount, CVCNumber, PinNumber, PINNumber, WithdrawalAmountWithdraw, WithdrawalAmount, GracePeriod, CardIdCancelCreditTF;
        double CreditLimit, InterestRate;
        
        //checking if CreditCard Button is Clicked 
        if(e.getSource() == AddDebitBtn) 
        {
            //checking if any field is empty
            if(ClientNameTF.getText().isEmpty() || IssuerBankTF.getText().isEmpty() || BankAccountTF.getText().isEmpty()
                || CardIdTF.getText().isEmpty() || BalanceAmountTF.getText().isEmpty() || PINNumberTF.getText().isEmpty())
            {
                JOptionPane .showMessageDialog(frame,"Empty fields found.", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            
            else
            {
                //exception handling
                try
                {
                    CardId = Integer.parseInt(CardIdTF.getText());
                    BalanceAmount = Integer.parseInt(BalanceAmountTF.getText());
                    BankAccount = BankAccountTF.getText();
                    IssuerBank = IssuerBankTF.getText();
                    ClientName = ClientNameTF.getText();
                    PINNumber = Integer.parseInt(PINNumberTF.getText());
                    
                    //checking if the arraylist is empty
                    if(ArrayListAL.isEmpty())
                    {
                        //Adding object of debitcard using the constructor
                        DebitCard ObjDC = new DebitCard(BalanceAmount, BankAccount, CardId, IssuerBank, ClientName, PINNumber);
                        
                        //Adding object to arraylist
                        ArrayListAL.add(ObjDC);
                        
                        //Message Dialog
                        JOptionPane.showMessageDialog(frame, "Debit Card is added successfully");
                    }
                    
                    else
                    {
                        //iterating through the arraylist
                        for(BankCard BC:ArrayListAL)
                        {
                            //assigning the boolean value to false
                            boolean isDuplicate = false;
                            
                            //checking if the object of BankCard is the instance of Debit Card
                            if(BC instanceof DebitCard)
                            {
                                //setting isDuplicate to true so that read and write can be done simultaneously in arraylist
                                isDuplicate = true;
                                
                                //checking  if there's a duplicate card Id
                                if(BC.getCardId() == CardId)
                                {
                                    JOptionPane.showMessageDialog(frame, "Duplicate Card ID. Please re-enter an original ID!", "Warning", JOptionPane.WARNING_MESSAGE);
                                    break;
                                }
                                
                                /* finding the total size of arraylist then iterating through the arraylist to see if the object already
                                exists */
                                else if(BC == ArrayListAL.get(ArrayListAL.size() - 1))
                                {
                                    //calling DebitCard constructor from DebitCard Class
                                    DebitCard ObjDC = new DebitCard(BalanceAmount, BankAccount, CardId, IssuerBank, ClientName, PINNumber);
                                    
                                    //adding object to arraylist
                                    ArrayListAL.add(ObjDC);
                                    
                                    JOptionPane.showMessageDialog(frame, "Debit Card Added");
                                    
                                    break;
                                }
                            }
                            
                            else if(BC == ArrayListAL.get(ArrayListAL.size() - 1))
                            {
                                if(isDuplicate == false)
                                {
                                    DebitCard ObjDC = new DebitCard(BalanceAmount, BankAccount, CardId, IssuerBank, ClientName, PINNumber);
                                    ArrayListAL.add(ObjDC);
                                    JOptionPane.showMessageDialog(frame, "Debit Card Added");
                                    break;
                                }
                            }
                        }
                    }
                }
                
                //catching the exception
                catch(NumberFormatException a)
                {
                    JOptionPane.showMessageDialog(frame, "Invalid input data, please re-confirm to continue.","Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
        //event handling for add credit button
        else if(e.getSource() == AddCreditBtn) 
        {
            //checking if empty field is found
            if(ClientNameTF.getText().isEmpty() || IssuerBankTF.getText().isEmpty() || BankAccountTF.getText().isEmpty()
                || CardIdTF.getText().isEmpty() || BalanceAmountTF.getText().isEmpty() || CVCNumberTF.getText().isEmpty() ||
                InterestRateTF.getText().isEmpty())
            {
                JOptionPane .showMessageDialog(frame,"Empty fields found.", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            
            //instructions if the empty field is not found
            else
            {
                //try block for exception handling
                try
                {
                    CardId= Integer.parseInt(CardIdTF.getText());
                    BalanceAmount = Integer.parseInt(BalanceAmountTF.getText());
                    BankAccount = BankAccountTF.getText();
                    IssuerBank = IssuerBankTF.getText();
                    ClientName = ClientNameTF.getText();
                    CVCNumber = Integer.parseInt(CVCNumberTF.getText());
                    InterestRate = Double.parseDouble(InterestRateTF.getText());
                    ExpirationDateDay = ExpirationDateDayCB.getSelectedItem().toString();
                    ExpirationDateMonth = ExpirationDateMonthCB.getSelectedItem().toString();
                    ExpirationDateYear = ExpirationDateYearCB.getSelectedItem().toString();
                    ExpirationDate = ExpirationDateDay + "-" + ExpirationDateMonth + "-" + ExpirationDateYear;
                    
                    //checking if the arraylist is empty and then adding the object to the constructor and to the arraylist
                    if(ArrayListAL.isEmpty())
                    {    
                        //adding object of CreditCard using constructor
                        CreditCard ObjCC = new CreditCard(CardId, BankAccount, IssuerBank, ClientName, BalanceAmount, CVCNumber, 
                        InterestRate, ExpirationDate);
                        
                        //adding objects to the arraylist
                        ArrayListAL.add(ObjCC);
                        
                        //optionpane
                        JOptionPane.showMessageDialog(frame, "Credit Card is added successfully");
                    }
                    
                    else
                    {
                        //iterating through the arraylist
                        for(BankCard BC:ArrayListAL)
                        {
                            boolean isAddedCredit = false;
                            
                            //checking if the object of BankCard is the instance of Credit Card
                            if(BC instanceof CreditCard)
                            {
                                isAddedCredit = true;
                                if(BC.getCardId() == CardId)
                                {
                                    JOptionPane.showMessageDialog(frame, "Duplicate Card ID. Please re-enter an original ID!", "Warning", JOptionPane.WARNING_MESSAGE);
                                    break;
                                }
                                
                                //adding the object to the arraylist by iterating through all the objects of arraylist by getting its size
                                else if(BC == ArrayListAL.get(ArrayListAL.size() - 1))
                                {
                                    CreditCard ObjCC = new CreditCard(CardId, ClientName, IssuerBank, BankAccount, BalanceAmount, CVCNumber, InterestRate, ExpirationDate);
                                    ArrayListAL.add(ObjCC);
                                    JOptionPane.showMessageDialog(frame, "Credit Card Added");
                                    break;
                                }
                            }
                            
                            //executing else if block if the BankCard Object is not the instance of CreditCard
                            else if(BC == ArrayListAL.get(ArrayListAL.size() - 1))
                            {
                                if(isAddedCredit == false)
                                {
                                    CreditCard ObjCC = new CreditCard(CardId, ClientName, IssuerBank, BankAccount, BalanceAmount, CVCNumber, InterestRate, ExpirationDate);
                                    ArrayListAL.add(ObjCC);
                                    JOptionPane.showMessageDialog(frame, "Credit Card Added");
                                    break;
                                }
                            }
                        }
                    }
                }
                
                //executing the catch block
                catch(NumberFormatException a)
                {
                    JOptionPane.showMessageDialog(frame, "Invalid input data, please re-confirm to continue.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
        //opens new frame for withdraw
        else if(e.getSource() == WithdrawBtn1)
        {
            WithdrawFrame.setLayout(null);
            WithdrawFrame.setResizable(false);
            WithdrawFrame.setVisible(true);
            WithdrawFrame.setSize(720, 240);
        }  
        
        //executes the withdraw process after successfully matching the existingcard Id 
        else if(e.getSource() == WithdrawBtn2)
        {
            if(CardIdWithdrawTF.getText().isEmpty() || PinNumberWithdrawTF.getText().isEmpty() || WithdrawalAmountWithdrawTF.getText().isEmpty())
            {
                JOptionPane .showMessageDialog(WithdrawFrame,"Empty fields found.", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            
            else
            {
                //try block to catch the exceptions
                try
                {
                    CardId = Integer.parseInt(CardIdWithdrawTF.getText());
                    WithdrawalAmount = Integer.parseInt(WithdrawalAmountWithdrawTF.getText());
                    PinNumber = Integer.parseInt(PinNumberWithdrawTF.getText());
                    DateOfWithdrawalDay = DateOfWithdrawalDayCB.getSelectedItem().toString();
                    DateOfWithdrawalMonth = DateOfWithdrawalMonthCB.getSelectedItem().toString();
                    DateOfWithdrawalYear = DateOfWithdrawalYearCB.getSelectedItem().toString();
                    DateOfWithdrawal = DateOfWithdrawalDay + "-" + DateOfWithdrawalMonth + "-" + DateOfWithdrawalYear;
                    
                    if(ArrayListAL.isEmpty())
                    {
                        JOptionPane .showMessageDialog(WithdrawFrame, "Debit Card Unavailable" , "Alert", JOptionPane.ERROR_MESSAGE);
                    }
                    
                    else
                    {
                        //iterating through the arraylist 
                        for(BankCard BC: ArrayListAL)
                        {
                            boolean wd = false;
                            
                            //checking if the obj of BankCard is instance of DebitCard
                            if(BC instanceof DebitCard)
                            {
                                wd = true;
                                if(BC.getCardId() == CardId)
                                {
                                    //downcasting
                                    DebitCard debitCard = (DebitCard) BC;
                                      
                                    //matching the pin number 
                                    if(debitCard.getpinNumber() == PinNumber)
                                    {
                                        debitCard.Withdraw(WithdrawalAmount, DateOfWithdrawal, PinNumber);
                                        JOptionPane.showMessageDialog(WithdrawFrame, "Amount " + "Rs. " + WithdrawalAmount + " is Withdrawn" + "\n" + "Date of Withdrawal: " + DateOfWithdrawal + "\n" + "Pin Number: " + PinNumber + "\n" );
                                        break;
                                    }
                                    
                                    else 
                                    {
                                        JOptionPane.showMessageDialog(WithdrawFrame, "Wrong PIN.", "ALERT", JOptionPane.ERROR_MESSAGE);
                                        break;
                                    }
                                    
                                }
                                
                                else if(BC == ArrayListAL.get(ArrayListAL.size() - 1))
                                {
                                    JOptionPane.showMessageDialog(WithdrawFrame, "Debit Card not available", "Warning", JOptionPane.WARNING_MESSAGE);
                                    break;
                                }
                            }
                            
                            else if(BC == ArrayListAL.get(ArrayListAL.size() - 1) )
                            {
                                if(wd == false)
                                {
                                    JOptionPane.showMessageDialog(WithdrawFrame, "Error, Please enter a Valid ID", "ALERT", JOptionPane.ERROR_MESSAGE);
                                    break;
                                }
                            }
                        }
                    }
                }
                
                catch(NumberFormatException a)
                {
                    JOptionPane.showMessageDialog(WithdrawFrame, "Entry value error", "Alert", JOptionPane.ERROR_MESSAGE);                                        
                }
            }   
        }
        
        //opening new frame for setting credit and cancelling the card
        else if(e.getSource() == CreditDetailsBtn)
        {
            CreditDetailsFrame.setLayout(null);
            CreditDetailsFrame.setResizable(false);
            CreditDetailsFrame.setVisible(true);
            CreditDetailsFrame.setSize(330, 300);
        }
        
        //Set credit after certain conditions match
        else if(e.getSource() == SetCreditBtn)
        {
            if(CardIdCreditDetailsTF.getText().isEmpty() || CreditLimitCreditDetailsTF.getText().isEmpty() || 
            GracePeriodCreditDetailsTF.getText().isEmpty())
            {
                JOptionPane .showMessageDialog(CreditDetailsFrame,"Empty fields found.", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            
            else
            {
                //try block 
                try
                {
                    CardId = Integer.parseInt(CardIdCreditDetailsTF.getText());
                    GracePeriod = Integer.parseInt(GracePeriodCreditDetailsTF.getText());
                    CreditLimit = Double.parseDouble(CreditLimitCreditDetailsTF.getText());
                    
                    //checking if the arraylist is empty
                    if(ArrayListAL.isEmpty())
                    {
                        JOptionPane.showMessageDialog(CreditDetailsFrame, "Card Not Found ", "Warning", JOptionPane.WARNING_MESSAGE);
                    }
                    
                    //executing else if Arraylist isn't empty
                    else
                    {
                        //using for each loop for bank card objects in Arraylist
                        for(BankCard BC: ArrayListAL)
                        {
                            boolean SetCredit = false;
                            
                            //checking if Bankcard object "BC" is the instance of Bank card
                            if(BC instanceof CreditCard)
                            {
                                SetCredit = true;
                                
                                //downcasting bankcard object to credit card object
                                CreditCard CC = (CreditCard) BC;  
    
                                //adding credit card if the condition matches
                                if(BC.getCardId() == CardId)
                                {
                                    //calling the setCreditLimit method
                                    CC.setCreditLimit(CreditLimit, GracePeriod);
                                    
                                    //Credit Card is set
                                    JOptionPane.showMessageDialog(CreditDetailsFrame,  "Credit Limit has been Set");
                                    break;
                                }
                                
                                //invalid card Id
                                else if(BC == ArrayListAL.get(ArrayListAL.size() - 1))
                                {
                                    JOptionPane.showMessageDialog(CreditDetailsFrame, "Card Id not found", "Alert", JOptionPane.ERROR_MESSAGE);
                                    break;
                                } 
                            }
                            
                            else if(BC == ArrayListAL.get(ArrayListAL.size() - 1))
                            {
                                if(SetCredit == false)
                                {
                                    JOptionPane.showMessageDialog(CreditDetailsFrame, "No Credit Card found", "Alert", JOptionPane.ERROR_MESSAGE);
                                    break;
                                }
                            }
                        }
                    }
                }
                
                
                //catches the exception
                catch(NumberFormatException a)
                {
                    JOptionPane.showMessageDialog(SetCreditFrame, "Entry value error", "Alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
        //clears the debit card textfields
        else if(e.getSource() == ClearDebitBtn)
        {
            CardIdTF.setText("");
            ClientNameTF.setText("");
            IssuerBankTF.setText("");
            BankAccountTF.setText("");
            BalanceAmountTF.setText("");
            PINNumberTF.setText(""); 
            JOptionPane.showMessageDialog(frame,"Text fields Cleared!");
        }
        
        //clears the credit card textfields
        else if(e.getSource() == ClearCreditBtn)
        {
            CVCNumberTF.setText("");
            InterestRateTF.setText("");
            JOptionPane.showMessageDialog(frame,"Text fields Cleared!");
        }
        
        //opens new frame for cancelling credit card
        else if(e.getSource() == CancelCreditBtn1)
        {
            CancelCreditFrame.setLayout(null);
            CancelCreditFrame.setResizable(false);
            CancelCreditFrame.setVisible(true);
            CancelCreditFrame.setSize(330, 250);
        }
        
        //in this button, card Id is entered and then the credit card for the particular card Id is cancelled
        else if(e.getSource() == CancelCreditBtn2)
        {
            if(CardIdCancelCredit.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(CancelCreditFrame, "Empty field found", "Error", JOptionPane.WARNING_MESSAGE);
            }
            
            else
            {
                //try block
                try
                {
                    CardId = Integer.parseInt(CardIdTF.getText());
                    
                    //checking if the array list is empty
                    if(ArrayListAL.isEmpty())
                    {
                        JOptionPane.showMessageDialog(CancelCreditFrame, "Credit Card not found. Can't cancel Credit Card", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                        
                    else
                    {
                        //iterating through the arraylist
                        for(BankCard BC: ArrayListAL)
                        {
                            boolean remove = false;
                            
                            if(BC instanceof CreditCard)
                            {
                                remove = true;
                                CreditCard crCard = (CreditCard) BC;
                                
                                if(BC.getCardId() == CardId)
                                {
                                    crCard.cancelCreditCard();
                                    JOptionPane.showMessageDialog(CancelCreditFrame, "Credit Card Cancelled");
                                    break;
                                }
                                
                                else if(BC == ArrayListAL.get(ArrayListAL.size() - 1))
                                {
                                    JOptionPane.showMessageDialog(CancelCreditFrame, "Invalid Card Id", "Alert", JOptionPane.ERROR_MESSAGE);
                                    break;
                                }
                            }
                            
                            else if(BC == ArrayListAL.get(ArrayListAL.size() - 1))
                            {
                                if(remove == false)
                                {
                                    JOptionPane.showMessageDialog(CancelCreditFrame, "Card Not Found", "Error", JOptionPane.WARNING_MESSAGE);
                                    break;
                                }
                            }
                        }
                    }
                }
                
                //catching the exception if any
                catch(NumberFormatException a)
                {
                    JOptionPane.showMessageDialog(CancelCreditFrame, "Entry value error", "Alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
        else if(e.getSource() == DisplayDebitBtn)
        {
            if(ArrayListAL.isEmpty())
            {
                JOptionPane.showMessageDialog(frame, "No data available for Debit Card", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
            else
            {
                boolean yes  = false;
                CardId = Integer.parseInt(CardIdTF.getText());
                ClientName = ClientNameTF.getText();
                IssuerBank = IssuerBankTF.getText();
                BankAccount = BankAccountTF.getText();
                BalanceAmount = Integer.parseInt(BalanceAmountTF.getText());
                    
                    
                for(BankCard BC: ArrayListAL)
                {
                    if(BC instanceof DebitCard)
                    {
                        yes = true;
                            
                        DebitCard deb = (DebitCard) BC;
                            
                        //calling the display method of debit card
                        deb.display();
                            
                    }
                } 
                    
                if(yes == false)
                {
                    JOptionPane.showMessageDialog(frame, "No Debit Card found", "ERROR", JOptionPane.ERROR_MESSAGE);
                            
                }
                        
                else
                {
                    JOptionPane.showMessageDialog(frame, "Values Entered: " + "\n" + "Client Name: " + ClientName + "\n" + "Card Id: " + CardId + "\n" + "Issuer Bank: " + IssuerBank + "\n" + "Bank Account: " + BankAccount + "\n" + "Balance Amount: " + BalanceAmount);
                } 
            }
        }
        
        
        else if(e.getSource() == DisplayCreditBtn)
        {
            if(ArrayListAL.isEmpty())
            {
                JOptionPane.showMessageDialog(frame, "No data available for Credit Card", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
            else
            { 
                boolean yes1  = false;
                    
                CardId = Integer.parseInt(CardIdTF.getText());
                ClientName = ClientNameTF.getText();
                IssuerBank = IssuerBankTF.getText();
                BankAccount = BankAccountTF.getText();
                BalanceAmount = Integer.parseInt(BalanceAmountTF.getText());
                CVCNumber = Integer.parseInt(CVCNumberTF.getText());
                InterestRate = Double.parseDouble(InterestRateTF.getText());
                    
                    
                for(BankCard BC: ArrayListAL)
                {
                    if(BC instanceof CreditCard)
                    {
                        yes1 = true;
                            
                        CreditCard cre = (CreditCard) BC;
                            
                        //calling the display method of debit card
                        cre.display();
                            
                    }
                }  
                
                if(yes1 == false)
                {
                    JOptionPane.showMessageDialog(frame, "No Credit Card found", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
                        
                else
                {
                    JOptionPane.showMessageDialog(frame, "Values Entered: " + "\n" + "Client Name: " + ClientName + "\n" + "Card Id: " + CardId + "\n" + "Issuer Bank: " + IssuerBank + "\n" + "Bank Account: " + BankAccount + "\n" + "Balance Amount: " + BalanceAmount + "\n" + "CVC Number: " + CVCNumber + "\n" + "Interest Rate: " + InterestRate);;
                }
                    
            }
        }
    } 
    
    
    //main method that runs the BankGUI constructor 
    public static void main(String[]args)
    {
        new BankGUI();
    }
}