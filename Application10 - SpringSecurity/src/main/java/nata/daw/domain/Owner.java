package nata.daw.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;


@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Entity
public class Owner {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    @JsonIgnore
    private List<Car> cars;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ownerid;
    private String name, surname;

    public Owner(){

    }
    public Owner(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public long getOwnerid(){
        return this.ownerid;
    }
    public List<Car> getCars() {   return cars;  }

    public void setCars(List<Car> cars) {   this.cars = cars;  }

    @Override  public String toString() {
        return "Owner [cars=" + cars + ", ownerid=" + ownerid + ", name="
                + name + ", surname=" + surname + "]";
    }

}
