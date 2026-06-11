package _16CaseStudy;

import java.util.Scanner;

class Device{
    String brand;
    int power;

    Device(String brand, int power){
        this.brand = brand;
        this.power = power;
    }
    public String show(){
        return "Brand: " + brand + ", Power: " + power +"W";
    }
}

class Fan extends Device{
    int speed;

    Fan(String brand, int power, int speed){
        super(brand, power);
        this.speed = speed;
    }

    public int getSpeed(){
        return speed;
    }

    @Override
    public String show(){
        return super.show();
    }
}

class AC extends Device{
    int temperature;

    AC(String brand, int power, int temperature){
        super(brand, power);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String show(){
        return super.show();
    }
}
public class _01caseStudy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        Device[] devices = new Device[n];

        for(int i = 0; i < n; i++){
            String type = scanner.next();
            String brand = scanner.next();
            int power = scanner.nextInt();

            if(type.equals("Fan")){
                int speed = scanner.nextInt();
                devices[i] = new Fan(brand, power, speed);
            }else if(type.equals("AC")){
                int temperature = scanner.nextInt();

                devices[i] = new AC(brand, power, temperature);
            }
        }
        
        for(Device d : devices){
            String status ="";

            if(d instanceof Fan){
                Fan f = (Fan) d;
                status = (f.getSpeed() > 3) ? "Fast" : "Normal";
            }else if(d instanceof AC){
                AC a = (AC) d;
                status = (a.getTemperature() <= 22) ? "COOL" : "WARM";
            }

            System.out.println(d.show() + " | Status: " + status);
        }
        scanner.close();
    }
}
