
import React, { useEffect, useState } from "react";
import axios from "axios";


import { Link } from "react-router-dom";

const Home = () => {
  //store the user information
  const [users, setUser] = useState([]); //black array

  // By using this Hook, you tell React that your component needs to do something after render.
  //so everytime page is opened it will open the users information
  useEffect(() => {
    loadUsers();
    //unlimited time chalxa so if we give [] - square brackt
    //it will run only once when page loads
  }, []);

  const loadUsers = async () => {
    const result = await axios.get("http://localhost:8080/api/cus/all");
    setUser(result.data);
  };

  const deleteUser = async (id) => {
    await axios.delete(`http://localhost:8080/api/cus/delete/${id}`);
    loadUsers();
  };

  return (
    <div className={"container"}>
      <div className="py-4">
        <table className="table border shadow">
          <thead>
            <tr>
      
            <th scope="col">Id</th>
              <th scope="col">Name</th>
              <th scope="col">Email</th>
              <th scope="col">Pass</th>
              <th scope="col">Action</th>
            </tr>
          </thead>
          <tbody>
            {
             
              users.map((user) => (
                <tr>
              
                  <td>{user.id}</td>
                  <td>{user.name}</td>
                  <td>{user.email}</td>
                  <td>{user.pass}</td>
                  <td>

              

                  <Link
                      className={"btn btn-outline-primary mx-2"}
                      exact to={`/Editcus/${user.id}`}
                    >
                      Edit
                    </Link>
                    <button
                      className={"btn btn-danger mx-2"}
                      onClick={() => deleteUser(user.id)}
                    >
                      Delete
                    </button>
                    
              
                  </td>
                </tr>
              ))
            }
          </tbody>
        </table>
      </div>
    </div>
  );
};

export default Home;

