import { useEffect, useState } from "react";
import { getEmployees, deleteEmployee } from "../services/api";
import "../App.css";

export default function Employees() {

  const [data, setData] = useState([]);
  const [search, setSearch] = useState("");
  const [loading, setLoading] = useState(true);

  const load = () => {
    setLoading(true);
    getEmployees().then(res => {
      setData(res.data);
      setLoading(false);
    });
  };

  useEffect(() => {
    load();
  }, []);

  const filtered = data.filter(e =>
    e.name.toLowerCase().includes(search.toLowerCase()) ||
    e.city.toLowerCase().includes(search.toLowerCase())
  );

  if (loading) {
    return <h3 style={{ textAlign: "center" }}>Loading...</h3>;
  }

  return (
    <div className="container">
      <div className="card">
        <h2>Employees</h2>

        {/* 🔍 SEARCH */}
        <input
          placeholder="Search by name or city..."
          value={search}
          onChange={(e) => setSearch(e.target.value)}
        />

        {/* 🔽 SORT */}
        <div style={{ marginBottom: 10 }}>
          <button onClick={() => setData([...data].sort((a,b)=>a.salary-b.salary))}>
            Sort Salary ↑
          </button>

          <button onClick={() => setData([...data].sort((a,b)=>b.salary-a.salary))}>
            Sort Salary ↓
          </button>
        </div>

        <table>
          <thead>
            <tr>
              <th>ID</th>
              <th>Name</th>
              <th>City</th>
              <th>Salary</th>
              <th>Action</th>
            </tr>
          </thead>

          <tbody>
            {filtered.map(e => (
              <tr key={e.id}>
                <td>{e.id}</td>
                <td>{e.name}</td>
                <td>{e.city}</td>
                <td>₹{e.salary}</td>
                <td>
                  <button onClick={() => {
                    if(window.confirm("Delete this employee?")) {
                      deleteEmployee(e.id).then(load);
                    }
                  }}>
                    Delete
                  </button>
                </td>
              </tr>
            ))}
          </tbody>
        </table>

        {filtered.length === 0 && <p>No employees found</p>}
      </div>
    </div>
  );
}