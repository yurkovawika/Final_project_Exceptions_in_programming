public class Gender {
    String gender;

    public Gender(String gender)  {
        this.gender = gender;
    }


    @Override
    public String toString() {
        return String.format("%s", this.gender);
    }
}
