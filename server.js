const express = require('express');
const app = express();

app.use(express.urlencoded({ extended: true })); // Parse URL-encoded bodies
app.use(express.json()); // Parse JSON bodies

app.post('/submit_product', (req, res) => {
    // Retrieve the form data from the request body
    const { quantity } = req.body;

    // Process the form data (e.g., save it to a database)
    // ...

    // Send a response back to the client
    res.sendStatus(200);
});

// Start the server
app.listen(3000, () => {
    console.log('Server listening on port 3000');
});

let products = [
    {
        id: 1,
        name: 'Garden furniture',
        category: 'Garden',
        image: 'https://m.media-amazon.com/images/I/71AGDYIh4qL._AC_SX679_.jpg',
        discount: '15% off',
        price: '99€'
    },
    {
        id: 2,
        name: 'Headphones',
        category: 'Electronics',
        image: 'https://m.media-amazon.com/images/I/61q8Esn5UvL._AC_SY879_.jpg',
        discount: '15% off',
        price: '50€'
    },
    {
        id: 3,
        name: 'Instant camera',
        category: 'Electronics',
        image: 'https://m.media-amazon.com/images/I/412JsUs79hL._AC_SX679_.jpg',
        discount: '50% off',
        price: '89€'
    },
    { id: 4,
        name: 'Dog bed',
        category: 'Pets',
        image: 'https://m.media-amazon.com/images/I/810uFCMRFuL._AC_SL1500_.jpg',
        discount: '35% off',
        price: '49€'
    },
    {
        id: 5,
        name: 'Fountain',
        category: 'Garden',
        image: 'https://m.media-amazon.com/images/I/81VkLCn0gCL._AC_SX679_.jpg',
        discount: '15% off',
        price: '150€'
    },
    {
        id: 6,
        name: 'Tempered glass',
        category: 'Electronics',
        image: 'https://m.media-amazon.com/images/I/61fkIpO4SxL._AC_SL1500_.jpg',
        discount: '35% off',
        price: '9.95€'
    },
    {
        id: 7,
        name: 'Statue',
        category: 'Garden',
        image: 'https://m.media-amazon.com/images/I/81ljUc1awvL._AC_SL1500_.jpg',
        discount: '35% off',
        price: '35€'
    },
    {
        id: 8,
        name: 'Dog bowl',
        category: 'Pets',
        image: 'https://m.media-amazon.com/images/I/61GYd8qG2QL._AC_SL1500_.jpg',
        discount: '15% off',
        price: '35€'
    },
    {
        id: 9,
        name: 'Apple watch',
        category: 'Electronics',
        image: 'https://m.media-amazon.com/images/I/71wiSqyzn6L._AC_SL1500_.jpg',
        discount: '0% off',
        price: '259€'
    },
    {
        id: 10,
        name: 'Cat toy set',
        category: 'Pets',
        image: 'https://m.media-amazon.com/images/I/61NPu0p-wsL._AC_SL1000_.jpg',
        discount: '0% off',
        price: '15€'
    },
    {
        id: 11,
        name: 'Carrier',
        category: 'Pets',
        image: 'https://m.media-amazon.com/images/I/81jNiuZUXjL._AC_SL1500_.jpg',
        discount: '0% off',
        price: '35€'
    },
    {
        id: 12,
        name: 'Lawnmower',
        category: 'Garden',
        image: 'https://m.media-amazon.com/images/I/71dCUT0RF1L._AC_SL1500_.jpg',
        discount: '0% off',
        price: '349€'
    }
];

// GET route for retrieving all items
app.get('/api/products', (req, res) => {
    res.json(products);
});

// POST route for adding a new item
app.post('/api/products', (req, res) => {
    const newProduct = req.body;
    products.push(newProduct);
    res.sendStatus(201); // Created
});

// TODO: Add more routes for updating and deleting items