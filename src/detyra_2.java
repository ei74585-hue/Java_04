public class detyra_2 {

    // Klasa Personi
    static class Personi {
        String emri;

        public Personi(String emri) {
            this.emri = emri;
        }
    }

    // IS-A: Mjeku eshte Personi
    static class Mjeku extends Personi {
        String specializimi;

        public Mjeku(String emri, String specializimi) {
            super(emri);
            this.specializimi = specializimi;
        }
    }

    // HAS-A: Spitali ka Dhome
    static class Dhoma {
        String numri;

        public Dhoma(String numri) {
            this.numri = numri;
        }
    }

    static class Spitali {
        String emri;
        Dhoma dhoma;

        public Spitali(String emri, Dhoma dhoma) {
            this.emri = emri;
            this.dhoma = dhoma;
        }
    }

    // Klasa kryesore
    public static void main(String[] args) {

        // IS-A (Trashëgimia)
        Mjeku mjeku = new Mjeku("Arben", "Kardiolog");

        System.out.println("=== IS-A (TRASHEGIMIA) ===");
        System.out.println("Emri i mjekut: " + mjeku.emri);
        System.out.println("Specializimi: " + mjeku.specializimi);

        // HAS-A (Kompozimi)
        Dhoma dhoma = new Dhoma("12");
        Spitali spitali = new Spitali("Spitali Qendror", dhoma);

        System.out.println("\n=== HAS-A (KOMPOZIMI) ===");
        System.out.println("Spitali: " + spitali.emri);
        System.out.println("Dhoma: " + spitali.dhoma.numri);

        // 3 shembuj IS-A
        System.out.println("\n=== 3 SHEMBUJ IS-A ===");
        System.out.println("1. Mjeku IS-A Personi");
        System.out.println("2. Infermieri IS-A Personi");
        System.out.println("3. Kirurgu IS-A Mjeku");

        // 3 shembuj HAS-A
        System.out.println("\n=== 3 SHEMBUJ HAS-A ===");
        System.out.println("1. Spitali HAS-A Dhoma");
        System.out.println("2. Mjeku HAS-A Specializimi");
        System.out.println("3. Pacienti HAS-A Kartela Mjekesore");

        // Pika (a)
        System.out.println("\n=== (a) DALLIMI ===");
        System.out.println("Trashëgimia: Nje klase trashegon");
        System.out.println("atributet dhe metodat nga nje klase tjeter.");
        System.out.println("Kompozimi: Nje klase permban objekte");
        System.out.println("te klasave te tjera si atribute.");

        // Pika (c)
        System.out.println("\n=== (c) STACK EXTENDS VECTOR ===");
        System.out.println("Konsiderohet dizajn jo i mire sepse");
        System.out.println("Vector lejon ndryshimin e elementeve");
        System.out.println("ne pozita te ndryshme, ndersa Stack");
        System.out.println("duhet te punoje sipas parimit LIFO.");
        System.out.println("Zgjidhja me e mire eshte kompozimi.");
    }
}




        /*
        (a) DALLIMI MES TRASHEGIMISE DHE KOMPOZIMIT

        TRASHEGIMIA (IS-A):
        Eshte mekanizem ku nje klase trashegon atributet
        dhe metodat nga nje klase tjeter.
        Perdoret fjala extends.

        Shembull:
        Mjeku IS-A Personi (Mjeku eshte nje Person).

        KOMPOZIMI (HAS-A):
        Eshte mekanizem ku nje klase permban nje objekt
        te nje klase tjeter si atribut.

        Shembull:
        Spitali HAS-A Dhoma (Spitali ka dhoma).


        (b) TRE SHEMBUJ IS-A DHE HAS-A

        IS-A (TRASHEGIMIA):
        1. Mjeku IS-A Personi.
        2. Infermieri IS-A Personi.
        3. Kirurgu IS-A Mjeku.

        HAS-A (KOMPOZIMI):
        1. Spitali HAS-A Dhoma.
        2. Mjeku HAS-A Specializimi.
        3. Pacienti HAS-A Kartela Mjekesore.


        (c) PSE Stack extends Vector KONSIDEROHET GABIM?

        Stack extends Vector konsiderohet dizajn jo i mire
        sepse Stack duhet te funksionoje sipas parimit LIFO
        (Last In, First Out).

        Ndersa Vector lejon qasje dhe ndryshime ne elemente
        ne pozita te ndryshme.

        Kjo mundeson perdorimin e metodave qe nuk pershtaten
        me funksionimin normal te Stack.

        Zgjidhja me e mire eshte kompozimi ne vend te
        trashegimise, duke perdorur metodat:
        push(), pop() dhe peek().
        */




