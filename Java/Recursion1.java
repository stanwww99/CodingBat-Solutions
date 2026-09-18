package codingbat;

public class Recursion1 {
    public int factorial(int n) {
        if (n == 1) return 1;
        return n * factorial(n-1);
    }
    public int count7(int n) {
        if (n == 0) {
            return 0;
        }
        int lastDigit = n % 10;
        if (lastDigit == 7) {
            return 1 + count7(n / 10);
        }
        return count7(n / 10);
    }
    public int countX(String str) {
        if(str.length() == 0){
            return 0;
        }
        if(str.charAt(0)  == 'x'){
            return 1 + countX(str.substring(1));
        }
        return countX(str.substring(1));
    }
    public int countAbc(String str) {
        if (str.length() < 3) {
            return 0;
        }
        if (str.startsWith("abc") || str.startsWith("aba")) {
            return 1 + countAbc(str.substring(1));
        }
        return countAbc(str.substring(1));
    }
    public int strCount(String str, String sub) {
        if (str.length() < sub.length()) {
            return 0;
        }
        if (str.substring(0, sub.length()).equals(sub)) {
            return 1 + strCount(str.substring(sub.length()), sub);
        }
        return strCount(str.substring(1), sub);
    }
    public int bunnyEars(int bunnies) {
        if(bunnies == 0){
            return 0;
        }
        return bunnyEars(bunnies -1) + 2;
    }
    public boolean array220(int[] nums, int index) {
        if (index >= nums.length - 1) {
            return false;
        }
        if (nums[index + 1] == nums[index] * 10) {
            return true;
        }
        return array220(nums, index + 1);
    }
    public int count11(String str) {
        if (str.length() < 2) {
            return 0;
        }

        if (str.substring(0, 2).equals("11")) {
            return 1 + count11(str.substring(2));
        }
        return count11(str.substring(1));
    }
    public String parenBit(String str) {
        if (str.charAt(0) != '(') {
            return parenBit(str.substring(1));
        }

        if (str.charAt(str.length() - 1) != ')') {
            return parenBit(str.substring(0, str.length() - 1));
        }

        return str;
    }
    public int count8(int n) {
        if (n == 0) {
            return 0;
        }
        int last = n % 10;
        int secondLast = (n / 10) % 10;

        if (last == 8) {
            if (secondLast == 8) {
                return 2 + count8(n / 10);
            } else {
                return 1 + count8(n / 10);
            }
        }

        return count8(n / 10);
    }

    public int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public int powerN(int base, int n) {
        if(n == 1){
            return base;
        }
        return base*powerN(base, n -1);
    }
    public boolean array6(int[] nums, int index) {
        if (index >= nums.length) {
            return false;
        }
        if (nums[index] == 6) {
            return true;
        }
        return array6(nums, index + 1);
    }
    public int countPairs(String str) {
        if(str.length() < 3){
            return 0;
        }
        if (str.charAt(0) == str.charAt(2)) {

            return 1 + countPairs(str.substring(1));
        }
        return countPairs(str.substring(1));
    }
    public String stringClean(String str) {
        if (str.length() <= 1) {
            return str;
        }

        if (str.charAt(0) == str.charAt(1)) {
            return stringClean(str.substring(1));
        }

        return str.charAt(0) + stringClean(str.substring(1));
    }
    public int strDist(String str, String sub) {
        if (str.length() < sub.length()) {
            return 0;
        }

        if (str.startsWith(sub) && str.endsWith(sub)) {
            return str.length();
        }
        if (!str.startsWith(sub)) {
            return strDist(str.substring(1), sub);
        }
        return strDist(str.substring(0, str.length() - 1), sub);
    }
}
