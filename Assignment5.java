public class Assignment5 {
    public static void main(String[] args) {
        for(int i=1;i<10;i++){
            String fold_string=paperFold(i);
            System.out.println("For " + i+" folds we get "+fold_string+"\n");
        }
    }
    static String reverse(String one){
        char[] oneChar = new char[one.length()];
        oneChar = one.toCharArray();
        char[] reverse = new char[one.length()];

        for(int i = 0; i < one.length(); i++) {
            reverse[one.length() - i - 1] = oneChar[i];
        }
        String x = new String(reverse);
        return x;
    }

    static String convert(String one){
        String out = "";
        for(int i = 0; i < one.length(); i++){
            if(one.charAt(i) == 'v'){
                out = out + '^';
            } else if(one.charAt(i) == '^'){
                out = out + 'v';
            }
        }
        return out;
    }

    static String paperFold(int n) {
        if (n == 1) {
            return "v";
        } else {
            String folds = paperFold(n - 1);
            return convert(reverse(folds)) + "v" + folds;
        }
    }
}
