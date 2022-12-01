package Quiz2;

public class Test{
    private int score;
    private String[] allergens = {"eggs", "peanuts", "shellfish", "strawberries", "tomatoes", "chocolate", "pollen", "cats"};
    private boolean[] allergyList = new boolean[8];

    public Test(int score){
        this.score = score;
        for(int i = 0; i < 8; i++){
            if((score & 1) == 1){
                allergyList[i] = true;
            }
            score = score >> 1;
        }
    }

    public boolean isAllergicTo(String allergen){
        for(int i = 0; i < 8; i++){
            if(allergen.equals(allergens[i])){
                return allergyList[i];
            }
        }
        return false;
    }

    public String[] getList(){
        String[] list = new String[8];
        int count = 0;
        for(int i = 0; i < 8; i++){
            if(allergyList[i]){
                list[count] = allergens[i];
                count++;
            }
        }
        String[] list2 = new String[count];
        for(int i = 0; i < count; i++){
            list2[i] = list[i];
        }
        return list2;
    }
}
