public class Persoana {

     String Nume;
    int Varsta;

    Persoana(String Nume, int Varsta) {
        this.Nume = Nume;
        this.Varsta = Varsta;
    }

    String getNume() {
        return Nume;
    }

    int getVarsta() {
        return Varsta;
    }

    void setNume(String nume) {
        Nume = nume;
    }

    void setVarsta(int varsta) {
        Varsta = varsta;
    }



    public static void main(String args[]) {
        Persoana p1 = new Persoana("Andrei", 18);
        Persoana p2 = new Persoana("abc",  20);
        System.out.println("Nume: " + p1.getNume());
        System.out.println("Varsta: " + p1.getVarsta());
        System.out.println("Nume: " + p2.getNume());
        System.out.println("Varsta: " + p2.getVarsta());
    }

}