public class Mario {
    private String hatColor;
    private String eyesColor;
    private String costumeColor;

    public Mario(String hatColor, String eyesColor,String costumeColor){
        this.hatColor = hatColor;
        this.eyesColor = eyesColor;
        this.costumeColor = costumeColor;
    }

    public void jump(){
        System.out.println("mario jump");
    }
    public void walk(){
        System.out.println("mario walk");
    }

}
