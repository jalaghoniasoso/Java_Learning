package ge.automation;

public class ChildOfCountVowel extends CountVowel {
    @Override
    public void countVowel(String inputStr) {
        int count = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        for (int i = 0; i < inputStr.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (Character.toLowerCase(inputStr.charAt(i)) == vowels[j]) {
                    count++;
                }
            }
        }

        System.out.println("ინსტრინგში " + count + " ხმოვანია");
    }
}
