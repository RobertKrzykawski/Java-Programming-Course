public class MainChallenge {
    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
        System.out.println("initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(5);
        System.out.printf("Current Job Pages: %d, Printer total: %d %n", pagesPrinted, printer.getPagesPrinted());
    }
}