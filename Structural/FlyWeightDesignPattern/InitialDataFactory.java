import java.util.HashMap;
import java.util.Map;

class InitialDataFactory {
    static private Map<String,InitialData> mymap= new HashMap<>();



    static void printMapSize(){
        System.out.println("mymap size = "+mymap.size());
    }

    static InitialData getInitialData(String initialHealth, String initialAmmo, String initialGun, String walkSpeed){
        String key = initialHealth+initialAmmo+initialGun+walkSpeed;
        if(!mymap.containsKey(key)){
            InitialData id = new InitialData(initialHealth,initialAmmo,initialGun,walkSpeed);
            mymap.put(key,id);
        }
        return mymap.get(key);
    }
}
