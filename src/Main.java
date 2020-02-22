public class Main {
    public static void main(String[] args) {
        SpecRevers spr = new SpecRevers();


        String ss = "a1bhe6hcd2ef";
        System.out.println(ss + " -> " + spr.getReversOnlyLetters(ss));
        ss = "a1bcd";
        System.out.println(ss + " -> " + spr.getReversOnlyLetters(ss));
    }
}
