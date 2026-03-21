import { useState } from "react";
import axios from "axios";
import "../App.css";

export default function AddEmployee() {
  const [emp, setEmp] = useState({
    id: "", name: "", email: "", mobile: "",
    city: "", salary: "", password: "", role: "EMPLOYEE"
  });

  const handleChange = (e) => {
    setEmp({ ...emp, [e.target.name]: e.target.value });
  };

  const submit = () => {
    axios.post("http://localhost:8082/employee", emp)
      .then(() => alert("Employee Added"));
  };

  return (
    <div className="container">
      <div className="card">
        <h2>Add Employee</h2>

        {["id","name","email","mobile","city","salary","password"].map(k => (
          <input key={k} name={k} placeholder={k} onChange={handleChange}/>
        ))}

        <select name="role" onChange={handleChange}>
          <option value="EMPLOYEE">Employee</option>
          <option value="MANAGER">Manager</option>
        </select>

        <button onClick={submit}>Submit</button>
      </div>
    </div>
  );
}