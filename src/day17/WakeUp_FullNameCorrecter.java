package day17;

public class WakeUp_FullNameCorrecter {
    public static void main(String[] args) {
        //                 01234567890
        String fullName = "eBrAr cAkiR";

        String firstName= fullName.substring(0,5);
        String lastName= fullName.substring(6);

        String firstNameCorrected =
                firstName.toUpperCase().substring(0,1) + firstName.toLowerCase().substring(1);
        System.out.println(firstNameCorrected);

        String lastNameCorrected = lastName.toUpperCase().substring(0,1)
                + lastName.toLowerCase().substring(1);
        System.out.println(lastNameCorrected);
        fullName = firstNameCorrected + " " + lastNameCorrected;
        System.out.println(fullName);

    }
}
