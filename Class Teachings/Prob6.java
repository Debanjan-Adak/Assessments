/*
=====================================================
          Java: Bank Implementation
=====================================================

Implement two classes that fulfill the Bank interface.

Given an interface named Bank with the following functions:
- void assignLoans(int[] loans);
- void averageLoan();
- void maxLoan();
- void minLoan();

Create 2 classes, PersonalLoanDept and BusinessLoanDept, implementing the Bank interface.

1. The class PersonalLoanDept should include an integer-type array termed loanAmounts and these methods:
   - PersonalLoanDept(int clients): An empty array loanAmounts of clients length is initialized in this class,
     where clients is the count of loan recipients. The initial loan amount assigned is zero.
   - void assignLoans(int[] loans): The loans array is linked to loanAmounts. If the lengths of the two arrays
     differ, as many values as possible are assigned, and then stop allocating more and print "Loans for
     clients processed".
   - void averageLoan(): This displays the loan average in the pattern "Average loan amount for clients is
     {averageLoan}". The average computation should consider any zero value present in loanAmounts and
     should be rounded to 2 decimal places.
   - void maxLoan(): This displays "Maximum loan amount amongst clients is {maximumLoan}" reflecting
     the largest loan.
   - void minLoan(): This displays "Minimum loan amount amongst clients is {minimumLoan}" reflecting the
     smallest loan given.

2. The BusinessLoanDept class needs an int[] as a variable called loanAmounts and should have these methods:
   - BusinessLoanDept(int businesses): This initializes an empty array loanAmounts of length
     businesses which signifies the number of business recipients.
   - void assignLoans(int[] loans): This assigns loans array to loanAmounts. The system discontinues further
     allocation if the lengths of arrays do not match post the assignment of possible values and prints
     "Loans for businesses processed".
   - void averageLoan(): This prints "Average loan amount for businesses is {averageLoan}". Any remaining
     zero values in loanAmounts are included in the average calculation.
   - void maxLoan(): This prints "Maximum loan amongst businesses is {maximumLoan}" reflecting the
     highest loan.
   - void minLoan(): This prints "Minimum loan amongst businesses is {minimumLoan}" reflecting the lowest
     loan value.

Ensure the usage of inheritance and encapsulation to prevent redundant code. Implementation of the
PersonalLoanDept and BusinessLoanDept classes is checked using the interface Bank provided in the
locked code stub.

Input Format For Custom Testing
Sample Case 0
Sample Input 0
4 4
2348 929 1284 5543
3117 5196 3352 7068

Sample Output 0
Loans for clients processed
Loans for businesses processed
Average loan amount for clients is 2526.00
Maximum loan amount amongst clients is 5543
Minimum loan amount amongst clients is 929
Average loan amount for businesses is 4683.25
Maximum loan amongst businesses is 7068
=====================================================
*/
import java.util.*;

// --------- LOCKED / GIVEN CODE (DO NOT MODIFY) ---------

interface Bank {
    void assignLoans(int[] loans);
    void averageLoan();
    void maxLoan();
    void minLoan();
}

// --------- YOUR TASK STARTS HERE ---------

// Suggestion: Create a parent class to handle common logic (Inheritance)
abstract class LoanDepartment implements Bank {
    // Protected variables for inheritance
    
    
    // Common methods or abstract methods...
}

class PersonalLoanDept extends LoanDepartment {
	int clients;
	int[] loanAmounts;

    public PersonalLoanDept(int clients) {
        // YOUR CODE GOES HERE
        this.clients = clients;
        this.loanAmounts = new int [clients];
    }

    @Override
    public void assignLoans(int[] loans) {
        // YOUR CODE GOES HERE
        for(int i = 0 ; i < Math.min(loans.length, clients) ; i++) {
        	loanAmounts[i] = loans[i];
        }
        System.out.println( "Loans for clients processed");
    }

    @Override
    public void averageLoan() {
        // YOUR CODE GOES HERE
    	double averageLoan = 0.0;
    	for(int l : loanAmounts) averageLoan+=l;
    	averageLoan /= clients;
        System.out.println("Average loan amount for clients is "+String.format("%.2f",averageLoan));
    }

    @Override
    public void maxLoan() {
        // YOUR CODE GOES HERE
    	int maximumLoan = loanAmounts[0];
    	for(int l : loanAmounts) maximumLoan = Math.max(l, maximumLoan);
        System.out.println("Maximum loan amount amongst clients is "+maximumLoan);
    }

    @Override
    public void minLoan() {
        // YOUR CODE GOES HERE
    	int minimumLoan = loanAmounts[0];
    	for(int l : loanAmounts) minimumLoan = Math.min(l, minimumLoan);
        System.out.println("Minimum loan amount amongst clients is "+minimumLoan);
    }
}

class BusinessLoanDept extends LoanDepartment {
	int businesses;
	int[] loanAmounts;

    public BusinessLoanDept(int businesses) {
        // YOUR CODE GOES HERE
    	this.businesses = businesses;
        this.loanAmounts = new int [businesses];
    }

    @Override
    public void assignLoans(int[] loans) {
        // YOUR CODE GOES HERE
    	for(int i = 0 ; i < Math.min(loans.length, businesses) ; i++) {
        	loanAmounts[i] = loans[i];
        }
        System.out.println( "Loans for businesses processed");
    }

    @Override
    public void averageLoan() {
        // YOUR CODE GOES HERE
    	double averageLoan = 0.0;
    	for(int l : loanAmounts) averageLoan+=l;
    	averageLoan /= businesses;
        System.out.println("Average loan amount for businesses is "+String.format("%.2f",averageLoan));
    }

    @Override
    public void maxLoan() {
        // YOUR CODE GOES HERE
    	int maximumLoan = loanAmounts[0];
    	for(int l : loanAmounts) maximumLoan = Math.max(l, maximumLoan);
        System.out.println("Maximum loan amount amongst businesses is "+maximumLoan);
    }

    @Override
    public void minLoan() {
        // YOUR CODE GOES HERE
    	int minimumLoan = loanAmounts[0];
    	for(int l : loanAmounts) minimumLoan = Math.min(l, minimumLoan);
        System.out.println("Minimum loan amount amongst businesses is "+minimumLoan);
        
    }
}

// --------- MAIN CLASS (HANDLES INPUT PARSING) ---------

public class Prob6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Read sizes
        int nClients = sc.nextInt();
        int nBusinesses = sc.nextInt();

        // 2. Initialize Objects
        Bank personal = new PersonalLoanDept(nClients);
        Bank business = new BusinessLoanDept(nBusinesses);

        // 3. Read arrays
        int[] clientLoans = new int[nClients];
        // Note: The sample input provides exactly 'n' numbers for valid cases,
        // but logic inside assignLoans handles mismatched lengths if necessary.
        // For input parsing, we assume standard format or read whole line.
        for(int i=0; i<nClients; i++) {
            if(sc.hasNextInt()) clientLoans[i] = sc.nextInt();
        }
        
        int[] businessLoans = new int[nBusinesses];
        for(int i=0; i<nBusinesses; i++) {
            if(sc.hasNextInt()) businessLoans[i] = sc.nextInt();
        }

        // 4. Process Personal Loans
        personal.assignLoans(clientLoans);
        
        // 5. Process Business Loans
        business.assignLoans(businessLoans);
        
        // 6. Print Stats (Order based on sample output)
        personal.averageLoan();
        personal.maxLoan();
        personal.minLoan();
        
        business.averageLoan();
        business.maxLoan();
        business.minLoan(); // Note: This line isn't fully visible in image but implied by pattern
        
        sc.close();
    }
}