import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String fin = "";
        
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
                fin+=Character.toLowerCase(str.charAt(i));
            }
            else{
                fin+=Character.toUpperCase(str.charAt(i));
            }
        }
        System.out.println(fin);
    }
}