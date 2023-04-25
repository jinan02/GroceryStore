package com.quintus.labs.grocerystore.helper;

import com.quintus.labs.grocerystore.model.Category;
import com.quintus.labs.grocerystore.model.Offer;
import com.quintus.labs.grocerystore.model.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Grocery App
 * https://github.com/quintuslabs/GroceryStore
 * Created on 18-Feb-2019.
 * Created by : Santosh Kumar Dash:- http://santoshdash.epizy.com
 */
public class Data {
    List<Category> categoryList = new ArrayList<>();
    List<Product> productList = new ArrayList<>();
    List<Product> newList = new ArrayList<>();
    List<Product> popularList = new ArrayList<>();
    List<Offer> offerList = new ArrayList<>();

    public List<Category> getCategoryList() {
        Category category = new Category("1", "Food", "https://image.flaticon.com/icons/png/512/262/262344.png");
        categoryList.add(category);
        category = new Category("2", "Home & Cleaning", "https://lisasnatural.com/wp-content/uploads/2018/05/housecleanicon-300x228.jpg");
        categoryList.add(category);
        category = new Category("3", "Baby Care", "https://tips4tots.files.wordpress.com/2015/08/medical-insurance-free-icon.png");
        categoryList.add(category);
        category = new Category("4", "Bakery", "https://kathleenhalme.com/images/nutrition-clipart-sport.jpg");
        categoryList.add(category);
        category = new Category("5", "Pet care", "http://kasperstromman.files.wordpress.com/2013/05/dog-cat-above-board.jpg");
        categoryList.add(category);
        category = new Category("6", "Waters, Drinks", "https://thumbs.dreamstime.com/b/household-cleaning-products-accessories-basket-there-mop-detergents-rubber-gloves-glass-cleaner-sponges-89944820.jpg");
        categoryList.add(category);
        return categoryList;
    }

    public List<Product> getProductList() {
        Product product = new Product("1", "1", "Apple", "", "1 Kg", "MAD", "18", "10% OFF", "https://storage.googleapis.com/zopnow-static/images/products/320/fresh-apple-red-delicious-v-500-g.png");
        productList.add(product);
        product = new Product("2", "1", "Banana", "", "1 Bounch", "MAD", "13", "20% OFF", "https://images-na.ssl-images-amazon.com/images/I/21DejQuoT2L.jpg");
        productList.add(product);
        product = new Product("3", "2", "House Clean Liquid", "", "1 Lit.", "MAD", "25", "", "http://sunsetcleaningcia.com/wp-content/uploads/2016/05/houseclean.png");
        productList.add(product);
        product = new Product("4", "2", "House Clean Brush", "", "1 Piece", "MAD", "22", "", "https://www.clean-hoouse.com/wp-content/uploads/2017/09/13.png");
        productList.add(product);
        product = new Product("5", "3", "Pampers", "", "1 Piece", "MAD", "80", "10% OFF", "https://cdn.bmstores.co.uk/images/hpcProductImage/imgFull/311448-Pampers-Baby-Dry-Size-4-Maxi-251.jpg");
        productList.add(product);
        product = new Product("6", "3", "Baby Oil", "", "500 Ml", "MAD", "40", "", "https://res.cloudinary.com/dcphm6bor/image/upload/w_375/v1641471789/product/a1a1cbe9b5d95bb82f4579688584591a.jpg");
        productList.add(product);
        product = new Product("7", "4", "baguette", "", "1 unit", "MAD", "3", "", "https://res.cloudinary.com/dcphm6bor/image/upload/w_250,h_250,c_pad/v1583089597/marjane_assets/april_prod/217349_1");
        productList.add(product);
        product = new Product("8", "4", "Toast", "", "1 packet", "MAD", "20", "", "https://res.cloudinary.com/dcphm6bor/image/upload/w_250,h_250,c_pad/v1619185445/product/283d7003370381ab440177b67f886382.jpg");
        productList.add(product);
        product = new Product("9", "5", "bird feeder", "", "1 unit", "MAD", "56", "", "https://res.cloudinary.com/dcphm6bor/image/upload/w_250,h_250,c_pad/v1647947035/product/157fd088ca7b9c45cbe674e29f409f8a.jpg");
        productList.add(product);
        product = new Product("10", "5", "Accessory for birds", "", "1 unit", "MAD", "22", "", "https://res.cloudinary.com/dcphm6bor/image/upload/w_375/v1647939600/product/7b80ee99cc5507096486af662b49d570.jpg");
        productList.add(product);
        product = new Product("11", "6", "Starbucks Frappuccino caramel 25cl", "", "1 bottle", "MAD", "33", "", "https://res.cloudinary.com/dcphm6bor/image/upload/w_250,h_250,c_pad/v1587472469/product/e4b2c84881711617f0e79a6613886853.jpg");
        productList.add(product);
        product = new Product("12", "6", "Arizona Ice Tea can 33cl", "", "1 can", "MAD", "16", "", "https://res.cloudinary.com/dcphm6bor/image/upload/w_250,h_250,c_pad/v1674816013/product/6b63d72b876d747e0cfcd7e3298df497.jpg");
        productList.add(product);
        product = new Product("13", "1", "melon", "", "1 Kg", "MAD", "30", "30%OFF", "https://res.cloudinary.com/dcphm6bor/image/upload/w_250,h_250,c_pad/v1588272659/product/48ddd7d9c77176e406d9a2c0715b55e1.jpg");
        productList.add(product);
        return productList;
    }

