package intrface;

public interface Laptop {

    public void notepad();
    public void onedrive();
    public void document();

    default void settings(){
        System.out.println("implement code");
    }
     static void calculator(){
        System.out.println("implement code");
    }

}
// untill java 7 we used what to do n not how to do.
//from java8 on wards we can also perform how to do as well.
//implemented private methods in java9