package com.Employee.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.Employee.entity.ContinentalEntity;
import com.Employee.service.ContinentalService;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/continental")
@CrossOrigin(origins = "http://localhost:3000/")
public class ContinentalController {

    @Autowired
    private ContinentalService continentalService;

    @GetMapping("/foods")
    public List<ContinentalEntity> getAllFoods() {
        return continentalService.getAllFoods();
    }

    @GetMapping("/breakfast")
    public ResponseEntity<List<Map<String, Object>>> getBreakfastItems() {
        try {
            List<ContinentalEntity> breakfastItems = continentalService.getAllFoods(); // Assuming this method returns all foods
            
            // Filter breakfast items
            List<Map<String, Object>> result = breakfastItems.stream()
                    .filter(item -> item.getBreakfast() != null && !item.getBreakfast().isEmpty())
                    .map(item -> {
                        Map<String, Object> map = Map.of(
                        		"customerid",item.getCustomerid(),
                                "breakfast", item.getBreakfast(),
                                "b_price", item.getB_price()
                        );
                        return map;
                    })
                    .collect(Collectors.toList());

            return ResponseEntity.ok(result);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    

    
    @GetMapping("/curries")
    public ResponseEntity<List<Map<String, Object>>> getCurriesAndPrices() {
        try {
            List<ContinentalEntity> curriesItems = continentalService.getAllFoods(); // Assuming this method returns all foods

            // Filter curries items
            List<Map<String, Object>> result = curriesItems.stream()
                    .filter(item -> item.getCurries() != null && !item.getCurries().isEmpty())
                    .map(item -> {
                        Map<String, Object> map = Map.of(
                        		"customerid",item.getCustomerid(),
                                "curries", item.getCurries(),
                                "c_price", item.getC_price()
                        );
                        return map;
                    })
                    .collect(Collectors.toList());

            return ResponseEntity.ok(result);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    @GetMapping("/soups") // Changed endpoint to /soups
    public ResponseEntity<List<Map<String, Object>>> getSoupsAndPrices() {
        try {
            List<ContinentalEntity> soupsItems = continentalService.getAllFoods(); // Assuming this method returns all foods

            // Filter soups items
            List<Map<String, Object>> result = soupsItems.stream()
                    .filter(item -> item.getSoups() != null && !item.getSoups().isEmpty())
                    .map(item -> {
                        Map<String, Object> map = Map.of(
                        		"customerid",item.getCustomerid(),
                                "soups", item.getSoups(),
                                "s_price", item.getS_price()
                        );
                        return map;
                    })
                    .collect(Collectors.toList());

            return ResponseEntity.ok(result);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    @GetMapping("/starters") // Changed endpoint to /starters
    public ResponseEntity<List<Map<String, Object>>> getStartersAndPrices() {
        try {
            List<ContinentalEntity> startersItems = continentalService.getAllFoods(); // Assuming this method returns all foods

            // Filter starters items
            List<Map<String, Object>> result = startersItems.stream()
                    .filter(item -> item.getStarters() != null && !item.getStarters().isEmpty())
                    .map(item -> {
                        Map<String, Object> map = Map.of(
                        		"customerid",item.getCustomerid(),
                                "starters", item.getStarters(),
                                "s1_price", item.getS1_price()
                        );
                        return map;
                    })
                    .collect(Collectors.toList());

            return ResponseEntity.ok(result);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    @GetMapping("/maincourse") // Changed endpoint to /maincourse
    public ResponseEntity<List<Map<String, Object>>> getMainCourseItems() {
        try {
            List<ContinentalEntity> mainCourseItems = continentalService.getAllFoods(); // Assuming this method returns all foods

            // Filter main course items
            List<Map<String, Object>> result = mainCourseItems.stream()
                    .filter(item -> item.getMaincourse() != null && !item.getMaincourse().isEmpty())
                    .map(item -> {
                        Map<String, Object> map = Map.of(
                        		"customerid",item.getCustomerid(),
                                "maincourse", item.getMaincourse(),
                                "m_price", item.getM_price()
                        );
                        return map;
                    })
                    .collect(Collectors.toList());

            return ResponseEntity.ok(result);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    @GetMapping("/desserts") // Changed endpoint to /desserts
    public ResponseEntity<List<Map<String, Object>>> getDessertsAndPrices() {
        try {
            List<ContinentalEntity> dessertsItems = continentalService.getAllFoods(); // Assuming this method returns all foods

            // Filter desserts items
            List<Map<String, Object>> result = dessertsItems.stream()
                    .filter(item -> item.getDesserts() != null && !item.getDesserts().isEmpty())
                    .map(item -> {
                        Map<String, Object> map = Map.of(
                        		"customerid",item.getCustomerid(),
                                "desserts", item.getDesserts(),
                                "d_price", item.getD_price()
                        );
                        return map;
                    })
                    .collect(Collectors.toList());

            return ResponseEntity.ok(result);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    @GetMapping("/drinks") // Changed endpoint to /drinks
    public ResponseEntity<List<Map<String, Object>>> getDrinksAndPrices() {
        try {
            List<ContinentalEntity> drinksItems = continentalService.getAllFoods(); // Assuming this method returns all foods

            // Filter drinks items
            List<Map<String, Object>> result = drinksItems.stream()
                    .filter(item -> item.getDrinks() != null && !item.getDrinks().isEmpty())
                    .map(item -> {
                        Map<String, Object> map = Map.of(
                        		"customerid",item.getCustomerid(),
                                "drinks", item.getDrinks(),
                                "d1_price", item.getD1_price()
                        );
                        return map;
                    })
                    .collect(Collectors.toList());

            return ResponseEntity.ok(result);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("/food/{id}")
    public ContinentalEntity getFoodById(@PathVariable Long id) {
        return continentalService.getFoodById(id);
    }

    @PostMapping("/save")
    public ResponseEntity<ContinentalEntity> addFood(@RequestBody ContinentalEntity food) {
        ContinentalEntity savedFood = continentalService.addFood(food);
        return new ResponseEntity<>(savedFood, HttpStatus.CREATED);
    }

    @PutMapping("/food/{id}")
    public ContinentalEntity updateFood(@PathVariable Long id, @RequestBody ContinentalEntity food) {
        return continentalService.updateFood(id, food);
    }

    @DeleteMapping("/food/{id}")
    public void deleteFood(@PathVariable Long id) {
        continentalService.deleteFood(id);
    }
}
//sumanth