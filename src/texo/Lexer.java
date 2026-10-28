package texo;
import java.util.ArrayList;
import java.util.List;
import static texo.TokenType.*;

class Lexer {
    private final String source;
    private final List<Token> tokens = new ArrayList<>();

    Lexer(String source) {
        this.source = source;
    }

    List<Token> scanTokens() {
        int whiteSp = 0;
        while (whiteSp < 3) {
            if ()
        }
    }
}
