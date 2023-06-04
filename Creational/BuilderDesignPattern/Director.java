public class Director {
    private IHouseBuilder builder ;
     Director(IHouseBuilder builder){
        this.builder=builder;
    }

    House buildHouse(){
         House h = new House();
         h.floorPlan = builder.build_floorPlan();
         h.electrictyPlan = builder.build_electrictyPlan();
         h.waterPlan = builder.build_waterPlan();
         h.pillars = builder.build_pillars();
         h.ceiling = builder.build_ceiling();
         h.tiles = builder.build_tiles();
         h.plaster = builder.build_plaster();
         h.paint = builder.build_paint();
         h.furniture = builder.build_furniture();
         return h;
    }
}
