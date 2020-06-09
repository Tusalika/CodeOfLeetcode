package test;

public class HexNumber {
    public static void main(String[] args) {
        String s="41500000";
        Float value = Float.intBitsToFloat(Integer.valueOf(s.trim(), 16));
        System.out.println(value);

        Float f=30.72f;
        System.out.println(Integer.toHexString(Float.floatToIntBits(f)));
    }
}
