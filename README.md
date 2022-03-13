# Specification by Example - Code

This repository contains the code skeleton that we will use in my Specification by Example-Workshop. It also contains an
example solution, so you can refer to that if you get lost or fall behind.

In general, trying to solve this on your own without looking at the solution will give you better learning results!

## Launch the FitNesse server

Go to the `FitNesse` directory and start the FitNesse server on a port of your choice (here: 7777).

- `cd FitNesse`
- `java -jar fitnesse-standalone.jar -p 7777`

Open a browser and go to the running FitNesse server. (Make sure to use the same port as in the previous step!)

- `http://localhost:7777`

You should now see a webpage with the message "Welcome to FitNesse!", among other things.

## Compile the Code

- This project requires Java 1.8 to work
- To compile anything, first go to `src` and then run one of the commands given below
- To compile the Java production code: `javac hotdog/*.java`
- To compile your own fixtures: `javac -cp ../FitNesse/fitnesse-standalone.jar fixures/*.java`
- To compile the example solution fixtures: `javac -cp ../FitNesse/fitnesse-standalone.jar fixtures_solution/*.java`
- All in one: `javac -cp ../FitNesse/fitnesse-standalone.jar hotdog/*.java fixtures/*.java fixtures_solution/*.java`

(This way we keep the class files in the same directories as the source files. This is purely to simplify the setup. In a real project you'd want to organzie this differently, of course.)
