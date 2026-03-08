/*
=====================================================
          Java Exceptions: Digital Wallet
=====================================================

Digital wallets have simplified the process of sending and receiving money, but they necessitate
authentication. To initiate transactions within this digital wallet system, a user must possess an access
token. The types of transactions include:
1. Adding money to the wallet.
2. Paying money from the wallet.

Both types of transactions undergo validation before processing. The following error codes and messages
are displayed for invalid transactions:

- USER_NOT_AUTHORIZED: This error code reports an unauthorized transaction, such as when there is
  no access token for the digital wallet. The error message should be "User not authorized".

- INVALID_AMOUNT: This error code indicates an attempt to add or pay a zero or negative amount. The
  error message should be "Amount should be greater than zero".

- INSUFFICIENT_BALANCE: This error code signifies an attempt to make a payment greater than the
  available digital wallet balance. The error message should be "Insufficient balance".

The challenge involves implementing the digital wallet workflow through three classes:

1. TransactionException class:
   o Constructor: TransactionException(String errorMessage, String errorCode)
   o Method: String getErrorCode() to return the error code of the exception.

2. DigitalWallet class:
   o Constructor: DigitalWallet(String walletId, String userName)
   o Constructor: DigitalWallet(String walletId, String userName, String userAccessToken)
   o Method: String getWalletId() to return the wallet ID.
   o Method: String getUsername() to return the owner's username.
   o Method: String getUserAccessToken() to return the access token.
   o Method: int getWalletBalance() to return the wallet balance.
   o Method: void setWalletBalance(int walletBalance) to update the wallet balance.

3. DigitalWalletTransaction class:
   o Method: void addMoney(DigitalWallet digitalWallet, int amount) to add money to the wallet,
     throwing necessary exceptions for invalid transactions.
   o Method: void payMoney(DigitalWallet digitalWallet, int amount) to make a payment from the wallet,
     throwing necessary exceptions for invalid transactions.

Input Format For Custom Testing
Sample Case 0
Sample Input 0
2
1 Julia bff834a2c117a76d9ceb782f98e428686ca3c4ea
2 Samantha
10
1 pay 50
1 add 100
1 add 0
1 pay 30
2 add 500
1 add -5
1 add 1000
1 pay -20
1 pay 100
1 add 720

Sample Output 0
User not authorized
Amount should be greater than zero
Insufficient balance
User not authorized
Amount should be greater than zero
Amount should be greater than zero
1 Julia 1920
2 Samantha 0
=====================================================
*/
import java.util.*;

// --------- YOUR TASK STARTS HERE ---------

class TransactionException extends Exception {
    // Declare variable for errorCode
    String errorCode;

    public TransactionException(String errorMessage, String errorCode) {
        // YOUR CODE GOES HERE
    	super(errorMessage);
    	this.errorCode = errorCode;
        
    }

    public String getErrorCode() {
        // YOUR CODE GOES HERE
        return this.errorCode;
    }
}

class DigitalWallet {
    // Declare variables
	String walletId;
	String userName;
	String userAccessToken;
	int balance;
    

    public DigitalWallet(String walletId, String userName) {
        // YOUR CODE GOES HERE
    	this.walletId = walletId;
    	this.userName = userName;
        
    }

    public DigitalWallet(String walletId, String userName, String userAccessToken) {
        // YOUR CODE GOES HERE
    	this.walletId = walletId;
    	this.userName = userName;
    	this.userAccessToken = userAccessToken;
    }

    public String getWalletId() {
        // YOUR CODE GOES HERE
        return walletId;
    }

    public String getUsername() {
        // YOUR CODE GOES HERE
        return userName;
    }

    public String getUserAccessToken() {
        // YOUR CODE GOES HERE
        return userAccessToken;
    }

    public int getWalletBalance() {
        // YOUR CODE GOES HERE
        return balance;
    }

    public void setWalletBalance(int walletBalance) {
        // YOUR CODE GOES HERE
        this.balance = walletBalance;
    }
}

