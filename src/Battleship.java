import java.util.Scanner;
// Here is a comment
// Change the welcome message
// Example Required Change to Game: Game should not crash if an invalid row and/or an invalid column is provided by the user
// Add more ships, with different numbers of pieces. Add a 4 piece ship, a 3 piece, a 2 piece, and a 1 piece ship.
class Ship {
    int numberOfPieces; // piece of data... aka property... aka variable
    public void PrintNumberOfPieces () {
        System.out.println("# of pieces this ship has: " + numberOfPieces);
    }

    public Ship () {
        numberOfPieces = 4;
    }

    public Ship () {
        numberOfPieces = 3;
    }

    public Ship () {
        numberOfPieces = 2;
    }

    public Ship () {
        numberOfPieces = 1;
    }

    public Ship (int numPieces) {
        numberOfPieces = numPieces;
    }

    // setter method
    public void SetNumPieces (int numPieces) {
        numberOfPieces = numPieces;
    }

    // getter method
    public int GetNumPieces () {
        return numberOfPieces;
    }
}

class Out {
    public void msg (String m) {
        System.out.println(m);
    }
}

class Board {
    public Board () {
        o = new Out();
    }

    public void placeShip(int row, int startColumn) {
        if (row == 0) shipRow = "a";
        else if (row == 1) shipRow = "b";
        else if (row == 2) shipRow = "c";
        else if (row == 3) shipRow = "d";
        else if (row == 4) shipRow = "e";
        else if (row == 5) shipRow = "f";
        else if (row == 6) shipRow = "g";
        else if (row == 7) shipRow = "h";
        else if (row == 8) shipRow = "i";
        else if (row == 9) shipRow = "j";

        columnOne = startColumn;
        columnTwo = startColumn + 1;
        columnThree = startColumn + 2;
        columnFour = startColumn + 3;
        columnFive = startColumn + 4;
    }

    public int checkWinStatus() {
        int hits = 0;
        if (shipRow == "a") {
            for (int idx = 0; idx < 10; ++idx) {
                if (columnOne == idx && a[columnOne] == 5) ++hits;
                if (columnTwo == idx && a[columnTwo] == 5) ++hits;
                if (columnThree == idx && a[columnThree] == 5) ++hits;
                if (columnFour == idx && a[columnFour] == 5) ++hits;
                if (columnFive == idx && a[columnFive] == 5) ++hits;
            }
        }
        if (shipRow == "b") {
            for (int idx = 0; idx < 10; ++idx) {
                if (columnOne == idx && b[columnOne] == 5) ++hits;
                if (columnTwo == idx && b[columnTwo] == 5) ++hits;
                if (columnThree == idx && b[columnThree] == 5) ++hits;
                if (columnFour == idx && b[columnFour] == 5) ++hits;
                if (columnFive == idx && b[columnFive] == 5) ++hits;
            }
        }
        if (shipRow == "c") {
            for (int idx = 0; idx < 10; ++idx) {
                if (columnOne == idx && c[columnOne] == 5) ++hits;
                if (columnTwo == idx && c[columnTwo] == 5) ++hits;
                if (columnThree == idx && c[columnThree] == 5) ++hits;
                if (columnFour == idx && c[columnFour] == 5) ++hits;
                if (columnFive == idx && c[columnFive] == 5) ++hits;
            }
        }
        if (shipRow == "d") {
            for (int idx = 0; idx < 10; ++idx) {
                if (columnOne == idx && d[columnOne] == 5) ++hits;
                if (columnTwo == idx && d[columnTwo] == 5) ++hits;
                if (columnThree == idx && d[columnThree] == 5) ++hits;
                if (columnFour == idx && d[columnFour] == 5) ++hits;
                if (columnFive == idx && d[columnFive] == 5) ++hits;
            }
        }
        if (shipRow == "e") {
            for (int idx = 0; idx < 10; ++idx) {
                if (columnOne == idx && e[columnOne] == 5) ++hits;
                if (columnTwo == idx && e[columnTwo] == 5) ++hits;
                if (columnThree == idx && e[columnThree] == 5) ++hits;
                if (columnFour == idx && e[columnFour] == 5) ++hits;
                if (columnFive == idx && e[columnFive] == 5) ++hits;
            }
        }
        if (shipRow == "f") {
            for (int idx = 0; idx < 10; ++idx) {
                if (columnOne == idx && f[columnOne] == 5) ++hits;
                if (columnTwo == idx && f[columnTwo] == 5) ++hits;
                if (columnThree == idx && f[columnThree] == 5) ++hits;
                if (columnFour == idx && f[columnFour] == 5) ++hits;
                if (columnFive == idx && f[columnFive] == 5) ++hits;
            }
        }
        if (shipRow == "g") {
            for (int idx = 0; idx < 10; ++idx) {
                if (columnOne == idx && g[columnOne] == 5) ++hits;
                if (columnTwo == idx && g[columnTwo] == 5) ++hits;
                if (columnThree == idx && g[columnThree] == 5) ++hits;
                if (columnFour == idx && g[columnFour] == 5) ++hits;
                if (columnFive == idx && g[columnFive] == 5) ++hits;
            }
        }
        if (shipRow == "h") {
            for (int idx = 0; idx < 10; ++idx) {
                if (columnOne == idx && h[columnOne] == 5) ++hits;
                if (columnTwo == idx && h[columnTwo] == 5) ++hits;
                if (columnThree == idx && h[columnThree] == 5) ++hits;
                if (columnFour == idx && h[columnFour] == 5) ++hits;
                if (columnFive == idx && h[columnFive] == 5) ++hits;
            }
        }
        if (shipRow == "i") {
            for (int idx = 0; idx < 10; ++idx) {
                if (columnOne == idx && i[columnOne] == 5) ++hits;
                if (columnTwo == idx && i[columnTwo] == 5) ++hits;
                if (columnThree == idx && i[columnThree] == 5) ++hits;
                if (columnFour == idx && i[columnFour] == 5) ++hits;
                if (columnFive == idx && i[columnFive] == 5) ++hits;
            }
        }
        if (shipRow == "j") {
            for (int idx = 0; idx < 10; ++idx) {
                if (columnOne == idx && j[columnOne] == 5) ++hits;
                if (columnTwo == idx && j[columnTwo] == 5) ++hits;
                if (columnThree == idx && j[columnThree] == 5) ++hits;
                if (columnFour == idx && j[columnFour] == 5) ++hits;
                if (columnFive == idx && j[columnFive] == 5) ++hits;
            }
        }

        String msg = "So far the number of hits you have is: " + hits;
        System.out.println(msg);
        return hits;
    }

