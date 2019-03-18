package com.thompson.nflnews.web;

import com.thompson.nflnews.domain.Team;
import com.thompson.nflnews.services.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController //tells web that this is a rest api controller
@RequestMapping("/api/team") //maps request to this url
public class TeamController {

    @Autowired
    private TeamService teamService;

    @PostMapping("")
    public ResponseEntity<Team> createNewTeam(@RequestBody Team team){
        //returns a response to the request with object of team and Status of OK
        return new ResponseEntity<Team>(team, HttpStatus.OK);
    }

}
