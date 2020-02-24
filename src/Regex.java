import java.util.regex.Pattern;

public class Regex {
    public boolean number(String num) {
        String pattern = "^[0-9][0-9+;,#*]*$";
        boolean matches = Pattern.matches(pattern, num);
        if (matches) {
            return true;
        } else {
            return false;
        }
    }

    public boolean emailreg(String reg) {
        String pattern = "^[a-z_][a-z0-9\\._]*@[a-z0-9\\.]*$";
        boolean m = Pattern.matches(pattern, reg);
        if (m) {
            return true;
        } else {
            return false;
        }
    }
}