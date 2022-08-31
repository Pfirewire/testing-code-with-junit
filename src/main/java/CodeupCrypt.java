import util.Input;

public class CodeupCrypt {
    public static double version;

    public static String hashPassword(String unsecurePassword) {
        String securePassword;
        char[] passwordCharArray = unsecurePassword.toCharArray();
        for(int i = 0; i < passwordCharArray.length; i++) {
            if(passwordCharArray[i] == 'a' || passwordCharArray[i] == 'A') {
                passwordCharArray[i] = '4';
            } else if (passwordCharArray[i] == 'e' || passwordCharArray[i] == 'E') {
                passwordCharArray[i] = '3';
            } else if (passwordCharArray[i] == 'i' || passwordCharArray[i] == 'I') {
                passwordCharArray[i] = '1';
            } else if (passwordCharArray[i] == 'o' || passwordCharArray[i] == 'O') {
                passwordCharArray[i] = '0';
            } else if (passwordCharArray[i] == 'u' || passwordCharArray[i] == 'U') {
                passwordCharArray[i] = '9';
            }
        }
        securePassword = new String(passwordCharArray);
        return securePassword;
    }

    public static boolean checkPassword(String unsecurePassword, String securePassword) {
        return securePassword.equals(hashPassword(unsecurePassword));
    }

}
