package CTF;

import java.util.Arrays;

/**
 * @author: TranVanTu 28/08/2021 10:36 CH
 * @desc:
 **/
public class Main {
    public static void main(String[] args) {
        Method method = new Method();
        for (int i = 0; i < Math.pow(2, 10); i++) {
            StringBuilder binary = new StringBuilder(Integer.toBinaryString(i));
            for (int j = binary.length(); j < 10; j++) {
                binary.insert(0, '0');
            }
            String s = binary.toString();
            int[] arr = Arrays.stream(s.split("")).mapToInt(Integer::parseInt).toArray();
            if (method.execute(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8], arr[9]) == 1) {
                System.out.println(s);
            }
        }
    }
}
