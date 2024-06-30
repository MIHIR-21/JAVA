class Loops_2 {
    private int a, j, i, size;
    private String s;

    public void loop72to82() {

        System.out.println("loop 72 : ");
        a = 5;
        for (i = 1; i <= a; i++) {
            for (j = 1; j <= a - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 73 : ");
        a = 5;
        for (i = 1; i <= a; i++) {
            for (j = 1; j <= a - i; j++) {
                System.out.print("  ");
            }
            for (j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 74 : ");
        s = "abcde";
        size = s.length() - 1;
        for (i = 0; i <= size; i++) {
            for (j = 1; j <= size - i; j++) {
                System.out.print("  ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print(s.charAt(j) + " ");
            }
            for (j = i - 1; j >= 0; j--) {
                System.out.print(s.charAt(j) + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 75 : ");
        s = "ABCDE";
        size = s.length() - 1;
        for (i = 0; i <= size; i++) {
            for (j = 1; j <= size - i; j++) {
                System.out.print("  ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print(s.charAt(j) + " ");
            }
            for (j = i - 1; j >= 0; j--) {
                System.out.print(s.charAt(j) + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 76 : ");
        s = "abcde";
        size = s.length() - 1;
        for (i = size; i >= 0; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (j = size; j >= i; j--) {
                System.out.print(s.charAt(j) + " ");
            }
            for (j = i + 1; j <= s.length() - 1; j++) {
                System.out.print(s.charAt(j) + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 77 : ");
        s = "ABCDE";
        size = s.length() - 1;
        for (i = size; i >= 0; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (j = size; j >= i; j--) {
                System.out.print(s.charAt(j) + " ");
            }
            for (j = i + 1; j <= s.length() - 1; j++) {
                System.out.print(s.charAt(j) + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 78 : ");
        a = 5;
        for (i = a; i >= 1; i--) {
            for (j = 1; j <= i - 1; j++) {
                System.out.print("  ");
            }
            for (j = a; j >= i; j--) {
                System.out.print(j + " ");
            }
            for (j = i + 1; j <= a; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 79 : ");
        a = 5;
        for (i = a; i >= 1; i--) {
            for (j = i + 1; j <= a; j++) {
                System.out.print("  ");
            }
            for (j = 1; j <= i - 1; j++) {
                System.out.print(j + " ");
            }
            for (j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 80 : ");
        a = 5;
        for (i = 1; i <= a; i++) {
            for (j = 1; j <= i - 1; j++) {
                System.out.print("  ");
            }
            for (j = i; j <= a; j++) {
                System.out.print(j + " ");
            }
            for (j = a - i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 81 : ");
        s = "ABCDE";
        size = s.length() - 1;
        for (i = size; i >= 0; i--) {
            for (j = i - 3; j <= 0; j++) {
                System.out.print("  ");
            }
            for (j = 0; j <= i - 1; j++) {
                System.out.print(s.charAt(j) + " ");
            }
            for (j = i; j >= 0; j--) {
                System.out.print(s.charAt(j) + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 82 : ");
        s = "abcde";
        size = s.length() - 1;
        for (i = size; i >= 0; i--) {
            for (j = i - 3; j <= 0; j++) {
                System.err.print("  ");
            }
            for (j = 0; j <= i - 1; j++) {
                System.out.print(s.charAt(j) + " ");
            }
            for (j = i; j >= 0; j--) {
                System.out.print(s.charAt(j) + " ");
            }
            System.out.println();
        }
    }

    public void loop83to89() {

        System.out.println("loop 83 : ");
        s = "ABCDE";
        size = s.length() - 1;
        for (i = size; i >= 0; i--) {
            for (j = 0; j <= i; j++) {
                if (j == size) {
                    break;
                }
                System.out.print(s.charAt(j) + " ");
            }
            for (j = i; j <= size - 2; j++) {
                System.out.print("  ");
            }
            for (j = i; j <= size - 1; j++) {
                System.out.print("  ");
            }
            for (j = i; j >= 0; j--) {
                System.out.print(s.charAt(j) + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 84: ");
        s = "abcde";
        size = s.length() - 1;
        for (i = size; i >= 0; i--) {
            for (j = 0; j <= i; j++) {
                if (j == size) {
                    break;
                }
                System.out.print(s.charAt(j) + " ");
            }
            for (j = i; j <= size - 2; j++) {
                System.out.print("  ");
            }
            for (j = i; j <= size - 1; j++) {
                System.out.print("  ");
            }
            for (j = i; j >= 0; j--) {
                System.out.print(s.charAt(j) + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 85 : ");
        s = "ABCDE";
        size = s.length() - 1;
        for (i = 0; i <= size; i++) {
            for (j = 0; j <= i; j++) {
                if (j == size) {
                    break;
                }
                System.out.print(s.charAt(j) + " ");
            }
            for (j = i + 2; j <= size; j++) {
                System.out.print("  ");
            }
            for (j = i + 1; j <= size; j++) {
                System.out.print("  ");
            }
            for (j = i; j >= 0; j--) {
                System.out.print(s.charAt(j) + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 86 : ");
        s = "abcde";
        size = s.length() - 1;
        for (i = 0; i <= size; i++) {
            for (j = 0; j <= i; j++) {
                if (j == size) {
                    break;
                }
                System.out.print(s.charAt(j) + " ");
            }
            for (j = i + 2; j <= size; j++) {
                System.out.print("  ");
            }
            for (j = i; j <= size - 1; j++) {
                System.out.print("  ");
            }
            for (j = i; j >= 0; j--) {
                System.out.print(s.charAt(j) + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 87 : ");
        a = 5;
        for (i = a; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                if (j == a) {
                    break;
                }
                System.out.print(j + " ");
            }
            for (j = i + 2; j <= a; j++) {
                System.out.print("  ");
            }
            for (j = i; j <= a - 1; j++) {
                System.out.print("  ");
            }
            for (j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 88 : ");
        a = 5;
        for (i = 1; i <= a; i++) {
            for (j = 1; j <= i; j++) {
                if (j == a) {
                    break;
                }
                System.out.print(j + " ");
            }
            for (j = i; j <= a - 2; j++) {
                System.out.print("  ");
            }
            for (j = i; j <= a - 1; j++) {
                System.out.print("  ");
            }
            for (j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 89 : ");
        s = "abcde";
        size = s.length() - 1;
        for (i = 0; i <= size; i++) {
            for (j = size; j >= i; j--) {
                if (j == 0) {
                    break;
                }
                System.out.print(s.charAt(j) + " ");
            }
            for (j = size - 2; j <= i; j++) {
                System.out.print("  ");
            }
            for (j = 0; j <= i - 1; j++) {
                System.out.print("  ");
            }
            for (j = i; j <= size; j++) {
                System.out.print(s.charAt(j) + " ");
            }
            System.out.println();
        }
    }

    public void loop90to93() {

        System.out.println("loop 90 : ");
        a = 5;
        for (i = 1; i <= a; i++) {
            for (j = i; j <= a; j++) {
                System.out.print("  ");
            }
            for (j = 1; j <= i - 1; j++) {
                System.out.print(j + " ");
            }
            for (j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (i = a; i >= 1; i--) {
            for (j = i; j <= a + 1; j++) {
                System.out.print("  ");
            }
            for (j = 1; j <= i - 2; j++) {
                System.out.print(j + " ");
            }
            for (j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 91 : ");
        a = 5;
        for (i = 1; i <= a; i++) {
            for (j = i; j <= a; j++) {
                System.out.print("  ");
            }
            for (j = i; j >= 2; j--) {
                System.out.print(j + " ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (i = a; i >= 1; i--) {
            for (j = i; j <= a + 1; j++) {
                System.out.print("  ");
            }
            for (j = i - 1; j >= 2; j--) {
                System.out.print(j + " ");
            }
            for (j = 1; j <= i - 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 92 : ");
        s = "abcde";
        size = s.length() - 1;

        for (i = 0; i <= size; i++) {
            for (j = i; j <= size; j++) {
                System.out.print("  ");
            }
            for (j = 0; j <= i - 1; j++) {
                System.out.print(s.charAt(j) + " ");
            }
            for (j = i; j >= 0; j--) {
                System.out.print(s.charAt(j) + " ");
            }
            System.out.println();
        }
        for (i = size; i >= 0; i--) {
            for (j = i; j <= size + 1; j++) {
                System.out.print("  ");
            }
            for (j = 0; j <= i - 2; j++) {
                System.out.print(s.charAt(j) + " ");
            }
            for (j = i - 1; j >= 0; j--) {
                System.out.print(s.charAt(j) + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 93 : ");
        s = "ABCDE";
        size = s.length() - 1;
        for (i = 0; i <= size; i++) {
            for (j = i; j <= size; j++) {
                System.out.print("  ");
            }
            for (j = 0; j <= i - 1; j++) {
                System.out.print(s.charAt(j) + " ");
            }
            for (j = i; j >= 0; j--) {
                System.out.print(s.charAt(j) + " ");
            }
            System.out.println();
        }
        for (i = size; i >= 0; i--) {
            for (j = i; j <= size + 1; j++) {
                System.out.print("  ");
            }
            for (j = 0; j <= i - 2; j++) {
                System.out.print(s.charAt(j) + " ");
            }
            for (j = i - 1; j >= 0; j--) {
                System.out.print(s.charAt(j) + " ");
            }
            System.out.println();
        }
    }

    public void loop94to96() {

        System.out.println("loop 94 : ");
        a = 5;
        for (i = a; i >= 1; i--) {
            for (j = i; j <= a - 1; j++) {
                System.out.print("  ");
            }
            for (j = 1; j <= i - 1; j++) {
                System.out.print(j + " ");
            }
            for (j = i; j >= 1; j--) {
                System.out.print(j + " ");

            }
            System.out.println();
        }
        for (i = 2; i <= a; i++) {
            for (j = i + 1; j <= a; j++) {
                System.out.print("  ");
            }
            for (j = 1; j <= i - 1; j++) {
                System.out.print(j + " ");
            }
            for (j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 95 : ");
        s = "ABCDE";
        size = s.length() - 1;
        for (i = size; i >= 0; i--) {
            for (j = i; j <= size - 1; j++) {
                System.out.print("  ");
            }
            for (j = 0; j <= i - 1; j++) {
                System.out.print(s.charAt(j) + " ");
            }
            for (j = i; j >= 0; j--) {
                System.out.print(s.charAt(j) + " ");
            }
            System.out.println();
        }
        for (i = 1; i <= size; i++) {
            for (j = i; j <= size - 1; j++) {
                System.out.print("  ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print(s.charAt(j) + " ");
            }
            for (j = i - 1; j >= 0; j--) {
                System.out.print(s.charAt(j) + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("loop 96 :");
        s = "abcde";
        size = s.length() - 1;
        for (i = size; i >= 0; i--) {
            for (j = i; j <= size - 1; j++) {
                System.out.print("  ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print(s.charAt(j) + " ");
            }
            for (j = i - 1; j >= 0; j--) {
                System.out.print(s.charAt(j) + " ");
            }
            System.out.println();
        }
        for (i = 1; i <= size; i++) {
            for (j = i; j <= size - 1; j++) {
                System.out.print("  ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print(s.charAt(j) + " ");
            }
            for (j = i - 1; j >= 0; j--) {
                System.out.print(s.charAt(j) + " ");
            }
            System.out.println();
        }
    }
}

public class avdvance_Loops {
    public static void main(String[] args) {
        Loops_2 l1= new Loops_2();
        // l1.loop72to82();   
        // l1.loop83to89(); 
        // l1.loop90to93();
        l1.loop94to96();
    }

}
