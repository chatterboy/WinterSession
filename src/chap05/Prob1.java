package chap05;

/**
 * Created by AIServer on 2016-12-27.
 */

class Printer {
    String model;
    String maker;
    String type;
    int numOfPrint;
    int numOfPaper;
    Printer() {}
    Printer(String model, String maker, String type, int numOfPrint, int numOfPaper) {
        this.model = model;
        this.maker = maker;
        this.type = type;
        this.numOfPrint = numOfPrint;
        this.numOfPaper = numOfPaper;
    }
    void decPaper() {
        --numOfPaper;
        --numOfPrint;
    }
    boolean canPrint() {
        return numOfPaper > 0 && numOfPrint > 0;
    }
    void print() {
        if (canPrint()) {
            System.out.println("model: " + model);
            System.out.println("maker: " + maker);
            System.out.println("type: " + type);
            System.out.println("# of print: " + String.valueOf(numOfPrint));
            System.out.println("# of paper: " + String.valueOf(numOfPaper));
            decPaper();
        }
    }
}

class Inkjet extends Printer {
    int remOfInk;
    Inkjet() {}
    Inkjet(String model, String maker, String type, int numOfPrint, int numOfPaper, int remOfInk) {
        super(model, maker, type, numOfPrint, numOfPaper);
        this.remOfInk = remOfInk;
    }
    void print() {
        super.print();
        if (canPrint()) {
            System.out.println("remainder of ink: " + String.valueOf(remOfInk));
        }
    }
}

class Laser extends Printer {
    int remOfToner;
    Laser() {}
    Laser(String model, String maker, String type, int numOfPrint, int numOfPaper, int remOfToner) {
        super(model, maker, type, numOfPrint, numOfPaper);
        this.remOfToner = remOfToner;
    }
    void print() {
        super.print();
        if (canPrint()) {
            System.out.println("remainder of toner: " + String.valueOf(remOfToner));
        }
    }
}

public class Prob1 {
    public static void main(String [] args) {
        Printer printer = new Printer("Printer1", "Indus1", "Basic", 3, 10);
        printer.print();
        printer.print();
        Inkjet inkjet = new Inkjet("Printer2", "Indus2", "Inkjet", 5, 10, 100);
        inkjet.print();
        inkjet.print();
        Laser laser = new Laser("Printer3", "Indus3", "Laser", 7, 15, 500);
        laser.print();
        laser.print();
    }
}
