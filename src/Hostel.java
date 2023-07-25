public class Hostel implements ServiceAble{
    private int Person;
    public Hostel(int person) {
        Person = person;
    }
    public int getPerson() {
        return Person;
    }
    public void setPerson(int person) {
        Person = person;
    }
    @Override
    public void Service() {
        System.out.println(10000 + " мин сомдон Аренда Толойт");
    }
}
