package practice1;

public class hospital {
    public static void main(String[] args) {
        System.out.println("Hospital system working!");
        String patientId = "P12345"; 
        String upiId = "patient@upi"; 
        boolean checkStatus = true; 

        System.out.println("Bill for patient " + patientId + " is Rs. 500");

        System.out.println("Processing payment of Rs. 500 via " + upiId + "...");
        System.out.println("Payment Successful. Transaction ID: TXN123456");

        if (checkStatus) {
            System.out.println("Status: Payment Completed");
        }
    }
}
