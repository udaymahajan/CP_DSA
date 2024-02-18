public class Palindrome {
    static boolean isPalindrome(String s) {

        StringBuilder sb = new StringBuilder();

        for(char ch: s.toCharArray()) {
            if(Character.isLetterOrDigit(ch)) {
                sb.append(Character.toLowerCase(ch));
            }
        }

        return sb.toString().contentEquals(sb.reverse());
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("Madam"));
    }
}
