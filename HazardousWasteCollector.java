public class HazardousWasteCollector extends WasteCollector {
    public void handleWaste(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("Hazardous")) {
            System.out.println("Hazardous waste collected and processed with caution.");
        } else {
            super.handleWaste(container);
        }
    }
}
