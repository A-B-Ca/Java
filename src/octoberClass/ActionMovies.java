package octoberClass;

public class ActionMovies extends MovieIndustry {
    int numbOfFight;
    int numOfVillain;
    CCC c;

    public ActionMovies(int numbOfFight, int numOfVillain, CCC c) {
        this.numbOfFight = numbOfFight;
        this.numOfVillain = numOfVillain;
        this.c = c;
    }

    @Override
    public String toString() {
        return "ActionMovies{" +
                "numbOfFight=" + numbOfFight +
                ", numOfVillain=" + numOfVillain +
                ", c=" + c +
                ", nationality='" + nationality + '\'' +
                ", censorboard='" + censorboard + '\'' +
                ", duration=" + duration +
                ", language='" + language + '\'' +
                '}';
    }
}
