
import Nav from 'react-bootstrap/Nav';
import "./Navbar.css"

const Navbar =() => {
   

    return (
      
        <div className="Navbar">
            <span className="nav-logo">TAXI ICBT</span>

        <Nav justify variant="tabs" defaultActiveKey="">
          <Nav.Item>
            <Nav.Link className="btn btn-outline-dark" href="/addcus">List</Nav.Link>
          </Nav.Item>
          <Nav.Item>
            <Nav.Link className="btn btn-outline-dark" href="/viewcus">Customer</Nav.Link>
          </Nav.Item>
          <Nav.Item>
            <Nav.Link className="btn btn-outline-dark" href="/editcus">Edit</Nav.Link>
          </Nav.Item>
          <Nav.Item>
            <Nav.Link eventKey="disabled" disabled>
              Disabled
            </Nav.Link>
          </Nav.Item>
        </Nav>


        
        </div>


);

    /*
    return(
        <div className="Navbar">
            <span className="nav-logo">TAXI ICBT</span>
            <div className= {'nav-items ${isOpen && "open"}'}>
                <a className="btn btn-outline-light" href="/list">List</a>
                <a className="btn btn-outline-light" href="/customer">Customer</a>
                <a className="btn btn-outline-light" href="/">Service</a>
                <a className="btn btn-outline-light" href="/">Contact</a>
            </div>
            <div className="nav-toggle">
                <div className="bar"></div>
            </div>
        </div>
    );

    */


};

export default Navbar;
