import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        var personlist= new PersonList("C:\\Users\\Senaa\\OneDrive\\Masaüstü\\coding\\Java-coding\\Project\\family.txt");
        var searctosurname=personlist.SearchtoSurname("AKAT");
        for(var result:searctosurname)
            System.out.println(result.yazdir());

        var searctostatus=personlist.SearchtoStatus("Kuzen");
        for(var result:searctostatus)
            System.out.println(result.yazdir());

    }
}