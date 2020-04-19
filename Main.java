class Person {
    private String fio;
    private String post;
    private String email;
    private String tel;
    private int mpm;
    private int age;

    Person(String fio, String post, String email, String tel, int mpm, int age) {
        this.fio = fio;
        this.post = post;
        this.email = email;
        this.tel = tel;
        this.mpm = mpm;
        if (age >= 18) {
            this.age = age;
        } else {
            System.out.println("Возраст сотрудника должен быть больше 18 лет");
        }
    }

    int GetAge() {
        return age;
    }

    void Show() {
        System.out.println(fio + ", " + post + ", " + email + ", " + tel + ", " + mpm + "₽, " + age+" лет.");
    }
}


public class Main {

    public static void main(String[] args) {

        Person[] persArray = new Person[6];
        persArray[0] = new Person("Aen Aenov", "Engineer", "aeoaenov@mail.ru", "89212111111", 30000, 20);
        persArray[1] = new Person("Ben Benov", "Sys.Admin", "benbenov@mail.ru", "89212222222", 35000, 40);
        persArray[2] = new Person("Ven Venov", "DevOps", "venvenov@mail.ru", "89212333333", 40000, 50);
        persArray[3] = new Person("Cen Cenov", "Programmer", "cencenov@mail.ru", "89212444444", 45000, 77);
        persArray[4] = new Person("Den Denov", "HoD", "dendenov@mail.ru", "89212555555", 50000, 70);
        for (Person item : persArray) {
            if (item.GetAge() > 40) item.Show();
        }
    }
}