
import './App.css';
import {BrowserRouter as Router, Routes, Route} from "react-router-dom";
import "../node_modules/bootstrap/dist/css/bootstrap.min.css"
import Navbar from "./Web_Page/Navbar";
import Allcustomer from './Web_Page/Allcustomer';

import Addcustomer from './Web_Page/Addcustomer';
import Editcustomer from './Web_Page/Editcustomer';




function App() {
  return (
    <div className="App">

        <Navbar/>
      
    
      

     <Router>
      
            <Routes>
          
            <Route exact path={"/viewcus"} element={<Allcustomer/>}/>
            <Route exact path={"/addcus"} element={<Addcustomer/>}/>
            <Route exact path={"/editcus/:id"} element={<Editcustomer/>}/>
            
           

            </Routes>

        </Router>

    </div>
  );
}

export default App;
