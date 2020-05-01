package nata.daw.domain;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface CarPagingRepository extends PagingAndSortingRepository<Car, Long> {
    
}
