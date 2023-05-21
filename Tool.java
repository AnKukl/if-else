package HW4;

public class Tool {

    public static void main(String[] args) {
        Tool tool = new Tool();
        System.out.println(tool.chekTemp());

    }
    Bulb first = new Bulb(101);
    Bulb second = new Bulb(20);


    public boolean chekTemp(){
        if (first.temperature >=100 && second.temperature <= 100){
            return true;
        } else {
            return false;
        }

    }

}
