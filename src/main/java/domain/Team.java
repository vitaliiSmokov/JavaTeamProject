package domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Team {

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n***** Team Details *****\n");
        sb.append("Coach: \t" + coach +"\n");
        sb.append("City: \t" + city +"\n");
        sb.append("Year: \t" + year);
        return sb.toString();
    }
}
