public class StringMethods {
    public static void main(String[] args) {
        String birthDate = "25/11/1982";
        int startingIndex = birthDate.indexOf("1982");
        System.out.println("starting index = " + startingIndex);
        System.out.println("Birth year = " + birthDate.substring(startingIndex));

        System.out.println("Month = " + birthDate.substring(3, 5));

//join method
        String newDate = String.join("/", "25", "11", "1982");
        System.out.println("newDate = " + newDate);

//concat method
        newDate = "25";
        newDate = newDate.concat("/");
        newDate = newDate.concat("11");
        newDate = newDate.concat("/");
        newDate = newDate.concat("1982");
        System.out.println("newDate = " + newDate);

        newDate = "25" + "/" + "11" + "/" + "1982";
        System.out.println("newDate = " + newDate);

//method chaining
        newDate = "25".concat("/").concat("11").concat("/").concat("1982");
        System.out.println("newDate = " + newDate);

//replace methods
        System.out.println(newDate.replace('/', '-'));
        System.out.println(newDate.replace("2", "00"));

        System.out.println(newDate.replaceFirst("/", "-"));
        System.out.println(newDate.replaceAll("/", "---"));

//repeat and indent method
        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(20));

        System.out.println("ABC\n".repeat(3).indent(8));
        System.out.println("-".repeat(20));

        System.out.println("    ABC\n".repeat(3).indent(-2));
        System.out.println("-".repeat(20));
    }
}
