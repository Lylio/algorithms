package firstrepeatedcharacter;

// This program finds the first repeated character in a String

public class FirstRepeatedCharacter {

    public static void main(String[] args) {

        String str = "Here we are now, entertain us";
        int index = findFirstRepeated(str);
        if(index != -1) {
            System.out.println("First repeated character '" + str.charAt(index) + "' found at index " + index);
        } else {
            System.out.println("No repeated character found");
        }
    }

    private static int findFirstRepeated(String str) {
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            for(int j = i + 1; j < str.length(); j++) {
                if(c == str.charAt(j))
                    return j;
            }
        }
        return -1;
    }
}
