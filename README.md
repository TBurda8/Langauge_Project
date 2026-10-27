# Texo

Texo is a experimental intrepreted programming language built from scratch in Java as a CS final project. 
The goal is to design a small readable language and to implement all systems needed to use it, like a lexer, parser, ASTs, and a intrepreter. 
Texo will run source files from the terminal.

![System diagram](docs/diagram.png)

## Tech Stack

- **Language:** Bash / Java
- **Libraries:** JUnit, JSL
- **External tools:** IntelliJ Idea, Git, Github

## Setup

```bash
git clone https://github.com/TBurda8/Texo
cd texo
javac -d out src/texo/*.java
java -cp out texo.Main
```

A bash launcher is planned for future versions.

## Usage

```bash
java -cp out texo.Main examples/hello.texo
```

## Roadmap

- [ ] Define languague grammar and syntax
- [ ] Implement lexer and tokenizer
- [ ] Develop parser
- [ ] Implement ASTs
- [ ] Support for variables and expressions
- [ ] Support conditionals and loops
- [ ] Support errors
- [ ] Implement functions and recursion
- [ ] Support scope

## Documentation

docs/language-spec.md - language syntax and grammar
docs/design.md - design choices and reasoning
examples/ - texo programs
tests/ - tests for the language

## Author

Thomas Haraburda, https://github.com/TBurda8/
