<h1 align="center">ASCII Animations</h1>

A wheel loading animation using java.

# How it works
<br></br>
Firstly, we must create a ``String[]`` array of symbols needed for the animation, as well as a "clear-line" symbol for the console:

```Java
public class Main {
    private static final String lineReset = "\r";
    private static final String[] WHEEL_SYMBOLS = {"|", "/", "-", "\"};
}
```
<br></br>
Then we define the speed of the animation, via a timeout (measured in ``java.lang.Long``)

```Java
    private static final long SPEED = 500L;
```
<br></br>

After that, comes the main part: the animation.
It works like this: you print out a symbol, then you clear the line the symbol was printed on, and print the next symbol:

```Java

    while (true) { //making a while loop ensures that the animation will NOT stop..
                for (String symbol : WHEEL_SYMBOLS) {
                    System.out.print(lineReset + symbol);
                    TimeUnit.MILLISECONDS.sleep(speed);
                }
            }
            
```
