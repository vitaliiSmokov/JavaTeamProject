package testSortingUtil;

import domain.Team;
import org.testng.annotations.Test;
import utils.JsonUtil;
import utils.SortingUtil;

import java.io.File;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class TestSortingUtil {

    List<Team> unsortedTeams = new JsonUtil().parseJson(new File("src/main/resources/test_teams.json"));
    List<Team> toSort = new JsonUtil().parseJson(new File("src/main/resources/test_teams.json"));


    @Test
    public void testCanSortTeams() {
        System.out.println(unsortedTeams);
        List<Team> sortedTeams = SortingUtil.sortTeams(toSort);
        System.out.println(sortedTeams);
        assertThat(sortedTeams.get(0), is(equalTo(unsortedTeams.get(0))));
        assertThat(sortedTeams.get(1), is(equalTo(unsortedTeams.get(2))));
        assertThat(sortedTeams.get(2), is(equalTo(unsortedTeams.get(1))));
    }
}
