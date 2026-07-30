import {BrowserRouter, Routes, Route} from "react-router-dom";
import './App.css'
import AllProductPage from './page/AllProductPage'
import LoginPage from "./page/LoginPage";
import RegisterAdminPage from "./page/RegisterAdminPage";
import { AuthProvider } from "./context/AuthProvider";

function App() {
  return (
    <AuthProvider>
      <BrowserRouter>
        <Routes>
          <Route path="/" element={<AllProductPage />} />
          <Route path="/admindejoysitesoloparajoyyparalogin" element={<LoginPage />} />
          <Route path="/admindejoysitesoloparajoyyparraregister" element={<RegisterAdminPage />} />
        </Routes>
      </BrowserRouter>
    </AuthProvider>
  )
}

export default App
