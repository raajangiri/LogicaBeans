package com.raajan.demo.Repository;


import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

import com.raajan.demo.Entity.Movie;

public interface MovieRepository extends CrudRepository<Movie, Long>,
        JpaSpecificationExecutor<Movie> {

    // TODO: add queries
}