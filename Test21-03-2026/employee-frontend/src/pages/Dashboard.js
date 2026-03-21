import "../Layout.css";

export default function Dashboard() {
  const user = JSON.parse(localStorage.getItem("user"));

  return (
    <div className="layout">

      {/* LEFT PANEL */}
      <div className="left">
        <h1>Hello, {user?.name}</h1>
        <p>Welcome to Employee Management System</p>
      </div>

      {/* RIGHT PANEL */}
      <div className="right">
        <div style={styles.card}>
          <h2>Dashboard</h2>

          <p><b>Role:</b> {user?.role}</p>
          <p><b>Email:</b> {user?.email}</p>

          <div style={{marginTop:20}}>
            <button onClick={()=>window.location.href="/employees"}>
              Employees
            </button>

            <button onClick={()=>window.location.href="/leave"}>
              Leave
            </button>

            {user?.role === "MANAGER" && (
              <>
                <button onClick={()=>window.location.href="/manager"}>
                  Manage Leaves
                </button>

                <button onClick={()=>window.location.href="/add"}>
                  Add Employee
                </button>
              </>
            )}
          </div>
        </div>
      </div>

    </div>
  );
}

const styles = {
  card: {
    width: "350px",
    display: "flex",
    flexDirection: "column",
    gap: "10px"
  }
};