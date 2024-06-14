package se.lexicon.sami;

public class StringExercises {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task11();
        task12();


    }


    public static void task1() {
        String message = ("Java");
        System.out.println("The length of the word " + message + " is " + message.length());
    }

        public static void task2() {
            String message = ("Long example sentence");
            System.out.println(message);
            System.out.println(message.charAt(6));

        }

    public static void task3() {
        String message = ("Even longer example sentence\" ");
        System.out.println(message);
        System.out.println(message.indexOf("o"));
    }

    public static void task4() {
        String message = ("Ok this is not as long!");
        System.out.println(message);
        System.out.println(message.substring(10, 21 + 1));
    }

    public static void task5() {
        String message = ("CAPS EQUALS SCREAMING");
        System.out.println(message);
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());

    }

    public static void task6() {
        String message = ("Java is the worst programming language!");
        System.out.println(message);
        System.out.println(message.replace("worst","best"));

    }

    public static void task7() {

        String message = ("\\tJ\\ta\\tv\\ta\\t");
        System.out.println(message);
        System.out.println(message.trim());
    }

    public static void task8() {

        int numb = 20;
        String result = numb + "20";
        System.out.println(result);

    }

    public static void task9() {
        String message = "Oil and Water";
        String[] words = message.split(" and ");
        for (String word : words) {
            System.out.println(word);
        }}

        public static void task10() {
            String names = "Carl,Susie,Fredrick,Bob,Erik";
            String[] nameArray = names.split(" , ");
            for (String message : nameArray) {
                System.out.println(message);


            }}

    public static void task11() {
        String toBeConverted = "This should be converted";
        char[] charArray = toBeConverted.toCharArray();
        for (char c : charArray) {
            System.out.println(c);
        }}


    public static void task12() {
        char[] javaArray = {'J','a','v','a'};
        String toString = new String(javaArray);
        System.out.println(toString);


    }

}








/* Convert the following String: "ThisShouldBeConverted" to
a char array. Iterate through the char array and print out
each element.

char[] javaArray = {'J', 'a', 'v', 'a'};
String javaString = new String(javaArray);
System.out.println(javaString); // Output: Java


*/