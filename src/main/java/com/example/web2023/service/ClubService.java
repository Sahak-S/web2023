package com.example.web2023.service;

import com.example.web2023.dto.ClubDto;
import com.example.web2023.model.Club;

import java.util.List;

public interface ClubService {

    List<ClubDto>findAllClubs();

    Club saveClub(ClubDto clubDto);

    ClubDto findClubById(long clubId);

    void updateClub(ClubDto club);

    void delete(Long clubId);

    List<ClubDto>searchClubs(String query);
}
