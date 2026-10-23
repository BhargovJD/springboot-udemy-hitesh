public class StringMethod {
    static void main() {
        String cityName = "Ghy";

        String oldCityName = new String("Sonitpur");

        System.out.println(cityName.toUpperCase());
        System.out.println(oldCityName);

        System.out.println(formatText(oldCityName));

    }

//    Custom method
    static String formatText(String text){
        System.out.println("Converting to lowercase:");
        return text.toLowerCase();
    }

}
