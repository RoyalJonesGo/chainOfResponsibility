public class WasteManagementSystem {
    private WasteCollector chain;

    public WasteManagementSystem() {
        // initialize chain
        WasteCollector organic = new OrganicWasteCollector();
        WasteCollector recyclable = new RecyclableWasteCollector();
        WasteCollector hazardous = new HazardousWasteCollector();
        
        // setup chain
        organic.setNextCollector(recyclable);
        recyclable.setNextCollector(hazardous);
        
        this.chain = organic;
    }

    public void processWaste(WasteContainer container) {
        if (container.isFull()) {
            chain.handleWaste(container);
        } else {
            System.out.println("Waste container is not full yet.");
        }
    }

    public static void main(String[] args) {
        WasteManagementSystem system = new WasteManagementSystem();
        
        WasteContainer organicBin = new WasteContainer("Organic", 100);
        WasteContainer recycleBin = new WasteContainer("Recyclable", 100);
        WasteContainer hazardousBin = new WasteContainer("Hazardous", 100);
        WasteContainer unknownBin = new WasteContainer("Unknown", 100);
        
        system.processWaste(organicBin);
        system.processWaste(recycleBin);
        system.processWaste(hazardousBin);
        system.processWaste(unknownBin);
    }
}
