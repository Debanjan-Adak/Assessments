import { useState } from "react";
import { login } from "../services/api";
import { useNavigate } from "react-router-dom";
import "../Layout.css";

export default function Login() {
  const [data, setData] = useState({ email: "", password: "" });
  const nav = useNavigate();

  const handleLogin = () => {
    login(data)
      .then(res => {
        localStorage.setItem("user", JSON.stringify(res.data));
        nav("/dashboard");
      })
      .catch(() => alert("Invalid credentials"));
  };

  return (
    <div className="layout">

      {/* LEFT */}
      <div className="left">
        <h1>Welcome Back</h1>
        <p>Manage your employees efficiently with EMS system.</p>
      </div>

      {/* RIGHT */}
      <div className="right">
        <div style={styles.card}>
          <h2>Sign in</h2>

          <input placeholder="Email"
            onChange={e => setData({...data,email:e.target.value})} />

          <input type="password" placeholder="Password"
            onChange={e => setData({...data,password:e.target.value})} />

          <button onClick={handleLogin}>Sign in</button>
        </div>
      </div>

    </div>
  );
}

const styles = {
  card: {
    width: "300px",
    display: "flex",
    flexDirection: "column",
    gap: "15px"
  }
};