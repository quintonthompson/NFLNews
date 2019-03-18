package com.thompson.nflnews.repostiories;

import com.thompson.nflnews.domain.Team;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends CrudRepository<Team, Long> {

    @Override
    Iterable<Team> findAll();
}
