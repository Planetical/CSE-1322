public class Lab1 {
    public static void main(String[] args) {
        char[][] drawing = new char[4][13];
        drawing = make_forward();

        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 13; j++) {
                System.out.print(drawing[i][j]);
            }
            System.out.println();
        }

        char[][] drawing2 = new char[4][13];
        drawing2 = make_mirror(drawing);

        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 13; j++) {
                System.out.print(drawing2[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < 4; i++) {
            System.out.println();
            for(int j = 0; j < 26; j++) {
                if (j < 13) {
                    System.out.print(drawing[i][j]);
                } else {
                    System.out.print(drawing2[i][j%13]);
                }
            }
        }
    }
    public static char[][] make_forward() {

    char[][] pixel = new char[4][13];
        pixel[0][0] = ' ';
        pixel[0][1] = ' ';
        pixel[0][2] = '_';
        pixel[0][3] = '_';
        pixel[0][4] = '_';
        pixel[0][5] = '_';
        pixel[0][6] = '_';
        pixel[0][7] = '_';
        pixel[0][8] = ' ';
        pixel[0][9] = ' ';
        pixel[0][10] = ' ';
        pixel[0][11] = ' ';
        pixel[0][12] = ' ';
        pixel[1][0] = ' ';
        pixel[1][1] = '/';
        pixel[1][2] = '|';
        pixel[1][3] = '_';
        pixel[1][4] = '|';
        pixel[1][5] = '|';
        pixel[1][6] = '_';
        pixel[1][7] = '\\';
        pixel[1][8] = '\'';
        pixel[1][9] = '.';
        pixel[1][10] = '_';
        pixel[1][11] = '_';
        pixel[1][12] = ' ';
        pixel[2][0] = '(';
        pixel[2][1] = ' ';
        pixel[2][2] = ' ';
        pixel[2][3] = ' ';
        pixel[2][4] = '_';
        pixel[2][5] = ' ';
        pixel[2][6] = ' ';
        pixel[2][7] = ' ';
        pixel[2][8] = ' ';
        pixel[2][9] = '_';
        pixel[2][10] = ' ';
        pixel[2][11] = '_';
        pixel[2][12] = '\\';
        pixel[3][0] = '=';
        pixel[3][1] = '\'';
        pixel[3][2] = '-';
        pixel[3][3] = '(';
        pixel[3][4] = '_';
        pixel[3][5] = ')';
        pixel[3][6] = '-';
        pixel[3][7] = '-';
        pixel[3][8] = '(';
        pixel[3][9] = '_';
        pixel[3][10] = ')';
        pixel[3][11] = '-';
        pixel[3][12] = '\'';
        return pixel;
    }
    public static char[][] make_mirror(char drawing[][]) {

        char[][] mirror = new char[4][13];
        for(int i = 0; i < 4; i++) {
            int cell = 12;
            for(int j = 0; j < 13; j++) {
                if (drawing[i][j] == '(') {
                    mirror[i][12 - j] = ')';
                } else if (drawing[i][j] == ')') {
                    mirror[i][12 - j] = '(';
                } else if (drawing[i][j] == '/') {
                    mirror[i][12 - j] = '\\';
                } else if (drawing[i][j] == '\\') {
                    mirror[i][12 - j] = '/';
                } else {
                    mirror[i][12-j] = drawing[i][j];
                }
                cell--;
            }
        }
        return mirror;
    }
}
