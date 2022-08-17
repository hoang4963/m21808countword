import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountWord {
    public static void main(String[] args) {
        System.out.println("Nhap doan van: ");
        Scanner scanner = new Scanner(System.in);
        String stringNeedCheck = scanner.nextLine();
        String[] arrayStringNeedCheck = stringNeedCheck.split(" ");
        Map<String,Integer> map = new HashMap<>();
        for (String s : arrayStringNeedCheck) {
            if (map.containsKey(s)) {
                map.replace(s, map.get(s) + 1);
            } else map.put(s, 1);
        }
        System.out.println("Nhap tu muon check: ");
        String wordNeedCheck = scanner.nextLine();
        if (map.containsKey(wordNeedCheck))
            System.out.println(map.get(wordNeedCheck));
        else System.out.println("khong co");
    }
}
