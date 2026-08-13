const BASE_URL = "http://localhost:8080/api/products";

export const fetchAllProduct = async() => {
	const response = await(`${BASE_URL}`, {
		method : "GET",
		credentials : "include",
	});

	if(!response.ok) {
		console.log("fetch all products error");
	}

	const products = await response.json();

	return products;
}

export const createProduct = async(productName, description, price, productImage, stock) => {
	const response = await fetch(`${BASE_URL}`, {
		method : "POST",
		credentials: "include",
		headers : {"Content-type" : "application/json"},
		body : JSON.stringify({productName, description, price, productImage, stock}),
	});

	if(!response.ok) {
		const errorData = await response.json();
		throw errorData;
	}

	return response.json();
}
