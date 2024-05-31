import './App.css'
import NavBar from './Organism/NavBar'
import { Route, Routes } from 'react-router-dom'
import HomePage from './Pages/HomePage'
//import DriverStandingPage from './Pages/Standings/DriverStandingPage'
import ConstructorStandingPage from './Pages/Standings/ConstructorStandingPage'
import ConstructorByName from './Pages/ConstructorByName'
import ConstructorPage from './Pages/ConstructorPage'
import DriverPage from './Pages/DriverPage'

function App() {
  return (
    <>
      <NavBar />
      <Routes>
        <Route path="/" element={<HomePage />}/>
        <Route path="/homepage" element={<HomePage />}/>
        <Route path="/standings/constructors" element={<ConstructorStandingPage />}/>
        <Route path="/constructors/:name" element={<ConstructorByName />}/>
        <Route path="/constructors" element={<ConstructorPage />}/>
        <Route path="/drivers" element={<DriverPage />}/>
      </Routes>
    </>
  )
}

export default App
