package paket;

public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock("SBER", "ПАО Сбербанк");
        stock.setPreviousClosingPrice(281.50);
        stock.setCurrentPrice(282.87);
        // Вычисление и вывод процента изменения стоимости акций
        double changePercent = stock.getChangePercent();
        System.out.printf("Процент изменения стоимости акций " + changePercent + "%%");
    }

}
