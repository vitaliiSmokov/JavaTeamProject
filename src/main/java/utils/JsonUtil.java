package utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import domain.Team;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonUtil {

    private ObjectMapper mapper = new ObjectMapper();
    private TypeFactory factory = TypeFactory.defaultInstance();
    private FileInputStream fileInputStream;

    public List<Team> parseJson(File file) {
        try {
            fileInputStream = new FileInputStream(file.getAbsolutePath());
        } catch (FileNotFoundException e) {
            System.err.println(String.format("File '%s' not found", file.getName()));
        }

        List<Team> teams = new ArrayList<Team>();
        try {
            teams = mapper.readValue(fileInputStream,
                    factory.constructCollectionType(ArrayList.class, Team.class));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  teams;
    }
}
