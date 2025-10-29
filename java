public class GiftCityEntity {
    // Class members (properties)
    private String name;
    private String businessSector;
    private boolean isIFSCUnit; // International Financial Services Centre (SEZ) status

    // Constructor
    public GiftCityEntity(String name, String sector, boolean isIFSC) {
        this.name = name;
        this.businessSector = sector;
        this.isIFSCUnit = isIFSC;
    }

    // Method to display the entity's details and zone
    public void displayEntityDetails() {
        String zone = this.isIFSCUnit ? "**IFSC (Special Economic Zone)**" : "**DTA (Domestic Tariff Area)**";
        System.out.println("--- Entity Profile ---");
        System.out.println("Name: " + this.name);
        System.out.println("Sector: " + this.businessSector);
        System.out.println("Operating Zone: " + zone);
        
        if (this.isIFSCUnit) {
            System.out.println("Note: This entity may avail special tax incentives and cross-border regulatory benefits.");
        }
    }

    public static void main(String[] args) {
        // Create an IFSC entity (e.g., a Foreign Bank Branch)
        GiftCityEntity ifscBank = new GiftCityEntity("Standard Chartered Bank", "Banking", true);
        ifscBank.displayEntityDetails();

        System.out.println("\n--------------------------\n");

        // Create a DTA entity (e.g., a Domestic IT Company)
        GiftCityEntity dtaITFirm = new GiftCityEntity("Tech Solutions India Ltd.", "IT & ITeS", false);
        dtaITFirm.displayEntityDetails();
    }
}
