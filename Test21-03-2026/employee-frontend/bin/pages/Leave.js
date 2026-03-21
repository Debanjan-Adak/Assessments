import { useState } from "react";
import { applyLeave } from "../services/api";
import "../App.css";

export default function Leave() {
  const user = JSON.parse(localStorage.getItem("user"));
  const [reason, setReason] = useState("");

  const submit = () => {
    applyLeave({ employeeId: user.id, reason })
      .then(() => alert("Leave applied"));
  };

  return (
    <div className="container">
      <div className="card">
        <h2>Apply Leave</h2>

        <input placeholder="Reason"
          onChange={e => setReason(e.target.value)} />

        <button onClick={submit}>Submit</button>
      </div>
    </div>
  );
}