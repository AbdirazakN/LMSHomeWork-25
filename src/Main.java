import car.classes.Car;
import car.classes.DataCars;
import car.enums.Colour;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        /**Car деген класс тузунуз (Id, номер авто)
         Дагы бир класс тузунуз, ал класста машинанын данныйлары сакталат (год выпуска, модель, цена, цвет)
         HashMap тузунуз ключ - машина, маани - машинанын данныйлары
         HashMapти толтуруп кайра entrySet деген методун колдонуп баардык элементтерин консольго чыгарыныз.*/

        Car car1 = new Car(123, "01KG 001 AAA");
        Car car2 = new Car(133, "02KG 222 BBB");
        Car car3 = new Car(143, "03KG 000 OOO");
        Car car4 = new Car(153, "04KG 400 VIP");
        Car car5 = new Car(163, "05KG 050 BMW");
        Car car6 = new Car(173, "06KG 606 KGZ");

        DataCars dataCars1 = new DataCars(LocalDate.of(2022, 10, 30), "Tesla Roadster", new BigDecimal(12000), Colour.BLACK);
        DataCars dataCars2 = new DataCars(LocalDate.of(2015, 1, 25), "Toyota Camry-70", new BigDecimal(10000), Colour.WHITE);
        DataCars dataCars3 = new DataCars(LocalDate.of(2020, 5, 12), "KIA K5", new BigDecimal(16000), Colour.RED);
        DataCars dataCars4 = new DataCars(LocalDate.of(2018, 12, 31), "BMW X7", new BigDecimal(22000), Colour.BLUE);
        DataCars dataCars5 = new DataCars(LocalDate.of(2021, 3, 3), " BMW M235I XDRIVE GRAN COUPE", new BigDecimal(22000), Colour.BLUE);
        DataCars dataCars6 = new DataCars(LocalDate.of(2019, 9, 9), "Ferrari V12 ENGINE", new BigDecimal(22000), Colour.BLUE);

        Map<Car, DataCars> carsMap = new HashMap<>();
        carsMap.put(car1, dataCars1);
        carsMap.put(car2, dataCars2);
        carsMap.put(car3, dataCars3);
        carsMap.put(car4, dataCars4);
        carsMap.put(car5, dataCars5);
        carsMap.put(car6, dataCars6);

        System.out.println(carsMap.entrySet());
//        System.out.println(carsMap);
    }
}