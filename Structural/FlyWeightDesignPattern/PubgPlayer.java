class PubgPlayer {
    String name;
    InitialData initialData;

    PubgPlayer(String name, String initialHealth,String initialAmmo, String initialGun,String walkSpeed){
        this.name=name;
        this.initialData = InitialDataFactory.getInitialData(initialHealth,initialAmmo,initialGun,walkSpeed);
    }
    //as below changes rarely and common for many types of player - normal, basic, pro
//    String initialHealth;
//    String initialAmmo;
//    String initialGun;
//    String walkSpeed;

}
