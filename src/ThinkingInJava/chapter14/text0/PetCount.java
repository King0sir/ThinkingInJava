package ThinkingInJava.chapter14.text0;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: asus
 * Date: 16-1-24
 * Time: 上午11:27
 * To change this template use File | Settings | File Templates.
 */
public class PetCount {
    static class PetCounter extends HashMap<String,Integer>{
        public void count(String type){
            Integer q  = get(type);
            if(q==null){
                put(type,1);
            }else {
                put(type,q+1);
            }
        }

    }
    public static void countPets(PetCreator creator){
        PetCounter counter = new PetCounter();
        for(Pet pet: creator.createArray(20)){
            System.out.println(pet.getClass().getSimpleName()+" ");
            if(pet instanceof Pet){
                counter.count("pet");
            }
            if(pet instanceof Dog){
                counter.count("dog");
            }if(pet instanceof Mutt){
                counter.count("mutt");
            }if(pet instanceof Pug){
                counter.count("pug");
            }if(pet instanceof Cat){
                counter.count("cat");
            }if(pet instanceof Manx){
                counter.count("manx");
            }if(pet instanceof Cymric){
                counter.count("cymric");
            }if(pet instanceof Rodent){
                counter.count("rodent");
            }if(pet instanceof Rat){
                counter.count("rat");
            }if(pet instanceof Mouse){
                counter.count("mouse");
            }if(pet instanceof Hamster){
                counter.count("hamster");
            }
        }
        System.out.println();
        System.out.println(counter);
    }

    public static void main(String[] args) {
        countPets(new ForNameCreator());
    }
}
