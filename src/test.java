public class test {
    private int kontobeløb = 1000;
    private int overførselsbeløb = 0;
    private int opsparingsBeløb = 5000;

    public String overførBeløb(int overførselsbeløb) {
        if (kontobeløb >= overførselsbeløb) {
            double nytBeløbPåOpsparing = opsparingsBeløb + overførselsbeløb;
            double nytBeløbPåKonto = kontobeløb - overførselsbeløb;
            return "Overførselse succesfuld";

        } else {
            return "Beløbet du prøver at overfører er større end det beløb du har på kontoen";

        }
    }
}
