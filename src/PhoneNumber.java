public class PhoneNumber {
    private String _phoneNumber;

    public PhoneNumber(String phoneNumber) {
        this._phoneNumber = phoneNumber;
    }


    public String get_phoneNumber() {
        return this._phoneNumber;
    }

    @Override
    public String toString() {
        return this.get_phoneNumber();
    }

}