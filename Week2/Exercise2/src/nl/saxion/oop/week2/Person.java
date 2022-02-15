package nl.saxion.oop.week2;

public class Person {
    private String firstname;
    private String lastname;
    private String zipCode;
    private String phoneNumber;
    private int age;

    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age is negative.");
        } else if (age > 150) {
            throw new IllegalArgumentException("Age is too high.");
        }

        this.age = age;
    }

    public void setZipCode(String zipCode) throws IllegalArgumentException {
        if (zipCode.length() == 6 && Character.isDigit(zipCode.charAt(0)) && Character.isDigit(zipCode.charAt(1)) &&
            Character.isDigit(zipCode.charAt(2)) && Character.isDigit(zipCode.charAt(3)) &&
            Character.isLetter(zipCode.charAt(4)) && Character.isLetter(zipCode.charAt(5))) {
            this.zipCode = zipCode;
        } else {
            throw new IllegalArgumentException("This is not a valid zipcode");
        }
    }

    public void setPhonenumber(String phoneNumber) throws IllegalArgumentException {
        if (phoneNumber.length() == 8 && phoneNumber.startsWith("0")) {
            this.phoneNumber = phoneNumber;
        } else {
            throw new IllegalArgumentException("Phonenumber does not start with a 0.");
        }
    }

    /**
     * This is the default generated toString from IntelliJ. It works for now!
     */
    @Override
    public String toString() {
        return "Person{" +
            "firstname='" + firstname + '\'' +
            ", lastname='" + lastname + '\'' +
            ", zipCode='" + zipCode + '\'' +
            ", phoneNumber='" + phoneNumber + '\'' +
            ", age=" + age +
            '}';
    }
}