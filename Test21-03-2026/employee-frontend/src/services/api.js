import axios from "axios";

const BASE_URL = "http://localhost:8082";

export const login = (data) => axios.post(`${BASE_URL}/auth/login`, data);

export const getEmployees = () => axios.get(`${BASE_URL}/employee`);
export const deleteEmployee = (id) => axios.delete(`${BASE_URL}/employee/${id}`);

export const applyLeave = (data) => axios.post(`${BASE_URL}/leave`, data);
export const getLeaves = () => axios.get(`${BASE_URL}/leave`);
export const approveLeave = (id) => axios.put(`${BASE_URL}/leave/approve/${id}`);
export const rejectLeave = (id) => axios.put(`${BASE_URL}/leave/reject/${id}`);