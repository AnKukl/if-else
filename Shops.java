package HW4;

public class Shops {
    public static void main(String[] args) {
        Shops shop = new Shops();
        System.out.println("Я могу купить еду: " + shop.canBuy());
    }
    boolean isEdekaOpen = true;
    boolean isReweOpen = false;
    public boolean canBuy(){
        if(isEdekaOpen && isReweOpen){
            return true;
        }else {
            return false;
        }
    }


}
