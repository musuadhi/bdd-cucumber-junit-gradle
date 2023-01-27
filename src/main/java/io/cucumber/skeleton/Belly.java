package io.cucumber.skeleton;

public class Belly {

    boolean growl_flag = false;
    public void eat(int cakes) {
        System.out.printf("I have %d cakes", cakes);
    }

    public void wait(int time_in_belly) {
        if (time_in_belly == 1){
            growl_flag = true;
        }
    }

    public void growl(){
        if (growl_flag)
            System.out.println("Growl!");
        else
            System.out.println("Ready for more cakes");
    }
}
