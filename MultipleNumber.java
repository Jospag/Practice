public class MultipleNumber {
    public static void main(String[] args) {
        int firstNumber = 3;
        int secondNumber = 5;
        int sum = 0;
        int counter = 1;
        int prime = 0;
        int prime2 = 0;

        while (counter <= 1000) {
            for (; counter <= 1000; ) {
                if (counter % firstNumber == 0) {
                    prime = counter;
                    System.out.printf("%d ",prime);
                }
                counter++;
        System.out.println();
            }
            while (counter <= 1000){
            for (; counter <= 1000; ) {
                if (counter % secondNumber == 0) {
                    prime2 = counter;
                    System.out.printf("%d ", prime2);
                }
                counter++;
            }
            }
           // sum = prime + prime2;

        }
    }
}
