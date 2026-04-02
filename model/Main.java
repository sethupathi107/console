package model;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    static List<Weather> weatherdata = new ArrayList<>();
    public static void main(String[] args) {
        weatherdata.add(new Weather("city1", LocalDate.parse("2025-10-01"), 30));
        weatherdata.add(new Weather("city2", LocalDate.parse("2025-10-01"), 30));
        weatherdata.add(new Weather("city3", LocalDate.parse("2025-10-01"), 30));
        weatherdata.add(new Weather("city4", LocalDate.parse("2025-10-01"), 32));
        weatherdata.add(new Weather("city5", LocalDate.parse("2025-10-01"), 31));
        weatherdata.add(new Weather("city6", LocalDate.parse("2025-10-01"), 31));
        weatherdata.add(new Weather("city7", LocalDate.parse("2025-10-01"), 32));
        weatherdata.add(new Weather("city8", LocalDate.parse("2025-10-01"), 33));
        weatherdata.add(new Weather("city9", LocalDate.parse("2025-10-01"), 33));
        weatherdata.add(new Weather("city10", LocalDate.parse("2025-10-01"), 33));
        weatherdata.add(new Weather("city11", LocalDate.parse("2025-10-01"), 32));
        weatherdata.add(new Weather("city12", LocalDate.parse("2025-10-01"), 34));
        weatherdata.add(new Weather("city13", LocalDate.parse("2025-10-01"), 35));
        weatherdata.add(new Weather("city1", LocalDate.parse("2025-10-02"), 30));
        weatherdata.add(new Weather("city2", LocalDate.parse("2025-10-02"), 30));
        weatherdata.add(new Weather("city3", LocalDate.parse("2025-10-02"), 30));
        weatherdata.add(new Weather("city4", LocalDate.parse("2025-10-02"), 32));
        weatherdata.add(new Weather("city5", LocalDate.parse("2025-10-02"), 31));
        weatherdata.add(new Weather("city6", LocalDate.parse("2025-10-02"), 31));
        weatherdata.add(new Weather("city7", LocalDate.parse("2025-10-02"), 32));
        weatherdata.add(new Weather("city8", LocalDate.parse("2025-10-02"), 33));
        weatherdata.add(new Weather("city9", LocalDate.parse("2025-10-02"), 33));
        weatherdata.add(new Weather("city10", LocalDate.parse("2025-10-02"), 33));
        weatherdata.add(new Weather("city11", LocalDate.parse("2025-10-02"), 32));
        weatherdata.add(new Weather("city12", LocalDate.parse("2025-10-02"), 34));
        weatherdata.add(new Weather("city13", LocalDate.parse("2025-10-02"), 35));
        weatherdata.add(new Weather("city1", LocalDate.parse("2025-10-03"), 30));
        weatherdata.add(new Weather("city2", LocalDate.parse("2025-10-03"), 30));
        weatherdata.add(new Weather("city3", LocalDate.parse("2025-10-03"), 30));
        weatherdata.add(new Weather("city4", LocalDate.parse("2025-10-03"), 32));
        weatherdata.add(new Weather("city5", LocalDate.parse("2025-10-03"), 31));
        weatherdata.add(new Weather("city6", LocalDate.parse("2025-10-03"), 31));
        weatherdata.add(new Weather("city7", LocalDate.parse("2025-10-03"), 32));
        weatherdata.add(new Weather("city8", LocalDate.parse("2025-10-03"), 33));
        weatherdata.add(new Weather("city9", LocalDate.parse("2025-10-03"), 33));
        weatherdata.add(new Weather("city10", LocalDate.parse("2025-10-03"), 33));
        weatherdata.add(new Weather("city11", LocalDate.parse("2025-10-03"), 32));
        weatherdata.add(new Weather("city12", LocalDate.parse("2025-10-03"), 34));
        weatherdata.add(new Weather("city13", LocalDate.parse("2025-10-03"), 35));
        weatherdata.add(new Weather("city1", LocalDate.parse("2025-10-04"), 30));
        weatherdata.add(new Weather("city2", LocalDate.parse("2025-10-04"), 30));
        weatherdata.add(new Weather("city3", LocalDate.parse("2025-10-04"), 30));
        weatherdata.add(new Weather("city4", LocalDate.parse("2025-10-04"), 32));
        weatherdata.add(new Weather("city5", LocalDate.parse("2025-10-04"), 31));
        weatherdata.add(new Weather("city6", LocalDate.parse("2025-10-04"), 31));
        weatherdata.add(new Weather("city7", LocalDate.parse("2025-10-04"), 32));
        weatherdata.add(new Weather("city8", LocalDate.parse("2025-10-04"), 33));
        weatherdata.add(new Weather("city9", LocalDate.parse("2025-10-04"), 33));
        weatherdata.add(new Weather("city10", LocalDate.parse("2025-10-04"), 33));
        weatherdata.add(new Weather("city11", LocalDate.parse("2025-10-04"), 32));
        weatherdata.add(new Weather("city12", LocalDate.parse("2025-10-04"), 34));
        weatherdata.add(new Weather("city13", LocalDate.parse("2025-10-04"), 35));

        Scanner sc = new Scanner(System.in);

        boolean flag=true;
        while (flag) {
            printlist();
            String input = sc.next();
            int userinput = inpuvalid(input, sc);
            switch (userinput) {
                case 1:
                    System.out.println("Enter the city name you want to check weather");
                    currentweather(sc.next(),sc);
                    break;
                case 2:
                    viewHistory(sc);
                    break;

                case 3:
                    filterByTemperature(sc);
                    break;

                case 4:
                    filterByDate(sc);
                    break;
                case 5:
                    addData(sc);
                    break;
                default:
                    flag=false;
                    break;
            }
        }
    }

    public static void printlist() {
        System.out.println("Enter the city you want to check weather");
        System.out.println("1 -> Check current weather of city");
        System.out.println("2 -> View History");
        System.out.println("3 -> Filter by temperature");
        System.out.println("4 -> Filter by date");
        System.out.println("5 -> Add Today Weather data");
        System.out.println("6 -> Exit");
    }


    public static void viewHistory(Scanner sc){
        pagination(weatherdata,sc);
    }


    public static int inpuvalid(String input, Scanner sc) {
        int ans = 0;
        while (true) {
            try {
                ans = Integer.parseInt(input);
                break;
            } catch (Exception e) {
                System.out.println("Invalid input Enter a number");
                input = sc.next();
            }
        }
        return ans;
    }

    public static void currentweather(String city,Scanner sc) {
        for(int ind=weatherdata.size()-1;ind>=0;ind--){
            if(weatherdata.get(ind).getCity().equals(city)){
                System.out.println(weatherdata.get(ind));
                break;
            }  
            
        }
    }

    public static void filterByDate(Scanner sc) {
        System.out.print("Enter date (YYYY-MM-DD): ");
        String userdate = sc.next().trim();

        try {
            LocalDate date = LocalDate.parse(userdate);
            List<Weather> filtered = weatherdata.stream()
                    .filter(w -> w.getDate().equals(date))
                    .collect(Collectors.toList());
            

            if (filtered.isEmpty()) {
                System.out.println("No data found for date: " + date);
            } else {
                System.out.println("Weather for " + date + ":");
                pagination(filtered, sc);
            }
        } catch (Exception e) {
            System.out.println("Invalid date format. Use YYYY-MM-DD.");
        }
    }

    private static void filterByTemperature(Scanner sc) {
        System.out.print("Enter minimum temperature (°C): ");
        int min = inpuvalid(sc.next().trim(), sc);
        System.out.print("Enter maximum temperature (°C): ");
        int max = inpuvalid(sc.next().trim(), sc);

        List<Weather> filtered = weatherdata.stream()
                .filter(w -> w.getTemp() >= min && w.getTemp() <= max)
                .collect(Collectors.toList());

        if (filtered.isEmpty()) {
            System.out.println("No records found between " + min + " and " + max + "°C.");
        } else {
            System.out.println("Filtered by temperature:");
            pagination(filtered, sc);
        }
    }

    public static void addData(Scanner sc){
        while (true) {
            System.out.println("Enter city name");
            String cityname = sc.next();
            LocalDate date = LocalDate.now();
            System.out.println("Enter Temperature");
            int temp = sc.nextInt();
            weatherdata.add(new Weather(cityname, date, temp));
            System.out.println("new data added");
            System.out.println("Add another new data  tell me Yes or No");
            String again = sc.next().trim().toLowerCase();
            if(again.equals("no")) break;
        }
    }



    public static void pagination(List<Weather> list, Scanner sc) {
        final int pageSize = 10;
        int page = 0;

        while (true) {
            if( page < 0){
                System.out.println("You are in first page");
                page++;
            }
            int start = page * pageSize;
            int end = Math.min(start + pageSize, list.size());
            if (start >= list.size()) {
                System.out.println("No more pages.");
                page--;
            }
            
            
            else System.out.println("Showing records " + (start + 1) + " to " + end + " of " + list.size() + ":");

            
            for (int i = start; i < end; i++) {
                System.out.println(list.get(i));
            }

            System.out.println("n=Next, p=Previous, q=Quit");
            System.out.print("Choose: ");
            String action = sc.next().trim().toLowerCase();

            if ("n".equals(action)) {
                page++;
            } else if ("p".equals(action)) {
                page--;
            }
            else if ("q".equals(action)) {
                break;
            } else {
                System.out.println("Invalid option. Use n/p/q.");
            }
        }
    }
}


