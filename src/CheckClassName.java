import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckClassName {
    private final String CLASS_NAME_REGEX = "^[C|A|P][0-9]{4}[G-M]$";

    public CheckClassName() {

    }
    public boolean check(String inputString){
        Pattern pattern = Pattern.compile(CLASS_NAME_REGEX);
        Matcher matcher = pattern.matcher(inputString);
        return matcher.matches();
    }
}
