import java.util.*;
class Loops {

    private int a, j, i, size;
    private String s;

    public void loop1to4() {
        a = 5;
        System.out.println("Loop 1 :");
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Loop 2 :");
        for (int i = a; i >= 1; i--) {
            for (int j = a; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Loop 3 :");
        for (int i = 1; i <= a; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Loop 4 :");
        for (int i = a; i >= 1; i--) {
            for (int j = i; j <= a; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void loop5to8() {
        System.out.println("loop 5:");
        s = "abcde";
        size = s.length() - 1;
        for (int i = 0; i <= size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(s.charAt(j) + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 6:");
        s = "ABCDE";
        size = s.length();
        for (i = 1; i <= size; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(s.charAt(j - 1) + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 7:");
        s = "abcde";
        size = s.length() - 1;
        for (i = 0; i <= size; i++) {
            for (j = i; j >= 0; j--) {
                System.out.print(s.charAt(j) + " ");
            }
            System.out.println();
        }

        System.out.println("");
        System.out.println("loop 8:");
        s = "ABCDE";
        size = s.length() - 1;
        for (i = 0; i <= size; i++) {
            for (j = i; j >= 0; j--) {
                System.out.print(s.charAt(j) + " ");
            }
            System.out.println();
        }
    }

    public void loop9to14() {

        System.out.println();
        System.out.println("loop 9:");
        a = 5;
        for (i = 1; i <= a; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 10:");
        a = 5;
        for (i = a; i >= 1; i--) {
            for (j = a; j >= i; j--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 11:");
        s = "abcde";
        for (i = 0; i <= s.length() - 1; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print(s.charAt(i) + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 12:");
        s = "ABCDE";
        size = s.length();
        for (i = 1; i <= size; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(s.charAt(i - 1) + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 13:");
        s = "abcde";
        size = s.length();
        for (i = size; i >= 1; i--) {
            for (j = size; j >= i; j--) {
                System.out.print(s.charAt(i - 1) + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 14:");
        s = "ABCDE";
        size = s.length() - 1;
        for (i = size; i >= 0; i--) {
            for (j = size; j >= i; j--) {
                System.out.print(s.charAt(i) + " ");
            }
            System.out.println();
        }
    }

    public void loop15to19() {

        System.out.println("loop 15:");
        a = 5;
        int c = 1;
        for (i = 1; i <= a; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(c + " ");
                c++;
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 16:");
        a = 5;
        for (i = 1; i <= a; i++) {
            for (j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print("1" + " ");
                } else {
                    System.out.print("0" + " ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 17:");
        a = 5;
        for (i = 1; i <= a; i++) {
            for (j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print("0" + " ");
                } else {
                    System.out.print("1" + " ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 18:");
        a = 5;
        for (i = 1; i <= a; i++) {
            for (j = 1; j <= i; j++) {
                if (i % 2 == 1) {
                    System.out.print("1" + " ");
                } else {
                    System.out.print("0" + " ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 19:");
        a = 5;
        for (i = 1; i <= a; i++) {
            for (j = 1; j <= i; j++) {
                if (i % 2 == 0) {
                    System.out.print("1" + " ");
                } else {
                    System.out.print("0" + " ");
                }
            }
            System.out.println();
        }
    }

    public void loop20to27() {

        System.out.println("loop 20:");
        a = 5;
        for (i = a; i >= 1; i--) {
            for (j = a; j >= i; j--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 21:");
        a = 5;
        int c = 1;
        for (i = 1; i <= a; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(c + " ");
                c++;
            }
            c = c - 1;
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 22:");
        a = 5;
        c = 0;
        for (i = a; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 23:");
        a = 5;
        for (i = 1; i <= a; i++) {
            for (j = a; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 24:");
        a = 5;
        for (i = 1; i <= a; i++) {
            for (j = i; j <= a; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 25:");
        a = 5;
        for (i = a; i >= 1; i--) {
            for (j = a; j >= 1; j--) {
                System.out.print(j + " ");
            }
            a = a - 1;
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 26:");
        a = 5;
        for (i = a; i >= 1; i--) {
            for (j = i; j >= 1; j--) {
                System.out.print(j % 2 + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 27 : ");
        a = 5;
        c = 1;
        for (i = a; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print(c + " ");
            }
            c++;
            System.out.println();
        }
    }

    public void loop28to34() {

        System.out.println("loop 28 :");
        String name = "abcde";
        size = name.length() - 1;
        for (i = size; i >= 0; i--) {
            for (j = 0; j <= i; j++) {
                System.out.print(name.charAt(j) + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 29 : ");
        s = "abcde";
        size = s.length() - 1;
        for (i = 0; i <= size; i++) {
            for (j = i; j <= size; j++) {
                System.out.print(s.charAt(j) + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 30 :");
        s = "ABCDE";
        size = s.length() - 1;
        for (i = size; i >= 0; i--) {
            for (j = 0; j <= i; j++) {
                System.out.print(s.charAt(j) + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 31 : ");
        s = "ABCDE";
        size = s.length() - 1;
        for (i = 0; i <= size; i++) {
            for (j = i; j <= size; j++) {
                System.out.print(s.charAt(j) + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 32 : ");
        s = "abcde";
        size = s.length() - 1;
        for (i = 0; i <= size; i++) {
            for (j = i; j <= size; j++) {
                System.out.print(s.charAt(i) + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 33 :");
        s = "abcde";
        size = s.length() - 1;
        for (i = size; i >= 0; i--) {
            for (j = 0; j <= i; j++) {
                System.out.print(s.charAt(i) + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 33 : ");
        s = "ABCDE";
        size = s.length() - 1;
        for (i = 0; i <= size; i++) {
            for (j = i; j <= size; j++) {
                System.out.print(s.charAt(i) + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 34 : ");
        s = "ABCDE";
        size = s.length() - 1;
        for (i = size; i >= 0; i--) {
            for (j = i; j >= 0; j--) {
                System.out.print(s.charAt(i) + " ");
            }
            System.out.println();
        }
    }

    public void loop35to40() {

        System.out.println("loop 35 : ");
        a = 5;
        for (i = a; i >= 1; i--) {
            for (j = i; j >= 1; j--) {
                System.out.print(j % 2 + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 36 : ");
        a = 5;
        int c = 1;
        for (i = a; i >= 1; i--) {
            for (j = i; j >= 1; j--) {
                System.out.print(c % 2 + " ");
            }
            c++;
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 37 :");
        a = 5;
        c = 5;
        for (i = a; i >= 1; i--) {
            for (j = i; j >= 1; j--) {
                if (c % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
                System.out.print(" ");
            }
            c--;
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 38 : ");
        a = 5;
        for (i = a; i >= 1; i--) {
            for (j = i; j >= 1; j--) {
                if (j % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 39 :");
        a = 5;
        c = 5;
        for (i = a; i >= 1; i--) {
            for (j = i; j >= 1; j--) {
                System.out.print(c + " ");
            }
            c--;
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 40 : ");
        a = 5;
        for (i = a; i >= 1; i--) {
            for (j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void loop41to45() {

        System.out.println("loop 41 : ");
        a = 5;
        for (i = 1; i <= a; i++) {
            for (j = 1; j <= a - i; j++) {
                System.out.print("  ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("loop 42 : ");
        a = 5;
        for (i = 1; i <= a; i++) {
            for (j = 1; j <= a - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 43 : ");

        a = 5;
        for (i = a; i >= 1; i--) {
            for (j = 1; j <= i - 1; j++) {
                System.out.print("  ");
            }
            for (int k = a; k >= i; k--) {
                System.out.print(k + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 44 : ");
        a = 5;
        for (i = 1; i <= a; i++) {
            for (j = 1; j <= a - i; j++) {
                System.out.print("  ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 45 : ");
        a = 5;
        for (i = 5; i >= 1; i--) {
            for (j = 1; j <= i - 1; j++) {
                System.out.print("  ");
            }
            for (int k = i; k <= a; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }

    public void loop46to53() {

        System.out.println("loop 46 : ");
        a = 5;
        for (i = a; i >= 1; i--) {
            for (j = 1; j <= i - 1; j++) {
                System.out.print("  ");
            }
            for (int k = a; k >= i; k--) {
                System.out.print(k % 2 + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 47 : ");
        a = 5;
        for (i = a; i >= 1; i--) {
            for (j = 1; j <= i - 1; j++) {
                System.out.print("  ");
            }
            for (int k = a; k >= i; k--) {
                if (k % 2 == 0) {
                    System.out.print("1" + " ");
                } else {
                    System.out.print("0" + " ");
                }
                // System.out.print(k + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 48 : ");
        s = "ABCDE";
        size = s.length() - 1;
        for (i = 0; i <= size; i++) {
            for (j = size; j >= i + 1; j--) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(s.charAt(k) + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 49 : ");
        s = "abcde";
        size = s.length() - 1;
        for (i = 0; i <= size; i++) {
            for (j = 1; j <= size - i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(s.charAt(k) + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 50 : ");
        s = "ABCDE";
        size = s.length() - 1;
        for (i = 0; i <= size; i++) {
            for (j = 1; j <= size - i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(s.charAt(i) + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 51 : ");
        s = "abcde";
        size = s.length() - 1;
        for (i = size; i >= 0; i--) {
            for (j = i; j >= 1; j--) {
                System.out.print("  ");
            }
            for (int k = size; k >= i; k--) {
                System.out.print(s.charAt(i) + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 52 : ");
        s = "ABCDE";
        size = s.length() - 1;
        for (i = size; i >= 0; i--) {
            for (j = i; j >= 1; j--) {
                System.out.print("  ");
            }
            for (int k = size; k >= i; k--) {
                System.out.print(s.charAt(i) + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 53 : ");
        a = 5;
        for (i = 1; i <= a; i++) {
            for (j = 1; j <= a - i; j++) {
                System.out.print("  ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(i % 2 + " ");
            }
            System.out.println();
        }
    }

    public void loop54to59() {

        System.out.println("loop 54 : ");
        a = 5;
        for (i = 0; i <= a; i++) {
            for (j = 0; j <= i - 1; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= a - i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 55 : ");
        a = 5;
        for (i = 1; i <= a; i++) {
            for (j = 1; j <= i - 1; j++) {
                System.out.print("  ");
            }
            for (int k = a; k >= i; k--) {
                System.out.print(k + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 56 : ");
        a = 5;
        for (i = 1; i <= a; i++) {
            for (j = 1; j <= i - 1; j++) {
                System.out.print("  ");
            }
            for (int k = i; k <= a; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 57 :");
        a = 5;
        for (i = a; i >= 1; i--) {
            for (j = i; j <= a - 1; j++) {
                System.out.print("  ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("loop 58 : ");
        a = 5;
        for (i = a; i >= 1; i--) {
            for (j = i; j <= a - 1; j++) {
                System.out.print("  ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 59 : ");
        a = 5;
        for (i = 1; i <= a; i++) {
            for (j = 1; j <= i - 1; j++) {
                System.out.print("  ");
            }
            for (int k = i; k <= a; k++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public void loop60to71() {

        System.out.println("loop 60 : ");
        a = 5;
        for (i = 1; i <= a; i++) {
            for (j = 1; j <= i - 1; j++) {
                System.out.print("  ");
            }
            for (int k = i; k <= a; k++) {
                System.out.print(k % 2 + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 61 : ");
        a = 5;
        for (i = 1; i <= a; i++) {
            for (j = 1; j <= i - 1; j++) {
                System.out.print("  ");
            }
            for (int k = i; k <= a; k++) {
                if (i % 2 == 1) {
                    System.out.print("0" + " ");
                } else {
                    System.out.print("1" + " ");
                }
                // System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 62 : ");
        s = "abcde";
        size = s.length() - 1;

        for (i = size; i >= 0; i--) {
            for (j = i; j <= s.length() - 2; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(s.charAt(k) + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 63 : ");
        s = "ABCDE";
        size = s.length() - 1;
        for (i = size; i >= 0; i--) {
            for (j = i; j <= s.length() - 2; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(s.charAt(k) + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 64 : ");
        s = "abcde";
        size = s.length() - 1;
        for (i = 0; i <= size; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int k = i; k <= size; k++) {
                System.out.print(s.charAt(k) + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 65 : ");
        s = "ABCDE";
        size = s.length() - 1;
        for (i = 0; i <= size; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int k = i; k <= size; k++) {
                System.out.print(s.charAt(k) + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 66 :");
        a = 5;
        for (i = 1; i <= a; i++) {
            for (j = 1; j <= a - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 67 : ");
        s = "abcde";
        size = s.length() - 1;
        for (i = 0; i <= size; i++) {
            for (j = i; j <= a - 2; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(s.charAt(k) + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 68 : ");
        a = 5;
        for (i = 1; i <= a; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 69 : ");
        a = 5;
        for (i = 1; i <= a; i++) {
            for (j = i; j <= a - 1; j++) {
                System.err.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 70 : ");
        s = "ABCDE";
        size = s.length() - 1;
        for (i = 0; i <= size; i++) {
            for (j = i; j <= a - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(s.charAt(k) + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 71 : ");
        s = "abcde";
        size = s.length() - 1;
        for (i = size; i >= 0; i--) {
            for (j = i; j >= 0; j--) {
                System.out.print(" ");
            }
            for (int k = s.length() - 1; k >= i; k--) {
                System.out.print(s.charAt(k) + " ");
            }
            System.out.println();
        }
    }

}

public class BasicLoop1 {
    public static void main(String[] args) {
        Loops l1 = new Loops();

        // l1.loop1to4();
        // l1.loop5to8();
        // l1.loop9to14();
        // l1.loop15to19();
        // l1.loop20to27();
        // l1.loop28to34();
        // l1.loop35to40();
        // l1.loop41to45();
        // l1.loop46to53();
        // l1.loop54to59();
        l1.loop60to71();
    }

}
