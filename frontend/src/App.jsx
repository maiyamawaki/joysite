import {BrowserRouter, Routes, Route} from "react-router-dom";
import './App.css'
import AllProductPage from './page/AllProductPage'

function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<AllProductPage />} />
      </Routes>
    </BrowserRouter>
  )
}

export default App
