public class SortingCities
{
    public static void main( String[] args ) {
        String[] cities = {"Bern", "Lucerne", "Interlaken", "Grindelwald", "Engelberg", "Geneva", "Murren", "Basel", "Zermatt", "Jungfraujoch"};
        int[] distances = {138, 52, 118, 136, 85, 276, 103, 87, 214, 101};

        SortingCities obj = new SortingCities();

        String[] upper = obj.convertUpperCase(cities);
        for(int i =0;i< cities.length;i++){
            System.out.print(upper [i]+ ", ");
        }
        System.out.println(" ");
        String city = obj.cityFiftyTwoKmFromZurich(cities, distances);
        //System.out.println(city);
        String city1 = obj.cityGreaterOrequalTwoSeventy(cities, distances);
        //System.out.println(city1);
    }


    public  String[] convertUpperCase(String[] citiesNames)
    {
        System.out.println("Cities in upperCases are :");
        String[] upperCase = new String[citiesNames.length];

        for (int i = 0; i < citiesNames.length; i++)
         {
            upperCase[i] = citiesNames[i].toUpperCase();
         }
        return upperCase;
    }

    public String cityFiftyTwoKmFromZurich(String[] citiessNames, int[] citiessDistance)
    {
            String city = "";
        System.out.println("City 52 Kms away from Zurish is :");
        for (int i = 0; i < citiessNames.length ; i++) {
            if(citiessDistance[i] == 52)
            {
                city = citiessNames[i];
                System.out.println(citiessNames[i]);
                break;
            }
        }

        return city;
    }
    public String cityGreaterOrequalTwoSeventy(String[] citiesNames, int[] citiesDistance) {
        String city1 = "";
        System.out.println("City 270 Kms away from Zurish is :");
        for (int i = 0; i < citiesNames.length; i++) {
            if (citiesDistance[i] >= 270) {
                city1 = citiesNames[i];
                System.out.println(citiesNames[i]);
                break;
            }
        }
        return city1;
    }}