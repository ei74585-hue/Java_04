
class Punonjesi {
    String emri;
    double pagaBaze;
    int vitetEPunes;

    public Punonjesi(String emri, double pagaBaze, int vitetEPunes) {
        this.emri = emri;
        this.pagaBaze = pagaBaze;
        this.vitetEPunes = vitetEPunes;
    }

    public double llogaritPagen() {
        return pagaBaze + vitetEPunes * 10;
    }

    @Override
    public String toString() {
        return "Emri: " + emri +
                ", Paga: " + llogaritPagen() + " euro";
    }
}

// Nenklasa Menaxheri
class Menaxheri extends Punonjesi {
    double bonusi;

    public Menaxheri(String emri, double pagaBaze,
                     int vitetEPunes, double bonusi) {
        super(emri, pagaBaze, vitetEPunes);
        this.bonusi = bonusi;
    }

    @Override
    public double llogaritPagen() {
        return super.llogaritPagen() + bonusi;
    }

    @Override
    public String toString() {
        return "Menaxheri - " + emri +
                ", Paga: " + llogaritPagen() + " euro";
    }
}

// Nenklasa Praktikanti
class Praktikanti extends Punonjesi {

    public Praktikanti(String emri, double pagaBaze,
                       int vitetEPunes) {
        super(emri, pagaBaze, vitetEPunes);
    }

    @Override
    public double llogaritPagen() {
        return super.llogaritPagen() * 0.60;
    }

    @Override
    public String toString() {
        return "Praktikanti - " + emri +
                ", Paga: " + llogaritPagen() + " euro";
    }
}

// Klasa kryesore
public class main {
    public static void main(String[] args) {

        Punonjesi p1 = new Punonjesi("Arta", 500, 5);

        Menaxheri p2 = new Menaxheri("Blerimi", 800, 10, 200);

        Praktikanti p3 = new Praktikanti("Dreni", 600, 2);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
