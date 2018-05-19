package domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Team implements Comparable<Team> {

    private String coach;
    private String city;
    private int year;

    @JsonCreator
    public Team(
            @JsonProperty("coach") String coach,
            @JsonProperty("city") String city,
            @JsonProperty("year") int year) {
        this.coach = coach;
        this.city = city;
        this.year = year;
    }

    public String getCoach() {
        return coach;
    }

    public String getCity() {
        return city;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n***** Team Details *****\n");
        sb.append("Coach: \t" + coach +"\n");
        sb.append("City: \t" + city +"\n");
        sb.append("Year: \t" + year);
        return sb.toString();
    }

    public int compareTo(Team team){

        int result = this.year - team.getYear();
        if (result!= 0)
            return result;

        result = this.coach.compareTo(team.getCoach());
        if (result!= 0)
            return result;

        result = this.city.compareTo(team.getCity());
        if (result!= 0)
            return result;

        return 0;
    }
}
