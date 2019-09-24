import java.util.*;

public class chess {
    public static void main(String[] args) {

        int A[][] = new int[8][8];
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                {
                    if (i % 2 != 0) { {
                        if ((j % 2) != 0) {
                            System.out.print("WW" + "|");
                        } else {
                            System.out.print("BB" + "|");
                        }}
                    } else {
                        if ((j % 2) == 0) {
                            System.out.print("WW" + "|");
                        } else {
                            System.out.print("BB" + "|");
                        }
                    }


                }
            }
            System.out.println();
        }
    }
}
