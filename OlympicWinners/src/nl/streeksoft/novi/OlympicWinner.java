package nl.streeksoft.novi;

public class OlympicWinner {
    String name;
    String gender;
    String sport;
    String discipline;
    byte medal; // 1 = goud, 2 = zilver, 3 = brons, 0 = geen waarde (= geen medaille).

    public OlympicWinner(String name, String gender, String sport, String discipline, byte medal) {
        this.name = name;
        this.gender = gender;
        this.sport = sport;
        this.discipline = discipline;
        this.medal = medal;
    }

    @Override
    public String toString() {
        String tmpString =
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", sport='" + sport + '\'' +
                ", discipline='" + discipline + '\'' +
                ", medal=";
                if(medal == 1) {
                    tmpString += " GOUD ";
                }
                else if( medal == 2) {
                    tmpString += " ZILVER ";
                }
                else if( medal == 3) {
                    tmpString += " BRONS ";
                }
        return tmpString;
    }
}