class DigitalWalletTransaction {

    public void addMoney(DigitalWallet digitalWallet, int amount) throws TransactionException {
        // YOUR CODE GOES HERE
        // 1. Check if token is present (if required for add).
        // 2. Check if amount <= 0 (Throw INVALID_AMOUNT).
        // 3. Update balance.
    	if(digitalWallet.userAccessToken == null) {
    		throw new TransactionException("User not authorized", "USER_NOT_AUTHORIZED");
    	}
    	if(amount <= 0) {
    		throw new TransactionException("Amount should be greater than zero", "INVALID_AMOUNT");
    	}
    	digitalWallet.setWalletBalance(digitalWallet.getWalletBalance()+amount);
        
    }

    public void payMoney(DigitalWallet digitalWallet, int amount) throws TransactionException {
        // YOUR CODE GOES HERE
        // 1. Check if token is present (Throw USER_NOT_AUTHORIZED).
        // 2. Check if amount <= 0 (Throw INVALID_AMOUNT).
        // 3. Check if amount > balance (Throw INSUFFICIENT_BALANCE).
        // 4. Update balance.
    	if(digitalWallet.userAccessToken == null) {
    		throw new TransactionException("User not authorized", "USER_NOT_AUTHORIZED");
    	}
    	if(amount <= 0) {
    		throw new TransactionException("Amount should be greater than zero", "INVALID_AMOUNT");
    	}
    	if(amount > digitalWallet.getWalletBalance()) {
    		throw new TransactionException("Insufficient balance", "INSUFFICIENT_BALANCE");
    	}
    	
    	digitalWallet.setWalletBalance(digitalWallet.getWalletBalance()-amount);
    }
}

// --------- MAIN CLASS (ALREADY IMPLEMENTED) ---------

public class Prob9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Use a map to store wallets by ID for easy retrieval
        Map<String, DigitalWallet> wallets = new LinkedHashMap<>();

        // 1. Read Number of Wallets
        int numberOfWallets = Integer.parseInt(sc.nextLine());

        // 2. Read Wallet Details
        for (int i = 0; i < numberOfWallets; i++) {
            String[] walletDetails = sc.nextLine().split(" ");
            
            DigitalWallet wallet;
            if (walletDetails.length == 3) {
                // Wallet with access token
                wallet = new DigitalWallet(walletDetails[0], walletDetails[1], walletDetails[2]);
            } else {
                // Wallet without access token
                wallet = new DigitalWallet(walletDetails[0], walletDetails[1]);
            }
            wallets.put(wallet.getWalletId(), wallet);
        }

        // 3. Read Number of Transactions
        int numberOfTransactions = Integer.parseInt(sc.nextLine());
        
        DigitalWalletTransaction transactionProcessor = new DigitalWalletTransaction();

        // 4. Process Transactions
        for (int i = 0; i < numberOfTransactions; i++) {
            String[] transactionDetails = sc.nextLine().split(" ");
            String walletId = transactionDetails[0];
            String action = transactionDetails[1];
            int amount = Integer.parseInt(transactionDetails[2]);

            DigitalWallet wallet = wallets.get(walletId);

            try {
                if (action.equals("add")) {
                    transactionProcessor.addMoney(wallet, amount);
                } else if (action.equals("pay")) {
                    transactionProcessor.payMoney(wallet, amount);
                }
            } catch (TransactionException e) {
                // Print Error Code if implementation returns it, otherwise just message
                // Based on standard patterns, usually:
                System.out.println(e.getErrorCode() + ": " + e.getMessage());
            }
        }

        // 5. Print Final Balances
        // The problem states the stub prints ID, Name, and Balance at the end.
        for (DigitalWallet wallet : wallets.values()) {
            System.out.println(wallet.getWalletId() + " " + wallet.getUsername() + " " + wallet.getWalletBalance());
        }
        
        sc.close();
    }
}