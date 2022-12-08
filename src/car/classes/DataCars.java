package car.classes;

import car.enums.Colour;

import java.math.BigDecimal;
import java.time.LocalDate;

public class DataCars {
    //год выпуска, модель, цена, цвет
    private LocalDate dateOfOrigin;
    private String model;
    private BigDecimal price;
    private Colour colour;

    public DataCars(LocalDate dateOfOrigin, String model, BigDecimal price, Colour colour) {
        this.dateOfOrigin = dateOfOrigin;
        this.model = model;
        this.price = price;
        this.colour = colour;
    }

    public LocalDate getDateOfOrigin() {
        return dateOfOrigin;
    }

    public void setDateOfOrigin(LocalDate dateOfOrigin) {
        this.dateOfOrigin = dateOfOrigin;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return  "      DataCars --->>>" +
                "\nDate Of Origin:  " + dateOfOrigin +
                "\nModel:           " + model +
                "\nPrice:           " + price +
                "\nColour:          " + colour +
                '\n';
    }
}
