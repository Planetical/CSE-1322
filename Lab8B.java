import java.util.Scanner;
public class Lab8B {

    static String repeatNTimes(String one, int two){
        if(two == 0){
            return "";
        } else {
            return one + repeatNTimes(one, two - 1);
        }
    }

    static boolean isReverse(String one, String two){
        if(one.length() != two.length()){
            return false;
        } else if(one.isEmpty()){
            return true;
        } else if (one.charAt(0) == two.charAt(two.length() - 1)){
            return isReverse(one.substring(1),two.substring(0,two.length()-1));
        } else {
            return false;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print(repeatNTimes("I must study recursion until it makes sense\n", 100));
        System.out.println("Enter the first string ");
        String s1 = sc.next();
        System.out.println("Enter the second string ");
        String s2 = sc.next();
        if(isReverse(s1,s2) == true) {
            System.out.println(s1 + " is the reverse of " + s2);
        } else {
            System.out.println(s1 + " is not the reverse of " + s2);
        }
    }
}
