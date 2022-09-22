public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 16_500;  // стоимость билета
        int pay = 20;  //  количество рублей за одну бонусную милю
        int cost = price / pay;  // начисленные мили
        int miles = service.calculate(cost);

        System.out.println("Количество начисленных мили за купленный билет: " + miles);


    }
}
