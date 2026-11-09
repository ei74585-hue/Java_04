public class detyra_4 {

    static class A {

        String emri() {
            return "A";
        }

        String pershendet() {
            return "Përshëndetje nga " + emri();
        }
    }

    static class B extends A {

        @Override
        String emri() {
            return "B";
        }
    }

    static class C extends B {

        @Override
        String pershendet() {
            return super.pershendet() + "!";
        }
    }

    public static void main(String[] args) {

        System.out.println(new A().pershendet());
        System.out.println(new B().pershendet());
        System.out.println(new C().pershendet());

    }
}

/*
Dalja:

Përshëndetje nga A
Përshëndetje nga B
Përshëndetje nga B!
*/
