java
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class PasswordValidatorMain {
    public static void main(String[] args) {
        String input = "Your password input here"; // Replace with the actual password input

        PasswordValidatorLexer lexer = new PasswordValidatorLexer(CharStreams.fromString(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PasswordValidatorParser parser = new PasswordValidatorParser(tokens);

        ParseTree tree = parser.password();
        boolean isValid = tree.getText().equals(input);

        System.out.println(isValid);
    }
}