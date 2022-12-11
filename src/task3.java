import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class task3 {
    public static int RomeToArabian(String romeNumber) {
    Map<String, Integer> ra = new HashMap<>();
        ra.put("I", 1);
        ra.put("V", 5);
        ra.put("X", 10);
        ra.put("L", 50);
        ra.put("C", 100);
        ra.put("D", 500);
        ra.put("M", 1000);

    int prev = 0;
    int curr = 0;
    int arNumber = 0;
    int temp = 0;
    String[] romeSymbols = romeNumber.split("");
        for (String romSym : romeSymbols) {
        prev = curr;
        curr = ra.get(romSym);
        if (curr > prev) {
            temp = -2 * prev;
        } else temp = 0;
        arNumber = arNumber + temp + curr;
    }
        return arNumber;
}

    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите римское число : ");
        String romeNumber = iScanner.nextLine();
        iScanner.close();

        try {
            System.out.printf("Римское число %s соответствует арабскому числу %d\n", romeNumber, RomeToArabian(romeNumber));
        } catch (Exception e) {
            System.out.println("Не корректная запись числа в римском формате!");
        }
    }

}
