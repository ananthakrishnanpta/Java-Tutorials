# Programming and Computer Fundamentals

> Part: [How Java Works](../README.md)

Programming is the work of turning a problem into instructions that a computer can execute exactly. Before learning Java syntax, build the mental model: a program accepts **input**, transforms it through **processing**, and produces **output**.

## What you will learn

- how a computer follows instructions and stores values;
- the input → process → output model;
- the difference between an algorithm, source code, and a running program; and
- a repeatable way to debug surprising results.

## 1. Programs are precise recipes

An algorithm is a finite, ordered procedure for solving a problem. Java source code is one way to express that procedure. Computers do not infer intent: `>` and `>=`, or an index of `4` instead of `3`, are different instructions with different results.

For a Celsius-to-Fahrenheit converter, the recipe is:

1. Read a Celsius value.
2. Multiply it by `9 / 5`.
3. Add `32`.
4. Display the result.

That is already an algorithm. Java supplies names, types, control flow, and library code to make it executable and maintainable.

## 2. Input → processing → output

Use this model to design every small program:

| Stage | Converter example | Question to ask |
| --- | --- | --- |
| Input | `20.0` degrees Celsius | What data enters the program? |
| Processing | `20.0 * 9 / 5 + 32` | What rules transform it? |
| Output | `68.0°F` | What should the user observe? |

The runnable [`InputProcessOutput.java`](examples/InputProcessOutput.java) example follows this shape. From its directory, compile and run it with:

```bash
javac InputProcessOutput.java
java InputProcessOutput
```

If your system says `javac` is unavailable, install a JDK and verify it with `java --version` before continuing.

## 3. What happens when a program runs

At a useful high level, a computer repeatedly fetches an instruction, decodes it, and executes it. Main memory holds the code and data currently in use. Storage keeps data after a program ends. The operating system coordinates access to hardware such as the keyboard, screen, filesystem, and network.

You do not need to memorize hardware details to write Java, but this model explains why programs need memory, why I/O can be slow, and why an infinite loop consumes CPU time.

## 4. Debug by making a prediction

When a result is wrong, avoid randomly changing code. Instead:

1. State the expected input and output.
2. Create the smallest case that reproduces the issue.
3. Print intermediate values or use a debugger.
4. Compare the first unexpected value with the rule that produced it.
5. Fix the rule, then rerun the original case and an edge case.

For example, test `0`, a negative temperature, and a decimal value in the converter. Each test checks a different assumption.

## Practice

1. Modify the example to convert Fahrenheit to Celsius: `(fahrenheit - 32) * 5 / 9`.
2. Design the input/process/output table for calculating the area of a rectangle.
3. Explain why the following is not sufficient for a useful program: “calculate the answer.” What inputs, rules, and output format are missing?

## Checkpoint

You are ready for the next lesson when you can explain the difference between an algorithm and a Java program, and can trace a value from input through processing to output.

Next: [Java: the Language and Platform](../02-java-language-platform/README.md).
