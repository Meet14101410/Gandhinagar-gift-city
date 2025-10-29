#include <iostream>
#include <string>

// Function to check tax exemption status based on years of operation
int checkTaxStatus(int years_of_operation) {
    const int EXEMPTION_PERIOD = 5;
    if (years_of_operation <= EXEMPTION_PERIOD) {
        return 100; // 100% tax exemption
    } else {
        return 0; // Taxable (Simplified for illustration)
    }
}

int main() {
    std::string entity_name = "Global Finance Solutions Pvt. Ltd.";
    int years = 3; // Example: 3 years of operation

    std::cout << "--- GIFT City SEZ Entity Status ---" << std::endl;
    std::cout << "Entity: " << entity_name << std::endl;
    std::cout << "Years of Operation: " << years << std::endl;

    int exemption_percentage = checkTaxStatus(years);

    if (exemption_percentage == 100) {
        std::cout << "Status: **Eligible for " << exemption_percentage << "% tax exemption** (Within the first 5 years)." << std::endl;
    } else {
        std::cout << "Status: **Taxable** (Beyond the initial 5-year exemption period)." << std::endl;
    }

    return 0;
}
