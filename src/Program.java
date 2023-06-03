import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        System.out.print("Enter the data separated by a space - full name, date of birth, phone number, gender.\n"
                + "Example: Petrov Ivan Ivanovich 20.05.1990 m 76554564\n"
                + "->>> ");
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");

        isValid isvalid = new isValid();
        Data data = new Data();


        for (int i = 0; i < s.length; i++) {
            if (s.length != 6) {
                System.out.println("Incorrect amount of data entered!");
                return;
            } else if (isvalid.isGender(s[i])) {
                data.gender = new Gender(s[i]);
            } else if (isvalid.isNum(s[i])) {
                data.phoneNumber = new PhoneNumber(s[i]);
            } else if (isvalid.isDate(s[i])) {
                data.dateOfBirth = (s[i]);
            } else if (data.firstname == null) {
                data.firstname = s[i];
            } else if (data.lastname == null) {
                data.lastname = s[i];
            } else {
                data.surname = s[i];
            }
        }
        if (isvalid.isValidData(data)) {
            ExportData exportContacts = new ExportData();
            exportContacts.save(data);
        }
    }
}