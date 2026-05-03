package _01IntroStringClass;

public class _07matchingRegularExpressionPattern {
    public static void main(String[] args) {
        // regular expression(regex) is a string that describe a pattern for matching a set of strings.
        /*
        regex pattern
            // 1. Basic character
                • . -> any character (except newline)
                • .- -> any character followed by -(hyphen)
                • [abc] -> contain a,b or c
                • [^abc] -> except a,b or c
                • [a-z] -> lowercase letters
                • [A-Z] -> Uppercase letters
                • [0-9] -> digits
            // 2. Predefined character class
                • \\d -> digits
                • \\D -> Non-digits
                • \\w -> words character
                • \\W -> Non-word character
                • \\s -> including Whitespace
                • \\S -> Non-Whitespace
            // 3. Quantifiers
                • * -> 0 or more
                • + -> 1 or more
                • ? -> 0 ir 1
                • {n} ->exactly n times
                • {n,} -> n or more
                • {n,m} -> in between n and m
            // 4. Anchor
                • ^ -> start of string 
                • $ -> end of String
            // 5. Grouping or Alternate
                • (abc) -> Grouping
                • a|b -> a or b
            // 6. Escaping special character
                • \\. -> literal dot
                • \\* -> literal *
                • \\\\ -> backslash
            // 7. lookaround
                • (?=...) -> positive lookahead
                • (?!...) -> negative lookahead
                • (?<=...) -> positive lookbehind
                • (?<!...) -> negative lookbehind
            // 8. flag Modifires
                • (?!) -> case insensitive
                • (?m) -> multi-line
        */
        /*
        common regex pattern
            • \\d+ -> only digits
            • [a-zA-Z]+ -> only letters
            • \\w+ -> Alpha numeric
            • ^abc -> starts with
            • $xyz -> ends with
            • .*abc.* -> contains
            • ^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$ -> emails basic
        */

        /* • match() : Boolean -> return boolean true when an entire string matches a regex */
        Boolean ans1 = "java".matches("java");
        System.out.println(ans1); // true 

        String s = "a+b$#c".replaceAll("[$+#]", "NNN");
        System.out.println(s); // aNNNbNNNNNNc

        String[] token = "Java,C?C#,C++".split("[.,:;?]");
        for(int i = 0; i < token.length; i++ ){
            System.out.println(token[i]);
        }
            /*
                Java
                C
                C#
                C++
            */
    }
}