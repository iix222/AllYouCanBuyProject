

const products = [
    {
        "id": 1,
        "name": "Garden furniture",
        "category": "Garden",
        "type": "Furniture",
        "image": "https://m.media-amazon.com/images/I/71AGDYIh4qL._AC_SX679_.jpg",
        "original_price": "129€",
        "discount": "15% off",
        "description": "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit...",
    },
    {
        "id": 2,
        "name": "Headphones",
        "category": "Electronics",
        "type": "Electronic",
        "image": "https://m.media-amazon.com/images/I/61q8Esn5UvL._AC_SY879_.jpg",
        "original_price": "60€",
        "discount": "15% off",
        "description": "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit...",
    },
    {
        "id": 3,
        "name": "Instant camera",
        " category": "Electronics",
        "type": "Electronic",
        "image": "https://m.media-amazon.com/images/I/412JsUs79hL._AC_SX679_.jpg",
        "original_price": "190€",
        "discount": "50% off",
        "description": "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit...",
    },
    {
        "id": 4,
        "name": "Dog bed",
        "category": "Pets",
        "type": "Animals",
        "image": "https://m.media-amazon.com/images/I/810uFCMRFuL._AC_SL1500_.jpg",
"original_price": "70€",
"discount": "35% off",
"description": "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit...",
    },
    {
        "id": 5,
        "name": "Fountain",
        "category": "Garden",
        "type": "Furniture",
        "image": "https://m.media-amazon.com/images/I/81VkLCn0gCL._AC_SX679_.jpg",
        "original_price": "180€",
        "discount": "15% off",
        "description": "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit...",
    },
    {
        "id": 6,
        "name": "Tempered glass",
        "category": "Electronics",
        "type": "Accessory",
        "image": "https://m.media-amazon.com/images/I/61fkIpO4SxL._AC_SL1500_.jpg",
        "original_price": "12€",
        "discount": "50% off",
        "description": "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit...",
    },
    {
        "id": 7,
        "name": "Statue",
        "category": "Garden",
        "type": "Furniture",
        "image": "https://m.media-amazon.com/images/I/81ljUc1awvL._AC_SL1500_.jpg",
"original_price": "55€",
"discount": "35% off",
"description": "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."
    },
    {
        "id": 8,
        "name": "Dog bowl",
        "category": "Pets",
        "type": "Animals",
        "image": "https://m.media-amazon.com/images/I/61GYd8qG2QL._AC_SL1500_.jpg",
"original_price": "55€",
"discount": "15% off",
"description": "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."
    },
    {
        " id": 9,
        " name": "Apple watch",
        " category": "Electronics",
        " type": "Electronic",
        "image": "https://m.media-amazon.com/images/I/71wiSqyzn6L._AC_SL1500_.jpg",
" original_price": "259€",
" discount": "0% off",
" description": "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."
    },
    {
        "id": 10,
        "name": "Cat toy set",
        "category": "Pets",
        "type": "Animals",
        "image": "https://m.media-amazon.com/images/I/61NPu0p-wsL._AC_SL1000_.jpg",
"original_price": "15€",
"discount": "0% off",
"description": "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."
    },
    {
        "id": 11,
        "name": "Carrier",
        "category": "Pets",
        "type": "Animals",
        "image": "https://m.media-amazon.com/images/I/81jNiuZUXjL._AC_SL1500_.jpg",
        "original_price": "35€",
        "discount": "0% off",
        "description": "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."
    },
    {
        "id": 12,
        "name": "Lawnmower",
        "category": "Garden",
        "type": "Furniture",
        "image": "https://m.media-amazon.com/images/I/71dCUT0RF1L._AC_SL1500_.jpg",
        "original_price": "349€",
        "discount": "0% off",
        "description": "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."
    }
];

const modifiedProducts = products.map(product => {
    const originalPrice = parseFloat(product.original_price);
    const discountPercentage = parseFloat(product.discount.replace('off', '')) / 100;
    const discountedPrice = originalPrice - (originalPrice * discountPercentage);

    return {
        ...product,
        price: discountedPrice.toFixed(2) + "\u20AC"
    };
});
products.forEach(product => {
    const link = document.createElement('a');
    link.href = `products/product${product.id}.html`; // Update the URL based on your directory structure and file naming convention
    link.textContent = product.name;

    const productContainer = document.getElementById('product-container');
    productContainer.appendChild(link);
});


