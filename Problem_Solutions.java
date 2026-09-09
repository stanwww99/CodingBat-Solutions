package codingbat;

public class Problem_Solutions {
    public String[] fizzBuzz(int start, int end) {
        String[] result = new String[end - start];

        for (int i = start; i < end; i++) {
            int index = i - start;

            if (i % 15 == 0) {
                result[index] = "FizzBuzz";
            } else if (i % 3 == 0) {
                result[index] = "Fizz";
            } else if (i % 5 == 0) {
                result[index] = "Buzz";
            } else {
                result[index] = String.valueOf(i);
            }
        }

        return result;
    }

    public boolean has77(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            // Case 1: two 7s next to each other
            if (i + 1 < nums.length && nums[i] == 7 && nums[i + 1] == 7) {
                return true;
            }
            // Case 2: two 7s separated by one element
            if (i + 2 < nums.length && nums[i] == 7 && nums[i + 2] == 7) {
                return true;
            }
        }
        return false;
    }

    public int centeredAverage(int[] nums) {
        int sum = 0;
        int min = nums[0];
        int max = nums[0];

        // Find sum, min, max
        for (int n : nums) {
            sum += n;
            if (n < min) min = n;
            if (n > max) max = n;
        }

        // Subtract exactly one min and one max
        sum -= min;
        sum -= max;

        // Average the remaining numbers
        return sum / (nums.length - 2);
    }


    public boolean twoTwo(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                // Check if this 2 has a neighbor 2
                boolean hasLeft = (i > 0 && nums[i - 1] == 2);
                boolean hasRight = (i < nums.length - 1 && nums[i + 1] == 2);

                if (!hasLeft && !hasRight) {
                    return false; // this 2 is alone
                }
            }
        }
        return true;
    }

    public int sum67(int[] nums) {
        int sum = 0;
        boolean inBlock = false;

        for (int n : nums) {
            if (n == 6) {
                inBlock = true;      // start ignoring
            } else if (inBlock && n == 7) {
                inBlock = false;     // stop ignoring
            } else if (!inBlock) {
                sum += n;            // only add when not ignoring
            }
        }

        return sum;
    }

    public int[] pre4(int[] nums) {
        // Find the index of the first 4
        int index = 0;
        while (nums[index] != 4) {
            index++;
        }

        // Create a new array with elements before the first 4
        int[] result = new int[index];
        for (int i = 0; i < index; i++) {
            result[i] = nums[i];
        }

        return result;
    }
    public boolean has12(int[] nums) {
        boolean seenOne = false;

        for (int n : nums) {
            if (n == 1) {
                seenOne = true;
            }
            if (seenOne && n == 2) {
                return true;
            }
        }

        return false;
    }
    public boolean has22(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                return true;
            }
        }
        return false;
    }
    public int[] shiftLeft(int[] nums) {
        if (nums == null || nums.length <= 1) return nums;
        int first = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = first;
        return nums;
    }
    public int countEvens(int[] nums) {
        if (nums == null) return 0;
        int count = 0;
        for (int n : nums) {
            if (n % 2 == 0) count++;
        }
        return count;
    }
    public int[] fizzArray(int n) {
        if (n <= 0) return new int[0];
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = i;
        }
        return result;
    }

    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend) {
            // On weekends, only the lower bound matters
            return cigars >= 40;
        } else {
            // On weekdays, cigars must be between 40 and 60 inclusive
            return cigars >= 40 && cigars <= 60;
        }
    }
    public int teenSum(int a, int b) {
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) {
            return 19;
        }
        return a + b;
    }
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep) {
            return false;
        }
        if (isMorning && !isMom) {
            return false;
        }
        return true;
    }


}
