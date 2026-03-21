import { Link } from "react-router-dom";

export default function Navbar() {
  const user = JSON.parse(localStorage.getItem("user"));

  return (
    <div style={styles.nav}>
      <h2 style={{ margin: 0 }}>EMS</h2>

      <div style={styles.links}>
        <Link to="/dashboard">Dashboard</Link>
        <Link to="/employees">Employees</Link>
        <Link to="/leave">Leave</Link>

        {user?.role === "MANAGER" && (
          <>
            <Link to="/manager">Manager</Link>
            <Link to="/add">Add</Link>
          </>
        )}
      </div>

      {/* ✅ FIXED LOGOUT */}
      <button style={styles.logout} onClick={() => {
        localStorage.removeItem("user");
        window.location.href = "/";
      }}>
        Logout
      </button>
    </div>
  );
}

const styles = {
  nav: {
    display: "flex",
    justifyContent: "space-between",
    alignItems: "center",
    padding: "12px 20px",
    background: "linear-gradient(90deg, #0f172a, #1e293b)",
    color: "white"
  },
  links: {
    display: "flex",
    gap: "25px"
  },
  logout: {
    background: "#6366f1",
    border: "none",
    padding: "8px 14px",
    color: "white",
    borderRadius: "6px"
  }
};