    public void handleUserGuess() {
        boolean hit = false;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Which Row? (a,b,c,d,e,f,g,h,i,j)");
        String row = userInput.nextLine();
        System.out.println("Which Column? (0,1,2,3,4,5,6,7,8,9)");
        int column = userInput.nextInt();

        o.msg("\n\n You entered " + row + column + "\n");
        if (row.equals(shipRow)) {
            if (
                    (column == columnOne) ||
                            (column == columnTwo) ||
                            (column == columnThree) ||
                            (column == columnFour) ||
                            (column == columnFive)
            ) {
/*****************
 Left off here together on Thursday, April 15th.
 Please see previous video for step by step code up until this point.
 By the way, devs often use comments like this to leave notes about
 where they left off, and any key ideas, problems, questions, etc that
 they had in mind when they were last working on code.
 Your engineering notebook is great for this too.
 For code comments, you just want to remember to remove them when
 you are done!
 *****************/
                if (row.equals("a")) {
                    a[column] = 5;
                    hit = true;
                }
                else if (row.equals("b")) {
                    b[column] = 5;
                    hit = true;
                }
                else if (row.equals("c")) {
                    c[column] = 5;
                    hit = true;
                }
                else if (row.equals("d")) {
                    d[column] = 5;
                    hit = true;
                }
                else if (row.equals("e")) {
                    e[column] = 5;
                    hit = true;
                }
                else if (row.equals("f")) {
                    f[column] = 5;
                    hit = true;
                }
                else if (row.equals("g")) {
                    g[column] = 5;
                    hit = true;
                }
                else if (row.equals("h")) {
                    h[column] = 5;
                    hit = true;
                }
                else if (row.equals("i")) {
                    i[column] = 5;
                    hit = true;
                }
                else if (row.equals("j")) {
                    j[column] = 5;
                    hit = true;
                }
                else o.msg("You did not provide a valid column number");
            }
        }
        else if ((row.equals("a")) && column <= 9) { a[column] = 1; }
        else if ((row.equals("b")) && column <= 9) { b[column] = 1; }
        else if ((row.equals("c")) && column <= 9) { c[column] = 1; }
        else if ((row.equals("d")) && column <= 9) { d[column] = 1; }
        else if ((row.equals("e")) && column <= 9) { e[column] = 1; }
        else if ((row.equals("f")) && column <= 9) { f[column] = 1; }
        else if ((row.equals("g")) && column <= 9) { g[column] = 1; }
        else if ((row.equals("h")) && column <= 9) { h[column] = 1; }
        else if ((row.equals("i")) && column <= 9) { i[column] = 1; }
        else if ((row.equals("j")) && column <= 9) { j[column] = 1; }
        else {
            System.out.println("You entered an invalid row and/or column, come on now, let's keep it on the board please... row must be between a-j inclusive, columns must be between 0-9 inclusive...");
        }
        if (hit == false) o.msg("That was a MISS!");
        else o.msg("That was a HIT!!! ... uh oh!!");
    }

