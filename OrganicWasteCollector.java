public class OrganicWasteCollector extends WasteCollector {
    public void handleWaste(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("Organic")) {
            System.out.println("Organic waste collected and processed.");
        } else {
            super.handleWaste(container);
        }
    }
}
