public class RecyclableWasteCollector extends WasteCollector {
    public void handleWaste(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("Recyclable")) {
            System.out.println("Recyclable waste collected and processed.");
        } else {
            super.handleWaste(container);
        }
    }
}
