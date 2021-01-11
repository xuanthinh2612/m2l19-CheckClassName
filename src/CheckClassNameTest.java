public class CheckClassNameTest {
    public static void main(String[] args) {
        String class1 = "C0318G";
        String class2 = "A03181G";
        String class3 = "M0318G";
        String class4 = "C0318C";
        String class5 = "P0323A";

        CheckClassName checkClassName = new CheckClassName();
        System.out.println(class1 + " is valid : "+checkClassName.check(class1));
        System.out.println(class2 + " is valid : "+checkClassName.check(class2));
        System.out.println(class3 + " is valid : "+checkClassName.check(class3));
        System.out.println(class4 + " is valid : "+checkClassName.check(class4));
        System.out.println(class5 + " is valid : "+checkClassName.check(class5));
    }
}
