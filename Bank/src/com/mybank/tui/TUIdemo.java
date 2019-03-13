package com.mybank.tui;

import com.mybank.data.DataSource;
import com.mybank.domain.*;
import com.mybank.report.CustomerReport;
import jexer.TAction;
import jexer.TApplication;
import jexer.TField;
import jexer.TText;
import jexer.TWindow;
import jexer.event.TMenuEvent;
import jexer.menu.TMenu;

import java.io.IOException;

/**
 *
 * @author ISparkIt
 */
public class TUIdemo extends TApplication {

    private static final int ABOUT_APP = 2000;
    private static final int CUST_INFO = 2010;

    private static final String USAGE
            = "USAGE: java com.mybank.test.TestReport <dataFilePath>";

    public static void main(String[] args) throws Exception {
        if ( args.length != 1 ) {
            System.out.println(USAGE);
        } else {
            String dataFilePath = args[0];

            try {
                System.out.println("Reading data file: " + dataFilePath);
                // Create the data source and load the Bank data
                DataSource dataSource = new DataSource(dataFilePath);
                dataSource.loadData();

            } catch (IOException ioe) {
                System.out.println("Could not load the data file.");
                System.out.println(ioe.getMessage());
                ioe.printStackTrace(System.err);
            }
        }
        /*Account checkingAccount = new CheckingAccount(500, 500);
        Account savingsAccount = new SavingsAccount(500, 10);
        Bank.addCustomer("Stas", "God");
        Bank.addCustomer("Andrey", "Rabotyaga");
        Bank.addCustomer("Sergey", "Programist");
        Bank.getCustomer(0).addAccount(checkingAccount);
        Bank.getCustomer(1).addAccount(savingsAccount);
        Bank.getCustomer(2).addAccount(checkingAccount);*/
        TUIdemo tdemo = new TUIdemo();
        (new Thread(tdemo)).start();
    }

    public TUIdemo() throws Exception {
        super(BackendType.SWING);

        addToolMenu();
        //custom 'File' menu
        TMenu fileMenu = addMenu("&Файл");
        fileMenu.addItem(CUST_INFO, "&Информация о клиенте");
        fileMenu.addDefaultItem(TMenu.MID_SHELL);
        fileMenu.addSeparator();
        fileMenu.addDefaultItem(TMenu.MID_EXIT);
        //end of 'File' menu

        addWindowMenu();

        //custom 'Help' menu
        TMenu helpMenu = addMenu("&Помощь");
        helpMenu.addItem(ABOUT_APP, "&Инфо...");
        //end of 'Help' menu

        setFocusFollowsMouse(true);
        //Customer window
        ShowCustomerDetails();
    }

    @Override
    protected boolean onMenu(TMenuEvent menu) {
        if (menu.getId() == ABOUT_APP) {
            messageBox("Инфо", "\t\t\t\t\t   BankPrj.\n\nCopyright \u00A9 2019 ISparkIt").show();
            return true;
        }
        if (menu.getId() == CUST_INFO) {
            ShowCustomerDetails();
            return true;
        }
        return super.onMenu(menu);
    }

    private void ShowCustomerDetails() {
        TWindow custWin = addWindow("Окно пользователя", 2, 1, 40, 10,TWindow.NOZOOMBOX);
        custWin.newStatusBar("Enter valid customer number and press Show...");

        custWin.addLabel("Введите номер клента: ", 2, 2);
        TField custNo = custWin.addField(24, 2, 3, false);
        TText details = custWin.addText("Owner Name: \nAccount Type: \nAccount Balance: ", 2, 4, 38, 8);
        custWin.addButton("&Show", 28, 2, new TAction() {
            @Override
            public void DO() {
                String account_type = "";
                String num = custNo.getText();
                int Num = Integer.parseInt(num);
                if (num == "" || num == " ") {
                    messageBox("Ошибка", "You must provide a valid customer number!").show();
                } else if (Bank.getNumberOfCustomers() <= Num){
                    messageBox("Ошибка", "You must provide a valid customer number!").show();

                } else {
                    Customer customer = Bank.getCustomer(Num);
                    Account account = customer.getAccount(0);
                    if (account  instanceof SavingsAccount) {
                        account_type = "Savings Account";
                    } else if ( account instanceof CheckingAccount) {
                        account_type = "Checking Account";
                    } else {
                        account_type = "Unknown Account Type";
                    }

                    details.setText("Owner Name: " + Bank.getCustomer(Num).toString() + "\nAccount Type: " + account_type + "\nAccount Balance: " + Bank.getCustomer(Num).getAccount(0).getBalance());

                }
            }
        });
    }
}