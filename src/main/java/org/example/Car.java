package org.example;

public class Car {
    String model;
    String color;
    double fuelConsumption;
    int volume;
    int fuelLevel;

    Car(){
        color = "Белый";
        fuelConsumption = 8;
        volume = 45;
        fuelLevel = 10;
    }


    Car (String model) {
        this.model = model;
        color = "Белый";
        fuelConsumption = 8;
        volume = 45;
        fuelLevel = 10;
    }

    Car (String model , String color) {
        this.model = model;
        this.color = "Белый";
        fuelConsumption = 18;
    }


    void move(int x1, int y1, int x2, int y2) {
        double path = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        fuelLevel = (int) (fuelLevel-path/100* fuelConsumption);
        if (fuelLevel < 0) {
            System.out.println("Автомобиль марки: " + model + " не доехал, пора заправится!");
        } else {
            System.out.println("Автомобиль марки: " + model + " прошел: 0" + path + "км, осталось топлива: " + fuelLevel );
        }
        System.out.println("Автомобиль марки: " + model + " прошел: 0" + path + "км, осталось топлива: " + fuelLevel );
    }
        void refuel (int liters) {
        fuelLevel = fuelLevel + liters; {
            if (fuelLevel > volume) {
                System.out.println ("Бензин льется через край!");
                fuelLevel = volume;
            } else {
                System.out.println ("Заправились теперь у нас столько литров " + fuelLevel );
            }
        }
    }


        public static void main (String[]args) {
        Car opel = new Car("Opel");
        opel.model = "Opel";
        opel.color = "Желтый";
        opel.move(10,10,100,100);


        Car bmw = new Car("BMW" ,"Черный");
        bmw.volume = 60;


        bmw.move(0,0,500,250);
        bmw.refuel(50);
        bmw.move(150,150,500,250);




        }

}


