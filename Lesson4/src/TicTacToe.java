import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        playGame();
    }

    static void playGame() {
        System.out.println("Hello, Sir!");
        System.out.println("There is the TicTacToe game!");
        System.out.println("===============");

        int fieldSize = 3;
        char[][] field;

        Scanner scanner = new Scanner(System.in);
        boolean isProceed;
        boolean isWin;
        char playerSign = 'X';
        //char computerSign = 'O';
        char currentPlayer;

        do {
            field = getNewField(fieldSize);
            drawField(field);
            currentPlayer = playerSign;
            boolean isDraw=false;

            do {
                doMove(field, fieldSize, currentPlayer);
                isWin = checkWin(field, fieldSize, currentPlayer);
                System.out.println("Updating...");
                System.out.println("===============");
                drawField(field);
                if (isWin) break;
                currentPlayer = changePlayer(currentPlayer);
                isDraw = isDraw(field);
            } while (!isDraw);

             String winnerName = currentPlayer == 'X' ? "Player" : "Computer";
            System.out.println(String.format("Congratulations, you [%s] are winner", winnerName));

            System.out.println("Do you want to proceed?");
            isProceed = scanner.nextBoolean();
        } while (isProceed);
    }

    static void doMove(char[][] field, int fieldSize, char sign) {
        int x, y;
        if (sign == 'X') {
            Scanner scanner = new Scanner(System.in);
            System.out.println(String.format("Please write down X-Axis value from 1 to %s", fieldSize));
            x = scanner.nextInt();
            System.out.println(String.format("Please write down Y-Axis value from 1 to %s", fieldSize));
            y = scanner.nextInt();

            x = checkCoordinate(x, fieldSize);
            y = checkCoordinate(y, fieldSize);

            putValueByCoordinates(field, x, y, fieldSize, sign);
        } else {
            Random random = new Random();
            x = random.nextInt(fieldSize);
            y = random.nextInt(fieldSize);
            putValueByCoordinates(field, x, y, fieldSize, sign);
        }
    }

    //TODO Проверить все варианты победы
    static boolean checkWin(char[][] field, int fieldSize, char sign) {
        int win1;
        int win2;
        //горизонтали
        for (int i = 0; i < fieldSize; i++) {
            win1 = 0;
            for (int j = 0; j < fieldSize; j++) {
                if (field[i][j] == sign) {
                    win1++;
                }
            }
            if (win1==fieldSize) {
                return true;
            }
        }
        //вертикали
        for (int j = 0; j < fieldSize; j++) {
            win1 = 0;
            for (int i = 0; i < fieldSize; i++) {
                if (field[i][j] == sign) win1++;
            }
            if (win1==fieldSize) return true;
        }
        //диагонали
        win1=0;
        win2=0;
        for (int i=0; i < fieldSize; i++){
            for (int j=0; j < fieldSize; j++){
                if (i==j && field[i][j]==sign) win1++;
                if (i+j==fieldSize-1 && field[i][j]==sign) win2++;
            }
        }
        if (win1==fieldSize || win2==fieldSize) return true;
        return false;
    }

    //Тут все хорошо

    static void putValueAsComputer(char[][] field, int x, int y, int fieldSize) {
        Random random = new Random();
        while (field[x][y] != '-') {
            x = random.nextInt(fieldSize);
            y = random.nextInt(fieldSize);
        }
        System.out.println(String.format("Computer puts value to [x: %s, y:%s]", x, y));
        field[x][y] = 'O';
    }

    static void putValueAsPlayer(char[][] field, int x, int y, int fieldSize) {
        while (field[x - 1][y - 1] != '-') {
            System.out.println(String.format("X-Axis: %s, Y-Axis: %s already occupied", x, y));
            x = reInputCoordinate(fieldSize);
            x = checkCoordinate(x, fieldSize);

            y = reInputCoordinate(fieldSize);
            y = checkCoordinate(y, fieldSize);
        }
        System.out.println(String.format("Putting value to [x: %s, y:%s]", x, y));
        field[x - 1][y - 1] = 'X';
    }

    static boolean isDraw(char[][] field) {
        int count = field.length*field.length;  //поправлено
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] != '-') {
                    count--;
                }
            }
        }
        return count == 0;
    }

    static void drawField(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j]);
            }
            System.out.print("\n");
        }
    }

    static char[][] getNewField(int size) {
        char[][] field = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                field[i][j] = '-';
            }
        }
        return field;
    }

    static char changePlayer(char sign) {
        return sign == 'X' ? 'O' : 'X';
    }

    static int checkCoordinate(int coordinate, int fieldSize) {
        while (coordinate < 1 || coordinate > fieldSize) {
            System.out.println(String.format("[X|Y]-Axis: %s is incorrect. Correct range from 1 to %s", coordinate, fieldSize));
            coordinate = reInputCoordinate(fieldSize);
        }
        return coordinate;
    }

    static int reInputCoordinate(int fieldSize) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(String.format("Please write down [X|Y]-Axis value from 1 to %s", fieldSize));
        return scanner.nextInt();
    }

    static void putValueByCoordinates(char[][] field, int x, int y, int fieldSize, char sign) {
        if (sign == 'X') {
            putValueAsPlayer(field, x, y, fieldSize);
        } else {
            putValueAsComputer(field, x, y, fieldSize);
        }
    }
}
