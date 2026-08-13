import { useState } from "react";
import { useLogin } from "../hooks/useAdminUser";
import { useNavigate } from "react-router-dom";

const LoginPage = () => {
	const {handleLogin} = useLogin();
	const [email, setEmail] = useState("");
	const [password, setPassword] = useState("");
	const navigate = useNavigate();

	const handleLoginSubmit = async(e) => {
		e.preventDefault();

		try {
			await handleLogin(email, password);
			navigate("/");
		} catch(err) {
			console.log("Error in login page : " + err);
		}
	}

	return (
		<div>
			<form onSubmit={handleLoginSubmit}>
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
				<button type="submit">Login</button>
			</form>
		</div>
	)
}

export default LoginPage;