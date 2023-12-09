public class Main {
    public static void main(String[] args) {
        String nameOfVal;
        final int NUM = -17;
        String word = "6j7j7";
        nameOfVal = NUM+word;
        System.out.println(NUM + word + nameOfVal);
        if (NUM<0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM>0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили число");
        }
        }
    }