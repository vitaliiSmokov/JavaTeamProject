package utils;

import domain.Team;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingUtil {

    public static List<Team> sortTeams(List<Team> unsortedList){

        Collections.sort(unsortedList, new Comparator<Team>() {

            public int compare(Team team1, Team team2) {
                return team1.compareTo(team2);
            }
        });

        return unsortedList;
    }

}
