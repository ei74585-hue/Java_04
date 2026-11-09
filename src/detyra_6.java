public class detyra_6 {

    static class Llogaria {
        private double bilanci;

        public Llogaria(double bilanci) {
            this.bilanci = bilanci;
        }
    }

    static class LlogariKursimi extends Llogaria {
        private double interesi;

        public LlogariKursimi(double interesi) {
            this.interesi = interesi;
        }

        public void shtoInteresin() {
            bilanci = bilanci + bilanci * interesi;
        }
    }

    public static void main(String[] args) {

        LlogariKursimi l = new LlogariKursimi(0.05);

        l.shtoInteresin();
    }
}

/*
GABIMI 1:
Ne konstruktorin e LlogariKursimi mungon super(),
sepse klasa prind ka konstruktor me parameter.

GABIMI 2:
Bilanci eshte private ne klasen Llogaria dhe
nuk mund te perdoret direkt ne klasen LlogariKursimi.
*/

