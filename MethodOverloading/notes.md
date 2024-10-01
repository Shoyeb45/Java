# Method overloading with autoboxing and widening 

1. Method overloading with widening primitive types

```
class Demo {
    void disp(long x) {

    }
}
public class Launch {
    public static void main(String[] args) {
        Demo d = new Demo();
        int a = 10;
        d.disp(a);  // call disp(long)
    }
}

```

2. Method overloading with widening reference types

### Ex. 1:

```
class Demo {
    void disp(Number x) {
        System.out.println(x);
    }
}
public class Launch {
    public static void main(String[] args) {
        Demo d = new Demo();
        Integer a = 10;
        d.disp(a);  // call disp(Number)
    }
}

```


> NOTE : Widening is not applicable between references of different wrapper classes. It is applicable only in between child type and parent type.

### Ex. 2:

```
class Demo {
    void disp(Long x) {
        System.out.println(x);
    }
}
public class Launch {
    public static void main(String[] args) {
        Demo d = new Demo();
        Integer a = 10;
        d.disp(a);  // Error: The method disp(Long) in the type Demo is not applicable for the arguments (Integer)
    }
}
```

3. Method overloading with autoboxing:

Ex.:

```
class Demo {
    void disp(Integer x) {
        System.out.println(x);
    }
}
public class Launch {
    public static void main(String[] args) {
        Demo d = new Demo();
        int a = 10;
        d.disp(a);  // Compiler will perform autoboxing and disp(Integer) will be called
    }
}
```

4. Method overloading with autounboxing(or unboxing)

```
class Demo {
    void disp(int x) {
        System.out.println(x);
    }
}
public class Launch {
    public static void main(String[] args) {
        Demo d = new Demo();
        Integer a = 10;
        d.disp(a);  // Compiler will perform auto unboxing and disp(int) will be called
    }
}
```

5. Method overloading with widening and auto boxing 

- <b>Compiler will prefer widening over autoboxing</b>

```
class Demo {
    void disp(long x) {
        System.out.println(x);
    }
    void disp(Integer x) {
        System.out.println(x);
    }
}
public class Launch {
    public static void main(String[] args) {
        Demo d = new Demo();
        int a = 10;
        d.disp(a);  // Compiler will perform widening and disp(long) will be called
    }
}
```
<code>
    <pre>
    widening > autoboxing
    </pre>
</code>

6. Method overloading with widening and autounboxing

- Compiler will prefer widening (uppercasting) over auto unboxing

```
class Demo {
    void disp(Number x) {
        System.out.println(x);
    }
    void disp(int x) {
        System.out.println(x);
    }
}
public class Launch {
    public static void main(String[] args) {
        Demo d = new Demo();
        Integer a = 10;
        d.disp(a);  // Compiler will perform widening and disp(long) will be called
    }
}
```

<pre>                       Widening > Autounboxing   </pre>



7. Method overloading with
    - <b>a. </b>Widening and autoboxing : widening and autoboxing cannot work together. 
        ```
        class Demo {
            void disp(Long x) {
                System.out.println(x);
            }
        }
        public class Launch {
            public static void main(String[] args) {
                Demo d = new Demo();
                int a = 10;
                d.disp(a);  // Compiler will throw error
            }
        }
        ```
    
    - <b>b. </b>Autoboxing and Widening : autoboxing followed by autoboxing can work together. 
        ```
        class Demo {
            void disp(Number x) {
                System.out.println(x);
            }
        }
        public class Launch {
            public static void main(String[] args) {
                Demo d = new Demo();
                int a = 10;
                d.disp(a);  // Compiler will call disp(Number)
            }
        }
        ```

- widening  <b>-></b> autoboxing { Not permitted }
- autoboxing <b>-></b> widening { Permitted }


8. Auto unboxing followed by widening can work together 

```
class Demo {
    void disp(long x) {
        System.out.println(x);
    }
    
}
public class Launch {
    public static void main(String[] args) {
        Demo d = new Demo();
        Integer a = 10;
        d.disp(a);  // Compiler will perform autounboxing and then widening and so disp(long) will be called
    }
}
```

- auto unboxing <b>-></b> widening