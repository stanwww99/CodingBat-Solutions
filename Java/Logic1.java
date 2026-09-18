package codingbat;

public class Logic1 {
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

    public int dateFashion(int you, int date) {
        if (you <= 2 || date <= 2) {
            return 0;
        }
        if (you >= 8 || date >= 8) {
            return 2;
        }
        return 1;
    }
}
