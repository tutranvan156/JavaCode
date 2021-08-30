package CTF;

/**
 * @author: TranVanTu 28/08/2021 10:29 CH
 * @desc:
 **/
public class Method {
    public int nor(int a, int b) {
        return ~(a | b);
    }
    public int xor(int a, int b) {
        return a ^ b;
    }
    public int execute(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j) {
        int temp1 = nor(a, ~b);
        int temp2_1 = (~c | d);
        int temp2_2 = (e | ~f);
        int temp2 = nor(temp2_1, temp2_2);
        int temp3_1 = nor(g, h);
        int temp3_2 = xor(h, i);
        int temp3_3 = i & j;
        int temp3 = temp3_1 & temp3_2;
        int a1 = temp1 & temp2;
        int a2 = temp3 & temp3_3;
        return a1 & a2;
    }
}