    public List<Product> getNewList() {
        Product product = new Product("1", "1", "Apple", "", "1 Kg", "MAD", "20", "10% OFF", "https://storage.googleapis.com/zopnow-static/images/products/320/fresh-apple-red-delicious-v-500-g.png");
        newList.add(product);
        product = new Product("2", "1", "Banana", "", "1 Bounch", "MAD", "10", "20% OFF", "https://images-na.ssl-images-amazon.com/images/I/21DejQuoT2L.jpg");
        newList.add(product);
        product = new Product("3", "2", "House Clean Liquid", "", "1 Lit.", "MAD", "25", "", "http://sunsetcleaningcia.com/wp-content/uploads/2016/05/houseclean.png");
        newList.add(product);
        product = new Product("4", "2", "House Clean Brush", "", "1 Piece", "MAD", "10", "", "https://www.clean-hoouse.com/wp-content/uploads/2017/09/13.png");
        newList.add(product);
        product = new Product("5", "3", "Pampers", "", "1 Piece", "20", "MAD", "10% OFF", "https://cdn.bmstores.co.uk/images/hpcProductImage/imgFull/311448-Pampers-Baby-Dry-Size-4-Maxi-251.jpg");
        newList.add(product);
        return newList;
    }

    public List<Product> getPopularList() {
        Product product = new Product("6", "3", "Baby Oil", "", "500 Ml", "MAD", "40", "", "https://res.cloudinary.com/dcphm6bor/image/upload/w_375/v1641471789/product/a1a1cbe9b5d95bb82f4579688584591a.jpg");
        popularList.add(product);
        product = new Product("7", "4", "baguette", "", "1 unit", "MAD", "3", "", "https://res.cloudinary.com/dcphm6bor/image/upload/w_250,h_250,c_pad/v1583089597/marjane_assets/april_prod/217349_1");
        popularList.add(product);
        product = new Product("8", "4", "Toast", "", "1 packet", "MAD", "20", "", "https://res.cloudinary.com/dcphm6bor/image/upload/w_250,h_250,c_pad/v1619185445/product/283d7003370381ab440177b67f886382.jpg");
        popularList.add(product);
        product = new Product("9", "5", "bird feeder", "", "1 unit", "MAD", "56", "", "https://res.cloudinary.com/dcphm6bor/image/upload/w_250,h_250,c_pad/v1647947035/product/157fd088ca7b9c45cbe674e29f409f8a.jpg");
        popularList.add(product);
        product = new Product("10", "5", "Accessory for birds", "", "1 unit", "MAD", "22", "", "https://res.cloudinary.com/dcphm6bor/image/upload/w_375/v1647939600/product/7b80ee99cc5507096486af662b49d570.jpg");
        popularList.add(product);
        product = new Product("11", "6", "Starbucks Frappuccino caramel 25cl", "", "1 bottle", "MAD", "33", "", "https://res.cloudinary.com/dcphm6bor/image/upload/w_250,h_250,c_pad/v1587472469/product/e4b2c84881711617f0e79a6613886853.jpg");
        popularList.add(product);
        product = new Product("12", "6", "Arizona Ice Tea can 33cl", "", "1 can", "MAD", "16", "", "https://res.cloudinary.com/dcphm6bor/image/upload/w_250,h_250,c_pad/v1674816013/product/6b63d72b876d747e0cfcd7e3298df497.jpg");
        popularList.add(product);
        product = new Product("13", "1", "melon", "", "1 Kg", "MAD", "30", "30%OFF", "https://res.cloudinary.com/dcphm6bor/image/upload/w_250,h_250,c_pad/v1588272659/product/48ddd7d9c77176e406d9a2c0715b55e1.jpg");
        popularList.add(product);
        return popularList;
    }

    public List<Offer> getOfferList() {
        Offer offer = new Offer("https://api-ayaline.marjane.ma/uploads/_/originals/9f8922c5-9b01-40f5-ad39-6c5b216f482c.png");
        offerList.add(offer);
        offer = new Offer("https://api-ayaline.marjane.ma/uploads/_/originals/6057fb3b-c343-4843-9e12-06a99be9d3fd.png");
        offerList.add(offer);
        offer = new Offer("https://api-ayaline.marjane.ma/uploads/_/originals/b9951b7c-ca2e-44a0-b229-c38be696f276.png");
        offerList.add(offer);
        offer = new Offer("https://api-ayaline.marjane.ma/uploads/_/originals/ccd84a07-63c9-4884-99f5-6a55711e6aab.png");
        offerList.add(offer);
        offer = new Offer("https://api-ayaline.marjane.ma/uploads/_/originals/756162e1-2739-46a0-b4d8-c79f28f8677d.png");
        offerList.add(offer);
        offer = new Offer("https://api-ayaline.marjane.ma/uploads/_/originals/43640569-e213-4996-a845-dad237fc1149.png");
        offerList.add(offer);


        return offerList;
    }
}
