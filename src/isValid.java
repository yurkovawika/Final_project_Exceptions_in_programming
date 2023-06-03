import java.text.ParseException;
import java.text.SimpleDateFormat;
public class isValid {


    static boolean isNum(String num) {
        try {
            Long.parseLong(num);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


    public static boolean isDate(String inDate) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        dateFormat.setLenient(false);
        try {
            dateFormat.parse(inDate.trim());
        } catch (ParseException pe) {
            return false;
        }
        return true;
    }

    static boolean isGender(String gen) {
        if (gen.equals("f") || gen.equals("m") || gen.equals("ж") || gen.equals("м")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isValidData(Data data) {
        StringBuilder nameError = new StringBuilder();
        if (data.firstname == null) {
            nameError.append("Bad firstname.\n");
        }
        if (data.lastname == null) {
            nameError.append("Bad lastname.\n");
        }
        if (data.surname == null) {
            nameError.append("Bad surname.\n");
        }
        if (data.gender == null) {
            nameError.append("Bad gender. Enter 'f' or 'm'.\n");
        }
        if (data.dateOfBirth == null) {
            nameError.append("Bad date of birth. Enter correct format - dd.mm.YYYY.\n");
        }
        if (data.phoneNumber == null) {
            nameError.append("Bad phone number.Enter only numbers.\n");
        }
        if (nameError.length()==0) {
            return true;
        }
        System.out.println(nameError);
        return false;
    }
}
