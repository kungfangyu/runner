package dev.fane.runnerz.run;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface RunRepository extends ListCrudRepository<Run, Integer>{

    @Query
    List<Run> findAllByLocation(String location); //這邊可以根據不一樣的參數找資料
}
