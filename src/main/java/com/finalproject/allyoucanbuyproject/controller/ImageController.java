package com.finalproject.allyoucanbuyproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImageController {

    @GetMapping("/get_images")
    public String getImages(@RequestParam String category) {
        // Retrieve images based on the category from the database or storage
        String[] images = retrieveImagesFromDatabase(category);

        // Convert the array of images to a JSON response
        StringBuilder response = new StringBuilder();
        response.append("{\"images\": [");
        for (int i = 0; i < images.length; i++) {
            response.append("\"").append(images[i]).append("\"");
            if (i < images.length - 1) {
                response.append(",");
            }
        }
        response.append("]}");

        return response.toString();
    }

    private String[] retrieveImagesFromDatabase(String category) {
        // Implement the logic to retrieve images based on the category
        // Return an array of image URLs or file paths
        // You can use a database query or any other method to fetch the images
        // For demonstration, let's return some static image URLs
        if (category.equals("category1")) {
            return new String[]{
                    "https://example.com/image1.jpg",
                    "https://example.com/image2.jpg"
            };
        } else if (category.equals("category2")) {
            return new String[]{
                    "https://example.com/image3.jpg",
                    "https://example.com/image4.jpg"
            };
        } else {
            return new String[0]; // Return an empty array if the category is not found
        }
    }
}