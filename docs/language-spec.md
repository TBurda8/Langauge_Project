# Texo Language Specification

Version 0.1.0 DRAFT \
In Development

1. Language Overview \
    1.1 Design \
    \
    Texo is a general purpose language with lightweight syntax meant to be easily readable.
    It is meant to be easy to understand, with many declarations based on in and out. Boilerplate is meant to be minimal, 
    and blocks are explicitly terminated. Variables are implicit and everything is consistent. 
    Texo will be executed by a tree- walk interpreter in Java. Code is tokenized, put into a AST, and interpreted.\
    \
    1.2 Language Characteristics 
    

2. Lexical Structures \
    2.1 Whitespace \
    \
    Whitespace seperates tokens and improves readibility. Spaces, tabs and line breaks are ignored except for token seperation.
    There will be a few exceptions to this relating to declaration and future updates.\
    \
    2.2 Comments \
    \
    Comments are made by #. Multi line comments are made by #/, ending with /#.\
    \
    2.3 Identifiers \
    \
    Identifiers are names assigned to variables and functions. They must begin with a letter or underscore,
    and subsequent characters can be nearly any basic character, including letters, numbers, dashes, and underscores.
    They cannot be reserved keywords. They are case-sensitive.\
    \
    2.4 Keywords \
    \
    Reserved keywords are: start - begins a function declaration, in - introduces function parameters, 
    out - returns a value, end - terminates a block, print - writes to standard output,
    if - conditional execution, than - begins a conditional block, else - alternative branch, 
    while - conditional loop, do - begins loop body, put - reading user input. Many more will be added through development.\
    \
    2.5 Literals \
    \
    Integer numbers: 0, 10, 23; Decimal numbers: 3.14, 0.5; Strings: "Hello World!"; Booleans: true, false\
    \
    2.6 Operators and Delimiters
    \
    \
    = assigns, + adds, - subtracts, * multiplies, / divides, == equality, > greater than, < less than, ; terminates, , seperates, () groups.
    Additional ones will be added. 
    

3. Expressions \
    3.1 Arithmetic \
    \
    Texo will support standard aritmetic operation, including addition, subtraction, multiplication, and division.\
    \
    3.2 Operator Precedence \
    \
    Standard operator precedence is planned. Parentheses override.\
    \
    3.3 Operator Associativity \
    \
    Left to right if equal precedence.\
    \
    3.4 Grouping \
    \
    Parentheses group expressions.


4. Statements \
    4.1 Variable Declarations \
    \
    Variables in Texo are created implicitly on the first assignment.
Subsequent assignments to a preexisting variable update the value in the variable.
The syntax for this is as follows: ```identifier = expression;``` and a example is:
```count = 10;```
Variable names are case sensitive, a assignment ends with a semicolon, and the right expression is evaluated before
the assignment occurs. Refrencing a undefined variable will produce a error.\
    \
    4.2 Assignment \
    \
    4.3 Output \
    \
    The print statement evaluates a expression and displays value.\
    \
    4.4 Conditional Statements \
    \
    Form is if condition, statement. Multiline is if condition, then statements else statements end\
    \
    4.5 Loops


5. Types and Values 


6. Scoping and Functions
    

7. Formal Grammar


8. Error Handling




