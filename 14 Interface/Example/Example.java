class Phone{
    public void call(){
        System.out.println("calling to Bela bose : 2441139");
    }
    public void sms(){
        System.out.println("Sent text to Her : 'Love you!'");
    }
}

interface Icamera {
    public void click();
    public void record();
}

interface ImusicPlayer{
    public void play();
    public void stop();
    public void nextSong();
}

class SmartPhone extends Phone implements Icamera,ImusicPlayer{
    @Override
    public void click(){System.out.println("Picture is being clicked...");}
    public void record(){System.out.println("Video is being recorded...");}

    public void play(){System.out.println("Music is being played...");}
    public void stop(){System.out.println("Music is stopped!");}
    public void nextSong(){System.out.println("Changed to next music.");}

    public void gps(){System.out.println("Scanning location");}
    public void internet(){System.out.println("Internet is on, Now you can search on web browser");}
}

public class Example {
    public static void main(String[] args) {

        SmartPhone vivo = new SmartPhone();
        ImusicPlayer radio = new SmartPhone();
        Icamera dslr = new SmartPhone();

        vivo.internet();
        vivo.gps();

        radio.play();
        radio.nextSong();
        radio.stop();

        dslr.click();
        dslr.record();
    }
}
