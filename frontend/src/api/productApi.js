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
