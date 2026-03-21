import { useEffect, useState } from "react";
import { getLeaves, approveLeave, rejectLeave } from "../services/api";
import "../App.css";

export default function ManagerPanel() {
  const [data, setData] = useState([]);

  const load = () => {
    getLeaves().then(res => setData(res.data));
  };

  useEffect(() => { load(); }, []);

  return (
    <div className="container">
      <div className="card">
        <h2>Leave Requests</h2>

        <table>
          <thead>
            <tr>
              <th>ID</th><th>Emp</th><th>Reason</th><th>Status</th><th>Action</th>
            </tr>
          </thead>

          <tbody>
            {data.map(l => (
              <tr key={l.id}>
                <td>{l.id}</td>
                <td>{l.employeeId}</td>
                <td>{l.reason}</td>
                <td>{l.status}</td>
                <td>
                  <button onClick={()=>approveLeave(l.id).then(load)}>Approve</button>
                  <button onClick={()=>rejectLeave(l.id).then(load)}>Reject</button>
                </td>
              </tr>
            ))}
          </tbody>
        </table>

      </div>
    </div>
  );
}