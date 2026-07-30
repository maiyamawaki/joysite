import { login, registerUser } from "../api/adminUserApi";
import { useAuthContext } from "./useAuthContext";

export const useLogin = () => {
	const {setIsLogin} = useAuthContext();
	const handleLogin = async(email, password) => {
		await login(email, password);
		setIsLogin(true);
	}
	return {handleLogin};
}

export const useRegisterUser = () => {
	const {setIsLogin} = useAuthContext();
	const handleRegister = async(email, password) => {
		await registerUser(email, password);
		setIsLogin(true);
	}
	return {handleRegister};
}