public class Main {
    public static void main(String[] args) {
        System.out.println("Moscow");
        System.out.println("FLAT ");
        Flat flat = new Flat(3);
        System.out.println(flat.getPerson() + " Адам жашайт");
        flat.Rent();
        System.out.println("Balashitha");
        System.out.println("HOSTEL");
        Hostel hostel = new Hostel(2);
        System.out.println(hostel.getPerson() + " Адам жашайт");
        hostel.Service();
        System.out.println("Balashikha");
        System.out.println("HOTEL");
        Hotel hotel = new Hotel(3);
        System.out.println(hotel.getPerson()+" Адам жашайт");
        hotel.Rent();
        System.out.println("FAMILY");
        Family family = new Family(8);
        System.out.println("Бир Уй-булодо " + family.getPerson() + " Адам Жашайт");
    }
}

