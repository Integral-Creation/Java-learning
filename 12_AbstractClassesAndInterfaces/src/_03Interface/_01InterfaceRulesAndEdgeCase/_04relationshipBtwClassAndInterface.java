package _03Interface._01InterfaceRulesAndEdgeCase;

/*
    • Relationship between Class and Interface in java
*/

/*
    • A class can extends another class, similarly a interface extends another interface, but
    for class inheritance it had to implements the interface.(• A class cannot extends a interface because an interface is not a class.)
*/

/*
(1) Inheritance                     (2) Realization                  (3) Interface Inheritance

+-----------+                      +----------------+               +----------------+
| SuperClass|                      | <<interface>>  |               | <<interface>>  |
+-----------+                      |   Interface    |               | ParentInterface|
      ▲                            +----------------+               +----------------+
      │                                    ▲                                 ▲
      │ extends                            │                                 │ extends
      │                                    │ implements                      │
+-----------+                      +----------------+               +----------------+
| SubClass  |                      |    Class       |               | <<interface>>  |
+-----------+                      +----------------+               | ChildInterface |
                                                                    +----------------+
*/

public class _04relationshipBtwClassAndInterface {
    
}
