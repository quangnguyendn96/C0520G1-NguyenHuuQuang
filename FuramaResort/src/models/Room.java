package models;

public class Room extends Services {
   String toStringFreeService;

    public static class FreeServiceIncluded {
        static String massage;
        static String karaoke;
        static String food;
        static String water;
        static String car;

        public FreeServiceIncluded(String massage, String karaoke, String food, String water, String car) {
            FreeServiceIncluded.massage = massage;
            FreeServiceIncluded.karaoke = karaoke;
            FreeServiceIncluded.food = food;
            FreeServiceIncluded.water = water;
            FreeServiceIncluded.car = car;
        }

        public FreeServiceIncluded() {
        }


        public static String toStringFreeService(String karaoke, String massage, String food, String beverage, String car) {
            return "FreeServiceIncluded{" +
                    "massage: " + massage + '\'' +
                    "/ karaoke: " + karaoke + '\'' +
                    "/ food: " + food + '\'' +
                    "/ beverage: " + beverage + '\'' +
                    "/ car: " + car + '\'' +
                    '}';
        }
    }


    public Room() {
    }

    public Room(String typeService, double area, double priceRents, int maxNumberOfCustomer, String typeRents,String toStringFreeService) {
        super(typeService, area, priceRents, maxNumberOfCustomer, typeRents);
        this.toStringFreeService = toStringFreeService;
    }

    public String getToStringFreeService() {
        return toStringFreeService;
    }

    @Override
    public String showInfor() {
        return String.format("%-20s%-20s%-20s%-20s%-20s%-50s", typeService, area, priceRents, maxNumberOfCustomer, typeRents, toStringFreeService);
    }


}
