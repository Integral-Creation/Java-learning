package _01Intro;

public class _01ImmutableObjectsAndClasses {
    /*
    Immutable class objects are those whose state cannot be modified after initialization. Once created, the values and state remains unchanged throught its scope.
    
    creating Immutable class in java:
        • All data fields must be private.
        • There can't be any mutator methods for data fields.
        • Initialize fields via constructor 
        • Make all data fields marked as final.
        • If it contains references to mutable objects, it defensively copies them
    */
    
    /*Immutable Class */
    final class student{
        private final int id; // private data filed
        private final String name;

        public student(int id, String name){  // constructor
            this.id = id;
            this.name = name;
        }

        public int getId(){
            return id;
        }

        public String getName(){
            return name;
        }
    }
}
