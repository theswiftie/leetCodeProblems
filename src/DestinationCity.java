public class DestinationCity {
    public static int Hash (String city) {
        int hash = 0;
        for (int i = 0; i < city.length(); i++){
            hash += city.charAt(i) - 'A';
        }
        hash = ((hash + city.charAt(city.length() / 2))) % 100;
        return hash;
    }

    public static void main(String[] args) {
        System.out.println(Hash("New York"));
        System.out.println(Hash("Delhi"));
        System.out.println(Hash("A"));
        System.out.println(Hash("Newark"));
        System.out.println(Hash("Princeton"));
        System.out.println(Hash("Prisceton"));
        System.out.println(Hash("Sao Paulo"));
        System.out.println(Hash("San Diego"));

    }
}
