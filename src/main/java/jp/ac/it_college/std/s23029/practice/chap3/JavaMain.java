package jp.ac.it_college.std.s23029.practice.chap3;

public class JavaMain {
    public static void main(String[] args) {
        HellByKotlin hellByKotlin = new HellByKotlin();
        hellByKotlin.printHello();

        System.out.println("----3.4.7----");
        System.out.println(CompanyConstants.Companion.getMaxEmployeeCount());

        System.out.println("----3.4.8----");
        System.out.println(CompanyConstants.getMinEmployeeCount());
    }
}
