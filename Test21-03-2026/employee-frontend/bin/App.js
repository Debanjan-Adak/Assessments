import { BrowserRouter, Routes, Route } from "react-router-dom";
import Login from "./pages/Login";
import Dashboard from "./pages/Dashboard";
import Employees from "./pages/Employees";
import Leave from "./pages/Leave";
import ManagerPanel from "./pages/ManagerPanel";
import AddEmployee from "./pages/AddEmployee";
import Navbar from "./components/Navbar";
import ProtectedRoute from "./components/ProtectedRoute";

function App() {
  const user = JSON.parse(localStorage.getItem("user"));

  return (
    <BrowserRouter>

      {/* ✅ Navbar only when logged in */}
      {user && <Navbar />}

      <Routes>

        {/* Public route */}
        <Route path="/" element={<Login />} />

        {/* Protected routes */}
        <Route path="/dashboard" element={
          <ProtectedRoute><Dashboard /></ProtectedRoute>
        } />

        <Route path="/employees" element={
          <ProtectedRoute><Employees /></ProtectedRoute>
        } />

        <Route path="/leave" element={
          <ProtectedRoute><Leave /></ProtectedRoute>
        } />

        <Route path="/manager" element={
          <ProtectedRoute><ManagerPanel /></ProtectedRoute>
        } />

        <Route path="/add" element={
          <ProtectedRoute><AddEmployee /></ProtectedRoute>
        } />

      </Routes>
    </BrowserRouter>
  );
}

export default App;