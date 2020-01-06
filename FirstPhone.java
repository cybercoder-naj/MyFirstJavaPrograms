public abstract class FirstPhone {

    void call() {
        System.out.println("Calling...");
    }

    public abstract void clickPicture();
    public abstract void playMusic();
    public abstract void playGames();
}

class SamsungNote8 extends FirstPhone {

    @Override
    public void clickPicture() {
        System.out.println("Clicking Picture...");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing Music...");
    }

    @Override
    public void playGames() {
        System.out.println("Playing Games...");
    }
}