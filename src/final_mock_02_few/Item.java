package final_mock_02_few;

import java.io.Serializable;
import java.util.Date;

public class Item implements Serializable {
    private int id;
    private String name;
    private double price;
    private Date created_on;

    public Item() {
        this(0, "", 0.0, null);
    }

    public Item(int id, String name, double price, Date created_on) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.created_on = created_on;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getCreated_on() {
        return created_on;
    }

    public void setCreated_on(Date created_on) {
        this.created_on = created_on;
    }
}
