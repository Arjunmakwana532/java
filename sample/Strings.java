package sample;

public class Strings {

    public static void main(String[] args) {

        char array[] = { 'a', 'b', 'c' };
        String text = new String(array);

        System.out.println(text);

        // concation method -- concat()
        String firstName = "alex";
        String lastName = "martin";

        System.out.println(firstName + " " + lastName);
        System.out.println(firstName.concat(lastName));

        // find length of string method -- length()
        System.out.println("The langth of FirstName" + " " + firstName.length());

        // print one by one char in string method ---charAt()
        for (int i = 0; i < firstName.length(); i++) {
            System.out.println(firstName.charAt(i));
        }
    }

}
