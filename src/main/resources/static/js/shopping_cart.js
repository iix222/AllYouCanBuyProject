// Retrieve cart items from local storage
const cartItems = JSON.parse(localStorage.getItem('cartItems')) || [];

// Retrieve products data from data.js file
const products = [
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

// Function to render cart items in the HTML
function renderCartItems() {
    const cartItemsContainer = document.getElementById('cartItems');
    cartItemsContainer.innerHTML = '';

    cartItems.forEach((cartItem) => {
        const product = products.find((p) => p.id === cartItem.productId);

        const row = document.createElement('tr');

        const nameColumn = document.createElement('td');
        nameColumn.textContent = product.name;
        row.appendChild(nameColumn);

        const itemPriceColumn = document.createElement('td');
        itemPriceColumn.textContent = product.price;
        row.appendChild(itemPriceColumn);

        const discountedPriceColumn = document.createElement('td');
        discountedPriceColumn.textContent = product.discount;
        row.appendChild(discountedPriceColumn);

        const quantityColumn = document.createElement('td');
        quantityColumn.textContent = cartItem.quantity;
        row.appendChild(quantityColumn);

        const totalPriceColumn = document.createElement('td');
        const totalPrice = calculateTotalPrice(cartItem.quantity, product.price);
        totalPriceColumn.textContent = totalPrice;
        row.appendChild(totalPriceColumn);

        cartItemsContainer.appendChild(row);
    });

    const totalPriceElement = document.getElementById('totalPrice');
    const totalPrice = calculateCartTotal(cartItems);
    totalPriceElement.textContent = `$${totalPrice}`;
}

// Function to calculate the total price for a cart item
function calculateTotalPrice(quantity, price) {
    const numericPrice = parseFloat(price.slice(0, -1));
    return (numericPrice * quantity).toFixed(2);
}

// Function to calculate the total price for all cart items
function calculateCartTotal(cartItems) {
    let total = 0;
    cartItems.forEach((cartItem) => {
        const product = products.find((p) => p.id === cartItem.productId);
        const totalPrice = calculateTotalPrice(cartItem.quantity, product.price);
        total += parseFloat(totalPrice);
    });
    return total.toFixed(2);
}

// Call the function to render cart items on page load
renderCartItems();