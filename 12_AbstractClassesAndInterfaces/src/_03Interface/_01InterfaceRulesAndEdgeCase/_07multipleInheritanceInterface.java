package _03Interface._01InterfaceRulesAndEdgeCase;

/*
• One interface implementing multiple interface                       
                <<interface>>      <<interface>>
                Interface1         Interface2
                  ▲                 ▲
                   ╲               ╱
                    ╲ «extends»   ╱
                     ╲           ╱
                    +---------------+
                    |   Interface3  |
                    +---------------+
*/

interface A{
    void a();
}

interface B{
    void b();
}

interface C extends A, B{
    // remember to extends the interface while inheritance.
}

/*
    • Interface cannot extends a Class
        Interface can only extends interface
*/

class D{

}
/*
    ❌ Invalid
interface E extends D{
    // Compile error: a superInterface must be an interface
}
*/

public class _07multipleInheritanceInterface {
    
}
