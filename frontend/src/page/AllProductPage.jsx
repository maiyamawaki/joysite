import { useProduct } from "../hooks/useProduct";
import ProductComponent from "../component/ProductComponent";

const AllProductPage = () => {
	const {products} = useProduct();

	return (
		<div className="main">
			<p>holis</p>
			<div className="productsContainer">
				{products.map((pro) => {
					return <ProductComponent 
					pro={pro}
					/>
				})}
			</div>
		</div>
	)
}

export default AllProductPage;