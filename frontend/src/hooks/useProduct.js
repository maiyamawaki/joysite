import { useState,useEffect } from "react";
import { fetchAllProduct } from "../api/productApi";

export const useProduct = () => {
	const [products, setProducts] = useState([]);

	useEffect(() => {
		const loadProducts = async() => {
			try {
				const productData = await fetchAllProduct();
				setProducts(productData);
			} catch(err) {
				console.log(err);
			}
		};
		loadProducts();
	}, []);

	return { products };
}