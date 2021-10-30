package stringtointconversion;

// This program converts a String to an Integer

public class StringToIntConversion {

    public static void main(String[] args) {

        String numberAsString = "876";
        int i = Integer.parseInt(numberAsString);
        int result = i + 2;
        System.out.println(result); //878
    }
}
