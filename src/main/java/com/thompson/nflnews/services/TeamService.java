package com.thompson.nflnews.services;

import com.thompson.nflnews.domain.Team;
import com.thompson.nflnews.repostiories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamService {

    @Autowired
    private TeamRepository teamRepository;

    //save team to database
    public Team saveTeam(Team team){
        return teamRepository.save(team);
    }
}
