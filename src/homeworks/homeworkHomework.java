package homeworks;

import utilities.ScannerHelper;

public class homeworkHomework {
    public static void main(String[] args) {
       String fullName = ScannerHelper.getAName();
        fullName = fullName.toLowerCase();
        int count = 0;
        for (int i = 0; i < fullName.length(); i++) {
            if (fullName.charAt(i) == 'a' || fullName.charAt(i) == 'e' || fullName.charAt(i) == 'i'
                    || fullName.charAt(i) == 'o' || fullName.charAt(i) == 'u')
                count++;
        }
    }
}
