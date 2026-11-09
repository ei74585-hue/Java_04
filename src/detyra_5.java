public class detyra_5 {

    static class Motori {
        int fuqiaKF;
        boolean ndezur;

        public Motori(int fuqiaKF) {
            this.fuqiaKF = fuqiaKF;
            ndezur = false;
        }

        void ndize() {
            ndezur = true;
            System.out.println("Motori u ndez");
        }

        void fike() {
            ndezur = false;
            System.out.println("Motori u fik");
        }

        boolean isNdezur() {
            return ndezur;
        }
    }

    static class Vetura {
        Motori motori;

        public Vetura(int fuqiaKF) {
            motori = new Motori(fuqiaKF);
        }

        void nisu() {
            motori.ndize();
            System.out.println("Vetura u nis");
        }

        void ndalo() {
            motori.fike();
            System.out.println("Vetura u ndal");
        }
    }

    public static void main(String[] args) {

        Vetura v = new Vetura(120);

        v.nisu();

        System.out.println("Motori ndezur: " + v.motori.isNdezur());

        v.ndalo();

        System.out.println("Motori ndezur: " + v.motori.isNdezur());
    }
}

/*
Vetura extends Motori do te ishte gabim sepse vetura
nuk eshte motor, por ka motor.

Per kete arsye perdorim kompozimin, ku klasa Vetura
permban nje objekt te klases Motori.
*/

