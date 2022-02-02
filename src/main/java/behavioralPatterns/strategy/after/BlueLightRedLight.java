package behavioralPatterns.strategy.after;

public class BlueLightRedLight {

    private Speed speed;

   public BlueLightRedLight(Speed speed) {
       this.speed = speed;
   }

    public void blueLightEach(Speed speed) {
    speed.blueLight();
    }

    public void redLightEach(Speed speed) {
        speed.redLight();
    }

    public void blueLight() {
        this.speed.blueLight();
    }

    public void redLight() {
        this.speed.redLight();
    }


}
