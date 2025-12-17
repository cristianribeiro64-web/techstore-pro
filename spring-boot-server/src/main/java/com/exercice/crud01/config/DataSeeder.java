package com.exercice.crud01.config;

import com.exercice.crud01.model.Product;
import com.exercice.crud01.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class DataSeeder {

    @Bean
    CommandLineRunner initDatabase(ProductRepository repository) {
        return args -> {
            // Check if data already exists to avoid duplication on restarts if using
            // persistent DB (though H2 mem is volatile)
            if (repository.count() == 0) {
                repository.saveAll(Arrays.asList(
                        new Product("iPhone 15 Pro", "Apple flagship smartphone with A17 Pro chip, Titanium design",
                                999.99),
                        new Product("Samsung Galaxy S24 Ultra", "AI-powered Android smartphone with S Pen", 1299.99),
                        new Product("Sony WH-1000XM5", "Industry leading noise canceling headphones", 348.00),
                        new Product("MacBook Air M3", "Supercharged by M3, incredibly thin and light", 1099.00),
                        new Product("Logitech MX Master 3S", "Performance wireless mouse, ultra-fast scrolling", 99.99),
                        new Product("Kindle Paperwhite", "Now with a 6.8” display and adjustable warm light", 139.99),
                        new Product("PlayStation 5", "Experience lightning fast loading with an ultra-high speed SSD",
                                499.99),
                        new Product("Xbox Series X", "The fastest, most powerful Xbox ever", 499.99),
                        new Product("Nintendo Switch OLED", "7-inch OLED screen, wide adjustable stand", 349.99),
                        new Product("Dell XPS 13", "Iconic design, manufactured with CNC aluminum", 1199.00),
                        new Product("iPad Air", "Serious performance in a thin and light design", 599.00),
                        new Product("GoPro Hero 12",
                                "Incredible image quality, even better HyperSmooth video stabilization", 399.99),
                        new Product("Dyson V15 Detect", "Powerful cordless vacuum with laser illumination", 749.99),
                        new Product("Nespresso Vertuo", "Versatile coffee and espresso machine", 159.00),
                        new Product("Instant Pot Duo", "7-in-1 electric pressure cooker, slow cooker, rice cooker",
                                79.99),
                        new Product("Fitbit Charge 6", "Fitness tracker with heart rate, built-in GPS", 159.95),
                        new Product("Apple Watch Series 9", "Smarter, brighter, and mightier", 399.00),
                        new Product("Samsung Odyssey G9", "49-inch curved gaming monitor, 240Hz", 1299.99),
                        new Product("Keychron K2", "Wireless mechanical keyboard for Mac and Windows", 79.00),
                        new Product("Bose SoundLink Flex", "Bluetooth speaker with waterproof design", 149.00),
                        new Product("Google Pixel 8", "The helpful phone engineered by Google", 699.00),
                        new Product("Amazon Echo Dot", "Smart speaker with Alexa, vibrant sound", 49.99),
                        new Product("Ring Video Doorbell", "1080p HD video, improved motion detection", 99.99),
                        new Product("Philips Hue Starter Kit", "White and Color Ambiance smart light bulbs", 199.99),
                        new Product("Sonos Arc", "The premium smart soundbar for TV, movies, music", 899.00),
                        new Product("Razer DeathAdder V3", "Ultra-lightweight ergonomic esports mouse", 69.99),
                        new Product("SteelSeries Arctis Nova", "High fidelity gaming headset", 179.99),
                        new Product("ASUS ROG Zephyrus", "Ultra-slim gaming laptop with GeForce RTX", 1899.99),
                        new Product("LG OLED C3 TV", "Self-lit pixels, brightness booster", 1499.00),
                        new Product("Canon EOS R6", "Full-frame mirrorless camera for photographers", 2299.00),
                        new Product("DJI Mini 4 Pro", "Mini camera drone with omnidirectional obstacle sensing",
                                759.00),
                        new Product("Anker 737 Power Bank", "Ultra-powerful two-way charging", 149.99),
                        new Product("Yeti Rambler", "Vacuum insulated stainless steel bottle", 50.00),
                        new Product("North Face Backpack", "Classic design with modern organization", 99.00),
                        new Product("Nike Air Zoom Pegasus", "Responsive road running shoes", 130.00),
                        new Product("Adidas Ultraboost", "Energy-returning boost midsole", 180.00),
                        new Product("Levi's 501 Original", "The original straight fit jeans", 79.50),
                        new Product("Ray-Ban Aviator", "Classic style sunglasses", 163.00),
                        new Product("Samsonite Omni", "Hardside expandable luggage", 149.99),
                        new Product("Herman Miller Aeron", "The standard for office seating", 1650.00),
                        new Product("IKEA Markus", "Comfortable office chair with mesh back", 229.00),
                        new Product("NutriBullet Pro", "High-speed blender/mixer system", 89.99),
                        new Product("KitchenAid Mixer", "Iconic stand mixer for baking", 379.99),
                        new Product("De'Longhi ECP3420", "Bar pump espresso and cappuccino machine", 139.95),
                        new Product("Hydro Flask", "Wide mouth bottle with flex sip lid", 32.95),
                        new Product("JBL Flip 6", "Bold sound for every adventure", 129.95),
                        new Product("Garmin Forerunner", "GPS running watch with training features", 299.99),
                        new Product("Seagate Portable HDD", "External hard drive for backup", 69.99),
                        new Product("SanDisk Extreme SSD", "Portable NVMe SSD, robust and fast", 129.99),
                        new Product("Raspberry Pi 5", "The everything computer, optimized", 80.00)));
                System.out.println("Test data initialized in database.");
            }
        };
    }
}
