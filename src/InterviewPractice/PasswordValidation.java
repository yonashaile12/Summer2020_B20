package InterviewPractice;

public class PasswordValidation {

    public static boolean Password(String password) {

        String lowercase="(.*[a-z].*)";

        String uppercase="(.*[A-Z].*)";

        String numbers="(.*[0-9].*)";

        String specialChars="(.*[ -/, :-@].*)";

        boolean  HasLower = password.matches(lowercase);

        boolean HasUpper = password.matches(uppercase);

        boolean HasDigits = password.matches(numbers);

        boolean HasSpecial = password.matches(specialChars);

        boolean Valid = false;

        if(password.length() >= 6 && !password.contains(" ")) {
            if (HasLower && HasUpper && HasDigits && HasSpecial)
                Valid = true;
        }
        return Valid;

    }

   public static int maxValue( int[]  n ) {
        int max = Integer.MIN_VALUE;
        for(int each: n)
            if(each > max)
                max = each;
        return max;
    }

    public static void main(String[] args) {
        System.out.println(Password("Yoni@mussie12"));
    }


}