    public void showBoard () {
        System.out.println("\n\n*****GAME BOARD*****");
        System.out.println("   0  1  2  3  4  5  6  7  8  9");

        System.out.print("a  ");
        for (int idx = 0; idx <= 9; ++idx) {
            System.out.print(a[idx]);
            System.out.print("  ");
        }
        System.out.print("\nb  ");
        for (int idx = 0; idx <= 9; ++idx) {
            System.out.print(b[idx]);
            System.out.print("  ");
        }
        System.out.print("\nc  ");
        for (int idx = 0; idx <= 9; ++idx) {
            System.out.print(c[idx]);
            System.out.print("  ");
        }
        System.out.print("\nd  ");
        for (int idx = 0; idx <= 9; ++idx) {
            System.out.print(d[idx]);
            System.out.print("  ");
        }
        System.out.print("\ne  ");
        for (int idx = 0; idx <= 9; ++idx) {
            System.out.print(e[idx]);
            System.out.print("  ");
        }
        System.out.print("\nf  ");
        for (int idx = 0; idx <= 9; ++idx) {
            System.out.print(f[idx]);
            System.out.print("  ");
        }
        System.out.print("\ng  ");
        for (int idx = 0; idx <= 9; ++idx) {
            System.out.print(g[idx]);
            System.out.print("  ");
        }
        System.out.print("\nh  ");
        for (int idx = 0; idx <= 9; ++idx) {
            System.out.print(h[idx]);
            System.out.print("  ");
        }
        System.out.print("\ni  ");
        for (int idx = 0; idx <= 9; ++idx) {
            System.out.print(i[idx]);
            System.out.print("  ");
        }
        System.out.print("\nj  ");
        for (int idx = 0; idx <= 9; ++idx) {
            System.out.print(j[idx]);
            System.out.print("  ");
        }
        System.out.println("\n\n");
    }

    Out o;
    public int[] a = {0,0,0,0,0,0,0,0,0,0};
    public int[] b = {0,0,0,0,0,0,0,0,0,0};
    public int[] c = {0,0,0,0,0,0,0,0,0,0};
    public int[] d = {0,0,0,0,0,0,0,0,0,0};
    public int[] e = {0,0,0,0,0,0,0,0,0,0};
    public int[] f = {0,0,0,0,0,0,0,0,0,0};
    public int[] g = {0,0,0,0,0,0,0,0,0,0};
    public int[] h = {0,0,0,0,0,0,0,0,0,0};
    public int[] i = {0,0,0,0,0,0,0,0,0,0};
    public int[] j = {0,0,0,0,0,0,0,0,0,0};
    public String shipRow;
    public int columnOne;
    public int columnTwo;
    public int columnThree;
    public int columnFour;
    public int columnFive;
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hey!  Welcome to new version of Access Point Battleship!");
        System.out.println("I'm about to change the number of guesses.");
        Ship s = new Ship();
        s.PrintNumberOfPieces();
        Ship sFour = new Ship(4);
        sFour.PrintNumberOfPieces();
        System.out.println("Ship 1 # of pieces is: " + s.GetNumPieces());
        System.out.println("Ship 2 # of pieces is: " + sFour.GetNumPieces());
        s.SetNumPieces(2);
        sFour.SetNumPieces(5);
        System.out.println("Ship 1 # of pieces is: " + s.GetNumPieces());
        System.out.println("Ship 2 # of pieces is: " + sFour.GetNumPieces());

        Out o = new Out();
        o.msg("Welcome to Access Point Find-a-ship!");
        o.msg("I bet you can't find my ship!!!");
        o.msg("... well, at least not in less than 7 guesses which is when I become invisible to you!");
        int hits = 0;
        int guesses = 0;

        Board b = new Board();
        int rowRandom = (int)(Math.random() * 9); //0 to 9
        int columnStartRandom = (int)(Math.random() * 4); //0 to 4
        b.placeShip(rowRandom, columnStartRandom);

        while (hits < 5) {
            b.showBoard();
            b.handleUserGuess();
            hits = b.checkWinStatus();
            ++guesses;
            o.msg("You're up to " + guesses + " guesses now...");
            if (guesses == 7) break;
        }

        if (guesses == 7) {
            o.msg("\n\n\nOhhh yeaaaahhhhhhh!!!!!");
            o.msg("I told you that you couldn't find me in less than 7 guesses!!!");
            o.msg("Maybe, just maybe, you'll try again!");
        }
        else {
            o.msg("\n\n\nYou sunk my ship!!!!");
            o.msg("But that's ok, I'll figure out how to move next time... or maybe I won't...");
            o.msg("Thanks for playing Battle Ship!!!!");
        }
    }
}


