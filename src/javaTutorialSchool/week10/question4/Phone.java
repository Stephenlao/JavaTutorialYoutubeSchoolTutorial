package javaTutorialSchool.week10.question4;

import java.io.Serial;

public class Phone {
    private String name;
    private String SerialNumber;

    public Phone(String name, String SerialNumber) throws ValidationException {
        if (name == null || name.isEmpty()) {
            throw new ValidationException("Name is not empty");
        }
        if (SerialNumber == null || SerialNumber.isEmpty()) {
            throw new ValidationException("Serial number is not empty");
        }
        if (SerialNumber.length() != 16) {
            throw new ValidationException("Serial number must have 16 digits");
        }
        this.name = name;
        this.SerialNumber = SerialNumber;
    }

    public static void main(String[] args) throws ValidationException {
        try {
            Phone phone1 = new Phone("Khang", "0913501135801146");
            Phone phone2 = new Phone("", "0913501135801146");
            Phone phone3 = new Phone("Uyen", "");
            Phone phone4 = new Phone("Khang", "09135");
//            Phone phone1 = new Phone("Khang", "1234567812345678");
            System.out.println("Phone created corrected: " + phone1);
//            Phone phone2 = new Phone("", "1234567812345678");
        } catch (ValidationException ve) {
            System.out.println("Phone creation failed: " + ve.getMessage());
        }
    }


}
