import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordsForNumbersNew {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] split = str.split(" ");

        Map<Integer, String> single = new HashMap<>();
        single.put(1, "one");
        single.put(2, "two");
        single.put(3, "three");
        single.put(4, "four");
        single.put(5, "five");
        single.put(6, "six");
        single.put(7, "seven");
        single.put(8, "eight");
        single.put(9, "nine");

        for (int i = 0; i < split.length; i++) {
            if (Character.isDigit(split[i].charAt(0)) && split[i].length() == 1) {
                Integer word = Integer.parseInt(split[i]);
                if (word == 0)
                    System.out.print("zero");
                else
                    System.out.print(single.get(word) + " ");
                continue;
            } else {
                if (Character.isDigit(split[i].charAt(0))) {
                    Integer twoword = Integer.parseInt(split[i]);

                    // 11 to 19
                    if (twoword == 11) {
                        System.out.print("eleven ");
                        continue;
                    }
                    if (twoword == 12) {
                        System.out.print("twelve ");
                        continue;
                    }
                    if (twoword == 13) {
                        System.out.print("thirteen ");
                        continue;
                    }
                    if (twoword == 14) {
                        System.out.print("fourteen ");
                        continue;
                    }
                    if (twoword == 15) {
                        System.out.print("fifteen ");
                        continue;
                    }
                    if (twoword == 16) {
                        System.out.print("sixteen ");
                        continue;
                    }
                    if (twoword == 17) {
                        System.out.print("seventeen ");
                        continue;
                    }
                    if (twoword == 18) {
                        System.out.print("eighteen ");
                        continue;
                    }
                    if (twoword == 19) {
                        System.out.print("nineteen ");
                        continue;
                    }

                    // from 20 to 29
                    if (twoword >= 20 && twoword <= 29) {
                        System.out.print("twenty");
                        String s = Integer.toString(twoword);
                        String[] arr = s.split("");
                        Integer word = Integer.parseInt(arr[1]);
                        if (word == 0) {
                            System.out.print(" ");
                            continue;
                        } else {
                            System.out.print("-" + single.get(word) + " ");
                            continue;
                        }
                    }

                    // from 30 to 39
                    if (twoword >= 30 && twoword <= 39) {
                        System.out.print("thirty");
                        String s = Integer.toString(twoword);
                        String[] arr = s.split("");
                        Integer word = Integer.parseInt(arr[1]);
                        if (word == 0) {
                            System.out.print(" ");
                            continue;
                        } else {
                            System.out.print("-" + single.get(word) + " ");
                            continue;
                        }
                    }

                    // from 40 to 49
                    if (twoword >= 40 && twoword <= 49) {
                        System.out.print("fourty");
                        String s = Integer.toString(twoword);
                        String[] arr = s.split("");
                        Integer word = Integer.parseInt(arr[1]);
                        if (word == 0) {
                            System.out.print(" ");
                            continue;
                        } else {
                            System.out.print("-" + single.get(word) + " ");
                            continue;
                        }
                    }

                    // from 50 to 59
                    if (twoword >= 50 && twoword <= 59) {
                        System.out.print("fifty");
                        String s = Integer.toString(twoword);
                        String[] arr = s.split("");
                        Integer word = Integer.parseInt(arr[1]);
                        if (word == 0) {
                            System.out.print(" ");
                            continue;
                        } else {
                            System.out.print("-" + single.get(word) + " ");
                            continue;
                        }
                    }

                    // from 60 to 69
                    if (twoword >= 60 && twoword <= 69) {
                        System.out.print("sixty");
                        String s = Integer.toString(twoword);
                        String[] arr = s.split("");
                        Integer word = Integer.parseInt(arr[1]);
                        if (word == 0) {
                            System.out.print(" ");
                            continue;
                        } else {
                            System.out.print("-" + single.get(word) + " ");
                            continue;
                        }
                    }

                    // from 70 to 79
                    if (twoword >= 70 && twoword <= 79) {
                        System.out.print("seventy");
                        String s = Integer.toString(twoword);
                        String[] arr = s.split("");
                        Integer word = Integer.parseInt(arr[1]);
                        if (word == 0) {
                            System.out.print(" ");
                            continue;
                        } else {
                            System.out.print("-" + single.get(word) + " ");
                            continue;
                        }
                    }

                    // from 80 to 89
                    if (twoword >= 80 && twoword <= 89) {
                        System.out.print("eighty");
                        String s = Integer.toString(twoword);
                        String[] arr = s.split("");
                        Integer word = Integer.parseInt(arr[1]);
                        if (word == 0) {
                            System.out.print(" ");
                            continue;
                        } else {
                            System.out.print("-" + single.get(word) + " ");
                            continue;
                        }
                    }

                    // from 90 to 99
                    if (twoword >= 90 && twoword <= 99) {
                        System.out.print("ninety");
                        String s = Integer.toString(twoword);
                        String[] arr = s.split("");
                        Integer word = Integer.parseInt(arr[1]);
                        if (word == 0) {
                            System.out.print(" ");
                            continue;
                        } else {
                            System.out.print("-" + single.get(word) + " ");
                            continue;
                        }
                    }
                }
            }
            System.out.print(split[i] + " ");
        }
        sc.close();
    }

}
