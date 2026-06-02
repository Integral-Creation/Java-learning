import p2.GlobalBike;
/*
+----------------------+
|    GlobalVehicle     |
+----------------------+
| # speed : int        |
+----------------------+

           ▲
           |
           | extends
           |
+----------------------+
|     GlobalBike       |
+----------------------+
|                      |
+----------------------+
| + showSpeed() : void |
+----------------------+

           │
           │ creates/uses
           ▼

+----------------------+
|        Main          |
+----------------------+
|                      |
+----------------------+
| + main(args:String[])|
|   : void             |
+----------------------+
*/
public class Main{
    public static void main(String[] args) {
        GlobalBike bike = new GlobalBike();
        bike.showSpeed();
    }
}

