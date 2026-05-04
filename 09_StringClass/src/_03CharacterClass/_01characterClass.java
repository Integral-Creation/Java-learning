package _03CharacterClass;
/*
The Character class in java, available in java.lang.package is a wrapper class used to represent a single char value as an object
To enable the primitive data values to be treated as objects, Java provides a class for every primitive data type.
These classes are Character, Boolean, Byte, Short, Integer, Long, Float, and Double for char, boolean, byte, short, int, long, float, and double, respectively.
These classes are called wrapper classes because each wraps of encapsulates a primitive type value in an object.

The Character class has a constructor and methods for determining a Character's category and converting Character from uppercase of lowercase.

    Character character = new Character('a'); // create a Character object for the character 'a'.

following methods:
    • Character(value: char)
    • charValue() ; char
    • equals(anotherCharacter: Character): boolean
    • isDigit(ch: char): boolean
    • isLetter(ch: char): boolean
    • isLetterOrDigit(ch: char): boolean
    • isLowerCase(ch: char): boolean
    • isUpperCae(ch: char): boolean
    • toLowerCase(ch: char): char
    • toUpperCase(ch: char): char
*/
public class _01characterClass {
    public static void main(String[] args) {
        char ch = 'A';
        char ch1 = 'B';
        
        System.out.println(Character.isDigit(ch));
        System.out.println(Character.isLetter(ch));
        System.out.println(Character.toLowerCase(ch));
        System.out.println(Character.compare(ch, ch1));

    }
    
}
