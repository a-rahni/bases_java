package fondamentaux;

import java.util.*;

class ASCIIArt {
    static final char FIRST_CHAR = 'a';
    static final char LAST_CHAR = 'z';
    static final char QU_MARK = LAST_CHAR+1;

    /** prints the l-th line of the ASCII-art representation of a character
     * @param l line to print
     * @param c char to print
     * @param rep ASCII-art representation of the whole alphabet + ?
     * @param w width of the ASCII-art representation of 1 character
     */
    public static void printChar(int l, char c, String[] rep, int w) {
        int begin = (c-FIRST_CHAR)*w;
        int end = begin+w;
        System.out.print(rep[l].substring(begin, end));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // width and height of the ASCII-art representation of 1 character
        System.out.println("width: ");
        int width = in.nextInt();
        System.out.println("height: ");
        int height = in.nextInt();

        // text to convert
        System.out.println("text to convert: ");
        in.nextLine();
        String text = in.nextLine().toLowerCase();

        // ASCII art representations of the whole alphabet + ?
        String[] rows = new String[height];
        for (int i = 0; i < height; i++)
            rows[i] = in.nextLine();

        // prints the result line by line, character by character
        for (int l = 0; l < height; l++) {
            for (char c : text.toCharArray())
                if (FIRST_CHAR <= c && c <= LAST_CHAR)
                    printChar(l, c, rows, width);
                else
                    printChar(l, QU_MARK, rows, width);
            System.out.print("\n");
        }
    }
}
