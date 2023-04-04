import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class PersonList {
    private List<PersonManager> personList;
    public PersonList(String fileline) throws IOException{
        var list= Files.readAllLines(Path.of(fileline));
        personList=new ArrayList<>();
        for (var line:list){
            var family=line.split("-");
            personList.add(new PersonManager(family[0],family[1],family[2],family[3]));
        }
    }

    public List<PersonManager> SearchtoSurname(String surname){
        var resultlist=new ArrayList<PersonManager>();
        for(var result: personList )
            if(result.getSurname().equals(surname))
                resultlist.add(result);
        return resultlist;
    }

    public List<PersonManager> SearchtoStatus (String status){
        var resultlist=new ArrayList<PersonManager>();
        for(var result: personList )
            if(result.getStatus().equals(status))
                resultlist.add(result);
        return resultlist;
    }
}
