package utils;

import domain.Team;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingUtil {

    public static List<Team> sortTeams(List<Team> unsortedList){

        Collections.sort(unsortedList, (team1, team2) -> team1.compareTo(team2));

        return unsortedList;
    }

}