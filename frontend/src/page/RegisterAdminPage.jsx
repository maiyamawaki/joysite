import { useState } from "react";
import { useRegisterUser } from "../hooks/useAdminUser";

const RegisterAdminPage = () => {
	const {handleRegister} = useRegisterUser();

	const [email, setEmail] = useState("");
	const [password, setPassword] = useState("");

	const handleRegisterSubmit = async(e) => {
		e.preventDefault();

		try {
			await handleRegister(email, password);
		} catch(err) {
			console.log("Error in login page : " + err);
		}
	}

	return (
		<div>
			<form onSubmit={handleRegisterSubmit}>
				<label>email : </label>
				<input 
					type="email"
					value={email}
					onChange={(e)=> {setEmail(e.target.value)}}
					/>
					<label>password : </label>
				<input 
					type="password"
					value={password}
					onChange={(e)=> {setPassword(e.target.value)}}
					/>
				<button type="submit">Register</button>
			</form>
		</div>
	)

}	

export default RegisterAdminPage;