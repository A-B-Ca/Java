package octoberClass;

public class OuterC {
    Movies m=new Movies(){
        @Override
        public void playMovie() {
            super.playMovie();
            System.out.println("Play Movie");
        }
    };




}
