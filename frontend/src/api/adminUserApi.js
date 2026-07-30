const BASE_URL = "http://localhost:8080/api/admin";

export const registerUser = async(email, password) => {
	const response = await fetch(`${BASE_URL}/register`, {
		method : "POST",
		credentials: "include",
		headers	:	{"Content-type" : "application/json"},
		body : JSON.stringify({email, password}),
	});

	const data = await response.json();

	if(!response.ok) {
		throw data;
	}

	return data;
}

export const login = async(email, password) => {
	const response = await fetch(`${BASE_URL}/login`, {
		method : "POST",
		headers	:	{"Content-type" : "application/json"},
		credentials: "include",
		body : JSON.stringify({email, password}),
	})

	const data = await response.json();

	if(!response.ok) {
		throw data;
	}

	return data;
}

export const isLoggedIn = async() => {
	const response = await fetch(`${BASE_URL}`, {
		method : "GET",
		credentials : "include",
	});

	if(response.ok) {
		return true;
	} else {
		return false;
	}
}