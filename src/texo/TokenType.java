package texo;

public enum TokenType {
    // Single Char Tokens
    LEFT_PARAN, RIGHT_PARAN, COMMA, ASSIGN, SEMICOLON,

    // Two Char Tokens + <>
    EQUAL_EQUAL, GREATER, LESS, GREATER_EQUAL, LESS_EQUAL, BANG, BANG_EQUAL,

    // Keywords
    IF, THAN, ELSE, WHILE, DO, START, IN, OUT, END, PRINT,

    // Literals
    IDENTIFIER, NUMBER, STRING,

    // Operators
    ADD, SUBTRACT, MULTIPLY, DIVIDE,

    // End of File
    EOF
}
