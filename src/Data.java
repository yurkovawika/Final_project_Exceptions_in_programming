
public class Data implements Comparable<Data> {


    public String firstname;
    public String lastname;
    public String surname;
    public PhoneNumber phoneNumber;
    public Gender gender;
    public String dateOfBirth;


    public Data() {
    }


    public String getFirstName() {
        return this.firstname;
    }


    @Override
    public String toString() {
        return String.format("<%s><%s><%s><%s><%s><%s>", this.firstname, this.lastname, this.surname, this.dateOfBirth, this.phoneNumber, this.gender);
    }


    public int compareTo(Data otherData) {
        return this.lastname.compareTo(otherData.lastname);


    }

}
