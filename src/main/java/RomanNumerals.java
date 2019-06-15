public class RomanNumerals {
    static boolean isRomanNumeral(String s)
    {
        return s.matches("(l?x{0,3}|x[lc])(v?i{0,3}|i[vx])$");
    }
}
