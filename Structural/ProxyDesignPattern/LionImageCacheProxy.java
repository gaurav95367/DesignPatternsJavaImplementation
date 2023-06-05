class LionImageCacheProxy implements IImage{
    private LionImage lm;
    @Override
    public void display() {
        //check security

        //checking cache
        if(lm == null){
            System.out.println("Not in Cache  fetching");
            lm = new LionImage();
        }
        else
            System.out.println("found in Cache");

        lm.display();
    }
}
