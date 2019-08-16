import java.util.*;
import java.io.*;
import java.math.*;

/**
 * ASCII ART
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        // Width
        int L = in.nextInt();

        // Height
        int H = in.nextInt();

        if (in.hasNextLine()) {
            in.nextLine();
        }

        // Text
        String T = in.nextLine();


        List<Letter> letters = new ArrayList<>(27);
        for (int i = 0; i < 27; ++i) {
            Letter temp = new Letter();
            temp.setHeight(H);
            temp.setWidth(L);
            letters.add(temp);
        }


        for (int i = 0; i < H; i++) {
            String ROW = in.nextLine();

            // Construct letters
            int count = 0;
            for (int j = 0; j < 27; ++j) {
                Letter l = letters.get(j);
                if (l == null) {
                    l = new Letter();
                    letters.add(l);
                }

                l.append(ROW.substring(count * L, (count + 1) * L));
                ++count;
            }
        }

//        letters.get(4).print();



        Word word = new Word();
        String upperCaseT = T.toUpperCase();
        for (int i = 0; i < T.length(); ++i) {
            int index = upperCaseT.charAt(i) - 'A';
            if (index >= 0 && index <= 25) {
//                System.out.println(index);
                word.appendLetter(letters.get(index));
            }
            else {
                word.appendLetter(letters.get(26));
            }
        }

        word.print();

    }
}


class Word {
    private List<Letter> letters = new ArrayList<>();

    private int numOfLetters = 0;

    public Word() {}

    public void appendLetter(Letter letter) {
        if (letter != null) {
            this.letters.add(letter);
            this.numOfLetters++;
        }
    }

    public void print() {
        if (null != this.letters) {
            for (int i = 0; i < this.letters.get(0).getHeight(); i++) {
                for (int j = 0; j < this.numOfLetters; j++) {
                    for (int k = 0; k < this.letters.get(j).getWidth(); k++) {
                        System.out.print(this.letters.get(j).getLetter().charAt(i * letters.get(0).getWidth() + k));
                    }
                }

                System.out.println();
            }
        }

    }

}

class Letter {
    private String letter = "";

    private int height = 0;

    private int width = 0;

    public Letter() {}

    public Letter(String letter) {
        this.letter = letter;
    }

    public int getPixelNum() {
        return this.height * this.width;
    }

    public Letter(String str, int height, int width) {
        this.letter = str;
        this.height = height;
        this.width = width;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    public void append(String substr) {
        this.letter += substr;
    }

    public String getLetter() {
        return this.letter;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return this.height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return this.width;
    }

    public void print() {
        if (this.letter != null) {
            for (int i = 0; i < this.height * this.width; i++) {
                System.out.print(this.letter.charAt(i));
                if ((i + 1) % this.width == 0) {
                    System.out.println();
                }
            }
        }
    }
}