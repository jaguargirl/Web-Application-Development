package daw.domain;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CarRepository extends CrudRepository<Car, Long> {
    List<Car> findByBrand(@Param("brand") String brand);
    List<Car> findByColor(@Param("color") String color);
    List<Car> findByYear(@Param("year") int year);
    List<Car> findByBrandAndModel(@Param("brand") String brand, @Param("model") String model);
    List<Car> findByBrandOrColor(@Param("brand") String brand,@Param("color") String color);
    List<Car> findByBrandOrderByYearAsc(@Param("brand") String brand);
    /*
    @Query("select c from Car c where c.brand like %?1")
    List<Car> findByBrand(String brand);
     */
    @Query("select c from Car c where c.brand like %?1")
    List<Car> findByBrandEndsWith(@Param("brand") String brand);
}
