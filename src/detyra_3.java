public class detyra_3 {

    static class Forma {
        String ngjyra;

        public Forma(String ngjyra) {
            this.ngjyra = ngjyra;
        }

        public double siperfaqja() {
            return 0;
        }

        @Override
        public String toString() {
            return "Ngjyra: " + ngjyra;
        }
    }

    static class Rrethi extends Forma {
        double rrezja;

        public Rrethi(String ngjyra, double rrezja) {
            super(ngjyra);
            this.rrezja = rrezja;
        }

        @Override
        public double siperfaqja() {
            return Math.PI * rrezja * rrezja;
        }

        @Override
        public String toString() {
            return "Rrethi, ngjyra: " + ngjyra +
                    ", siperfaqja: " + siperfaqja();
        }
    }

    static class Drejtkendeshi extends Forma {
        double gjatesia;
        double gjeresia;

        public Drejtkendeshi(String ngjyra, double gjatesia, double gjeresia) {
            super(ngjyra);
            this.gjatesia = gjatesia;
            this.gjeresia = gjeresia;
        }

        @Override
        public double siperfaqja() {
            return gjatesia * gjeresia;
        }

        @Override
        public String toString() {
            return "Drejtkendeshi, ngjyra: " + ngjyra +
                    ", siperfaqja: " + siperfaqja();
        }
    }

    static class Katrori extends Drejtkendeshi {

        public Katrori(String ngjyra, double a) {
            super(ngjyra, a, a);
        }

        @Override
        public double siperfaqja() {
            return super.siperfaqja();
        }

        @Override
        public String toString() {
            return "Katrori, ngjyra: " + ngjyra +
                    ", siperfaqja: " + siperfaqja();
        }
    }

    public static void main(String[] args) {

        Forma f1 = new Forma("E bardhe");
        Forma f2 = new Rrethi("E kuqe", 5);
        Forma f3 = new Drejtkendeshi("E kalter", 6, 4);
        Forma f4 = new Katrori("E gjelber", 4);

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);
    }
}

