import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length > 1) {
            System.out.println("Usage: texo [script]");
            System.exit(64);
        } else if (args.length == 1) {
            System.exit(1);
        } else {
            System.exit(0);
        }

    }
}
