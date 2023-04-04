public class PersonManager {
    private String name;
    private String surname;
    private String status;
    private String age;

    public PersonManager(String name, String surname, String status, String age){
        this.name=name;
        this.surname=surname;
        this.status=status;
        this.age=age;
    }
    public String getSurname(){
        return surname;
    }

    public String getStatus(){
        return status;
    }
    public String yazdir(){
        return " Name & Surname: "+name+" "+ surname+" Status: "+status+" Age: "+age;
    }
}
