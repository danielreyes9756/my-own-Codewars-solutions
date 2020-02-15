import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Solution {
  public static boolean validatePin(String pin) {
    return pin.matches("^\\d{4}(\\d\\d)?$");
  }
}